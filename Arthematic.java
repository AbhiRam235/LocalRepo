package LocalRepo;
import java.util.Scanner;
public class Arthematic {
    static void add(int a, int b){
        System.out.println("The sum of"+ a +" and "+ b + "is ="+ (a+b));
     }
     static void subtract(int a, int b){
        System.out.println("The sum of"+ a +" and "+ b + "is ="+ (a-b));
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        subtract(a, b);
    }
}
