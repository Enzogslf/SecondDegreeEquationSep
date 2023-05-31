package main

import (
	"fmt"
	"strings"
)

func input() string {
	var input string
	fmt.Scanln(&input)
	return input
}
func allIndexOf(str string) int {
	sum := input()
	var characterCheck bool
	characterCheck = strings.ContainsAny(sum, str)
	var allindexes = strings.Count(sum, str)
	fmt.Println(characterCheck)
	return allindexes
}
func main() {
	allIndexOf("x")
}
