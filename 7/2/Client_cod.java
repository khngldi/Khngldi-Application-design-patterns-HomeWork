public class Client_cod {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        Trader trader = new Trader("Khangeldi");
        TradingRobot robot = new TradingRobot();
        MobileApp mobileApp = new MobileApp();
        currencyExchange.registerObserver(trader);
        currencyExchange.registerObserver(robot);
        currencyExchange.registerObserver(mobileApp);
        currencyExchange.setRate("TENGE", 1.1);
        currencyExchange.setRate("RUB", 1.3);
        currencyExchange.removeObserver(robot);
        currencyExchange.setRate("USD", 1.25);
    }
}
