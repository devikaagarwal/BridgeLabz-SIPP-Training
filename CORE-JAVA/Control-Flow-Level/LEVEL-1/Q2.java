import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a > b && a > c) {
            System.out.println("A is the greatest");
        } else if(b > a && b > c) {
            System.out.println("B is the greatest");
        } else if(c > a && c > b) {
            System.out.println("C is the greatest");
        } else {
            System.out.println("All are equal or there is no single greatest number");
        }
    }
}
