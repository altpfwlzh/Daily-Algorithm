package Baekjun_Programmars.Simulation

// 크레인 인형뽑기 게임
private class Solution_pro_doll_gacha {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var removedCnt = 0
        val basket = mutableListOf<Int>()

        for (move in moves) { //1,5,3,5,1,2,1,4
            val col = move - 1

            for (row in board.indices) { // 0,1,2,3,4
                val doll = board[row][col]

                if( doll != 0) {
                    board[row][col] = 0

                    if(basket.isNotEmpty() && basket.last() == doll) {
                        basket.removeAt(basket.lastIndex)
                        removedCnt += 2
                    } else {
                        basket.add(doll)
                    }

                    break
                }
            }
        }
        return removedCnt
    }
}