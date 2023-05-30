package main

import (
	"fmt"
	"strings"
)

func input() string {
	var input string
	fmt.Scanln(&input)
	return input
	// fmt.Println(input)

}
func indexOf(str string) int {
	sum := input()
	var index int = strings.IndexAny(sum, str)
	fmt.Println(index)
	return index
}

func main() {
	indexOf("x")
}

//currently not working but im taking a short break so i want to commit the changes

func allIndexOf(str string) int {
	sum := input()
	var characterCheck bool
	var locationOfX int
	LoXIncreaser := locationOfX + 1
	characterCheck = strings.Contains(sum, str)
	if characterCheck == true {
		locationOfX = strings.IndexAny(sum, str)
		for locationOfX <= 0 {
			locationOfX = strings.IndexAny(sum, str)
			LoXIncreaser++
			fmt.Println(locationOfX)
			return locationOfX
		}
	}
	// var a int = strings.Index(input, str)	// return a
	return 0
}
