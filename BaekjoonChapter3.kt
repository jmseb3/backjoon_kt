package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

class Chapter3 {
    val sc: Scanner = Scanner(System.`in`)

    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    //https://www.acmicpc.net/problem/2739
    fun solution_2739() {
        val n = sc.nextInt()
        for (i in 1..9) {
            println(String.format("%d * %d = %d", n, i, n * i))
        }
    }

    //https://www.acmicpc.net/problem/10950
    fun solution_10950() {
        val n = sc.nextInt()
        for (i in 1..n) {
            val a = sc.nextInt()
            val b = sc.nextInt()
            println(a + b)
        }
    }

    //https://www.acmicpc.net/problem/8393
    fun solution_8393() {
        var result = 0
        for (i in 1..sc.nextInt()) {
            result += i
        }
        println(result)

    }

    //https://www.acmicpc.net/problem/15552
    fun solution_15552() {
        val bf = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                val temp: List<String> = bf.readLine().split(" ")
                val result = temp[0].toInt() + temp[1].toInt()
                bw.write("$result\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/2742
    fun solution_2742() {
        val bf = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                bw.write("$i\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/11021
    fun solution_11021() {
        val bf = BufferedReader(InputStreamReader(System.`in`))
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                val temp: List<String> = bf.readLine().split(" ")
                bw.write("Case #$i: ${temp.sumOf { it.toInt() }}\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

}

fun main() {
    Chapter3().solution_11021()
}