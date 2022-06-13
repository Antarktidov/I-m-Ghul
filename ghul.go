package main

import (
	"fmt"
	"time"
)

func main() {
	var a = 1000
	var b = 7
	for a > b {
		var c = a - b
		fmt.Println(a, " - ", b, " = ", c)
		a = c
		time.Sleep(30000)
	}
	fmt.Printf("i'm Ghul!")
}
