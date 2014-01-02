import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boy extends GamePlay
{
    
    public void act() 
    {
        super.act();
        Actor balloon;
        if(Greenfoot.isKeyDown("left"))
        {
            this.move(-5);
        }
        
         if(Greenfoot.isKeyDown("right"))
        {
            this.move(5);
        }
        
        
    }    
}
