import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
      // i had taken the input okay
   Scanner sc = new Scanner(System.in);
   int w = sc.nextInt();
   
   
   //now we want to divide it into 2 equal parts
   // use if else for it
   if(w%2 == 0 && w>2){
       System.out.println("YES");
   } else{
       System.out.println("NO");
   } 
   
  }
}
