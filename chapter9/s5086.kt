package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/5086
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0) {
            break
        }
        if (a % b == 0) {
            println("multiple")
        } else if (b % a == 0) {
            println("factor")
        } else {
            println("neither")
        }
    }
}