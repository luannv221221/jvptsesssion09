import java.util.Scanner;

public class Demo1 {
    private int num;

    public Demo1() {
    }

    public void inputNum() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
        num = Integer.parseInt(sc.nextLine());
        if(num <= 0){
            throw new Exception("Phai so nguyen lon hon 0");
        }
        System.out.println("Gia tri so vua nhap la : "+num);
    }

}
