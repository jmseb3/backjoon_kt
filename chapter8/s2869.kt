package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/2869
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (a, b, v) = br.readLine().split(" ").map { it.toInt() }
    val total = v - b
    val day = a - b

    val result = total / day
    if (total % day == 0) {
        println(result)
    } else {
        println(result + 1)
    }

}