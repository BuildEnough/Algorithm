import java.util.HashSet;
import java.util.Scanner;

public class _3052_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> namugi = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            namugi.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(namugi.size());
    }
}