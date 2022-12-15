# Make the Deadfish Swim 

## Problem Description

From [codewars](https://www.codewars.com/): You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.

>Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).


## Personal Solution Thought Process

To solve the problem, I wanted to simplify the cardinal direction system as much as possible. To do this I decided I could represent the x and y displacement using at least two variables: up and side. After that I arbitrarily assigned the cartesian coordinates an increment or decrement operator and used a switch statement with cases to act on the displacement variables. This solution worked out nicely and the only thing I forgot in the end was to check if the character array was exactly 10 characters in size, which is why I added the check in the return line and not at the beginning! 


## Best Solution

```
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) {
      return false;
    }
    int x = 0, y = 0;
    for (int i = 0; i < 10; i++) {
      switch (walk[i]) {
        case 'n':
          y++;
          break;
        case 'e':
          x++;
          break;
        case 's':
          y--;
          break;
        case 'w':
          x--;
          break;
      }
    }
    return x == 0 && y == 0;
  }
}
```
The highest rated solution is almost identical to my own solution, the only difference is that it checks to see if the initial character array is 10 characters long, which is a performance upgrade to my own solution. My solution checks at the end and potentially does unnecessary computations on a string that could never be true. Other than that, my solution is the same!