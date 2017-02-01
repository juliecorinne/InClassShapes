public class Main {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        char asterisk = '#';
        char space = ' ';

        System.out.println("#######");

        for (i = 1; i <= 5; ++i) {


            for (j = 2; j <= 2; ++j) {

                System.out.print(asterisk);

                for (k = 1; k < 6; ++k) {

                    System.out.print(space);
                }

            }



            System.out.println(asterisk);
        }
        System.out.println("#######");


        }
    }


        /*for (i = 2; i <= 3; ++i) {

            System.out.println(asterisk);

            for (j = 1; j <= 6; ++j) {

                System.out.print(asterisk);
            }

            for (j = 1; j <=7; ++j) {

                System.out.println(asterisk);
            }*/