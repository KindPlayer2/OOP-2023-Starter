package ie.tudublin;

public class Follow 
{
    private String word;
    private int count;

    //constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    //getter word
    public String getWord() {
        return word;
    }

    //setter word
    public void setWord(String word) {
        this.word = word;
    }

    //getter count
    public int getCount() {
        return count;
    }

    //setter count
    public void setCount(int count) {
        this.count = count;
    }

    //toString
    public String toString() {
        return word + "(" + count + ")";
    }
}
