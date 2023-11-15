package com.freefall;

public class VacuumFall {
    FallObject fallingObj;
    float gravity;//gravitational acceleration for the  object
    float updateFreq;
    public VacuumFall(FallObject obj,float g){
        fallingObj=obj;
        gravity=g;
        updateFreq=1/g;
    }
}
