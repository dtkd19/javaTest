package day06.ex10;

 class Dog extends Animal{
  String color;


  Dog(String name, int age, String color) {
    super(name, age); //부모 생성자를 호출
   this.color = color;
  }

  // 메소드

   //재설정
   void sleep(){
    //super.sleep();
     System.out.println(name + "은(는) 아주많이 잠을잔다.");
   }

   void run(){
     System.out.println(name+" 은(는) 달린다. ");
   }
}
