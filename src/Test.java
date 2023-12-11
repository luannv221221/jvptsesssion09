import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Demo1 demo1 = new Demo1();
        demo1.inputNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so");
        int num = Integer.parseInt(sc.nextLine());
    }
}
