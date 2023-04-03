package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/3003
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val goal = listOf(1,1,2,2,2,8)
    val list = br.readLine().split(" ").mapIndexed { index, i ->
        goal[index] - i.toInt()
    }
    println(list.joinToString(" "))

}