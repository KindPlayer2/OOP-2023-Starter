package ie.tudublin;

import java.util.ArrayList;

public class Word {

    //Variables of class
    public String word;
    ArrayList<Follow> follows = new ArrayList<Follow>();


    //toString
    @Override
    public String toString()
    {
        return(word + ":" + follows.get(0));
    }
    
}
