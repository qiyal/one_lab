import java.util.Scanner;

public class Task4 {
    static boolean []used = new boolean[1000123];
    static int []values = new int[1000123];

    public static int rec(int n) {
        if(n == 1 || n == 0)
            return n;
        else {
            int a, b;

            if (used[n - 1])
                a = values[n - 1];
            else {
                a = rec(n - 1);
                used[n - 1] = true;
                values[n - 1] = a;
            }

            if (used[n - 2])
                b = values[n - 2];
            else {
                b = rec(n - 2);
                used[n - 2] = true;
                values[n - 2] = b;
            }
            return a + b;
        }

    }

    public static void main(String[] args) {
        // число фибоначчи

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rec(n));
    }
}
