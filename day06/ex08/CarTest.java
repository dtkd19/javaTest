package day06.ex08;

public class CarTest {
  public static void main(String[] args) {
    Car car1 = new Car();

    Car car2 = new Car("테슬라");

    Car car3 = new Car("테슬라"," 검정");

    Car car4 = new Car("테슬라","검정",200);

   Car[] cars = new Car[]{car1,car2,car3,car4};

    for( Car c : cars){
      c.display();
    }

  }
}
