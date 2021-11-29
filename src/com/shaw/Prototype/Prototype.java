package com.shaw.Prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable{
    protected ArrayList list = new ArrayList();
    public Prototype copy(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
            prototype.list = (ArrayList) this.list.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
