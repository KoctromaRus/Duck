public class ReactDuck extends Duck implements Fly {
    public static void main(String[] args) {

        ReactDuck reactDuck = new ReactDuck();
        reactDuck.swim();
        reactDuck.fly();
        reactDuck.reactFly();
    }
    public void reactFly(){
        System.out.println("С реактивным двигателем.");
    }

}
