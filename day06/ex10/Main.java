package day06.ex10;



public class Main {
  public static void main(String[] args) {
    //Dog ,Cat
    Dog dog = new Dog ( "리트리버", 3, "gold");
   dog.sound();
   dog.sleep();
   dog.run();

   Cat cat = new Cat ("페르시안",2,"사료");
   cat.sound();
   cat.sleep();
   cat.eat();
  }
}
