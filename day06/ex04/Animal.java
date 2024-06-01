package day06.ex04;

public class Animal {
  String name;
  int age;
  String address;
  String favFood;
  // 기본생성자 Animal()

  // 메소드
  // this : 객체(인스턴스)  자신
  public void run() {
    System.out.println( this.name + " 달린다. " );
  }  // end
  //this는 생략가능
  public void eat() {
    System.out.println( name + "이(가) 좋아하는 음식은 " + favFood + " 입니다. ");
  } // end
  public  void  info(){
    System.out.println("-------------------------------");
    System.out.println(" 이름 : " + this.name);
    System.out.println(" 나이 : " + this.age);
    System.out.println(" 주소 : " + this.address);
    System.out.println(" 음식 : " + this.favFood);
  }
}
