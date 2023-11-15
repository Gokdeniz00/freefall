package com.freefall;

public class FallObject{
    float mass_in_kg;
    float surfaceArea;
    public FallObject(float mass,float... sa){
        mass_in_kg=mass;
        if(sa !=null){
          surfaceArea=sa[0];  
        }else{
            surfaceArea=0;
        }
    }
}