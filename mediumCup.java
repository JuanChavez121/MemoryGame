import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mediumCup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mediumCup extends Actor
{
    /**
     * Act - do whatever the mediumCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public mediumCup()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 500; 
        int newHeight = 400;
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new mediumTable());
        }
    }
}
