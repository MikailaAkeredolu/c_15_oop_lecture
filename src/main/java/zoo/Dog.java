package zoo;

public class Dog extends Canine implements Pet{

    public Dog(String food) {
        super(food);
    }


    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }

    public void fetch(){
        System.out.println("I can fetch cos i am a dog");
    }


    @Override
    public void greetOwner() {
        System.out.println("lick feet");
    }
}
