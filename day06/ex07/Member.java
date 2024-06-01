package day06.ex07;

public class Member {
  // 1. 필드명
 String name;
  int age;
  String tel;

 // 오버로딩 ( 같은함수(메소드(매개변수 다르게 )
 // 기본 생성자
  Member(){
    this("",0,"");
  }
  Member( String name){
   this(name, 10,"010-0000-0000");
  }


  Member( String name, int age){
    this( name, age, "010-0000-0000");
  }


  Member( String name, int age, String tel){
    this.name = name;
    this.age = age;
    this.tel = tel;
  }
 // 3. 메소드

}
