public class Main {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        char asterisk = '#';
        char space = ' ';

        for (i = 1; i <= 8; ++i) {

            for (k = 7; k > i - 1; --k) {

                System.out.print(space);
            }

            for (j = 2; j < i + 1; ++j) {

                System.out.print(asterisk);

            }

            System.out.println(asterisk);
        }
    }
}
