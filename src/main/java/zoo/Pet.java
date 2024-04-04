package zoo;

public interface Pet {


    //public abstract methods in them
   void greetOwner(); // abstract method

    //Java version 8
    default void printPetClassName(Pet pet){
        System.out.println(pet.getClass().getSimpleName());
    }

    //static methods
    //Looping - enhanced for loop ..aka forEachLoop
    static void printPetGreeting(Pet[] pets){  //Don't Repeat Yourself
        for(Pet p : pets ){
            p.greetOwner();
        }

    }



}
