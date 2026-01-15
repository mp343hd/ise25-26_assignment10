package de.seuhd.observer;
import java.util.List;
import java.util.ArrayList;
import de.seuhd.observer.Observer;

public abstract class Subject {
    // DONE: Add fields.
    private List<Observer> observerList = new ArrayList<>();
    private int state;

    void attach(Observer observer) {
        // DONE: Implement attach method.
        this.observerList.add(observer);
    }

    void detach(Observer observer) {
        // DONE: Implement detach method.
        this.observerList.remove(observer);
    }

    protected void notifyObservers() {
        // DONE: Implement fireUpdate method.
        System.out.println("Sending update ot observers ...");
        for(Observer observer: this.observerList){
            observer.update(this);
        }
    }

    protected void setValue(int i) {
        this.state = i;
        System.out.println("Value of subject updated to " + i);
        this.notifyObservers();
    }

    protected int getValue(){
        return this.state;
    }
}
