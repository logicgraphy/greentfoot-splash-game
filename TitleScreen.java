import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 *  
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World implements Screen
{  
    
    private boolean startGame=true;
    private boolean endGame=true;
    PlayButton play = new PlayButton();    
    private GreenfootSound backgroundMusic=null;
    private GreenfootImage frontImage;
    private GreenfootImage splashImage;
    private GreenfootImage textImage;
  
    public TitleScreen()  
    {      
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.  
        super(800, 600, 1);  
        frontImage= new GreenfootImage("front.png");
        splashImage= new GreenfootImage("splashI.png");
        textImage= new GreenfootImage("text.png");
        prepare();  
        
          
    }  
      
      public boolean getStart()
      {
          return startGame;
        }
        
    public boolean getStop()
    {
        return endGame;
    }
    
    public void backgroundMusic()
    {
    }
        
            
        
    public void act()  
    { 
          
       if (play.getStart() == true){    
            Greenfoot.setWorld(new GameWorld());
            backgroundMusic();
        }  
    }  
     
      
    private void prepare()  
    {  
        //Play button  
        addObject(play, 395, 405);  
        this.getBackground().drawImage(frontImage, 40, 300);
        this.getBackground().drawImage(splashImage, 200, 20);
        this.getBackground().drawImage(textImage, 450,450);
        //playbutton.setLocation(424, 392);
    }
      
      
      
}  
  

