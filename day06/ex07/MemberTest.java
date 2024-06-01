package day06.ex07;

public class MemberTest {
  public static void main(String[] args) {
    Member member1 = new Member(); // 객체생성 - 메모리할당 - 생성자 호출
    Member member2 = new Member(" 홍길동 ");
    Member member3 = new Member(" 이영한 ", 22 );
    Member member4 = new Member(" 임아니 ", 23 , " 010-0400-1111 ");
    Member[] members = new Member[]{member1,member2,member3,member4};
   /* for (int i = 0; i < members.length ; i++) {
      System.out.println( members[i].name + members[i].age + members[i].tel);
    } */
    for ( Member m : members) {
      System.out.println( "이름 : " + m.name + " 나이 : " +  m.age + " 번호 : " +  m.tel );
    }
    System.out.println( " ------------------- ");
    System.out.println( " 인스턴스(객체) 실행 ");
  }
}
