//import java.util.Scanner;
 interface Mediaplayer
{
   default void play0()
   {
      System.out.println("Musicplayer..");
   }
   default void play()
   {
      System.out.println("videoplayer..");
   }
}
class Media
{
   public static void main(String[] args) {
      Mediaplayer s1 = new Musicplayer();
      Mediaplayer s2 = new Videoplayer();
      s1.play0();
      s2.play();
   }
}

 class Musicplayer implements Mediaplayer
{
   @Override
   public void play0()
   {
      System.out.println("Selected Music is been played");
   }
}
class Videoplayer implements Mediaplayer
{
   public void play()
   {
      System.out.println("Selected Video is been played");
   }
}