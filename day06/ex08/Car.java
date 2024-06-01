package day06.ex08;

public class Car {
  String company = "현대 자동차";
  String model;
  String color;
  int maxSpeed;

  // 생성자
  Car(){
    this("","",0);
  }

  Car(String model){
    this(model, "black", 200);
  }
  Car(String model, String color){
    this(model,color, 200);
  }
  Car(String model, String color, int maxSpeed){
    this.model =model;
    this.color= color;
    this.maxSpeed = maxSpeed;
  }
  void  display(){
    System.out.println(" 회사 : " + company );
    System.out.println(" 모델 : " + model);
    System.out.println(" 컬러 : " + color);
    System.out.println(" 최대속도 : " + maxSpeed);
  }

}
