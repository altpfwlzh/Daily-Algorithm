package TEST

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val (S : Int, P : Int) = br.readLine().split(" ").map { it.toInt() }

    var (cntA : Int, cntC : Int, cntG : Int, cntT : Int) = IntArray(4)
    val dnaList : String = br.readLine()

    repeat(P){
        when(dnaList[it]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }


    }

    val (needA : Int, needC : Int, needG : Int, needT : Int) = br.readLine().split(" ").map { it.toInt() }

    var ans = 0
    val ptr = P

    if(needA <= cntA && needC <= cntC && needG <= cntG && needT <= cntT) ans++

    while (S> ptr) {
        when(dnaList[ptr]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }

        when(dnaList[ptr - P]){
            'A' -> cntA--
            'C' -> cntC--
            'G' -> cntG--
            'T' -> cntT--
        }

        if(needA <= cntA && needC <= cntC && needG <= cntG && needT <= cntT) ans++

    }

    bw.write(ans.toString())
    bw.flush()

}