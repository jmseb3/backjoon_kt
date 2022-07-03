package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.InputStreamReader


class Chapter5 {

    private val bf = BufferedReader(InputStreamReader(System.`in`))

    //https://www.acmicpc.net/problem/4673
    fun solution_4673() {

        fun selfNumber(n: Int): Int {
            var start = n
            var sum = n
            while (true) {
                if (start >= 10) {
                    sum += start % 10
                    start /= 10
                } else {
                    sum += start
                    break
                }
            }
            return sum

        }

        val data = IntArray(10000)
        for (i in 0..9999) {
            data[i] = selfNumber(i)
        }
        val answer = (IntArray(10000) { i -> i }.toSet() - data.toSet())
        answer.forEach {
            println(it)
        }
    }

    //https://www.acmicpc.net/problem/1065
    fun solution_1065() {

        fun isHansu(num:Int):Boolean{

            if(num <100){
                return true
            }else if (num < 1000){
                val z = num % 10
                val y = (num/10) % 10
                val x = (num/100)
                if((y-x) == (z-y)){
                    return true
                }
                return false

            }else {
                return false
            }

        }
        try {
            val num = bf.readLine().toInt()
            var cnt =0
            for (i in 1..num){
                if(isHansu(i)) {
                    cnt +=1
                }
            }
            println(cnt)
        } catch (e: Exception) {

        }
    }

}

fun main() {
    Chapter5().solution_1065()
}