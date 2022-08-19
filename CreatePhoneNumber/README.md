# Create Phone Number

## Problem Description

From [codewars](https://www.codewars.com/): Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example
```
createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) // => returns "(123) 456-7890"
```

The returned format must be correct in order to complete this challenge.


## Personal Solution Thought Process

To solve the problem, the function only needed to insert 4 special characters in three different places in the array. I knew in JS the string can be concatinated very easily and decided to initialize a string with one of the special characters at the begining. From there all I had to do was iterate through the remainder of the values and insert the other three characters in the two places required to produce the desired string. This approach worked reasonably well, but would have become increasingly complicated with the required template for the numbers was more complex or changed depending on the input. The best solution featured a clever way to utilize a native JS function.


## Best Solution

```
function createPhoneNumber(numbers){
  var format = "(xxx) xxx-xxxx";
  
  for(var i = 0; i < numbers.length; i++)
  {
    format = format.replace('x', numbers[i]);
  }
  
  return format;
}
```
This solution is far superior to my own because it plainly shows the format the array of numbers will as a result, which makes the function easier to understand and update. This function uses [String.prototype.replace()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/replace) to return a new string with the array of numbers in the correct place and format. It does this by iterating through the given array and using replace to swap an "x" with the next number in the array. Short and sweet!