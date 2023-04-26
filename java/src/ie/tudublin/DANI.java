package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> test;

	String[] X;
	String[] Y;

	public void settings() {
		size(1000, 1000);
		new ArrayList<Word>();
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }
 

	public void loadFile()
	{
		X = loadStrings("small.txt");
		for(int i = 0; i < X.length; i ++)
		{
			Y = split(X[i], " ");
			for(int j = 0; j < Y.length; j ++)
			{
				Y[j] = Y[j].replaceAll("[^a-zA-Z ]", "");
				Y[j] = Y[j].toLowerCase();
				//check if there is a follow word
                boolean lastWord;
                if(j+1 == Y.length)
                {
                    lastWord = true;
                }
                else
                {
                    lastWord = false;
                }

                if(!lastWord)
                {
                    Y[j+1] = Y[j+1].replaceAll("[^a-zA-Z ]", "");
                    Y[j+1] = Y[j+1].toLowerCase();
                }

                int result = findWord(Y[j]);
                Word word;
                //if word is not in model, add it
                if(result == -1)
                {
                    word = new Word(Y[j]);
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

	public void setup() {
		colorMode(HSB);
		loadFile();
		printModel();
	}

	public void keyPressed() {

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
