import java.util.Scanner;

public class codeup1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ymd[] = sc.next().split("\\.");

        int y = Integer.parseInt(ymd[0]);
        int m = Integer.parseInt(ymd[1]);
        int d = Integer.parseInt(ymd[2]);

        System.out.printf("%02d-%02d-%04d", d, m, y);
    }
    
}
