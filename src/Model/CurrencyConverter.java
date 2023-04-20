package Model;

public class CurrencyConverter {

    public double CurrencyConvertToUSD(double nis) {
        return nis * 0.27;
    }

    public double CurrencyConvertToNIS(double usd) {
        return usd * 3.65;
    }
}
