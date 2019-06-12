public class array {
  public static void main(String[] args) {
	int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) { //assign values
            arr[i] = (int)(Math.random()*101);
      }
      for (int i = 0; i < arr.length; i++) { //output
          System.out.println(arr[i]);
      }
      
  }
}
