package com.apache;

import org.apache.commons.collections.Predicate;
public class Pred implements Predicate{
    public boolean evaluate(Object object) {
        if(object.toString().equals("hello")){
            return true;
        }
        return false;
    }
}
