import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat");
        int num1 = 0;
        do {
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception exception){
                System.err.println("Vui long nhap vao so nguyen");
            }
        } while (true);

        System.out.println("Nhap vao so thu hai");
        int num2 = 0;
        do {
            try {
                num2 = Integer.parseInt(sc.nextLine());
                if(num2 == 0){
                    System.err.println("Vui long nhap khac 0");
                }
            } catch (Exception exception){
                System.err.println("Vui long nhap vao so nguyen");
            }
        } while (num2 == 0);
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException exception){
            System.err.println("Bạn không thể chia cho số 0");
        } finally {
            System.out.println("OK");
        }

        System.out.println("Done");
    }
}