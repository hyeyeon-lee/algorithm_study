import java.util.*;
class Main {
    public static void main(String[] args) {
        int reward = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a==b) {
            if(b==c) {
                reward = 10000 + a * 1000;
            } else {
                reward = 1000 + a * 100;
            }
        } else {
            max = a>=b ? a : b;
            if(a==c) {
                reward = 1000 + a * 100;
            } else {
                max = max >= c ? max : c;
                reward = 100* max;
            }
        }
        
        System.out.println(reward);
        
        
    }
}