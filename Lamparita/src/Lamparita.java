public class Lamparita {

    private boolean isOn = false;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean estado() {
        return this.isOn;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a programar una lamparita! ");
    }
}
