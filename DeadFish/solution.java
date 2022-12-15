public class DeadFish {
    public static int[] parse(String data) {
      int value = 0;
      int arraySize = 0;
      int placeHolder = 0;
      for (int i = 0; i<data.length(); i++){
          if (data.charAt(i) == 'o'){
              arraySize++;
          }
      }
      int[] result = new int[arraySize];
      for (int i = 0; i<data.length(); i++){
          
          switch (data.charAt(i)) {
              case 'i' -> value++;
              case 'd' -> value--;
              case 's' -> value = value * value;
              case 'o' -> {result[placeHolder] = value; placeHolder++;}
              default -> {}
          }
      }
      return result;
    }
}