package com.wonddak.backjoon_kt.chapter9

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/9506
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val n = br.readLine().toInt()
        if (n == -1) {
            break
        }
        val numbers = mutableSetOf(1)

        for (i in 2 until n / 2) {
            if (n % i == 0) {
                numbers.add(i)
                numbers.add(n / i)
            }
        }
        val st = StringBuilder()
        st.append(n)

        if (numbers.sum() == n) {
            st.append(" = ")
            st.append(numbers.toList().sorted().joinToString(" + "))
        } else {
           st.append(" is NOT perfect.")
        }
        println(st.toString())
    }

}