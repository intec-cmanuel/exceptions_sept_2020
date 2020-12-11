package be.intecbrussel.gameshop;

import be.intecbrussel.gameshop.exception.*;

public class GameShopApp {
    public static void main(String[] args) {

        Client c1 = new Client("Jean-Jaque", 1, 1990);
        Client c2 = new Client("Jean-Marie-Robert-Jaqueline", 1000, 1990);
        Client c3 = new Client("Jean-Jean-Jean", 555, 2021);

        GameShop gs = new GameShop(new Client("Not Anthony", 0, 1999), new Stock(1,5,5,5,5,5,5));

        GameShop.Game game = null;
        try {
            game = gs.buyGame(c2, "Disgaea 5");
        } catch (GameShopException e){
            System.out.println(e.getMessage());
        }

        try {
            gs.buyGame(c2, "Disgaea 5");
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        try {
            gs.buyGame(c3, "sfsdfsdfsdfsdfsfsdfds");
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        try {
            gs.buyGame(c1, "Fifa 21");
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        try {
            gs.buyGame(c3, "Rayman");
        } catch (GameShopException e) {
            System.out.println(e.getMessage());
        }

        if (game != null) {
            c2.play(game);
        }

    }
}
