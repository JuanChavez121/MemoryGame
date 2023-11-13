import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cup1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class middleCup2 extends Actor
{
    
    private int delayCounter = 0;
    private easyTable world;
    private int moveSpeed=1; 
    private int targetY=525;
    private int moveSpeedUp=2;
    public boolean isMovingUp=false; 

    public middleCup2()
    {
        GreenfootImage letterMImage = getImage();
        
        int newWidth = 100; 
        int newHeight = 150; 
        letterMImage.scale(newWidth, newHeight);
    
        setImage(letterMImage);

    
        
    }
    public middleCup2(easyTable world) {
        this.world = world;
    }
    public boolean isMovingUp() {
        return isMovingUp;
    }
    public void act()
    {
        if (getY() >= targetY)
        {
            // Cup has reached the target Y-coordinate
            ball2 ball2 = (ball2) getWorld().getObjects(ball2.class).get(0); 
            if (ball2 != null)
            {
                ball2.getImage().setTransparency(0); 
            }
        }
        
        if (getWorld() instanceof hardTable) {
            hardTable world = (hardTable) getWorld();
            int numSwaps = world.numSwaps;
            
        if (getY() < targetY &&numSwaps!=0)
            {
                setLocation(getX(), getY() + moveSpeed); 
            }
            if (Greenfoot.mouseClicked(this) && numSwaps == 0) {
                ball2 ball2 = (ball2) getWorld().getObjects(ball2.class).get(0);
                ball2.setLocation(getX(),575);
                ball2.getImage().setTransparency(255);
                
                while (getY() > 475 && isMovingUp==false) {
                setLocation(getX(), getY() - moveSpeedUp);
                Greenfoot.delay(1);
                }
    
                world.showText("You win!", 500, 300);
                nextArrow2 arrow1 = new nextArrow2();
                world.addObject(arrow1,945,645);

                if(getY()==475){
                isMovingUp=true;
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

                      
        
    
    

