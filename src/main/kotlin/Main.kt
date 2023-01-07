import java.util.Objects

fun main(args: Array<String>) {

    val lines = object {}.javaClass.getResourceAsStream("input_day4.txt")?.bufferedReader()?.readLines()!!

    var total = 0
    for (line in lines) {

        val split = line.split(",")

        val firstSection = split[0].split("-")
        val firstSectionStart = firstSection[0].toInt()
        val firstSectionEnd = firstSection[1].toInt()
        val range1 = firstSectionStart..firstSectionEnd

        val secondSection = split[1].split("-")
        val secondSectionStart = secondSection[0].toInt()
        val secondSectionEnd = secondSection[1].toInt()
        val range2 = secondSectionStart..secondSectionEnd


        if ((firstSectionStart in range2 || firstSectionEnd in range2)
            || (secondSectionStart in range1 || secondSectionEnd in range1)
        ) {
            total++
        }

//        print("$range1, $range2")
//        if ((firstSectionStart in range2 || firstSectionEnd in range2)) {
//            println(" in")
//            total++
//        } else {
//            println(" not in")
//        }

    }

    println(total)
}