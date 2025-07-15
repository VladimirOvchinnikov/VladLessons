package com.vlad.generics.wildcards.buisness;

import com.vlad.generics.wildcards.domain.IPeople;

public class PeopleService<P extends IPeople> {



    public void justSay(IPeople people){
        people.say();
    }


//    public void justDoIt1(PeopleService<? super P> service){
//        people.justDoIt();
//    }

}
