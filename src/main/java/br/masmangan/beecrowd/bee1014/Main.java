import java.util.Scanner;


public class Main {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    FuelConsumption fuelConsumption = new FuelConsumption();
    fuelConsumption.setDistance(x);
    fuelConsumption.setFuel(y);
    double k = fuelConsumption.getConsumption();
    System.out.println(String.format("%.3f km/l", k));

 }

}