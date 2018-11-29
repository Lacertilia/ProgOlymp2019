import java.util.Scanner;

public class U5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Storlek?");
        int size = scan.nextInt();
        int[] row = new int[size];
        int[] col = new int[size];
        int max = 0;
        for(int i = 1; i<=size; i++){
            System.out.println("Rad " + i + ", högsta stapel?");
            row[(i-1)] = scan.nextInt();
        }
        for(int i = 1; i<=size; i++){
            System.out.println("Kolumn " + i + ", högsta stapel?");
            col[(i-1)] = scan.nextInt();
        }
    }
}
