import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class GamePlayHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLogic extends GamePlay
{
    /**
     * Act - do whatever the GamePlayHandler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int boyX, boyY;
    int pointerX, pointerY;
    int pedestrianX, pedestrianY;
    int cycleX, cycleY;
    int carX, carY;
    

    public void act() 
    {
        System.out.println("Handler.act()");
        if(shootFlag)
        {
            getBoyXY();
            List<Balloon> balloonList = getWorld().getObjects(Balloon.class);
            if(!balloonList.isEmpty())
            {
                Balloon balloon = (Balloon)balloonList.get(0);
                balloon.setLocation(boyX+75, boyY+24);
            }
            shootFlag = false;
        }

    }

    private void getBoyXY()
    {
        List<Boy> boyList = getWorld().getObjects(Boy.class);
        if(!boyList.isEmpty())
        {
            Boy boy = (Boy)boyList.get(0);
            boyX = boy.getX();
            boyY = boy.getY();
        }

        
    }

    private void getPointerXY()
    {
        List<Pointer> pointerList = getWorld().getObjects(Pointer.class);
        if(!pointerList.isEmpty())
        {
            Pointer pointer = (Pointer)pointerList.get(0);
            pointerX = pointer.getX();
            pointerY = pointer.getY();

        }
    }

    private void getPedestrianXY()
    {
        List<Pedestrian> pedestrianList = getWorld().getObjects(Pedestrian.class);
        if(!pedestrianList.isEmpty())
        {
            Pedestrian pedestrian = (Pedestrian)pedestrianList.get(0);
            pedestrianX = pedestrian.getX();
            pedestrianY = pedestrian.getY();
        }
    }

    private void getCycleXY()
    {
        List<Cycle> cycleList = getWorld().getObjects(Cycle.class);
        if(!cycleList.isEmpty())
        {
            Cycle cycle = (Cycle)cycleList.get(0);
            cycleX = cycle.getX();
            cycleY = cycle.getY();
        }
    }

    private void getCarXY()
    { 
        List<Car> carList = getWorld().getObjects(Car.class);
        if(!carList.isEmpty())
        {
            Car car = (Car)carList.get(0);
            carX = car.getX();
            carY = car.getY();
        }
    }
}
