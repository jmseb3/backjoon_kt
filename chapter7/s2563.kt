package com.wonddak.backjoon_kt.chapter7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

// https://www.acmicpc.net/problem/2563
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val paper: ArrayList<IntArray> = arrayListOf()
    for (i in 1..100) {
        paper.add(IntArray(100) { 0 })
    }

    val n = br.readLine().toInt()

    for (i in 1..n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        for (dx in x until min(x + 10, 100)) {
            for (dy in y until min(y + 10, 100)) {
                paper[dx][dy] = 1
            }
        }
    }

    println(paper.sumOf { it.sum() })

}