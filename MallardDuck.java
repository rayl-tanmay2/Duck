public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWithLegs();
        flyBehaviour = new CanFly();
    }



    @Override
    public void display() {
        System.out.println("I am Mallard duck..");
    }
}
