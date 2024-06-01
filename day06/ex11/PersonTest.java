package day06.ex11;

public class PersonTest {
  public static void main(String[] args) {
    Person person = new Person();
   person.setName(" 홍길동 ");
   person.setAge(20);

    System.out.println("이름 : " + person.getName() );
    System.out.println("나이 : " + person.getAge() );
  }
}
