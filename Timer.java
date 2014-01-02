import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends GamePlay implements Observer
{
    private String scoreText = "COUNTDOWN";
    Font font = new Font("Comic Sans MS", 2, 28);
    private static int timerCount = 6000;
    private static int timerScore = 0;
    int tempScore = 0;
    int level = 2;
    
    public Timer(ScoreSubject subj){
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
        int time = timerCount/100;
        if(tempScore > 49)
        {
            tempScore = 0;
            timerCount = timerCount + 2000;
            gameWorld.getInstructions().drawMessage("Level: "+level);
            Greenfoot.delay(40);
            gameWorld.getInstructions().drawMessage("");
            level++;
        }
        if(timerCount > 0)
        
        {
            img.drawString(scoreText+ ":" + time,0,200);
            timerCount--;
        }
        else
        {
            gameWorld.getInstructions().drawMessage("GAME OVER");
            Greenfoot.delay(20);
            Greenfoot.stop();  
        }
    }
    
    public void update(int addScore){

        timerScore = timerScore + addScore;
        tempScore = tempScore + addScore;
    }    
     
    
}
