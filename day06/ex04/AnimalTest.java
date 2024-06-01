package day06.ex04;

public class AnimalTest {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.name = "Buddy";
    dog.age = 5;
    dog.address = "서울시 강남구";
    dog.favFood = " 개껌";
    Animal cat = new Animal();
    cat.name = "Kitty";
    cat.age = 3;
    cat.address = "경기도 수원시";
    cat.favFood = "참치";
    Animal panda = new Animal();
    panda.name = "Pan";
    panda.age = 7;
    panda.address = "강원도 평창군";
    panda.favFood = "대나무";
    Animal monkey = new Animal();
    monkey.name = "Momo";
    monkey.age = 4;
    monkey.address = "제주도 서귀포시";
    monkey.favFood = "바나나";

    dog.run();
    dog.eat();
    dog.info();
  }
}
