package ex03;

public class PersonTest {
  public static void main(String[] args) {
  // 타입 ( 클래스도면 ) 객체명(인스턴스명) = new 클래스도면() : 객체생성  메모리에 만들어짐 (객체)
    Person person1 = new Person();
    person1.name = " 홍길동 ";
    person1.age = 20;
    person1.address = "인천";
    person1.grade =70;

    Person person2 = new Person();
    person2.name = " 이영호 ";
    person2.age = 25;
    person2.address = "서울";
    person2.grade =80;
    Person person3 = new Person();
    person3.name = " 이영한 ";
    person3.age = 24;
    person3.address = "인천";
    person3.grade =77;

      // 타입 배열[] = new 타입[개수]
    Person[] person = new Person[]{person1,person2,person3};
    person[0] = person1;
    person[1] = person2;
    person[2] = person3;

    // 향상된 for 문
    for( Person p : person) {
      System.out.println("------------------------");
      System.out.println(" 이름 " + p.name + "나이 :" + p.age + " 주소 : " + p.address + " 점수 :" + p.grade);
    }

    for( int i =0; i < person.length; i ++) {
      System.out.println("---------------------------------");
      System.out.println( " 이름: " + person[i].name + "나이 : "  + person[i].age + " 주소 : " + person[i].address + " 점수 : " +
          person[i].grade);
    } //end for


  }
}
