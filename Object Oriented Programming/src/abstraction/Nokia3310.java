
package abstraction;

public class Nokia3310 implements Callable,Music,Game,Camera{

  
    @Override
    public void makeCall(){
    System.out.println("Mom is calling.........");
    }

    @Override
    public void takePictures() {
    System.out.println("Shedrak has taken a picture on his Nokia........");
    }

    @Override
    public void PlayMusic() {
    System.out.println("Aunty Opeyemi is listening to music now.......");
    }


    @Override
    public void PlayGame() {
    System.out.println("Shawn said he will not play this game.......");
    }
  
}
