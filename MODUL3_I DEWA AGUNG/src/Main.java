import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("\n==Menu Program==");
        System.out.println("1. Square");
        System.out.println("2. Circle");
        System.out.println("3. Trapezoid");
        System.out.println("0. Exit");
        System.out.print("Select menu: ");
        int menu = scanner.nextInt();

        switch (menu) {
          case 1:
            System.out.print("\nMasukkan panjang sisi persegi : ");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("\n Hasil kalkulasi: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\n Masukkan jari-jari(r) lingkaran : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("\n Hasil Kalkulasi: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\n Masukkan sisi atas trapesium : ");
            double a = scanner.nextDouble();
            System.out.print(" Masukkan sisi bawah trapesium : ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium : ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            calculation.run();
            System.out.println("\n Hasil kalkulasi: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\n End");
            break;
          default:
            System.out.println("\n opsi tidak valid");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\n === Error hanya masukkan angka ===");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }
    } while (repeat);

    scanner.close();
  }
}
