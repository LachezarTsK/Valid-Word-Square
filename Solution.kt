
class Solution {

    fun validWordSquare(words: List<String>): Boolean {
        val numberOfWords = words.size

        for (row in words.indices) {
            if (words[row].length > numberOfWords) {
                return false
            }
            for (column in words[row].indices) {
                if (words[column].length - 1 < row || words[column][row] != words[row][column]) {
                    return false
                }
            }
        }
        return true
    }
}
