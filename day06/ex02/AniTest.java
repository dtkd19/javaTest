package day06.ex02;

public class AniTest {
  public static void main(String[] args) {

    // dog 객체
    Ani dog = new Ani();
    // dog 인스턴스명.멤버변수(필드,인스턴스변수)
    System.out.println("이름 : "+ dog.name);
    System.out.println("나이 : "+ dog.age);
    System.out.println("주소 : "+ dog.addr);
    System.out.println("음식 : "+ dog.food);
    System.out.println("털색 : "+ dog.color);

    System.out.println("--------------------");
    dog.name ="강아지";
    dog.age = 3;
    dog.addr = "인천";
    dog.color = "검정";
    dog.food ="사료";

    System.out.println("이름 : "+ dog.name);
    System.out.println("나이 : "+ dog.age);
    System.out.println("주소 : "+ dog.addr);
    System.out.println("음식 : "+ dog.food);
    System.out.println("털색 : "+ dog.color);

    System.out.println("--------------------");

    Ani cat = new Ani();
    cat.name = "고양이";
    cat.age = 3;
    cat.addr = "제주";
    cat.color = "흰색";
    cat.food = "사료";

    System.out.println("이름 : "+ cat.name);
    System.out.println("나이 : "+ cat.age);
    System.out.println("주소 : "+ cat.addr);
    System.out.println("음식 : "+ cat.food);
    System.out.println("털색 : "+ cat.color);


    System.out.println("--------------------");


    Ani panda = new Ani();
    panda.name = "판다";
    panda.age = 4;
    panda.addr = "동물원";
    panda.color = "노랑";
    panda.food = "대나무";
    System.out.println("이름 : "+ panda.name);
    System.out.println("나이 : "+ panda.age);
    System.out.println("주소 : "+ panda.addr);
    System.out.println("음식 : "+ panda.food);
    System.out.println("털색 : "+ panda.color);
    System.out.println("--------------------");



  }
}
