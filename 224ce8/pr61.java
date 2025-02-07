import java.util.Scanner;
public class pr61{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        sc.close();
        if(a1.contains("+")){
            
        
        String[] a2 = a1.split("\\+");
        a2[0] = a2[0].trim();
        a2[1] = a2[1].trim();
        int num1 = Integer.parseInt(a2[0]);
        int num2 = Integer.parseInt(a2[1]);
        System.out.println(num1+num2);
        }
        if(a1.contains("-")){
            
        
        String[] a2 = a1.split("\\-");
        a2[0] = a2[0].trim();
        a2[1] = a2[1].trim();
        int num1 = Integer.parseInt(a2[0]);
        int num2 = Integer.parseInt(a2[1]);
        System.out.println(num1-num2);
        }
        if(a1.contains("*")){
            
        String[] a2 = a1.split("\\*");
        a2[0] = a2[0].trim();
        a2[1] = a2[1].trim();
        int num1 = Integer.parseInt(a2[0]);
        int num2 = Integer.parseInt(a2[1]);
        System.out.println(num1*num2);
        }
        if(a1.contains("/")){
            
        String[] a2 = a1.split("\\/");
        a2[0] = a2[0].trim();
        a2[1] = a2[1].trim();
        int num1 = Integer.parseInt(a2[0]);
        int num2 = Integer.parseInt(a2[1]);
        System.out.println(num1/num2);
        }

    }
}