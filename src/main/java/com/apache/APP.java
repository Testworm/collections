package com.apache;
import com.apache.Pred;
import org.apache.commons.collections.Predicate;

public class APP {
    public boolean Check(Object obj, Predicate pred){
        if(pred.evaluate(obj) == true){
            System.out.println("right");
            return true;
        }
        else {
            System.out.println("wrong");
            return false;
        }
    }
    public static void main(String[] arg){
        APP app = new APP();
        Predicate pred = new Pred();

        System.out.println(app.Check("hello", pred));
    }
}
