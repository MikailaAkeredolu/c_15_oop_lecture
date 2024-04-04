package zoo;
// cat IS-A  relationship - Inheritance Feline (extends keyword)
public class Cat extends Feline implements Pet{
    public Cat(String food) {
        super(food);
    }

    public void makeSound(){
        System.out.println("meow meow");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }


    public void scratch(){
        System.out.println("I am a cat. I scratch things");
    }

    @Override
    public void greetOwner() {
        System.out.println("lick face");
    }
}
