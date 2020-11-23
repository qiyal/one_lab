import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // given array, find sum / n

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        double sum = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int a : arr)
            sum += a;

        System.out.println(sum/n);
    }
}
