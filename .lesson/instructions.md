# Lab 6
### Searching...

#### Objective: 
Write a program that performs a linear search and a binary search on various arrays, and use the Arrays class.

A) Write a method that will set up an array for searching.  Set the size of the array to a random number between 20 and 50 inclusive and then fill the array with random integers between 0 and 99 inclusive.  
 
B) Write a method that will print the elements in the array, going across the screen, 10 numbers to a line formatted as seen below. Note: do not include the top line in the method you will print that before you call it.
		
```
Original array of 25 elements:
10  3 23 18 92 11  6 99 20 42 
42 13 48 84 33 86 15 12 88 40
 2  7 64 41 77
 ```
C) Write a linear search method `linearSearch` that searches for an input value, displaying the location of the element, and returning number of probes, comparisons needed to find that element.  The method should take in as parameters the array and number to search for.  A linear search starts at the beginning of a list and goes to the end looking for a value.  Stopping at the first one it finds.  You should display location -1 if the element does not exist in the array.

D) Write two binary search methods, one recursive - `recBinSearch` and one iterative - `iterBinSearch` .  A binary search only works on sorted lists, and it’s process is such: look at the middle element (use int math) . Is this the number you are looking for? **Yes** - You are done, display the location and return the probe count. **No** - then determine if the number you are looking for is larger or smaller than the middle number? If *smaller* go to the middle of left side of the array, If *larger* go to the middle of the right side of the array and repeat the process. A probe is counted as a comparison between the element sought and an element in the array.  Note you only count when you are looking at the element in the array to see if it is the one you are looking for.  DO NOT count <  or > checks if the value is not the one you want.  The methods need to take parameters, the array and value you are searching for.

E) Finally write a program that demonstrates all of this in the order listed below in the sample run.


** Important Information: **

When you need to sort the array in ascending order using the Arrays sort method.  It will do the sorting for you automagically.  `Arrays.sort(list);`

When you need to perform Java’s built-in binary search method in the Arrays class to see if the item exists in the list..   `Arrays.binarySearch(list,value);` This method returns the location of value if it exists otherwise?  Use that information to display the proper result.


***

### Scoring Guide

| Requirement | Possible Points |
| :---        |    :----:   | 
| On time submission | 4 | 
| Header filled in with name, block, etc. | 2 |
| Correctly uploaded zipped replit project to Google Classroom | 2 |
| Correctly setup and filled random sized array | 3 |
| Correctly Displayed the array | 2 |
| Correct Linear Search Method run two times with probe count | 4 |
| Correct Display, Sort and Display Array | 3 |
| Correct usage of built-in binary search, two times| 4 |
| Correct iterative binary search with probe count two times| 4 |
| Correct recursive binary search with probe count two times | 4 |
| **Total:** | **32** |

***  

### Here is what a sample run of this program should look like: 

```

Linear Search:

Original array of 25 elements:
10  3 23 18 92 11  6 99 20 42 
42 13 48 84 33 86 15 12 88 40
 2  7 64 41 77

What entry? 12
	status: found at index 17 after 18 probes.

What entry? 170
	status: found at index -1 after 25 probes.

Binary Search:

Original array of 25 elements:
10  3 23 18 92 11  6 99 20 42 
42 13 48 84 33 86 15 12 88 40
 2  7 64 41 77

Sorted array of 25 elements:
 2  3  6  7 10 11 12 13 15 18 
20 23 33 40 41 42 42 48 64 77
84 86 88 92 99


Built-in Binary Search:

What entry? 12
	status: found at index 6.   
What entry? 170
	status: not found.

My iterative Binary Search:      
  
What entry? 12
	status: found at index 6 after 4 probes.   
What entry? 170
	status: not found after 5 probes.

My Recursive Binary Search:      
  
What entry? 12
	status: found at index 6 after 4 probes.   
 What entry? 170
	status: not found after 6 probes.
```