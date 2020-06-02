import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        System.out.println(getGrade(score));
    }
    public static char getGrade(int scr) {
      if(scr >= 90) return 'A';
        else if(scr >= 80) return 'B';
        else if(scr >= 70) return 'C';
        else if(scr >= 60) return 'D';
        else return 'F';
    }
}