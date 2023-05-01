package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/10101
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = IntArray(3){0}
    for (i in 0 until 3) {
        a[i] = br.readLine().toInt()
    }
    if (a.sum() != 180) {
        println("Error")
    } else {
        when (a.toSet().size) {
            3 -> println("Scalene")
            2 -> println("Isosceles")
            else -> println("Equilateral")
        }
    }
}