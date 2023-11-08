import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letterS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class letterS extends Actor
{
    /**
     * Act - do whatever the letterS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public letterS()
    {
        GreenfootImage letterMImage = getImage();
        
        int newWidth=130; 
        int newHeight=140; 
        letterMImage.scale(newWidth, newHeight);
        
        
        setImage(letterMImage);
    }
    public void act()
    {
        // Add your action code here.
    }
}
