# Bit Counting

## Problem Description

From [codewars](https://www.codewars.com/): Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


## Personal Solution Thought Process

First I needed to understand how to convert an integer into binary and then recreate the process using Java. I began by creating a while loop to continue to divide the integer by 2 until it equaled zero and pushed the remainders into a stack. I chose a stack so that I could pop off the remainders in reverse order to create the binary number without needing to reverse any numbers myself. 

The problem with this approach is the while loop terminated before the last division where the result would be zero. This division is still necessary to complete the binary number calculation and I added a second condition to the while loop checking to see if the remainder is also nonzero. With both of these conditions the entire binary number is successfully generated with all inputs. 

Next, I popped off the numbers stored in the stack and added them together to get the answer to the problem. In hindsight, I did not need to use a stack because representing the actual binary number is not important, only getting the correct amount of 1s to add them together. 


## Best Solution

```
public class BitCounting {

  public static int countBits(int n){
    
    return Integer.bitCount(n);
  }
  
}
```

The best practice solution surprised me. Who knew Java had a native function to calcuate the sum of the bits in the binary representation of an integer! 

This solution is better in many ways because it is much simpler to read and is probably more performant than my solution. 