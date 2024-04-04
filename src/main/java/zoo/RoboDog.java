package zoo;

public class RoboDog extends Robot implements Pet{

    @Override
    public void greetOwner() {
        System.out.println("rolls on wheel and lights up");
    }
}
