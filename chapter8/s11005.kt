package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

//https://www.acmicpc.net/problem/11005
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var (n, b) = br.readLine().split(" ").map { it.toInt() }
    val result :ArrayList<Int> = arrayListOf()

    while (n > 0) {
        result.add(n % b)
        n /= b
    }

    println(result.reversed().map { num -> if (num >= 10) (num+55).toChar() else num }.joinToString(""))

}