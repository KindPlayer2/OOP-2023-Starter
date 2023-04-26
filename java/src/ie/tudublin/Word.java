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

    //add to the follow array list
    public void addFollow(Follow follow) {
        follows.add(follow);
    }

    //Adds to the followcounter used to print model
    public void FollowCounter(Follow follow)
    {
        follow.setCount(follow.getCount()+1);
    }

    //returns the amount of times a given word follows another 
    public int follower(String word)
    {
        for(Follow x:follows)
        {
            if(x.getWord().equals(word)){

                return follows.indexOf(x);
            }
        }
        return -1;
    }

    //toString that itirates 
    @Override
    public String toString()
    {
        String result = "";
        result += word + ":";
        for(Follow f:follows)
        {
            result += " " + f.toString();
        }
        return result;
    }
}
