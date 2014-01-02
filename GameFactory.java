public class GameFactory  
{
    static ScoreSubject subj = new ScoreSubject();
    public static GamePlay getNewInstance(String play){
        
        if(play.equals("boy")){
        return new Boy();
        }
        
        if(play.equals("pedestrian")){
        return new Pedestrian();
        }
        
        if(play.equals("pointer")){
        return new Pointer();
        }
        
        if(play.equals("timer")){
        return new Timer(subj);
        }
        
        if(play.equals("splash")){
        return new Splash();
        }
        
        if(play.equals("car")){
        return new Car();
        }
        
        if(play.equals("cycle")){
        return new Cycle();
        }
        
        if(play.equals("score")){
        return new Score(subj);
        }
        
        if(play.equals("balloon")){
        return new RedBalloon();
        }
        
        if(play.equals("detect")){
        return new CollisionDetect();
        }
        
        if(play.equals("targetController")){
        return new TargetController();
        }
         if(play.equals("message")){
        return new Instructions();
        }
        return null;
    }
}
