package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exception.EmptyStockException;
import be.intecbrussel.gameshop.exception.GameNotFoundException;
import be.intecbrussel.gameshop.exception.NotEnoughMoneyException;
import be.intecbrussel.gameshop.exception.TooYoungToGameException;

import java.time.LocalDate;

public class GameShop {
    private Client vendor;
    private Stock gameStock;

    public GameShop(Client vendor, Stock gameStock) {
        this.vendor = vendor;
        this.gameStock = gameStock;
    }

    public Game buyGame(Client client, String gameName) throws GameNotFoundException, EmptyStockException, TooYoungToGameException, NotEnoughMoneyException {
        Game[] games = Game.values();

        Game clientGame = searchGame(gameName, games);
        verifyStock(clientGame);
        verifyAge(client);
        verifyMoney(client, clientGame);

        client.setMoney(client.getMoney() - clientGame.getPrice());
        gameStock.gameSold(clientGame);
        return clientGame;
    }

    private Game searchGame(String gameName, Game[] games) throws GameNotFoundException {
        Game clientGame = null;
        for (Game game : games) {
            if (gameName.equalsIgnoreCase(game.getName())) {
                clientGame = game;
            }
        }
        if (clientGame == null) {
            throw new GameNotFoundException(gameName + " does not exist in the shop!");
        }
        return clientGame;
    }

    private void verifyStock(Game clientGame) throws EmptyStockException {
        int stock = gameStock.getStock(clientGame);
        if (stock <= 0) {
            throw new EmptyStockException(clientGame.getName() + " is out of stock!");
        }
    }

    private void verifyAge(Client client) throws TooYoungToGameException {
        int age;
        if ((age = LocalDate.now().getYear() - client.getBirthYear()) < 18) {
            throw new TooYoungToGameException("You need to be 18 to game! You are only " + age);
        }
    }

    private void verifyMoney(Client client, Game clientGame) throws NotEnoughMoneyException {
        if (client.getMoney() < clientGame.getPrice()) {
            throw new NotEnoughMoneyException("You are broke lol!");
        }
    }


    public enum Game {
        DISGAEA5("Disgaea 5", 999.99),
        FIFA21("Fifa 21", 29.99),
        RAYMAN("Rayman", 29.99),
        DUNGREED("Dungreed", 9.99),
        STAR_WARS_FALLEN_ORDER("Star wars: Fallen Order", 29.99),
        GRAND_THEFT_AUTO_SAN_ANDREAS("Grand Theft Auto: San Andreas", 4.99),
        CALL_OF_DUTY_MODERN_WARFARE_2("Call of duty: Modern Warfare 2", 19.99);

        private String name;
        private double price;

        Game(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
