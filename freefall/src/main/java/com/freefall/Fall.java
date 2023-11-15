package com.freefall;

public class Fall {
    Object fallingObj;
    float gravity;//gravitational acceleration for the  object
    boolean isVacuum;
    public Fall(Object obj,float g,boolean isVacuum){
        fallingObj=obj;
        gravity=g;

    }
}
