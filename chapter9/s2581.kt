package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/2581
fun main() {
    fun isPrime(number: Int): Boolean {
        if (number == 1) {
            return false
        }
        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

    val br = BufferedReader(InputStreamReader(System.`in`))
    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    val primes = arrayListOf<Int>()

    for (number in m..n) {
        if (isPrime(number)) {
            primes.add(number)
        }
    }
    if (primes.isEmpty()) {
        println(-1)
    } else {
        println(primes.sum())
        println(primes[0])
    }
}