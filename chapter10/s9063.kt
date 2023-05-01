package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/9063
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val xArray = IntArray(n) { 0 }
    val yArray = IntArray(n) { 0 }

    for (i in 0 until n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        xArray[i] = x
        yArray[i] = y
    }

    xArray.sort()
    yArray.sort()
    println((xArray[xArray.lastIndex]- xArray[0]) * (yArray[yArray.lastIndex] - yArray[0]))
}