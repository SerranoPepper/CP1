public class specialEleven {
	public static void main(String[] args) {
    System.out.println(specialEleven(22));
    System.out.println(specialEleven(23));
    System.out.println(specialEleven(24));

 }




  public static boolean specialEleven(int n){


	int z = n % 11;
	
    
    if(z == 0){
      return true;
    } else if(z == 1){
      return true;
    }

    return false;
  }


  
}