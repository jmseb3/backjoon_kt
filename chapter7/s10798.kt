package com.wonddak.backjoon_kt.chapter7

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/10798
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val res : ArrayList<String> = arrayListOf()
    var max = 1
    for (i in 1 .. 5) {
        val line = br.readLine().toString()
        if (line.length > max) {
            max = line.length
        }
        res.add(line)
    }
    for (idx in 0 until  max) {
        for (nIdx in 0 .. 4) {
            val word = res[nIdx]
            if (word.length >= idx +1) {
                print(res[nIdx][idx])
            }
        }
    }
}