package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*

class Chapter4 {

    private val bf = BufferedReader(InputStreamReader(System.`in`))

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
            for (index in 0 ..8) {
                array[index] = bf.readLine().toInt()
            }
            val max = array.maxOf { it }
            println(max)
            println(array.indexOf(max)+1)
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/2557
    fun solution_2557() {
        try {
            val a = bf.readLine().toInt()
            val b = bf.readLine().toInt()
            val c = bf.readLine().toInt()
            val cal = (a*b*c)
            val numbers = IntArray(10)
           while (true){

           }
            for (i in 1..10){
                println(numbers[i])
            }
        } catch (e: Exception) {
            println(e)
        }
    }

}

fun main() {
    Chapter4().solution_2557()
}