package ie.tudublin;

import java.util.ArrayList;

public class Word 
{
    //initialising variables
    private String word;
    private ArrayList<Follow> follows;

    //constructor
    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    //accesors
    //word getter
    public String getWord() {
        return word;
    }

    //word setter
    public void setWord(String word) {
        this.word = word;
    }

    //follows getter
    public ArrayList<Follow> getFollows() {
        return follows;
    }

    //follows setter
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public void addFollow(Follow follow) {
        follows.add(follow);
    }

    //toString that itirates 
    @Override
    public String toString() {
        String x = "";
        for (Follow follow : follows) {
            x += follow.getWord() + "(" + follow.getCount() + ") ";
        }
        return word + ": " + x;
    }
}
