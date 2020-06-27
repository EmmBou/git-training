package com.gitTraining

fun computeFibbonaciNumber(position: Int, recursion: Boolean = false): Int {
    if (recursion) return recursiveFibbonachi(1, 1, position - 2)

    var notNullPosition = position
    if (notNullPosition == null) {
        notNullPosition = 1
    }
    var i = 1
    var j = 1

    if (notNullPosition <= 2) return 1

    var currentPosition = 2
    while (currentPosition < notNullPosition) {
        val temp = i
        i = j
        j += temp
        currentPosition ++
    }
    return j
}

fun computeFibbonachiArray(start: Int, end: Int): List<Int> {
    return (start..end).map { computeFibbonaciNumber(it) }
}

fun recursiveFibbonachi(previous: Int, current: Int, stepsLeft: Int): Int {
    if (stepsLeft < 0) return 1
    return when (stepsLeft) {
        0 -> current
        else -> recursiveFibbonachi(current, previous + current, stepsLeft - 1)
    }
}