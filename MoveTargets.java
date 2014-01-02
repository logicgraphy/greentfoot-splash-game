import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveTargets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveTargets extends GamePlay
{
    
    public MoveTargets()
    {
    }
    
    public void moveCar(Car car)
    {
        if(null != car)
        {
            car.move();
        }
    }
    
    public void moveCycle(Cycle cycle)
    {
        
        if(null != cycle)
        {
      
            cycle.move();
        }
    }
    
    public void movePedestrian(Pedestrian pedestrian)
    {
        
        if(null != pedestrian)
        {
           
            pedestrian.move();
        }
    }
}
