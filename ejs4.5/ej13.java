import java.util.*;
public class ej13{
  public static void main(String[] args){
   double a,b,c;
   int [] arr = new int[3];
   System.out.println("Introduce 3 numeros, y te los ordenare");
   
   Scanner S = new Scanner(System.in);
   for (int i = 0; i< arr.length;i++){
     arr[i] = S.nextInt();
   }
   S.close();
   
   Arrays.sort(arr);
   
   System.out.println("-------------- de menor a mayor:");
   for (int i=0;i<arr.length;i++){
     System.out.println(arr[i]);
   }
   System.out.println("-------------- de mayor a menor:");
  for (int i=arr.length-1; i>=0; i--){
    System.out.println(arr[i]);
  }

}
}
