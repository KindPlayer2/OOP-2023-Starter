package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	//initialise arraylist and string arrays
	ArrayList<Word> test = new ArrayList<Word>();
	String[] X;
	String[] Y;
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	//setup loads the file then prints the model
	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();       
	}

	public void loadFile()
	{
		//load small.txt file
		X = loadStrings("small.txt");
		for(int i = 0; i < X.length; i ++)
		{
			//split the strings into single words
			Y = split(X[i], " ");

			//itirate through every word in word string array
			for(int j = 0; j < Y.length; j ++)
			{
				//firstly remove all punctuation from words
				Y[j] = Y[j].replaceAll("[^a-zA-Z ]", "");
				//change all to lower case
				Y[j] = Y[j].toLowerCase();

				//see if there is a follower word
				boolean ender;
				if(j+1 == Y.length){
					ender = true;
				}
				else{
					ender = false;
				}
				if(!ender){
					Y[j+1] = Y[j+1].replaceAll("[^a-zA-Z ]", "");
					Y[j+1] = Y[j+1].toLowerCase();
				}

				int result = findWord(Y[j]);
				Word word;
				//if word is not in test, add it
				if(result == -1){
					word = new Word(Y[j]);
					test.add(word);
				}
				else{
					word = test.get(result);
				}

				//check for follower
				if(!ender){
					if(word.follower(Y[j+1]) == -1){
						word.addFollow(new Follow(Y[j+1], 1));
					}
					else{
						word.FollowCounter(word.getFollows().get(word.follower(Y[j+1])));
					}
				}
		}
	}
}
	public int findWord(String word)
	{
		for(int i = 0; i < test.size(); i ++)
		{
			if(test.get(i).getWord().equals(word))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void printModel()
	{
		for(Word w:test)
		{
			System.out.println(w.toString());
		}
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
	}
}