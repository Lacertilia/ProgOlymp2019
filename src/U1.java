import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int out = 0;
        for(int i = 1; i<=in; i++){
            out += Math.pow(i,3);
        }
        System.out.println(out);
    }
}
