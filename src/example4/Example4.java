package example4;

public class Example4 {
    public static void main(String[] args) {
        final String robotName = "Bug";
        final int robotAssemblyYear = 2112;

        SpeakingEntity robot = new SpeakingEntity() {

            static final int MAGIC_CONSTANT = 10;
            private String name;
            private int assemblyYear;

                    {
                        name = robotName;
                        assemblyYear = robotAssemblyYear;
                    }
                    @Override
                    public void sayHello() {
                        System.out.println("1010001" + MAGIC_CONSTANT);
                    }

                    @Override
                    public void sayBye() {
                        System.out.println("0101110" + MAGIC_CONSTANT);
                    }
                };
        robot.sayBye();
        robot.sayHello();

    }

}
