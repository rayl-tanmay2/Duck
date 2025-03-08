public class RubberDuck extends Duck{
    public  RubberDuck(){
        quackBehaviour = new Squeak();
        swimBehaviour = new Floating();
        flyBehaviour = new CannotFly();
    }


    @Override
    public void display() {
        System.out.println("I am a rubber duck!!");
    }
}



