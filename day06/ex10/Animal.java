package day06.ex10;

public class Animal {
  // 필드
  String name;
  int age;

  // 생성자 함수
  Animal(String name , int age){
   this.name = name;
   this.age = age;
  }
  // 메소드
  void sound(){
    System.out.println(name + "은(는) 소리를 냅니다.");
  }

  void sleep(){
    System.out.println(name + "은(는) 잠을 잔다.");
  }

}
