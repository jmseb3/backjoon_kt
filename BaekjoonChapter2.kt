package com.wonddak.backjoon_kt

import java.util.*
import kotlin.math.max

class Chapter2 {
    val sc: Scanner = Scanner(System.`in`)

    fun solution_1330() {
        val num1 = sc.nextInt()
        val num2 = sc.nextInt()
        if (num1 < num2) {
            println("<")
        } else if (num1 > num2) {
            println(">")
        } else {
            println("==")
        }
    }

    fun solution_9498() {
        val score = sc.nextInt()
        when {
            score >= 90 -> {
                println("A")
            }
            score >= 80 -> {
                println("B")
            }
            score >= 70 -> {
                println("C")
            }
            score >= 60 -> {
                println("D")
            }
            else -> {
                println("F")
            }
        }
    }

    fun solution_2753() {
        val year = sc.nextInt()
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            println("1")
        } else {
            println("0")
        }

    }

    fun solution_14681() {
        val x = sc.nextInt()
        val y = sc.nextInt()
        var result = 0
        result = if (x > 0) {
            if (y > 0) {
                1
            } else {
                4

            }
        } else {
            if (y > 0) {
                2
            } else {
                3
            }
        }

        println(result.toString())
    }

    fun solution_2884() {
        val hour = sc.nextInt()
        val min = sc.nextInt()
        if (min >= 45) {
            println("$hour ${min - 45}")
        } else {
            println("${if (hour == 0) 23 else hour - 1} ${min + 15}")
        }
    }

    fun solution_2525() {
        val hour = sc.nextInt()
        val min = sc.nextInt()
        val time = sc.nextInt()

        val temp = min + time
        val nHour = hour + temp / 60

        println("${nHour % 24} ${temp % 60}")
    }

    fun solution_2480() {

        val data = mutableListOf<Int>()
        for (i in 0..2) {
            data.add(sc.nextInt())
        }
        data.sort()

        when (data.toSet().size) {
            1 -> {
                println(10000 + 1000 * data[0])
            }
            2 -> {
                println(1000 + 100 * data[1])
            }
            else -> {
                println(100 * data[2])
            }
        }


    }
}

fun main() {
    Chapter2().solution_2480()
}