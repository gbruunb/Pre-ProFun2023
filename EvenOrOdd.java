import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " เป็นเลขคู่");
        }else{
            System.out.println(num + " เป็นเลขคี่");
        }
    }
}
