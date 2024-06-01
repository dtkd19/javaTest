package day06.ex10;

 public class Cat extends Animal{
  String food;
  Cat(String name, int age, String food) {
    super(name,age);
    this.food = food;
  }
  void sleep(){
    System.out.println(name + "은(는) 많이 잔다.");
  }

  void  eat(){
    System.out.println(name + "의 음식은" + food + "를 먹습니다.");
  }


}
