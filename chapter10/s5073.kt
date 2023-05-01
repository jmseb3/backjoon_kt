package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/5073
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val array = br.readLine().split(" ").map { it.toInt() }
        if (array.sum() == 0) {
            break
        }
        val check = array.sorted()

        if (check[2] < check[1] + check[0]) {
            when (check.toSet().size) {
                3 -> println("Scalene")
                2 -> println("Isosceles")
                else -> println("Equilateral")
            }
        } else {
            println("Invalid")
        }
    }
}