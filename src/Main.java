import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int dem=0;
        int demsnt=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println(" nhap y");
        y= scanner.nextInt();
        for (int i=x;i<=y;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    dem++;
                }
            }
            if (dem==2){
                demsnt++;
                dem=0;
            }
            else {
                dem=0;
            }
        }
        System.out.println("co"+demsnt+"so nguyen to");
    }
}