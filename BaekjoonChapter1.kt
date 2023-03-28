package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

class Chapter1 {
    fun solution_2557() {
        println("Hello World!")
    }

    fun solution_10718() {
        for (i in 0..1) {
            println("강한친구 대한육군")
        }
    }

    fun solution_10171() {
        println("\\    /\\\n )  ( \')\n(  /  ) \n \\(__)|")
    }

    fun solution_250832() {
        println("         ,r'\"7")
        println("r`-_   ,'  ,/")
        println(" \\. \". L_r'")
        println("   `~\\/")
        println("      |")
        println("      |")
    }

    fun solution_1000() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a + b)

    }

    fun solution_1001() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a - b)

    }

    fun solution_10998() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a * b)

    }

    fun solution_1008() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextDouble()
        val b = sc.nextDouble()
        println(a / b)

    }

    fun solution_10869() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a + b)
        println(a - b)
        println(a * b)
        println(a / b)
        println(a % b)

    }

    fun solution_10926() {
        val sc: Scanner = Scanner(System.`in`)
        println(sc.next() + "??!")
    }

    fun solution_18108() {
        val sc: Scanner = Scanner(System.`in`)
        println(sc.nextInt() - (2541 - 1998))
    }

    fun solution_3003() {
        val bf = BufferedReader(InputStreamReader(System.`in`))
        val answer = StringBuilder()
        bf.readLine().split(" ") .zip(listOf(1,1,2,2,2,8)) {read,standard ->
            answer.append(standard - read.toInt())
            answer.append(" ")
        }
        println(answer.toString())

    }

    fun solution_10430() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()
        println((a + b) % c)
        println(((a % c) + (b % c)) % c)
        println((a * b) % c)
        println(((a % c) * (b % c)) % c)
    }


    fun solution_2588() {
        val sc: Scanner = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        val temp1 = a * (b % 10)
        val temp2 = a * ((b / 10) % 10)
        val temp3 = a * ((b / 100) % 10)
        println(temp1)
        println(temp2)
        println(temp3)
        println(temp3 * 100 + temp2 * 10 + temp1)


    }

    fun solution_11382() {
        val bf = BufferedReader(InputStreamReader(System.`in`))

        try {
            println(bf.readLine().split(" ").map { it.toLong() }.sumOf { it })
        }catch (e:Exception) {
            e.printStackTrace()
        }


        bf.close()
    }


}

fun main() {
    Chapter1().solution_11382()
}