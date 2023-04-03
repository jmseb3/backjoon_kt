package com.wonddak.backjoon_kt.chapter6

// https://www.acmicpc.net/problem/25083
fun main() {
    StringBuilder().apply {
        append("         ,r'\"7\n")
        append("r`-_   ,'  ,/\n")
        append(" \\. \". L_r'\n")
        append("   `~\\/\n")
        append("      |\n")
        append("      |\n")
    }.also {
        println(it.toString())
    }
}