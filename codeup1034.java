import java.util.Scanner;

public class codeup1034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = Integer.valueOf(a, 8);
        System.out.printf("%d", b);
    }
}