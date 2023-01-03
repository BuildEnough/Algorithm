import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int oven = scan.nextInt();

        int min = 60 * hour + minute;
        min += oven;

        hour = (min / 60) % 24;
        minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}