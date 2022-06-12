package com.wonddak.backjoon_kt

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Exception
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

    //https://www.acmicpc.net/problem/11022
    fun solution_11022() {
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                val temp: List<String> = bf.readLine().split(" ")
                bw.write("Case #$i: ${temp[0]} + ${temp[1]} = ${temp.sumOf { it.toInt() }}\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }

    //https://www.acmicpc.net/problem/2438
    fun solution_2438() {
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                bw.write("*".repeat(i) + "\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/2439
    fun solution_2439() {
        try {
            val n = bf.readLine().toInt()
            for (i in 1..n) {
                bw.write(" ".repeat(n - i) + "*".repeat(i) + "\n")
            }
            bw.flush()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/10871
    fun solution_10871() {
        try {
            var st = StringTokenizer(bf.readLine())
            val n = st.nextToken().toInt()
            val x = st.nextToken().toInt()

            val sb = StringBuilder()
            st = StringTokenizer(bf.readLine())

            for (i in 0 until n) {
                val value = st.nextToken().toInt()
                if (value < x) sb.append(value).append(' ')
            }
            println(sb)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/10952
    fun solution_10952() {
        try {
            var flag = true
            while (flag) {
                val st = StringTokenizer(bf.readLine())
                val n = st.nextToken().toInt()
                val x = st.nextToken().toInt()

                if (n == 0 && x == 0) {
                    flag = false
                    break
                }
                println(n + x)
            }

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/10951
    fun solution_10951() {
        try {
            var flag = true
            while (flag) {
                try {
                    val st = StringTokenizer(bf.readLine())
                    val n = st.nextToken().toInt()
                    val x = st.nextToken().toInt()
                    println(n + x)
                } catch (e: Exception) {
                    flag = false
                    break
                }

            }

        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }

    //https://www.acmicpc.net/problem/1110
    fun solution_1110() {
        try {
            val n = bf.readLine().toInt()
            var start = n
            var cnt = 0
            while (true) {
                cnt ++
                val first = start / 10
                val second = start % 10
                val sumX = first +second
                val next = second*10 + sumX%10

                if (next == n) {
                    println(cnt)
                    break
                }
                start = next
            }


        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

    }


}

fun main() {
    Chapter3().solution_1110()
}