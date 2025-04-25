package practice1.liskov;

class Bird {
    public void eat(){
        System.out.println("Bird eats");
    }
    public static void main(String[] args) {
        Bird pen = new Penguin();
        FlyingBird flyingbird = new FlyingBird();
        Penguin penguin = new Penguin();
        flyingbird.fly();
        pen.eat();
        penguin.notFly();
        penguin.eat();
    }
}
