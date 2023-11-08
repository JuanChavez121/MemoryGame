import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letterQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class letterQ extends Actor
{
    /**
     * Act - do whatever the letterQ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public letterQ()
    {
        GreenfootImage letterMImage = getImage();
        
        int newWidth = 80; // Set the desired width
        int newHeight = 117; // Set the desired height
        letterMImage.scale(newWidth, newHeight);
        
        // Set the modified image back to the actor
        setImage(letterMImage);
    }
    public void act()
    {
        // Add your action code here.
    }
}
