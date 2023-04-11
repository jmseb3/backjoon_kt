import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.max
import java.lang.Integer.min

//https://www.acmicpc.net/problem/10757
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    //반대로 돌려주자 우선..
    val (a, b) = br.readLine().split(" ").map { it.reversed() }

    val minLength = min(a.length, b.length)
    val maxLength = max(a.length, b.length)

    // 짧은 길이 만큼 0 배열로 만들어줌.. 하나더 크게 하는 이유는 더해져서 크기가 커질수가 있기떄문에..
    val answer = IntArray(maxLength + 1) { 0 }
    for (i in 0 until minLength) {
        // 원래 있는 값과
        var sum = answer[i]
        //a와 b의 i번째 값을 더해줌
        sum += a[i].digitToInt()
        sum += b[i].digitToInt()

        //10보다 크다면 다음위치에 1을 넣어주고 10을 뺴줌
        if (sum >= 10) {
            answer[i + 1] = 1
            sum -= 10
        }
        answer[i] = sum
    }

    // 나머지 길이에 대하여 계산시작
    for (i in minLength until maxLength) {
        var sum = answer[i]
        if (i < a.length) {
            sum += a[i].digitToInt()
        }
        if (i < b.length) {
            sum += b[i].digitToInt()
        }
        if (sum >= 10) {
            answer[i + 1] = 1
            sum -= 10
        }
        answer[i] = sum
    }

    val result = answer.reversed().joinToString("")
    //처음이 0이면 제거해줌...
    if (result[0] == '0') {
        println(result.slice(1 until result.length))
    } else {
        println(result)
    }
}