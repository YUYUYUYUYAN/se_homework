import java.util.Random;
public class Sortinsert {
    public static void main(String[] args){
        Random rd = new Random();
        int[] arr = new int[5000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = rd.nextInt(200)+1;
        }
        sortInsert(arr);
    }
    static void sortInsert(int[] arr){
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr[j],arr[j-1]);
                }
                else {
                    break;
                }
                //systemArr(arr);\
            }
        }
    }
    static void swap(int a,int b){
        int c = b;
        b = a;
        a = c;
    }
    static void systemArr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}}