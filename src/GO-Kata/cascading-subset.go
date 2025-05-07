package main 

import (
	"fmt"
)

func EachCons(arr []int, n int)[][]int {
	// create slice of two d array where i don't know the size
	var matrix [][]int 

	currentIndex := 0

	//repeat while current index is less than equal to (current index + n-1)

	for currentIndex <= currentIndex + n - 1 {
		iterator := currentIndex
		
		// create a new array with these elements ( i push try to push)
		sets = make([]int, n)

		//for each iteration create another iteration from current to lengtth n-1		
		for iterator <= iterator + n - 1 {
			append(sets, arr[iterator] )

			iterator += 1
		}

		// then push the complete array to two d array

		append(matrix, iterator)
		currentIndex += 1
	}

	return matrix
	// return the two d array. 
}

func main(){
	
}