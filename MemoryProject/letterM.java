import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letterM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class letterM extends Actor
{
    /**
     * Act - do whatever the letterM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public letterM()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 130; 
        int newHeight = 125; 
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);
    }
    public void act()
    {
        // Add your action code here.
    }
}
