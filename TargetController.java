import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TargetController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetController extends GamePlay
{
    /**
     * Act - do whatever the TargetController wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private MoveTargets moveTargets = new MoveTargets();
    public void act() 
    {
        super.act();
        
        moveTargets.moveCar(gameWorld.getCar());
        moveTargets.moveCycle(gameWorld.getCycle());
        moveTargets.movePedestrian(gameWorld.getPedestrian());
    }    
}