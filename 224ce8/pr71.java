import java.util.ArrayList;
import java.util.Date;

public class pr71 {
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<Object>();
        String str = new String("abc");
        Date date = new Date();
        Loan a2 = new Loan();
        Circle a3 = new Circle();
        a1.add(str);
        a1.add(date);
        a1.add(a2);
        a1.add(a3);
        for (Object elem : a1) {
            System.out.println(elem);
        }
        System.out.println(a1);
    }
}

class Loan {
    private double balance;
    private int acc;
    Loan() {
        this.balance = 1000;
        this.acc = (int)(Math.random() * 10000);
    }
    Loan(double amount){
        this.balance = amount;
        this.acc = (int)(Math.random() * 10000);
    }
    public String toString() {
        return "Loan balance: " + this.balance + "\nLoan acc: " + this.acc;
    }


}

class Circle {
    private double radius;
    Circle() {
        this.radius = 10.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    public String toString() {
        return "Circle radius: " + this.radius;
    }

}