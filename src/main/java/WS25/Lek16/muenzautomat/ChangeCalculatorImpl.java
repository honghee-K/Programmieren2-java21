package WS25.Lek16.muenzautomat;

public class ChangeCalculatorImpl implements ChangeCalculator {

    @Override
    public int[] getChange(int euros, int cent) {

        Coin[] coins = {
            Coin.EURO_2, Coin.EURO_1, Coin.CENT_50, Coin.CENT_20, Coin.CENT_10, Coin.CENT_5, Coin.CENT_2, Coin.CENT_1
        };
        int[] result = new int[coins.length];
        int[] mapping = {7, 6, 5, 4, 3, 2, 1, 0};
        int amount = euros * 100 + cent;

        for (int i = 0; i < coins.length; i++) {
            int count = amount / coins[i].value;
            amount = amount % coins[i].value;
            result[mapping[i]] = count;
        }

        return result;
    }
}
