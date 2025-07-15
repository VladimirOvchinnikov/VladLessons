package com.vlad.generics.example.service;

import com.vlad.generics.example.domain.Dota;
import com.vlad.generics.example.domain.Dota2;
import com.vlad.generics.example.domain.IGame;
import com.vlad.generics.example.domain.MarioBros;

public class GameService {

    public String getNameGame1(Object game) {
        if (game instanceof Dota2) {
            return ((Dota2) game).getNameGame();
        } else if (game instanceof Dota) {
            return ((Dota) game).getNameGame();
        } else if (game instanceof MarioBros) {
            return ((MarioBros) game).getNameGame();
        }

        return "not found game!";
    }


    public <G extends IGame> String getNameGame(G game) {
        return game.getNameGame();
    }

}
