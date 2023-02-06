package example1;

public class Human {

    public void takeMilkshake () {
        HumanThought thought = new HumanThought() {
            @Override
            public void print() {
                System.out.println("Что же взять?" + "Шоколадный или клубничный коктейль");
            }
        };
        thought.print();
    }
}
