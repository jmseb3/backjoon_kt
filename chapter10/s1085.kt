package com.wonddak.backjoon_kt.chapter10

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min

//https://www.acmicpc.net/problem/1085
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x,y,w,h) = br.readLine().split(" ").map { it.toInt() }

    println(min(min(w-x,x),min(h-y,y)))
}