import java.util.*

fun bubbleSort(arr: IntArray) {
    val size = arr.size
    for (i in 0 until size - 1) {
        for (j in 0 until size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}


fun main() {
    val arr = intArrayOf(4, 3, 7, 8, 53, 6, 5, 2)
    println("Nieposortowana tablica: " + Arrays.toString(arr))
    bubbleSort(arr)
    println("Posortowana tablica: " + Arrays.toString(arr))
}