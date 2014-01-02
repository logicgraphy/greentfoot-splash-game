import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Rectangle;
/**
 * Write a description of class Pedestrian here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedestrian extends GamePlay implements IScoreStrategy
{

    ScoreSubject subject = new ScoreSubject();
    public void move() 
    {

        if(this.getX() == 0 || this.getX() == (getWorld().getWidth() - 1))
        {
            this.turn(180);
        }
        this.move(1);
       
    }    
    public void computeScore(){
        int score = getScore() + 5;

        subject.notifyObserver(score);
    }
}
