# Valid Parentheses

## Problem Description

From [codewars](https://www.codewars.com/): write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.

Examples
```
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
```

Constraints
```
0 <= input.length <= 100
```


## Personal Solution Thought Process

I began by considering what the most important conditions where which would make the string of parentheses false, based on the requirements of the problem. I first considered pairing the open and closed parentheses to make sets and remove them from the string to leave behind the unpaired parentheses. Then I could see if the string was empty or not and if it was return true meaning the original string contained all valid parentheses. 

As I began to code this, I realized it would be challenging to keep track of the valid sets and remove them, and that instead, all I really needed to do was count the number of closed and open parentheses separately and subtract those two sums. To further simplify this concept, I create just one variable to hold the number of open, unpaired parentheses and subtracted the closed parentheses as I encountered it when traversing the string. I used a linked list to hold the original string so that I could use a for each loop to traverse it easily. Then I added if statements to alert for open and closed parentheses. I added one special condition to catch any string that began with a closed parentheses to immediately return false without traversing the entire string. 


## Best Solution

```
public class Solution{
  
  public static boolean validParentheses(String str) {
    
    int count = 0;
    
    for(int i = 0; i < str.length(); i++) {
      
      if(str.charAt(i) == '(') count++;
        else if(str.charAt(i) == ')') count--;
      if(count < 0) return false;
    }
    if(count == 0) return true;
    else return false;
  }
}
```

The best solution is remarkably similar to my own. One advantage is that it does not use a linked list and instead uses the original string. It also uses less lines, which is good for performace, although it is technically less readable. I think the readility difference is negligible due to the simplicity of the program. I think my program is has one benefit over the best solution in that I have special case to catch strings which begin with a closing parentheses and terminate the program. This will improve performace if this case is more than marginally common. It is hard to tell how important the special case would be without more sample data. 