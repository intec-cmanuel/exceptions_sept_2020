package be.intecbrussel.gameshop;

public class Stock {
    private int amountOfDisgaea;
    private int amountOfFifa;
    private int amountOfRayman;
    private int amountOfDungreed;
    private int amountOfStarWars;
    private int amountOfGTA;
    private int amountOfMW2;

    public Stock(int amountOfDisgaea, int amountOfFifa, int amountOfRayman, int amountOfDungreed, int amountOfStarWars, int amountOfGTA, int amountOfMW2) {
        this.amountOfDisgaea = amountOfDisgaea;
        this.amountOfFifa = amountOfFifa;
        this.amountOfRayman = amountOfRayman;
        this.amountOfDungreed = amountOfDungreed;
        this.amountOfStarWars = amountOfStarWars;
        this.amountOfGTA = amountOfGTA;
        this.amountOfMW2 = amountOfMW2;
    }

    public int getStock(GameShop.Game game){
        int stock = 0;
        switch (game) {
            case DISGAEA5:
                stock = amountOfDisgaea;
                break;
            case FIFA21:
                stock = amountOfFifa;
                break;
            case RAYMAN:
                stock = amountOfRayman;
                break;
            case DUNGREED:
                stock = amountOfDungreed;
                break;
            case STAR_WARS_FALLEN_ORDER:
                stock = amountOfStarWars;
                break;
            case GRAND_THEFT_AUTO_SAN_ANDREAS:
                stock = amountOfGTA;
                break;
            case CALL_OF_DUTY_MODERN_WARFARE_2:
                stock = amountOfMW2;
                break;
        }
        return stock;
    }

    public void gameSold(GameShop.Game game){
        switch (game) {
            case DISGAEA5:
                amountOfDisgaea--;
                break;
            case FIFA21:
                amountOfFifa--;
                break;
            case RAYMAN:
                amountOfRayman--;
                break;
            case DUNGREED:
                amountOfDungreed--;
                break;
            case STAR_WARS_FALLEN_ORDER:
                amountOfStarWars--;
                break;
            case GRAND_THEFT_AUTO_SAN_ANDREAS:
                amountOfGTA--;
                break;
            case CALL_OF_DUTY_MODERN_WARFARE_2:
                amountOfMW2--;
                break;
        }
    }
}
