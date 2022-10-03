import java.text.SimpleDateFormat
import java.util.*

fun main() {
    // #1
    val arr: Array<Int> = arrayOf(2, 4, 6, 8, 12)
    println(getAvgForEvenIndexes(arr))
    // #2
    val text = "text"
    val textOne = "asa"
    println(isPalindrome(text))
    println(isPalindrome(textOne))
    // #3
    val date = Date()
    println(date.fo("YYYY/MM/dd"))
}


fun getAvgForEvenIndexes(arr: Array<Int>): Int {
    var itemCount = 0
    var sum = 0

    for (idx in arr.indices) {
        if (idx > 0 && idx % 2 == 0) {
            itemCount++
            sum += arr[idx]
        }
    }

    return sum / itemCount
}

fun isPalindrome(text: String): Boolean {
    return text.reversed() == text
}

fun Date.fo(pattern: String): String {
    return SimpleDateFormat(pattern).format(this)
}