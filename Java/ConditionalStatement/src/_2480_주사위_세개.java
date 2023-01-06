import java.util.Scanner;
public class _2480_주사위_세개 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int dice1, dice2, dice3;
        dice1 = scan.nextInt();
        dice2 = scan.nextInt();
        dice3 = scan.nextInt();

        if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            int max;
            if (dice1 > dice2) {
                if (dice3 > dice1) {
                    max = dice3;
                }
                else {
                    max = dice1;
                }
            }
            else {
                if (dice3 > dice2) {
                    max = dice3;
                }
                else {
                    max = dice2;
                }
            }
            System.out.println(max * 100);
        }

        else {
            if (dice1 == dice2 && dice1 == dice3) {
                System.out.println(10000 + dice1 * 1000);
            }
            else {
                if (dice1 == dice2 || dice1 == dice3) {
                    System.out.println(1000 + dice1 * 100);
                }
                else {
                    System.out.println(1000 + dice2 * 100);
                }
            }
        }
    }
}