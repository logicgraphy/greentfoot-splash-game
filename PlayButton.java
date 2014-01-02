import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class PlayButton extends Actor  
    {  
        private boolean Startgame = false;   
        private boolean clicked = false;  
        private GreenfootImage background;  
          
        public PlayButton(){  
            background = getImage();  
            updateImage();  
        }  
          
        public void act()   
        {  
            if (Greenfoot.mouseClicked(this)){  
            Startgame = true;  
            updateImage();  
            }  
        }      
          
          
        public boolean getStart(){  
            return Startgame;  
        }  
          
        private void updateImage(){  
            GreenfootImage image = new GreenfootImage(background);  
            setImage(image);  
        }  
    }  
