import java.util.Scanner;

public class Q1443 {
    // 1443 : 삽입 정렬
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int key;
        int j;

        for (int i = 1; i < n; i++) {
            key = arr[i];

            for (j = i; j > 0 && arr[j - 1] > key; j--)
                arr[j] = arr[j - 1];
            arr[j] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
