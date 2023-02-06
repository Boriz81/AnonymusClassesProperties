package createinstance;

public class CreateInstance {
        public static SuperClass create() {
            AnonimCreatClass instance = new AnonimCreatClass() {
                @Override
                public void method1() {
                    System.out.println("It's a static method.");
                }

                @Override
                public void method2() {
                    System.out.println("It's not a static method.");
                }

                @Override
                public void method3() {

                }

            };
            instance.method1();
            instance.method2();
            instance.method3();

            return null;

        }
    }
