public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j = i++;
        System.out.printf("i=%d, j=%d%n", i, j);

        i=5;
        j=0;

        j = ++i;
        System.out.printf("i=%d, j=%d", i, j);

    }
}
