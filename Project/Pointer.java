import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Poiner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pointer extends GamePlay
{
    /**
     * Act - do whatever the Poiner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        setRotation(270);
         if(Greenfoot.isKeyDown("z"))
        {
            this.move(3);
            if(this.getY() < 10)
            {
                this.setLocation(25, 500);
            }
        }
        
    
    }    
   
}
