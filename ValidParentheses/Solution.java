import java.util.*; 

public class Solution{
  
  public static boolean validParentheses(String parens)
  {
    int openCount = 0;
    
    List<Character> myList = new ArrayList<Character>();
        
    for ( int i = 0; i<parens.length(); i++){
        myList.add(parens.charAt(i));
    }
        
    for (Character c : myList){
        if (c == ')' && openCount ==0){
            return false; 
        }
        else if (c == '('){
            openCount++;
        }
        else if (c == ')' && openCount > 0){
            openCount--;
        } 
    }
    
    if (openCount == 0) {
        return true; 
    }
    else {
        return false; 
    }
  }
}