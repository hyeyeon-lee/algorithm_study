class Main {
  public static void main(String[] args) {
    System.out.println(max4(1,5,6,4));
    System.out.println(max4(1,5,6,8));
    System.out.println(max4(8,5,6,4));
    System.out.println(max4(1,7,3,4));
    System.out.println(max4(6,4,2,9));
   
  }
  static int max4(int a, int b, int c, int d){
    int max = a;
    if(b > max) max = b;
    if(c > max) max = c;
    if(d > max) max = d;

    return max;
  }
}