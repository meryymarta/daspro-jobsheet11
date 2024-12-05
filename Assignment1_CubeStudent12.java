import java.util.Scanner;

public class Assignment1_CubeStudent12 {
   
    public static int calculateArea(int side) {
        return 6 * side * side;
    }
    public static int calculateVolume(int side) {
        return side * side * side;
    }
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.print("Input side length of the cube: ");
        int side = input12.nextInt();

        int area = calculateArea(side);
        int volume = calculateVolume(side);

        System.out.println("Area of the Cube: " + area);
        System.out.println("Volume of the Cube: " + volume);
        }
    }


    

