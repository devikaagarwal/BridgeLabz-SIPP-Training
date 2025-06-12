import java.util.Scanner;
public class Q1 {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0) System.out.printf("Is the number %d divisible by 5? YES",n);
        else System.out.printf("Is the number %d divisible by 5? NO",n);
    }
}
