
/**
 * Write a description of class Array100 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array100{
   int[] list;
   public Array100(){
        list = new int[100];
        for (int i = 0; i < 100; i++){
            list[i] = i + 1;
        }
   }
   
   public void printArray(){
        System.out.println(list);
   }
   
   public static void main(){
       for (int i = 6; i > 0; i--){
           for (int j = 1; j < i; j++){
               System.out.print(j + " ");
           }
           System.out.println();
       }
    }
}
