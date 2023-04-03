package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

// https://www.acmicpc.net/problem/4344
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var c = br.readLine().toInt()
    while (c != 0) {
        val line = br.readLine().split(" ").map { it.toInt() }
        val n = line[0]
        val numbers = line.slice(1..n)

        val avg = numbers.sum().toFloat() / n

        val avgOvers = numbers.filter { it.toFloat() > avg }

        println(String.format("%2.3f%%",(avgOvers.size.toFloat() / n) * 100))
        c --
    }

}