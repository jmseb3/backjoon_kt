package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/11653
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()

    while (n != 1) {
        for (i in 2..n) {
            if (n % i == 0) {
                println(i)
                n /= i
                break
            }
        }
    }

}