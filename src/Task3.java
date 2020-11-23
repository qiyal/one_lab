import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // given array, find duplicate

        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println(i);
                return;
            }
            else
                map.put(arr[i], i);
        }
        System.out.println("no");
    }
}
