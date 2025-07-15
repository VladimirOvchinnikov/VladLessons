package com.vlad.generics.wildcards.buisness;

import com.vlad.generics.wildcards.domain.IPeople;
import com.vlad.generics.wildcards.domain.Man;
import com.vlad.generics.wildcards.domain.Student;

public class JustSayService {


    public void justDoSay(PeopleService<IPeople> service, IPeople people){
        service.justSay(people);
    }

//    public void justDoSay(PeopleService<Man> service, Man people){
//        service.justSay(people);
//    }
//
//    public void justDoSay(PeopleService<Student> service, Student people){
//        service.justSay(people);
//    }

    public void justDoSay1(PeopleService<? super Student> service, IPeople people){
        service.justSay(people);
    }

    public void justDoSay2(PeopleService<? super Man> service, IPeople people){
        service.justSay(people);
    }

    public void justDoSay3(PeopleService<? super IPeople> service, IPeople people){
        service.justSay(people);
    }



    public /*<T extends Student>*/void justDoSay4(PeopleService<? extends Student> service, Student people){
        service.justSay(people);
    }


    public /*<T extends Man>*/void justDoSay5(PeopleService<? extends Man> service, Man people){
        service.justSay(people);
    }

    public /*<T extends IPeople>*/void justDoSay6(PeopleService<? extends IPeople> service, IPeople people){
        service.justSay(people);
    }


    public /*<T extends IPeople>*/ void justDoSay7(PeopleService<?> service, IPeople people){
        service.justSay(people);
    }

}
