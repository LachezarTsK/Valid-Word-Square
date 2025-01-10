
using System;
using System.Collections.Generic;

public class Solution
{
    public bool ValidWordSquare(IList<string> words)
    {
        int numberOfWords = words.Count;

        // In this particular case, transforming List<string> to char[][] gives better times for C#, 
        // (as well as for Java) even with the additional cost for transformation. With the solution herewith,
        // char[][] runs several times faster than List<string>.
        char[][] arrayWords = new char[numberOfWords][];
        for (int i = 0; i < words.Count; ++i)
        {
            arrayWords[i] = words[i].ToCharArray();
        }

        for (int row = 0; row < numberOfWords; ++row)
        {
            if (arrayWords[row].Length > numberOfWords)
            {
                return false;
            }
            for (int column = 0; column < arrayWords[row].Length; ++column)
            {
                if (arrayWords[column].Length - 1 < row || arrayWords[column][row] != arrayWords[row][column])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
