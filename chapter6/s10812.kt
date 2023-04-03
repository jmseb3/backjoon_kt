package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

// https://www.acmicpc.net/problem/10812
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val baguni = (1..n).toMutableList()

    for (idx in 1..m) {
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() - 1 }
        val find = LinkedList(baguni.slice(i..j))
        for (cnt in 1 ..k - i) {
            find.add(find.pop())
        }

        find.forEachIndexed { index, value ->
            baguni[index + i] = value
        }
    }
    println(baguni.joinToString(" "))
}