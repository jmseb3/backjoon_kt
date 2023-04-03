package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/1157
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val word = br.readLine().toString().uppercase()
    val result = mutableMapOf<Char,Int>()
    for (c in word) {
        if (result.containsKey(c)) {
            result[c] = result[c]!! + 1
        } else {
            result[c] = 1
        }
    }
    val maxValue = result.map { it.value }.toSet().max()
    val answer = result.filterValues { it == maxValue }
    if (answer.size == 1) {
        println(answer.keys.joinToString(""))
    } else {
        println("?")
    }

}