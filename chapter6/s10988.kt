package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/10988
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val word = br.readLine().toString()
    val size = word.length
    if (size == 1) {
        println(1)
    }else {
        for (i in 0.. size/2) {
            if (word[i] != word[size-1-i]) {
                println(0)
                return
            }
        }
        println(1)
    }

}