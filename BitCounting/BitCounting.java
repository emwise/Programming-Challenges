import java.util.*;

public class BitCounting {

	public static int countBits(int n){
		//in order to convert an integer into binary you must divide it by two 
    //and remember the remainders until the result of the division is 0. Then, 
    //simply concatinate the remainders in reverse order of the division and the 
    //result is the binary representation of the integer. 
    //ex. 12 / 2 = 6 R0
    //     6 / 2 = 3 R0
    //     3 / 2 = 1 R1
    //     1 / 2 = 0 R1
    // 12 in binary equals 1100
    
    Deque<Integer> remainders = new ArrayDeque<Integer>();

    while( n / 2 != 0 || n % 2 != 0){
      remainders.push(n % 2);
      n = n / 2;
    }
    
    int ans = 0;
    while(!remainders.isEmpty()){
      ans += remainders.pop();
    }
    
    return ans;
	}
  
}

