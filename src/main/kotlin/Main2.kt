import java.io.File
import java.util.Deque

fun readInputAsText(name: String) = File("./src/main/resources", "$name.txt").readText()

fun main(args: Array<String>) {

    val input = readInputAsText("input_day5")
    initialize(input)
}

fun initialize(input: String) {

    val lines = input.lines()

    val toList = lines.takeWhile { it.isNotEmpty() }
        .map { it.toCharArray() }
        .toList()


    val queues = mutableListOf<ArrayDeque<String>>()

    for (line in toList.reversed().withIndex()) {
        if (line.index == 1) {
            line.value
                .filter { it.isLetter() }
                .forEach {
                    print(it)
                }
        }
    }

}
