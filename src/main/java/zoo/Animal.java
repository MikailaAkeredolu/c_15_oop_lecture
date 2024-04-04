package zoo;

public abstract class  Animal {

  //ivar , property, field, attribute
  protected String food;  //change the access modifier

  public int id;
  public static int uniqueID = 0;  // 0 static belong to the class and are shared by each instance of the class

  public Animal(String food){
    this.food = food;
    uniqueID++;
    id = uniqueID;
  }

  // 4 pillars of OOP

  //Polymorphism

  public static void printUniqueAnimalMethod(Animal animal){
      if(animal instanceof Dog){
         ((Dog) animal).fetch();
      }

    if(animal instanceof Cat){
      ((Cat) animal).scratch();
    }

  }



  public void makeSound(){
    System.out.println("unknown animal sound");
  }

  public abstract void printAnimalFood(); // signature


}
