
package abstraction;

public class MainInterface {
    public static void main(String[] args ){
    SmartPhone smartPhone = new SmartPhone();
    Nokia3310 nokia3310 = new Nokia3310();
    
    System.out.println("""
                     =======================================
                      SMART PHONE \n""");

    smartPhone.makeCall();
    smartPhone.PlayGame();
     smartPhone.connectToWifi();
    smartPhone.PlayMovie();
    smartPhone.takePictures();
    
    
 
    System.out.println("""
                      =======================================
                      NOKIA3310 \n""");

    nokia3310.makeCall();
    nokia3310.PlayGame();
    nokia3310.takePictures();

}
}