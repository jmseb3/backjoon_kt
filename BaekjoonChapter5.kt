package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max


class Chapter5 {

    private val bf = BufferedReader(InputStreamReader(System.`in`))

    //https://www.acmicpc.net/problem/27866
    fun solution27866() {
        val s = bf.readLine().toString()
        val i = bf.readLine().toInt()
        println(s[i-1])
    }

    //https://www.acmicpc.net/problem/2743
    fun solution2743() {
        println(bf.readLine().toString().length)
    }

    //https://www.acmicpc.net/problem/9086
    fun solution9086() {
        val t = bf.readLine().toInt()
        val result = mutableListOf<String>()
        for (i in 1..t) {
            val word = bf.readLine().toString()
            result.add("${word[0]}${word[word.length-1]}")
        }
        println(result.joinToString("\n"))
    }

    //https://www.acmicpc.net/problem/11654
    fun solution11654() {
        val t = bf.readLine().toString().toCharArray()
        println(t[0].code)
    }


    //https://www.acmicpc.net/problem/11720
    fun solution11720() {
        val t = bf.readLine().toInt()
        val numbers = bf.readLine().toCharArray()
        println(numbers.map { it.toString().toInt() }.sumOf { it })
    }

    //https://www.acmicpc.net/problem/10809
    fun solution10809() {
        val word = bf.readLine()
        val result = IntArray(26) { -1 }
        val aCode :Int = 'a'.code
        word.forEachIndexed { index,  alphabet ->
            val findIndex = alphabet.code - aCode
            if (result[findIndex] == -1) {
                result[findIndex] = index
            }
        }
        println(result.joinToString(" "))
    }

    //https://www.acmicpc.net/problem/2675
    fun solution2675() {
        val t = bf.readLine().toInt()
        for (cnt in 1..t) {
            val (r,s) = bf.readLine().split(" ")
            val result = s.map { it.toString().repeat(r.toInt()) }
            println(result.joinToString(""))
        }
    }

    //https://www.acmicpc.net/problem/1152
    fun solution1152() {
        val s = bf.readLine()
        if (s == "") {
            println(0)
        } else {
            println(s.trim().split(" ").size)
        }
    }

    //https://www.acmicpc.net/problem/2908
    fun solution2908() {
        val (n,m) = bf.readLine().split(" ")
        println(max(n.reversed().toInt(),m.reversed().toInt()))
    }


    //https://www.acmicpc.net/problem/5622
    fun solution5622() {
        val array = listOf(
            3,3,3,
            4,4,4,
            5,5,5,
            6,6,6,
            7,7,7,
            8,8,8,8,
            9,9,9,
            10,10,10,10
        )

        val word = bf.readLine().toCharArray()
        println(word.map { array[it.code-'A'.code] }.sumOf { it })
    }

    //https://www.acmicpc.net/problem/11718
    fun solution11718() {
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        while (true) {
            val read = bf.readLine()
            if (read == null || read.isEmpty()) {
                break
            }
            bw.write(read)
            bw.write("\n")
        }
        bw.flush()
    }
}

fun main() {
    Chapter5().solution11718()
}