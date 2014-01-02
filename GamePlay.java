import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class GamePlay extends Actor
{
    
    
    boolean shootFlag = false;
    protected int score;
    public GameWorld gameWorld;
    
    
    public void act() 
    {
        gameWorld = (GameWorld) getWorld();
       
    }
    
    public void setScore(int score){
    this.score = score;
    }
    
    public int getScore(){
    return this.score;
    }
    
    public GameWorld getGameWorld()
    {
        return gameWorld;
    }
}
