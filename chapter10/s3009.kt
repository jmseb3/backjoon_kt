package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/3009
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = IntArray(3) { 0 }
    val y = IntArray(3) { 0 }
    val ans = IntArray(2) { 0 }

    for (i in 0..2) {
        val (t_x, t_y) = br.readLine().split(" ").map { it.toInt() }
        x[i] = t_x
        y[i] = t_y
    }

    for (i in 0..2) {
        if (x[i % 3] == x[(i + 1) % 3]) {
            ans[0] = x[(i + 2) % 3]
        }

        if (y[i % 3] == y[(i + 1) % 3]) {
            ans[1] = y[(i + 2) % 3]
        }
    }
    println(ans.joinToString(" "))
}