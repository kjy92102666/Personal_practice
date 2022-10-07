package VariableBankTest;

//이율3%
public class GoodBank extends Bank{


    public GoodBank(int rate, int money) {
        super(rate, money);
    }

    //    public GoodBank(int money){
//        bk = new Bank();
//        super.money = money;
//        System.out.println(money);
//        System.out.println(this.money);
//    }
    @Override
    int getInterestRate(int money){

        rate = 3/100;

        super.money = money * rate;

        return money * 3 / 100;
    }
}
