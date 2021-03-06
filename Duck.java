public class Duck implements Fly, Quack{

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.quack();
        duck.swim();
        duck.fly();

    }
    public void swim() {
        System.out.println("Плаваю");
    }

}
