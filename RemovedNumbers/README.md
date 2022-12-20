# Is my friend cheating?

## Problem Description

From [codewars](https://www.codewars.com/): 
- A friend of mine takes the sequence of all numbers from 1 to n (where n > 0).
- Within that sequence, he chooses two numbers, a and b.
- He says that the product of a and b should be equal to the sum of all numbers in the sequence, excluding a and b.
- Given a number n, could you tell me the numbers he excluded from the sequence?
The function takes the parameter: n (n is always strictly greater than 0) and returns an array or a string (depending on the language) of the form:
```
[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [{a, b}, ...]
```
with all (a, b) which are the possible removed numbers in the sequence 1 to n.

[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or ... will be sorted in increasing order of the "a".

It happens that there are several possible (a, b). The function returns an empty array (or an empty string) if no possible numbers are found which will prove that my friend has not told the truth! (Go: in this case return nil).

Examples
```
removNb(26) should return [(15, 21), (21, 15)]
or
removNb(26) should return { {15, 21}, {21, 15} }
or
removeNb(26) should return [[15, 21], [21, 15]]
or
removNb(26) should return [ {15, 21}, {21, 15} ]
or
removNb(26) should return "15 21, 21 15"
```

or
```
in C:
removNb(26) should return  {{15, 21}{21, 15}} tested by way of strings.
Function removNb should return a pointer to an allocated array of Pair pointers, each one also allocated. 
```


## Personal Solution Thought Process

When I first attempted the problem I figured it could be solved using nested for-loops. I tested every number, 0 to n, with every other number, 0 to n, in the equation: x * y = sum - (x + y). Although this approach worked, it timed out when handling the largest values of n. The big O notation of this approach is O(n^2). In order to pass all the tests without timing out I needed to optimize the function. I first tried changing the inner nested loop to only run from 0 to n - the index of the first loop, which resulted in O((n^2)/2). The resulting function was faster, but still resulted in a timeout. 
To speed up the function further someone in the comments suggested to actually solve the equation. After solving the equation for x (it could be solved for either x or y) I only needed one for loop to test every number from 0 to n. The resulting value should be an integer less than n. This results in O(n) time which is fast enough to pass all the tests! 
I loved this problem because I got to see the value of simplifying a function for improving performance. 


## Best Solution

```
import java.util.LinkedList;

public class RemovedNumbers {
  /*
  We desire: ab = 1 + ... + n - a - b
  Take advantage of b = (sum - a) / (a + 1)
  */
	public static LinkedList<long[]> removNb(long n) {
    LinkedList<long[]> numbers = new LinkedList<long[]>();
    long sum = (n * n + n) / 2;
    for (long a = 1; a < n; a++) {
      double b = (sum - a) / (double) (a + 1);
      if (b <= n && b % 1 == 0) {
        numbers.add(new long[] {a, (long) b});
      }
    }
		return numbers;
	}
}
```

The best solution was essentially the same as the solution I wrote. The only significant difference is it calculates the sum using an equation rather than a for-loop, which will result in a performance increase. Overall, it was a lovely problem to solve, and so much fun to learn from! 