
import java.util.List;

public class Solution {

    public boolean validWordSquare(List<String> words) {
        int numberOfWords = words.size();

        // In this particular case, transforming List<String> to char[][] gives better times for Java, 
        // (as well as for C#) even with the additional cost for transformation. With the solution herewith, 
        // char[][] runs several times faster than List<String>.
        char[][] arrayWords = new char[numberOfWords][];
        for (int i = 0; i < words.size(); ++i) {
            arrayWords[i] = words.get(i).toCharArray();
        }

        for (int row = 0; row < numberOfWords; ++row) {
            if (arrayWords[row].length > numberOfWords) {
                return false;
            }
            for (int column = 0; column < arrayWords[row].length; ++column) {
                if (arrayWords[column].length - 1 < row || arrayWords[column][row] != arrayWords[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
}
