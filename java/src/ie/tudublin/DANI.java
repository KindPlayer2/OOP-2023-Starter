package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> test;
	StringBuilder sb;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

	public void setup() {
		colorMode(HSB);
		test = new ArrayList<Word>();
		loadFile();
		printModel();       
	}

	public void loadFile()
{
	String[] line = loadStrings("small.txt");
	for(int i = 0; i < line.length; i ++)
	{
		String[] words = split(line[i], " ");
		for(int j = 0; j < words.length; j ++)
		{
			//get a word from line and create a word object, add it to test
			//then get the next word and create a follow object, add it to the arraylist of follows in the word object
			words[j] = words[j].replaceAll("[^a-zA-Z ]", "");
			words[j] = words[j].toLowerCase();

			//check if next word exist or not
			boolean lastWord;
			if(j+1 == words.length)
			{
				lastWord = true;
			}
			else
			{
				lastWord = false;
			}
			
			if(!lastWord)
			{
				words[j+1] = words[j+1].replaceAll("[^a-zA-Z ]", "");
				words[j+1] = words[j+1].toLowerCase();
			}

			int result = findWord(words[j]);
			Word word;
			//if word is not in test, add it
			if(result == -1)
			{
				word = new Word(words[j]);
				test.add(word);
			}
			else
			{
				word = test.get(result);
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