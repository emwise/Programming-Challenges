# Detect Pangram 

## Problem Description

A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.


## Personal Solution Thought Process

I originally wanted to find a function which counted the number of unique characters in the string and with the result I could compare it to 26, the number of unique characters in the alphabet. If the number of unique characters in the string is equal to 26 I would return true, the string is a pangram. I used Sets to do this at first, but I quickly ran into an issue of needing to remove all of the characters from the string that aren't letters. At this point I abandoned this idea and created my submitted solution.

I wanted to avoid the type of solution I ulimately submitted due to its redundancy.I simply created 26 if blocks each checking if the string had that particular letter and incrementing a counter. If, at the end of the function, the counter equaled 26 then the string was a pangram. 

Once I submitted my answer the best practice solution surprised me and introduced me to a new native function in JS. 


## Best Solution

```
function isPangram(string){
  string = string.toLowerCase();
  return "abcdefghijklmnopqrstuvwxyz".split("").every(function(x){
    return string.indexOf(x) !== -1;
  });
}
```

The best solution utilizes [Array.prototype.every()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/every) which runs the provided function on every element in the array. The provided function is a test and returns a boolean. This makes .every() the perfect native function to use because the problem also requires a boolean result. The provided function, in this case:
```
function(x){
    return string.indexOf(x) !== -1;
```
tests whether or not each letter in the aphabet string provided exists within the parameter string. If it does the function will return true, and if it doesnt  indexOf() will return -1 and make the statement false. This will make the entire result of .every() false and therefore isPangram() will return false. 

This solution is far better than my own because it is much fewer lines with no repeating code. This makes it easier to debug and understand quickly. Further there is less room for human error when coding this solution as opposed to my own. 