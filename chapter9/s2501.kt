package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/2501
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    val numbers = mutableSetOf<Int>()
    for (i in 1 until  n/ 2) {
        if (n % i == 0) {
            numbers.add(i)
            numbers.add(n/i)
        }
    }
    if (numbers.size < k) {
        println(0)
    } else {
        println(numbers.toList().sorted()[k-1])
    }
}