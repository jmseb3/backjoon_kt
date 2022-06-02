package com.wonddak.backjoon_kt

import android.util.Log

class Solution {
    fun solution92334(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val map : MutableMap<String,Int> = mutableMapOf<String,Int>()
        val map2 : MutableMap<String,Int> = mutableMapOf<String,Int>()


        id_list.forEach {
            map[it] = 0
            map2[it] = 0
        }

        report.forEach {
            val test = it.split(" ")
            map[test[1]] = map[test[1]]!!+ 1
        }

        val data = map.filter { it.value >=k }

        report.forEach {
            val test = it.split(" ")
            if(test[1] in data.keys){
                map2[test[0]] = map2[test[0]]!! +1
            }
        }

        answer = {map2.map { it.value }} as IntArray

        return answer
    }
}

fun main() {
    println(
        Solution().solution92334(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            2
        )
    )
}