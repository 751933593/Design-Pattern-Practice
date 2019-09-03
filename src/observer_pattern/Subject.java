package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer, Object obj){
        observer.update(this, obj);
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(Object object){

        for (Observer observer : observers) {
            observer.update(this, object);
        }
    }
}
