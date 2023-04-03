package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/2444
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = (1 until n).map { i -> " ".repeat(n-i) + "*".repeat(2*i -1) }
    val result = mutableListOf<String>()
    result.addAll(list)
    result.add("*".repeat(2*n-1))
    result.addAll(list.reversed())
    println(result.joinToString("\n"))
}