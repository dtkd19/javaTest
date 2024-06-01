package day06.ex09;

public class Music {
  String title;
  String singer;
  int num;

  Music(){
    this( "", "", 0 );
  }

  Music(String title){
      this( title ,"",0);
  }
  Music(String title, String singer){
  this ( title, singer , 0);
  }
  Music(String title,String singer, int num){
   this.title =title;
   this.singer = singer;
   this.num = num;
  }
  void display(){
    System.out.println(" 노래제목 :" + title);
    System.out.println(" 가수이름 :" + singer);
    System.out.println(" 앨범 수  :" + num );
  }

}
