public class Largest_Of_threeNumbers {
    public static void main(String[] args) {
        int a = 1, b= 3,c = 6;
        if((a>=b) && a>=c){
            System.out.println("large is a");
        }else if(b>=c){
           System.out.println("large number is b");
        }else{
            System.out.println("large number is c");
        }
    }
}
