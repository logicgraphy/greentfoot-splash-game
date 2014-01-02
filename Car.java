import greenfoot.*; 
import java.awt.Rectangle; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends GamePlay implements IScoreStrategy
{

    private Actor balloon;
    private ScoreSubject subject = new ScoreSubject();
    
    public void move() 
    {

        this.move(-3);
        if(this.getX() == 0 || this.getX() == (gameWorld.getWidth() - 1))
        {
            this.turn(180);
        }
    }   
    
    public void computeScore(){
        
        int score = getScore() + 15;
        subject.notifyObserver(score);
        
    }
}
