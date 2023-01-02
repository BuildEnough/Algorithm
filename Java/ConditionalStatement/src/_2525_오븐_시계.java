import java.util.Scanner;
public class _2525_오븐_시계 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int oven = scan.nextInt();

        minute += oven;

        if (minute >= 60) {
            hour += minute / 60;
            minute = minute % 60;
            if (hour >= 24){
                hour = 0;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
