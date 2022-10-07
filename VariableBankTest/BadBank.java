package VariableBankTest;

//이율10%
public class BadBank extends Bank{

//    public BadBank(int rate, int money) {
//        super(rate,money);
//        this.rate = rate;
//        this.money = money;
//    }

    @Override
    int getInterestRate(int money){

        rate = 10/100;

        super.money = money * rate;

        return money * rate;
    }
}
