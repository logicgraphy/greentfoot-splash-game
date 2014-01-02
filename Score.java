import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends GamePlay implements Observer
{
   private String scoreText = "SCORE";
    Font font = new Font("Comic Sans MS", 2, 28);
    private static int score = 0;

    
    public Score(ScoreSubject subj){
        setImage(new GreenfootImage(500, 200));
        drawMessage();
        subj.register(this);
        
    }
    public void act() 
    {
        super.act();
        drawMessage();
    }
    
     public void drawMessage(){
        GreenfootImage img = this.getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.setFont(font);
        img.drawString(scoreText+ ":" + score,0,200);
    }
  
    public void update(int score){
        this.score = this.score + score;
    }
    
}
