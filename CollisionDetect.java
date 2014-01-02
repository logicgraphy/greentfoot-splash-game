import greenfoot.*;
import java.awt.Rectangle;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CollisionDetect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollisionDetect extends GamePlay
{
    Car car ;
    Pedestrian p ;
    Cycle c;


    public void act()
    {
       super.act();
    }
    
    public void checkCollision(GameWorld gameWorld, Balloon b){

    car = gameWorld.getCar();
    int carx = car.getX() - ((car.getImage().getWidth())/2);
    int cary = car.getY() - ((car.getImage().getHeight())/2);
    int carwidth = car.getImage().getWidth();
    int carheight = car.getImage().getHeight();
   
    int bx = b.getX() - ((b.getImage().getWidth())/2);
    int by = b.getY() - ((b.getImage().getHeight())/2);
    int bwidth = b.getImage().getWidth();
    int bheight = b.getImage().getHeight();
    
    c = gameWorld.getCycle();
    int cx = c.getX() - ((c.getImage().getWidth())/2);
    int cy = c.getY() - ((c.getImage().getHeight())/2);
    int cwidth = c.getImage().getWidth();
    int cheight = c.getImage().getHeight();
    
    p = gameWorld.getPedestrian();
    int px = p.getX() - ((p.getImage().getWidth())/2);
    int py = p.getY() - ((p.getImage().getHeight())/2);
    int pwidth = p.getImage().getWidth();
    int pheight = p.getImage().getHeight();
    
    Rectangle carRect = new Rectangle(carx-(carwidth/2),cary-(carheight/2),carwidth,carheight);
    Rectangle balloonRect = new Rectangle(bx-(bwidth/2),by-(bheight/2),bwidth,bheight);
    Rectangle pedRect = new Rectangle(px-(pwidth/2),py-(pheight/2),pwidth,pheight);
    Rectangle cycRect = new Rectangle(cx-(cwidth/2),cy-(cheight/2),cwidth,cheight);
    
    if(balloonRect.intersects(carRect))
        {
            Greenfoot.playSound("car.mp3");
            car.computeScore();

        }
        
    if(balloonRect.intersects(pedRect))
        {
            Greenfoot.playSound("ped.mp3");
            p.computeScore();

        }
        
    if(balloonRect.intersects(cycRect))
        {
            Greenfoot.playSound("cycle.mp3");
            c.computeScore();

        }
        
    }
    
    
}
