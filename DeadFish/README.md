# Make the Deadfish Swim 

## Problem Description

From [codewars](https://www.codewars.com/): Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.
```
Deadfish.parse("iiisdoso") =- new int[] {8, 64};
```

## Personal Solution Thought Process

To solve this problem, I knew I needed to iterate over each character in the string and create a switch statement to act on the value according to the rules. I considered using an ArrayList to handle the result because it is dynamic, but I abandoned the idea because I thought I would have to change it back into an integer array and that would require more code than was necessary. So, to only use an integer array I iterated through the input string twice: once to determine the size of the output array and second to operate on the value according to the rules. 


## Best Solution

```
import java.util.ArrayList;
import java.util.List;

public class DeadFish {
  public static int[] parse(String data) {
    int value = 0;
    List<Integer> result = new ArrayList<>();
    for(char letter : data.toCharArray()) {
      switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result.add(value); break;
        default: throw new IllegalArgumentException("Not valid code letter");
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
```
This solution is like my solution in that it uses a switch statement to operate on the values. But it is better than my solution because it only iterates through the string once, adding values to an ArrayList dynamically and simply casting the ArrayList into an integer array in one line at the end. I'll remember that's possible for next time!
