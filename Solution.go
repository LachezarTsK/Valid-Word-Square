
package main

import "fmt"

func validWordSquare(words []string) bool {
    numberOfWords := len(words)

    for row := range len(words) {
        if len(words[row]) > numberOfWords {
            return false
        }
        for column := range len(words[row]) {
            if len(words[column]) - 1 < row || words[column][row] != words[row][column] {
                return false
            }
        }
    }
    return true
}
