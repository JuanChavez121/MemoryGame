import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rightCup2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rightCup2 extends Actor
{
    /**
     * Act - do whatever the rightCup2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean isMovingUp=false;
    private int moveSpeedUp=2;
    private int delayCounter = 0;
    private int moveSpeed=1;
    private easyTable world;
    public rightCup2()
    {
        GreenfootImage letterMImage = getImage();
        
        int newWidth=100; 
        int newHeight=150; 
        letterMImage.scale(newWidth, newHeight);
        setImage(letterMImage);

    
        
    }
    public rightCup2(easyTable world) {
        this.world = world; 
    }
    public void act(){
    if (getWorld() instanceof hardTable) {
        hardTable world = (hardTable) getWorld();
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
