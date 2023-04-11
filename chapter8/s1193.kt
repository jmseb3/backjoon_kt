package com.wonddak.backjoon_kt.chapter8

import java.io.BufferedReader
import java.io.InputStreamReader

//https://www.acmicpc.net/problem/1193
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()

    //처음 0,0 으로시작
    var sum = 0
    var idx = 0

    //sum이 n보다 작을때까지만 계산시작
    while (sum < n) {
        idx += 1
        sum += idx
    }
    // 위치는 총합 -n 이 idx열에서으 위치
    val count = sum - n

    var a = 0
    var b = 0

    //나누어 떨어지는 여부로 방향 결정
    if (idx % 2 == 0) {
        a = idx - count
        b = 1 + count
    } else {
        b = idx - count
        a = 1 + count
    }
    println(String.format("%d/%d", a, b))

}