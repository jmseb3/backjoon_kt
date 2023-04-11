package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

//https://www.acmicpc.net/problem/2903
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val result = IntArray(n+1)
    result[0] = 2
    for (i in 1..n) {
        result[i] = result[i-1] *2 -1
    }

    println(result[n]*result[n])
}