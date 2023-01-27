public class LandLine implements phone{

    private  String myPhoneNumber;
    private  boolean isRinging;
    private boolean  isPowerOn;

    public LandLine(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean  isPowerOn() {
        return isPowerOn;

    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String PhoneNo) {
      if(isPowerOn==true){
          System.out.println("You are dialing a number"+PhoneNo);
      }
      else {
          System.out.println("Your landline is off");
      }
    }

    @Override
    public void receiveCall(String PhoneNo) {
     if( isPowerOn && PhoneNo.equals(myPhoneNumber)){
         this.isRinging=true;
         System.out.println("Hey,PhoneNo"+ "You are receiving a call");
     }
     else{
         System.out.println("call not received");
     }
     return ;
    }

    @Override
    public boolean answerCall() {
       if(isRinging==true){
           System.out.println("call answered");
           this.isRinging=false;
           return true;
       }
       else{
           return false;
       }
    }

    @Override
    public boolean isRinging() {
        if(isRinging==true) return true;
        else return false;

    }
}
