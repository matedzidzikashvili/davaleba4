package demo3;

public class Main {
    public static void main(String[] args) {

    }

    static <Smartphoni extends Smartphone> void printdisplay(Smartphoni sp) {
        System.out.println(sp);
    }

    static <simbiani extends Simbian> void printSimbian(simbiani smb) {
        System.out.println(smb);
    }
}
