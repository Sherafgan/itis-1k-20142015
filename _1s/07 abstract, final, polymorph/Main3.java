class Phone {
    public void call(){
        System.out.println("I am calling as old phone.");
    }
}
class SmartPhone extends Phone {
    public void call(){
        System.out.println("I am calling as super good awesome device!");
    }
    public void makeSelfie() {
        System.out.println("I am making selfie.");
    }
}
public class Main3 {
    public static void main(String[] args) {
        SmartPhone yourPhone = new SmartPhone();
        Phone yourGrandmaPhone = new SmartPhone();
        //yourGrandmaPhone.makeSelfie(); - нельзя вызвать, т.к. нет в Phone
        yourGrandmaPhone.call();
    }
}
