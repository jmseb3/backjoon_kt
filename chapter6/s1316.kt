package com.wonddak.backjoon_kt.chapter6

import java.io.BufferedReader
import java.io.InputStreamReader

// https://www.acmicpc.net/problem/1316
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    var cnt = 0
    val aCode = 'a'.code
    while (n!=0){
        n--
        val word = br.readLine().toString()
        if (word.length == 1 || word.length == 2) {
            //길이가 1 또는 2인 경우 무조건 만족
            cnt +=1
        } else {
            val lastIdxAlphabet = IntArray(26) { -1 }

            var pass = false
            for (i in word.indices) {
                val idx = word[i].code -aCode
                //처음 넣는 경우
                if (lastIdxAlphabet[idx] == -1) {
                    lastIdxAlphabet[idx] = i
                } else{
                    //값이 있는 경우 +1 과 idx가 같지 않다면 연속이 아님
                    if (lastIdxAlphabet[idx] + 1 != i) {
                        pass = true
                        break
                    } else {
                        lastIdxAlphabet[idx] = i
                    }
                }
            }
            if (!pass) {
                cnt +=1
            }
        }
    }
    println(cnt)
}