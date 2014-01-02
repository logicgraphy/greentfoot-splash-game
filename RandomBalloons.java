import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomBalloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomBalloons extends GamePlay
{
    BalloonFactory balloonFactory = new BalloonFactory();
    Balloon balloon;
        
    public void setRandomBalloons(GameWorld world)
    {   
         switch ((Greenfoot.getRandomNumber(9999) % 4))
         {
             case 0:
             {
                 balloon = balloonFactory.makeBalloons("red");
                 break;
             }
             
             case 1:
             {
                 balloon = balloonFactory.makeBalloons("green");
                 break;
             }
             
             case 2:
             {
                 balloon = balloonFactory.makeBalloons("blue");
                 break;
             }
             
             case 3:
             {
                 balloon = balloonFactory.makeBalloons("yellow");
                 break;
             }
         }
         world.setBalloon(balloon);

    }
}
