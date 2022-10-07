package VariableBankTest;

public class bankTest {
    public static void main(String[] args) {
        //Bank bk = new Bank();
        GoodBank gb = new GoodBank((3/100),200_0000);
        NormalBank nb = new NormalBank((5/100),200_0000);
//        BadBank bb = new BadBank((10/100),200_0000);

        //gb.money = 200_0000;
        int Good_result=gb.getInterestRate(200_0000);
        int Normal_result=nb.getInterestRate(200_0000);
//        int Badresult=bb.getInterestRate(200_0000);

        System.out.println("GoodBank 이자 : "+Good_result + "원");
        System.out.println("NormalBank 이자 : "+Normal_result + "원");
//        System.out.println("Badresult"+Badresult);

    }
}
