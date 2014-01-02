import java.util.*;
public class ScoreSubject  
//Observer newObserver
//Observer deleteObserver
{
   static ArrayList<Observer> list ;
    
    public ScoreSubject(){
    list = new ArrayList<Observer>();
   }

    public void register(Observer obs) {
        list.add(obs);
    }

    public void unregister(Observer obs) {
            int observerIndex = list.indexOf(obs);
            list.remove(observerIndex);
    }
    
    public void notifyObserver(int score) {
        
        for(Observer obs : list){
        obs.update(score);
        }
    }


}
