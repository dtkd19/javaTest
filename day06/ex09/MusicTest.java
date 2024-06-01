package day06.ex09;

public class MusicTest {
  public static void main(String[] args) {
    Music music1 = new Music();
    Music music2 = new Music("덩그러니");
    Music music3 = new Music(" 덩그러니 ", "이수영 ");
    Music music4 = new Music(" 덩그러니", " 이수영", 3);

    Music[] musics = new Music[]{music1,music2,music3,music4};

    for( Music m : musics) {
      m.display();
    }
  }
}
