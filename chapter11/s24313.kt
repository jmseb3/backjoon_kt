package com.wonddak.backjoon_kt.chapter11


import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/24313
// 1. a1 > c 인경우 항상 불만족
// 2. a1 == c 인경우 a0 가 0보다 작거나 같을때만  만족
// 3. a1 <c 인 경우 f(n0)값이 0보다 작거나 같을때만 만족
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a1, a0) = br.readLine().split(" ").map { it.toInt() }
    val c = br.readLine().toInt()
    val n0 = br.readLine().toInt()

    var result = 0

    if (c == a1 && a0 <= 0) {
        result = 1
    }

    if (a1 < c && ((a1-c)*n0 + a0) <=0) {
        result = 1
    }

    println(result)
}