package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/1978
fun main() {
    fun isPrime(number: Int): Boolean {
        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val numbers = br.readLine().split(" ").map { it.toInt() }

    var cnt = 0

    for (number in numbers) {
        if (number == 1) {
            continue
        }

        if (isPrime(number)) {
            cnt += 1
        }
    }
    println(cnt)

}