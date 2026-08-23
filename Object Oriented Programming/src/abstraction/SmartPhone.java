
package abstraction;


public class SmartPhone implements Callable,Camera,Movie,Music,Wifi,Game{
    
    public void makeCall(){
    System.out.println("John is calling.........");
    }

    @Override
    public void takePictures() {
    System.out.println("John has taken a picture........");
    }

    @Override
    public void PlayMovie() {
    System.out.println("John is watching movie.......");
    }

    @Override
    public void PlayMusic() {
    System.out.println("John is listening to music now.......");
    }

    @Override
    public void connectToWifi() {
    System.out.println("John has connected to the wifi.......");
    }

    @Override
    public void PlayGame() {
    System.out.println("John is playing a game.......");
    }
  
}
