package Strategy.Card;

interface PaymentStrategy {
    void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public KAKAOCardStrategy(String nm, String ccNum) {
        this.name = nm;
        this.cardNumber = ccNum;
    }

    public void pay(int amount) {
        System.out.println(amount + "원 paid using KAKAOCard.");
    }
}

class LUNACardStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public LUNACardStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    public void pay(int amount) {
        System.out.println(amount + "원 paid using LUNACard.");
    }
}