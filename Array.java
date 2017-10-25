
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array{
    int[] list;
    int[] list2;
    public Array(){
        list = new int[10000];
        list2 = new int[10000];
        for (int i = 0; i < 10000; i++){
            list[i] = i + 1;
        }
        list2 = list;
        list[0] = 2017;
    }
    
    public Array(int n){
        list = new int[n];
        for (int i = 0; i < n; i++){
            list[i] = i + 1;
        }
    }
    
    public void printArray(){
        System.out.println(list);
    }
}
