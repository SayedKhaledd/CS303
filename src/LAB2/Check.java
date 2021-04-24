package LAB2;

public class Check extends Payment {
    public String name;
    public String bankID;
    Authorizenon authorizenon;
    PrintCashTrans printCashTrans;

    public Check() {
        authorizenon = new Authorizenon();
        printCashTrans = new PrintCashTrans();
    }

    @Override
    public void authorize() {
        authorizenon.authorized();
    }

    @Override
    public void print() {
        printCashTrans.print();
    }
}
