public class Driver {

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.getDetails();
        Bank b2 = new SBI();
        b2.getDetails();
        Bank b3 = new BOI();
        b3.getDetails();
        Bank b4 = new ICICI();
        b4.getDetails();
    }
}
