package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/27323
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toShort()
    val b = br.readLine().toShort()
    println(a*b)
}