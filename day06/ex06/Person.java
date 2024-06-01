package day06.ex06;

public class Person {
  // 1. 필드, 멤버변수, 인스턴스(객체) 변수
  String name;
  int age;
  String address;
  int grade;
  //  이름을 다르게 처리한다
  public void info1(String na, int x , String addr, int num){
    // 변수는 가까운 영역(스코프) 이름으로 인식한다.
    name = na;
     age = x;
     address = addr;
     grade = num;
    System.out.println("이름 : " + name + " 나이: " + age + " 주소 :" + address + " 점수 : " +  grade );
  }
  public void info2 (String name, int age , String address, int grade){
    // 변수는 가까운 영역(스코프) 이름으로 인식한다.
    this.name = name;
    this.age = age;
    this.address = address;
    this.grade = grade;

    System.out.println("이름 : " + this.name + " 나이: " + this.age + " 주소 :" + this.address + " 점수 : " +  this.grade );
  }

}
