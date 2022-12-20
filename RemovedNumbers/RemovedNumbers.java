package RemovedNumbers;

import java.util.List;
import java.util.ArrayList;

public class RemovedNumbers {
  public static List<long[]> removNb(long n) {
    double sum = 0;
    List<long[]> result = new ArrayList<>();
    for (int i = 0; i <= n; i++){
        sum+=i;
    }
    for (int i = 0; i <= n; i++){
        double res = ( sum - i )/(i + 1);
        if (res % 1 == 0 && res < n ){
            long x = (long) res;
            result.add(new long[] {i, x});
        }
    }

    return result;
  }
}