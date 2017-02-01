public class Main {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        char asterisk = '#';

        for (i = 1; i <= 8; ++i) {

            for (j = 7; j > i - 1; j--) {

                System.out.print(asterisk);

            }

            System.out.println(asterisk);
        }
    }
}
