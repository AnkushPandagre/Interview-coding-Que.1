import java.util.Scanner;

public class Tax_counter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    int tax ;

    if(income <=500000){
        tax = 0;
    }else if(income >500000 && income >=1000000){
        tax = (int) (income *.2);
    }else {
        tax = (int) (income*.3);
    }
System.out.println("your tax is " + tax);
    }
}
