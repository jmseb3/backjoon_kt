package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/25206
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var cnt = 0.0f
    var sum = 0.0f
    for (idx in 1.. 20) {
        val (_,b,c) = br.readLine().split(" ")
        if (c != "P") {
            val st = b.toFloat()
            cnt += st
            if (c != "F") {
                val score = c
                    .replace("+", "5")
                    .replace("A", "4.")
                    .replace("B", "3.")
                    .replace("C", "2.")
                    .replace("D", "1.").toFloat()
                sum += (score * st)
            }
        }
    }
    println(String.format("%1.6f",sum/cnt))

}