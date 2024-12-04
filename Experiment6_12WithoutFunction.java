import java.util.Scanner;
public class Experiment6_12WithoutFunction {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);
        int p,l,t,L, vol;
        System.out.print("Input length = ");
        p = input12.nextInt();
        System.out.print("Input width = ");
        l = input12.nextInt();
        System.out.print("Input Heigh = ");
        t = input12.nextInt();

        L = p * l;
        System.out.println("Area of the rectangle = " + L);
        vol = p * l * t;
        System.out.println("Volume of rhe rectangle = " + vol);
        
    }
    
}
