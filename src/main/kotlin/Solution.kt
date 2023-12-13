class Solution {
    fun numDecodings(s: String): Int {
        if (s.isEmpty()) return 0
        return when {
            s[0] == '0' -> 0
            s.length == 1 -> 1
            s.length == 2 -> {
                val dig = s.toInt()
                if ((dig in 10..26) && (s[1] != '0')) 2 else 1
            }

            s.substring(0,2).toInt() > 26 -> numDecodings(s.substring(1))
            else -> {
                val oneDig = numDecodings(s.substring(1))
                val twoDig = numDecodings(s.substring(2))

                oneDig + twoDig
            }
        }
    }
}