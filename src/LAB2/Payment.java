package LAB2;

public abstract class Payment {
    float amount;
    AuthorizationBehavior authorizationBehavior;
    PrintBehavior printBehavior;

    public void authorize() {
        authorizationBehavior.authorized();

    }

    public void print() {
        printBehavior.print();
    }
}

