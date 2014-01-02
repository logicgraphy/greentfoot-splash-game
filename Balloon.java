import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Rectangle;
/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Balloon extends GamePlay
{
    Balloon balloon;
    Splash splash;
    RandomBalloons randomBalloons = new RandomBalloons();
    CollisionDetect collisionDetect = new CollisionDetect();
    
    public void act() 
    {
        super.act();

        balloon = gameWorld.getBalloon();
        if(Greenfoot.isKeyDown("left"))
        {
            this.move(-5);
        }
        
         if(Greenfoot.isKeyDown("right"))
        {
            this.move(5);
        }
        
         if(!Greenfoot.isKeyDown("z") && getPointerY() < 500)
        {
           shootFlag = true;
           this.setLocation(getBoyX(), getPointerY());
           gameWorld.addObject(balloon, getBoyX(), getPointerY());
           Greenfoot.delay(8);
           splash = gameWorld.getSplash();
           gameWorld.addObject(splash, getBoyX(), getPointerY());
           Greenfoot.delay(15);
           collisionDetect.checkCollision(gameWorld, balloon);
           resetPointerLocation();
           resetBalloon(balloon);   
        }
    }    
    
    private int getPointerY()
    {
        Pointer pointer = gameWorld.getPointer();
        return pointer.getY();
    }
    
    private int getBoyX()
    {

        Boy boy = gameWorld.getBoy();
        return boy.getX();
    }
    
    private void resetPointerLocation()
    {

        Pointer pointer = gameWorld.getPointer();
        pointer.setLocation(25, 500);
        int x = gameWorld.getBoy().getX();
    }
    
    private void resetBalloon(Balloon balloon)
    {   
        Boy boy = gameWorld.getBoy();
        //Balloon balloon = gameWorld.getBalloon();
        gameWorld.removeObject(splash);
        gameWorld.removeObject(balloon);
        randomBalloons.setRandomBalloons(gameWorld);
        gameWorld.addObject(gameWorld.getBalloon(), boy.getX()+80, boy.getY()+30);
        
    }
}
