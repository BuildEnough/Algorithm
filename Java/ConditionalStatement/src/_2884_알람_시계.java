import java.util.Scanner;
public class _2884_ěë_ěęł {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();

        minute -= 45;

        if (minute < 0) {
            hour -= 1;
            minute += 60;
            if (minute >= 60) {
                hour -= 1;
                minute -= 45;
            }
            if (hour < 0) {
                hour = 23;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
