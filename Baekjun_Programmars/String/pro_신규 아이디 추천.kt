package Baekjun_Programmars.String

private class Solution_new_id_recommend {
    fun solution(new_id: String): String {
        val step1 = new_id.lowercase()
        val step2 = step1.replace(Regex("[^a-z0-9-_.]"), "")
        val step3 = step3(step2)
        val step4 = step3.trimStart('.').trimEnd('.')
        val step5 = step4.ifEmpty { "a" }
        val step6 = step5.take(15).trimEnd('.')
        val step7 = step7(step6)

        val answer: String = step7
        return answer
    }

    fun step2(s: String) {
        val sb = StringBuilder()
        for(c in s) {
            val ok = (c in 'a'..'z') || (c in '0'..'9') || c == '-' || c == '_' || c == '.'
        }

    }

    fun step3(s: String): String {
        val sb = StringBuilder()
        for(c in s) {
            if ( c == '.' && sb.isNotEmpty() && sb.last() == '.') continue
            sb.append(c)
        }
        return sb.toString()
    }

    fun step7(s: String): String {
        var step7 = s
        while (step7.length < 3) step7 += step7.last()
        return step7
    }
}

