
/**
 * @param {string[]} words
 * @return {boolean}
 */
var validWordSquare = function (words) {
    const numberOfWords = words.length;
    for (let row = 0; row < numberOfWords; ++row) {
        if (words[row].length > numberOfWords) {
            return false;
        }
        for (let column = 0; column < words[row].length; ++column) {
            if (words[column].length - 1 < row || words[column][row] !== words[row][column]) {
                return false;
            }
        }
    }
    return true;
};
