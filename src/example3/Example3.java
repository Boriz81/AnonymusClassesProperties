package example3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Divider.divide(a, b, new Callback() {
            static int c;

            static {
                c = 50;
            }
            @Override
            public void calculated(int result) {
                String textToPrint = String.format("%d / %d это %в", a, b, result);
                print(textToPrint);
            }

            @Override
            public void failed(String errorMsg) {
                print(errorMsg);
            }

        });
    }
    public static void print(String result) {
        System.out.println(result);
    }
}
