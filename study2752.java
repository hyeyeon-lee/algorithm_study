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
        
        Arrays.sort(arr);

        for(int i = 0; i < 3 ; i++) {
          if(i<2)
            System.out.print(arr[i]+" ");
          else
            System.out.print(arr[i]);
		}
    }
}
