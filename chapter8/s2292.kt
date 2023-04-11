package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/2292
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    var sum = 1
    var cnt = 1
    while (true) {
        if (sum >= n) {
            println(cnt)
            break
        }
        sum += 6 * cnt
        cnt += 1
    }
}