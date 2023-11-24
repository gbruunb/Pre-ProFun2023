import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Lab Score: ");
        int Lab = sc.nextInt();

        System.out.print("Input Midterm Score: ");
        int Midterm = sc.nextInt();

        System.out.print("Input Final Score: ");
        int Final = sc.nextInt();

        if ((Lab >= 0 && Lab <= 30) && (Midterm >= 0 && Midterm <= 30) && (Final >= 0 && Final <= 40)) {

        }

    }
}
