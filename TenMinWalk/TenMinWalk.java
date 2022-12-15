package TenMinWalk;

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int up = 0;
    int side = 0;
    for (char c : walk){
        switch (c) {
            case 'n' -> up++;
            case 's' -> up--;
            case 'e' -> side++;
            case 'w' -> side--;
            default -> throw new IllegalArgumentException("Invalid code letter");
        }
    }
    return up == 0 && side ==0 && walk.length == 10;
  }
}
