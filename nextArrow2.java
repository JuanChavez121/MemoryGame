import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nextArrow2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nextArrow2 extends Actor
{
    /**
     * Act - do whatever the nextArrow2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nextArrow2()
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
            Greenfoot.setWorld(new easySimon());
        }
    }
}
