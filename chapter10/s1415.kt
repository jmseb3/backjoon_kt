package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

//https://www.acmicpc.net/problem/14125
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().split(" ").map { it.toInt() }.sorted()
    println((a[0] + a[1] + min(a[2], a[0] + a[1] - 1)))
}