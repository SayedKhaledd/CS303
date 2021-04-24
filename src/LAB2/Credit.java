package LAB2;

import java.util.Date;

public class Credit extends Payment {
    public String name;
    public String type;
    public Date expDate;
    AuthorizeCredit authorizeCredit;
    PrintCashTrans printCashTrans;

    public Credit() {
        authorizeCredit = new AuthorizeCredit();
        printCashTrans = new PrintCashTrans();
    }

    @Override
    public void authorize() {
        authorizeCredit.authorized();
    }

    @Override
    public void print() {
        printCashTrans.print();
    }
}
