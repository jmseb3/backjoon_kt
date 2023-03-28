package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*
import kotlin.math.round

class Chapter4 {

    private val bf = BufferedReader(InputStreamReader(System.`in`))

    //https://www.acmicpc.net/problem/10807
    fun solution_10807() {
        try {
            val n = bf.readLine().toInt()
            val array = bf.readLine().split(" ").map { it.toInt() }
            val v = bf.readLine().toInt()
            println(array.filter { it == v }.size)
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/10871
    fun solution_10871() {
        try {
            val (n,x) = bf.readLine().split(" ").map { it.toInt() }
            val array = bf.readLine().split(" ").map { it.toInt() }
            println(array.filter { it < x }.joinToString(" "))
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/10818
    fun solution_10818() {
        try {
            val n = bf.readLine().toInt()
            val st = StringTokenizer(bf.readLine())

            val array = IntArray(n)
            for (index in 0 until n) {
                array[index] = st.nextToken().toInt()
            }
            array.sort()
            println("" + array[0] + " " + array[n - 1])
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/2562
    fun solution_2562() {
        try {
            val array = IntArray(9)
            for (index in 0..8) {
                array[index] = bf.readLine().toInt()
            }
            val max = array.maxOf { it }
            println(max)
            println(array.indexOf(max) + 1)
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/10810
    fun solution_10810() {
        val (n,m) = bf.readLine().split(" ").map { it.toInt() }
        val array = IntArray(n)
        for ( idx in 1..m) {
            val (i,j,k) = bf.readLine().split(" ").map { it.toInt() }
            for (index in i-1 until j) {
                array[index] = k
            }
        }
        println(array.joinToString(" "))
    }

    //https://www.acmicpc.net/problem/10813
    fun solution_10813() {
        val (n,m) = bf.readLine().split(" ").map { it.toInt() }
        val array = IntArray(n) {it+1}
        for ( idx in 1..m) {
            val (i,j) = bf.readLine().split(" ").map { it.toInt() - 1 }
            if (i == j) {
                continue
            }
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
        println(array.joinToString(" "))
    }

    //https://www.acmicpc.net/problem/5597
    fun solution_5597() {
        val array = (1..30).toMutableSet()
        for (i in 1 .. 28) {
            val n = bf.readLine().toInt()
            array.remove(n)
        }
        println(array.joinToString("\n"))

    }

    //https://www.acmicpc.net/problem/3052
    fun solution_3052() {
        try {
            val mSet = mutableSetOf<Int>()
            for (i in 0..9) {
                val num = bf.readLine().toInt()
                mSet.add(num % 42)
            }
            println(mSet.size)

        } catch (e: Exception) {
            println(e)
        }
    }

    //https://www.acmicpc.net/problem/10811
    fun solution_10811() {
        val (n,m) = bf.readLine().split(" ").map { it.toInt() }
        val array = IntArray(n) {it+1}
        for ( idx in 1..m) {
            val (i,j) = bf.readLine().split(" ").map { it.toInt() - 1 }
            if (i == j) {
                continue
            }
            val mid: Int = (i + j) / 2
            for (index in i..mid) {
                val temp = array[index]
                array[index] = array[j - index + i]
                array[j - index + i] = temp
            }
        }
        println(array.joinToString(" "))
    }

    //https://www.acmicpc.net/problem/1546
    fun solution_1546() {
        try {
            val n = bf.readLine().toInt()
            val list = mutableListOf<Double>()
            val st = StringTokenizer(bf.readLine())
            for (i in 0 until n) {
                list.add(st.nextToken().toDouble())
            }
            list.sort()
            val mMax = list.last()
            for (i in list.indices){ list[i] = (list[i]/mMax) *100 }
            println((list.sumOf { it }/ n))


        } catch (e: Exception) {
            println(e)
        }
    }
}

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val start = System.currentTimeMillis()
//    val array = bf.readLine().split(" ").map { it.toInt() }
    val st = StringTokenizer(bf.readLine())
    val array = IntArray(10)
    for (index in 0 until 10) {
        array[index] = st.nextToken().toInt()
    }
    println(array.joinToString(" "))
    val end = System.currentTimeMillis()
    println("걸린 시간 : ${end-start}")
}