package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/2941
fun main() {
    val matcher = mapOf(
        "dz=" to 1,
        "c=" to 2,
        "c-" to 3,
        "d-" to 4,
        "lj" to 5,
        "nj" to 6,
        "s=" to 7,
        "z=" to 8
    )
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var read = bf.readLine().toString()
    matcher.forEach {
        read = read.replace(it.key,it.value.toString())
    }
    println(read.length)
}