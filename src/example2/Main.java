package example2;

public class Main {

    public static void main(String[] args) {

        //Анонимный класс создан как аргумент конструктора
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run, run, run!");
            }

        });
        t.run();
    }
}