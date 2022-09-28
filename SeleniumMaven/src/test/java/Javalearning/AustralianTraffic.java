package Javalearning;

public class AustralianTraffic implements InterfaceConceptsCentral,ContinentalTraffic {
    public static void main(String[] args) {

        InterfaceConceptsCentral a = new AustralianTraffic();
        a.redstop();
        a.flashyellow();
        a.Green();

        ContinentalTraffic b = new AustralianTraffic();
        b.Trainsymbol();


        AustralianTraffic t = new AustralianTraffic();
        t.Walk();

    }

    public  void Walk(){
        System.out.println("walking");
    }
    @Override
    public void Green() {
        System.out.println("Green go implementation");
    }

    @Override
    public void redstop() {
        System.out.println("Red stop implementation");
    }

    @Override
    public void flashyellow() {
        System.out.println(" flash yellow implementation");
    }

    @Override
    public void Trainsymbol() {
        System.out.println("Train symbol to stop");

    }
}
