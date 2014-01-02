import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    
    private Boy boy;
    private Car car;
    private Cycle cycle;
    private Pedestrian pedestrian;
    private Balloon balloon;
    private Pointer pointer;
    private GamePlay play;
    private GameFactory factory;
    //private CollisionDetect detect;
    private Timer timer;
    private Splash splash;
    private Score score;
    private GamePlay gamePlay;
    private TargetController targetController;
    GreenfootSound backgroundMusic = new GreenfootSound("1game.wav");
    Instructions message;
     public void started()
    {
        backgroundMusic.playLoop();  
    }  
      
     public void stopped()  
    {  
        backgroundMusic.stop();  
    } 
    
    public Boy getBoy()
    {
        return this.boy;
    }
    
    public Splash getSplash()
    {
        return this.splash;
    }
    
    public Car getCar()
    {
        return this.car;
    }
    
    public Timer getTimer()
    {
        return this.timer;
    }
    
    public Cycle getCycle()
    {
        return this.cycle;
    }
    
    public Pedestrian getPedestrian()
    {
        return this.pedestrian;
    }

    public Balloon getBalloon()
    {
        return this.balloon;
    }
    
    public void setBalloon(Balloon newBalloon)
    {
        this.balloon = newBalloon;
    }
    
    public Pointer getPointer()
    {
        return this.pointer;
    }
    
    public Instructions getInstructions()
    {
        return this.message;
    }
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        started(); 

    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        this.gamePlay = new GamePlay();
        this.boy = (Boy)GameFactory.getNewInstance("boy");
        addObject(boy, 400, 507);
        this.pedestrian = (Pedestrian)GameFactory.getNewInstance("pedestrian");
        addObject(pedestrian, 35, 306);
        this.cycle = (Cycle)GameFactory.getNewInstance("cycle");
        addObject(cycle, 770, 200);
        this.car = (Car)GameFactory.getNewInstance("car");
        addObject(car, 748, 30);
        this.pointer =(Pointer)GameFactory.getNewInstance("pointer");
        addObject(pointer, 30, 500);
        this.balloon = (Balloon)GameFactory.getNewInstance("balloon");
        addObject(balloon, 480, 536);
        this.timer = (Timer)GameFactory.getNewInstance("timer");
        addObject(timer,800, 480);
        this.score = (Score)GameFactory.getNewInstance("score");
        addObject(score, 300, 480);
        this.splash = (Splash)GameFactory.getNewInstance("splash");
        //this.detect = (CollisionDetect)GameFactory.getNewInstance("detect");
        this.targetController = (TargetController) GameFactory.getNewInstance("targetController");
        addObject(targetController, 0, 0);
        this.message = (Instructions)GameFactory.getNewInstance("message");
        addObject(message, 510, 307);
    }
}
