package ra.bt;

import java.util.Scanner;

public class Cal {
    private int num1;
    private int num2;

    public Cal() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất ");
        do {
            try {
                num1 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception exception)
            {
                System.err.println("Phai la so nguyen vui long nhap lại");
            }
        } while (true);

        System.out.println("Nhập vào số thứ hai ");
        do {
            try {
                num2 = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception exception)
            {
                System.err.println("Phai la so nguyen vui long nhap lại");
            }
        } while (true);
    }

    public void sum(){
        System.out.println(num1+"+"+num2+"="+(num1 +num2));
    }

    public void div() throws Exception{
        if(num2 == 0){
            throw new Exception("Khong chia duoc cho so 0");
        }
        System.out.println(num1+"/"+num2+"="+num1/num2);
    }
}
