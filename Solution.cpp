
#include <vector>
#include <string>
using namespace std;

class Solution {

public:
    bool validWordSquare(const vector<string>& words) const {
        size_t numberOfWords = words.size();

        for (int row = 0; row < numberOfWords; ++row) {
            if (words[row].length() > numberOfWords) {
                return false;
            }
            for (int column = 0; column < words[row].length(); ++column) {
                if (words[column].length() - 1 < row || words[column][row] != words[row][column]) {
                    return false;
                }
            }
        }
        return true;
    }
};
