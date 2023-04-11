package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

//https://www.acmicpc.net/problem/2720
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var t = br.readLine().toInt()
    while (t > 0) {
        t--
        var money = br.readLine().toInt()
        val result = IntArray(4) { 0 }
        result[0] = money / 25
        money %= 25
        result[1] = money / 10
        money %= 10
        result[2] = money / 5
        money %= 5
        result[3] = money
        println(result.joinToString(" "))
    }
}