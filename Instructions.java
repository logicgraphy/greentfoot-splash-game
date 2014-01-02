import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Instructions class is created to draw messages in the 
 * Gumball world regarding processing intructions.
 * 
 */

public class Instructions extends GamePlay
{
    // Font object for instructions/messages.
    Font font = new Font("Comic Sans MS", 2, 38);
    
    /**
     * Contructor for the Instructions class
     */
    public Instructions() 
    { 
        setImage(new greenfoot.GreenfootImage(400,200));
    } 
    
    /**
     * This method is created to draw messages.
     * 
     * @param string message to be drawn
     */
    public void drawMessage(String message)
    {
        GreenfootImage gimg = this.getImage();
        gimg.clear();
        gimg.setFont(font);
        gimg.setColor(Color.WHITE);
        gimg.drawString(message,0,50); 
    }
 

}
