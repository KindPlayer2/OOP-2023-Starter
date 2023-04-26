package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> test = new ArrayList<Word>();

	String[] X;
	String[] Y;

	public void settings() {
		size(1000, 1000);
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
			}
		}
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
