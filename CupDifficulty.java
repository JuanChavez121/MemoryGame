import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CupDifficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CupDifficulty extends World
{

    /**
     * Constructor for objects of class CupDifficulty.
     * 
     */
    public CupDifficulty()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        String instructionsText = "Cup Shuffle Difficulty";
        showText(instructionsText, getWidth() / 2, 100);
        easyCup y = new easyCup();
        addObject(y,500,200);
        mediumCup b = new mediumCup();
        addObject(b,500,400);
        hardCup r = new hardCup();
        addObject(r,500,600);
        String easy = "Easy";
        showText(easy, 500, 200);
        String medium = "Medium";
        showText(medium, 500, 400);
        String hard = "Hard";
        showText(hard, 500, 600);
    }
}
