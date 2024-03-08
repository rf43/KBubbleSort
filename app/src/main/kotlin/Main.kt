package io.ivycreek

fun main() {
    println("List1: ${bubbleSort(listOf(3, 4, 11, 1, 9))}")
    println("List2: ${bubbleSort(listOf(1, 2, 3, 4, 5))}")
    println("List3: ${bubbleSort(listOf(5, 4, 3, 2, 1))}")
    println("List4: ${bubbleSort(listOf(1, 4, 6, 4))}")
    println("List5: ${bubbleSort(listOf())}")
}

private fun bubbleSort(listToSort: List<Int>): List<Int> {
    val tmpList = listToSort.toMutableList()

    for (i in tmpList.indices) {
        for (j in 0..<tmpList.size - (i + 1)) {
            val left = tmpList[j]
            val right = tmpList[j + 1]

            if (left > right) {
                tmpList[j] = right
                tmpList[j + 1] = left
            }
        }
    }

    return tmpList
}