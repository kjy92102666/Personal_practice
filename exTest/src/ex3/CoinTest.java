package ex3;

public class CoinTest {

    public static void main(String[] args) {
        int[] coins = {500, 100, 50, 10};
        int price = 8370;

        for(int i=0; i<coins.length; i++){
            int count = price / coins[i];
            if(coins[i] == 500){
                if(count > 10){
                    price = price - (coins[i]*10);
                    count = 10;
                }
            }else if(coins[i] == 100) {
                if(count > 30) {
                    price = price - (coins[i]*30);
                    count = 30;
                }
            }else{
                price = price % coins[i];
            }
            System.out.println(coins[i]+" coin: "+ count);
        }
    }
}
