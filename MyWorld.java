import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound menuMusic;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        menuMusic = new GreenfootSound("menuMusic.mp3");
        //menuMusic.playloop();
        letterB b = new letterB();
        addObject(b,171,300);
        letterM m = new letterM();
        addObject(m,348,300);
        letterB b2 = new letterB();
        addObject(b2,431,300);
        letterS s = new letterS();
        addObject(s,508,298);
        letterQ q = new letterQ();
        addObject(q,585,300);
        letterU u = new letterU();
        addObject(u,664,300);
        letterA a = new letterA();
        addObject(a,746,300);
        letterD d = new letterD();
        addObject(d,828,300);
        startButton start = new startButton();
        addObject(start,500,450);
        
}
}
