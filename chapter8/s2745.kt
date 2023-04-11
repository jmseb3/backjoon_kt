package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

//https://www.acmicpc.net/problem/2745
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val (n,b) = br.readLine().split(" ")

    var sum = 0
    val max = n.length
    val alphabetList = (65..65+27).map { it.toChar() }

    for (i in 0 until max) {
        val idx = max - i - 1
        val findNum  = n[i]
        if (findNum == '0') {
            continue
        }
        val convertNum = if (findNum in alphabetList) {
            findNum.code - 55
        } else {
            findNum.toString().toInt()
        }
        val multiple  = b.toDouble().pow(idx.toDouble()).toInt()
        sum += multiple * convertNum
    }
    println(sum)
}