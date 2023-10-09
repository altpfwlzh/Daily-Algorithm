package TEST.no_1

import java.io.*

private val br = BufferedReader(InputStreamReader(System.`in`))
private val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() {
    val N : Int = br.readLine().toInt()
    val arr : MutableList<IArray> = mutableListOf<IArray>()

    repeat(N){
        arr.add(IArray(br.readLine().toInt(), it))
    }

    arr.sort()

    val max : Int = arr.withIndex().maxOf { (idx, num) ->
        num.idx - idx + 1
    }

    bw.write(max.toString())
    bw.flush()
    bw.close()
}

data class IArray(
    val num : Int,
    val idx : Int
) : Comparable<IArray>{
    override fun compareTo(other: IArray): Int {
        return num.compareTo(other.num)
    }

}