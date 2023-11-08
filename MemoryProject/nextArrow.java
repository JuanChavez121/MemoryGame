import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nextArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nextArrow extends Actor
{
    /**
     * Act - do whatever the nextArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nextArrow()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 100; 
        int newHeight = 90;
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new easyTable());
        }
    }
}
