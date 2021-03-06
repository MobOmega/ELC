package io.github.mobomega.elc


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import kotlinx.coroutines.launch
import org.reflections.Reflections
import java.net.URL

val reflections = Reflections("io.github.mobomega.elc.attractions")
var display by mutableStateOf<Set<Attraction>>(setOf())
var mutableDisplay = mutableSetOf<Attraction>()
var names = mutableSetOf<String>()
val windowColors = Colors(
    primary = Color(92, 141, 137),
    primaryVariant = Color(75, 119, 116),
    secondary = Color(167, 215, 197),
    secondaryVariant = Color(116, 180, 155),
    background = Color(244, 249, 244),
    surface = Color(29, 65, 79),
    error = Color(59, 99, 97),
    onPrimary = Color(19, 47, 63),
    onSecondary = Color(19, 47, 63),
    onBackground = Color(19, 47, 63),
    onSurface = Color(8, 15, 10),
    onError = Color(19, 47, 63),
    isLight = true
)
val sizeHor = Dp(1000f)
val sizeVer = Dp(750f)
var tabulated = mutableMapOf<String, Pair<MutableSet<Attraction>, MutableSet<String>>>()

@OptIn(ExperimentalMaterialApi::class)
fun main() = application {

    val composableScope = rememberCoroutineScope()

    for (attr in reflections.getSubTypesOf(Attraction::class.java)) {

        val temp = attr.getConstructor().newInstance()

        for (sharedTag in temp.tags) {

            if (sharedTag !in tabulated) {
                tabulated[sharedTag] = Pair(mutableSetOf(temp), mutableSetOf(temp.name))
            }

            val newPair: Pair<MutableSet<Attraction>, MutableSet<String>> =
                Pair(
                    tabulated[sharedTag]?.first?.plus(temp),
                    tabulated[sharedTag]?.second?.plus(temp.name)
                ) as Pair<MutableSet<Attraction>, MutableSet<String>>

            tabulated[sharedTag] = newPair

        }

    }

    println("There are ${reflections.getSubTypesOf(Attraction::class.java).size} attractions.")


    val windowState = rememberWindowState(
        placement = WindowPlacement.Floating,
        isMinimized = true,
        position = WindowPosition(alignment = Alignment.Center),
        size = DpSize(width = sizeHor, height = sizeVer)
    )

    val density = LocalDensity.current
    val stateVertical = rememberScrollState(0)
    val stateHorizontal = rememberScrollState(0)

    Window(
        onCloseRequest = ::exitApplication,
        title = "Exploring Lake Country",
        state = windowState
    ) {

        MaterialTheme (
            colors = windowColors.copy()
        ) {

            val helpRequest = remember { mutableStateOf(true) }
            if (helpRequest.value) {
                AlertDialog(
                    modifier = Modifier.fillMaxWidth(0.8f),
                    onDismissRequest = { helpRequest.value = false },
                    title = { Text(text = "Help") },
                    text = { Text(text = """
                                        Welcome to ELC, or Exploring Lake Country. This is a project that allows you to explore attractions and areas in the vicinity of Waukesha County and Lake Country.
                                        
                                        To begin, enter desired attributes in the text box, separated by commas. For example, "fun, sports, waukesha".
                                        
                                        When you want to search for something else, or add to your results, click reset to clear the selections.
                                    """.trimIndent())},
                    buttons = {
                        Button(modifier = Modifier.fillMaxWidth(),
                            onClick = { helpRequest.value = false }) {
                            Text("Dismiss")
                        }
                    },
                    backgroundColor = Color(167, 215, 197, 255)
                )
            }

            WindowDraggableArea {

                Box(Modifier
                    .fillMaxWidth()
                    .height(windowState.size.height.div(3))
                    .background(windowColors.surface)
                )

            }

            Column {

                val text = remember { mutableStateOf("") }

                OutlinedTextField(
                    value = text.value,
                    singleLine = true,
                    onValueChange = { text.value = it },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                Row (modifier = Modifier.size(windowState.size.width, windowState.size.height.div(20)),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Button(modifier = Modifier.align(Alignment.Top),
                        onClick = {

                            composableScope.launch {

                                mutableDisplay = mutableSetOf()
                                names = mutableSetOf()
                                val tags = text.value.split(", ", ",")

                                for (tag in tags) {

                                    search(tag.lowercase())
                                    display = mutableDisplay

                                }

                            }

                        }

                    ) {

                        Text("Search")

                    }

                    Button (modifier = Modifier.align(Alignment.Top),

                        onClick = {

                            composableScope.launch {

                                mutableDisplay = mutableSetOf()
                                display = setOf()
                                names = mutableSetOf()

                            }

                        }) {

                        Text("Reset")

                    }

                }
                Row (modifier = Modifier.align(Alignment.CenterHorizontally),horizontalArrangement = Arrangement.Center) {

                    Box(
                        modifier = Modifier.fillMaxSize()
                            .background(color = Color(red = 0xFF, green = 0xFF, blue = 0xFF))
                            .padding(10.dp)
                    ) {

                        // Creating the state Box component in the Row
                        create(stateVertical, stateHorizontal, density, windowState)

                        VerticalScrollbar(
                            modifier = Modifier.align(Alignment.CenterEnd)
                                .fillMaxHeight(),
                            adapter = rememberScrollbarAdapter(stateVertical)
                        )

                        HorizontalScrollbar(
                            modifier = Modifier.align(Alignment.BottomStart)
                                .fillMaxWidth()
                                .padding(end = 12.dp),
                            adapter = rememberScrollbarAdapter(stateHorizontal)
                        )

                    }

                }

            }

        }

    }

}

@Composable
fun textBox(attr: Attraction?, density: Density, windowState: WindowState) {

    if (attr != null) {

        Box(
            modifier = Modifier
                .height(windowState.size.height.div(6))
                .width(windowState.size.width.minus(windowState.size.width.div(10)))
                .background(color = Color(167, 215, 197, 20))
                .padding(start = 10.dp, end = windowState.size.width.div(40)),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "${attr.name}\n${attr.address}\n${attr.stars} out of 5.0 stars",
                modifier = Modifier.align(Alignment.CenterStart)
            )

            Box (
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = BitmapPainter(loadImageBitmap(URL(attr.image).openStream()!!)),
                    contentDescription = "Image for ${attr.name}",
                    modifier = Modifier.align(Alignment.TopCenter).height(windowState.size.height.div(9))
                )

                Text(
                    text = attr.source,
                    modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = windowState.size.height.div(30))
                )

            }

        }

    } else {

        Box(
            modifier = Modifier
                .height(windowState.size.height.div(6))
                .width(windowState.size.width.minus(windowState.size.width.div(10)))
                .background(color = Color(255, 10, 10, 40)),
            contentAlignment = Alignment.Center
        ) {

            Text(text = "No Results.", modifier = Modifier.align(Alignment.Center))

        }

    }

}

@Composable
fun create(
    stateVertical: ScrollState,
    stateHorizontal: ScrollState,
    density: Density,
    windowState: WindowState
) = Box(
    modifier = Modifier
        .fillMaxSize()
        .verticalScroll(stateVertical)
        .padding(start = windowState.size.width.div(25), end = windowState.size.width.div(25), bottom = 12.dp)
        .horizontalScroll(stateHorizontal)
    ) {

    Column {

        if (display.isEmpty() && names.isEmpty()) {

            textBox(null, density, windowState)

        } else {

            for (attr in display) {

                textBox(attr, density, windowState)
                Spacer(modifier = Modifier.height(40.dp).align(Alignment.CenterHorizontally))

            }

        }

    }

}


fun search(text: String) {

    if (text !in tabulated.keys) return

    mutableDisplay += tabulated[text]?.first as MutableSet<Attraction>

    names += tabulated[text]?.second as MutableSet<String>

}

