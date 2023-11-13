import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leftCup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leftCup extends Actor
{
    /**
     * Act - do whatever the leftCup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private easyTable world;
    public boolean isMovingUp=false;
    private int moveSpeedUp=2;
    private int delayCounter = 0;
    private int moveSpeed=1;
    public leftCup()
    {
        GreenfootImage letterMImage = getImage();
        int newWidth = 100; 
        int newHeight = 150; 
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);

    
        
    }
    public leftCup(easyTable world) {
        this.world = world;
    }
    public void act()
    {
    if (getWorld() instanceof easyTable) {
        easyTable world = (easyTable) getWorld();
        int numSwaps = world.numSwaps;
        if (Greenfoot.mouseClicked(this) && numSwaps == 0) {
            while (getY() > 475 && isMovingUp == false) {
                setLocation(getX(), getY() - moveSpeedUp);
                Greenfoot.delay(1);
            }
            world.showText("You lose!", 500, 300);
            if (getY() == 475) {
                isMovingUp = true;
            }
        } else if (getY() < 525 && isMovingUp == true) {
            delayCounter++;
            if (delayCounter >= 120) { 
                setLocation(getX(), getY() + moveSpeed);
                Greenfoot.delay(1);
            }
            
        }
        
    }
    
    }
}
