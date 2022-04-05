import java.util.Scanner;
  
 class Main
   {
    public static void main(String[] args) {
      
        Scanner o = new Scanner(System.in);
      char z ='p';
      while(true)
        {
          z=o.next().charAt(0);
          if(z=='q') break;
          System.out.println(z);
          
        }
  
  
        
  
    }
}