package LAB2;

public class Cash extends Payment{
public float cashTendered;
    Authorizenon authorizenon;
    PrintCashTrans printCashTrans;

    public Cash() {
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
