import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Introduceti 10 numere intregi:");
        for (int i = 0; i < 10; i++)
            a[i] = in.nextInt();

        for (int j = 0; j < 10; j++) {
            int count = 0;  // Resetăm count pentru fiecare număr
            for (int k = 1; k <= a[j]; k++) {
                if (a[j] % k == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(a[j] + " este un numar prim.");
        }
    }
}