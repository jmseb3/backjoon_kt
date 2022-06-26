package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception
import java.util.*
import kotlin.math.round

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
            for (index in 0..8) {
                array[index] = bf.readLine().toInt()
            }
            val max = array.maxOf { it }
            println(max)
            println(array.indexOf(max) + 1)
        } catch (e: Exception) {

        }
    }

    //https://www.acmicpc.net/problem/2557
    fun solution_2557() {
        try {
            val a = bf.readLine().toInt()
            val b = bf.readLine().toInt()
            val c = bf.readLine().toInt()
            var cal = (a * b * c)
            val numbers = IntArray(10) { 0 }
            while (true) {
                if (cal >= 10) {
                    numbers[cal % 10] += 1
                    cal /= 10
                } else {
                    numbers[cal] += 1
                    break
                }

            }
            for (i in 0..9) {
                println(numbers[i])
            }
        } catch (e: Exception) {
            println(e)
        }

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

    //https://www.acmicpc.net/problem/8958
    fun solution_8958() {
        try {
            val n = bf.readLine().toInt()
            for (i in 0 until n) {
                val list = bf.readLine()
                var sum = 0
                var cnt = 0
                list.forEach {
                    if(it == 'O'){
                        cnt +=1
                    }else{
                        cnt = 0
                    }
                    sum +=cnt
                }
                println(sum)
            }


        } catch (e: Exception) {
            println(e)
        }
    }
        //https://www.acmicpc.net/problem/4344
    fun solution_4344() {
        try {
            val c = bf.readLine().toInt()
            for (i in 0 until c) {
                val st = StringTokenizer(bf.readLine())
                val n = st.nextToken().toInt()
                val list  = mutableListOf<Double>()
                for (j in 0 until n){
                    list.add(st.nextToken().toDouble())
                }
                val avg = (list.sumOf { it } / n)
                var cnt = 0
                list.forEach {
                    if(it >avg){
                        cnt +=1
                    }
                }
                val percent = cnt.toDouble() / n *100

                println("%.3f%%".format(percent))
            }


        } catch (e: Exception) {
            println(e)
        }
    }


}

fun main() {
    Chapter4().solution_4344()
}