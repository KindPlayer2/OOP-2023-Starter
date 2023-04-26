package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

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
		X = loadStrings("small.txt"); // Load a text file into a String array

		for (int i = 0; i < X.length; i++) 
		{
			Y = split(X[i], ' '); // Split a string into an array of words
			Y[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			Y[i].toLowerCase(); // Convert a string to lower case 
			
		}

		
	}

	public void printModel()
	{
		for (int j = 0; j < Y.length; j++) 
		{
			System.out.println(Y[j] + "\n");
			Word word = new Word();
			word.word = Y[j];
			Follow follow = new Follow();
			word.follows.add();
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
