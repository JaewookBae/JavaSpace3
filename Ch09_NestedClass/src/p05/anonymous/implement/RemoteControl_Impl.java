package p05.anonymous.implement;

public class RemoteControl_Impl implements RemoteControl {

   @Override
   public void turnOn() {
      System.out.println("Audio On");
   }

   @Override
   public void turnOff() {
      System.out.println("Audio Off");
   }

}