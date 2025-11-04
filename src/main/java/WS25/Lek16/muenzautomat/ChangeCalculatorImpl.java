package WS25.Lek16.muenzautomat;

public class ChangeCalculatorImpl implements ChangeCalculator{
    @Override
    public int[] getChange(int euros, int cent){

        Coin[] coins = {Coin.EURO_2, Coin.EURO_1, Coin.CENT_50, Coin.CENT_20, Coin.CENT_10, Coin.CENT_5, Coin.CENT_2, Coin.CENT_1};
        int amount = 157;
        for(int i = 0; i < coins.length; i++){
            //Todo

        }

        return null;
    }
}
