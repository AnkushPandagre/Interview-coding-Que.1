// Write a Java program to input week number(1-7) and print day of week name
// using switch case.
import java.util.Scanner;

class Week{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tuesday")
            case 3:
            System.out.println("Wed");
            break;
            case 4:
            System.out.println("thu");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("nput week number(1-7) ");
        }
    }
}