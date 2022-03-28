import java.util.Scanner;


public class Main {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    double y = sc.nextDouble();
    double k = x / y;
    System.out.println(String.format("%.3f km/l", k));

 }

}