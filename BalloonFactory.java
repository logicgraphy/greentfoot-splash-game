/**
 * Write a description of class BalloonFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalloonFactory  
{
    public Balloon makeBalloons(String color)
    {
        if(color.equals("red"))
        {
            return new RedBalloon();
        }
        if(color.equals("green"))
        {
            return new GreenBalloon();
        }
        if(color.equals("yellow"))
        {
            return new YellowBalloon();
        }
        if(color.equals("blue"))
        {
            return new BlueBalloon();
        }
        return null;
    }
}
