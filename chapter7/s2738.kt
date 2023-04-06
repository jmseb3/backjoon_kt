package com.wonddak.backjoon_kt.chapter7

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/2738
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val result: ArrayList<IntArray> = arrayListOf()

    for (i in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }.toIntArray()
        result.add(row)
    }

    for (i in 0 until n) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 0 until m) {
            result[i][j] += row[j]
        }
    }
    result.map {
        println(it.joinToString(" "))
    }

}