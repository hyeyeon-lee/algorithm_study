import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        int[] arr = new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        
        sort(arr);


    }
    static void sort(int[] arr){
        int[] sortArr = (int[]) Arrays.sort(arr);
        for(int i : sortArr) {

        System.out.println(i);
        }
    }
}