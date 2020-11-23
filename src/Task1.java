import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // given array, find max element

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [] array = new int [n];

        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        int max = array[0];
        for(int i = 1; i < n; i++) {
            if(max < array[i])
                max = array[i];
        }

        System.out.println(max);
    }
}
