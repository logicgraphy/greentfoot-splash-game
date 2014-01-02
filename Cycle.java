import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Rectangle;

public class Cycle extends GamePlay implements IScoreStrategy{


    ScoreSubject subject = new ScoreSubject();
    
    public void move() 
    {

         if(this.getX() == 0 || this.getX() == (getWorld().getWidth() - 1))
        {
            this.turn(180);
        }
        this.move(-2);
}
     

    
    public void computeScore(){
        int score = getScore() + 10 ;
        subject.notifyObserver(score);
    }
}
