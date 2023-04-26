package ie.tudublin;

//The Follow class
public class Follow {

    //Variables of class
    public String word;
    public int count;

    //constructor
    public Follow(String word, int count)
    {
        this.word = word;
        this.count = count;
    }

    //toString, called in DANI() to print to the terminal
    public String toString()
    {
        return("Hello");
    }

    //Accesor methods

    //word getter
    public String getWord()
    {
        return(word);
    }

    //word setter
    public String setWord()
    {
        return(word);
    }

    //count getter
    public int getCount()
    {
        return(count);
    }
    
    //count setter
    public int setCount()
    {
        return(count);
    }
}
