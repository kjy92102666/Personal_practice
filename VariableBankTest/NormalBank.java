package VariableBankTest;

//이율5%
public class NormalBank extends Bank{
//    public NormalBank(int rate, int money) {
//        super(rate, money);
//        this.rate = rate;
//        this.money = money;
//    }

    @Override
    int getInterestRate(int money){

        rate = 3/100;
        super.money = money * rate;
        return money * 3 / 100;
    }
}
