package com.wonddak.backjoon_kt.chapter7

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/2566
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = 0
    var m = 0
    var max = -1

    for (i in 0 until 9) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until 9) {
            if (row[j] > max) {
                max = row[j]
                n = i + 1
                m = j + 1
            }
        }
    }
    println(max)
    println("$n $m")
}