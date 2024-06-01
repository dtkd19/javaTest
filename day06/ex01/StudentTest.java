package day06.ex01;

public class StudentTest {
  public static void main(String[] args) {
    //실행
    // 클래스타입 변수(인스턴스명) = 클래스선언:메모리생성(힙메모리)
    // 객체 - 참조형 ( 메모리주소 : x1000 )
    Student s1 = new Student();
    // Student s1 = x1000
    System.out.println("s1 인스턴스변수가 Student객체를 참조");

    Student s2 =new Student();
    // Student s2 = y1000
    System.out.println("s2 인스턴스변수가 Student객체를 참조");

  }
}
