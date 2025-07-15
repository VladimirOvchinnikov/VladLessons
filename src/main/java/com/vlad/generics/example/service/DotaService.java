package com.vlad.generics.example.service;

import com.vlad.generics.example.domain.Dota;
import com.vlad.generics.example.domain.Dota2;
import com.vlad.generics.example.domain.IGame;
import com.vlad.generics.example.domain.MarioBros;

public class DotaService {


    public String getNameGame(Dota dota) {
        return dota.getNameGame();
    }


//    public String getNameGame(Dota2 dota){
//        return dota.getNameGame();
//    }
//
//
//    public String getNameGame(MarioBros mario){
//        return mario.getNameGame();
//    }
//
//
////    public String getNameGame(IGame dota){
////        return dota.getNameGame();
////    }
}
