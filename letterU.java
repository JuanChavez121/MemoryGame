import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letterU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class letterU extends Actor
{
    /**
     * Act - do whatever the letterU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public letterU()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 85; 
        int newHeight = 115; 
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);
    }
    public void act()
    {
        // Add your action code here.
    }
}
