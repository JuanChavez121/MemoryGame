import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ball1()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 50; 
        int newHeight = 50; 
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);
    }
    public void act()
    {
        // Add your action code here.
    }
}
