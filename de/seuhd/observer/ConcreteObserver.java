package de.seuhd.observer;

import de.seuhd.observer.Subject;
import java.util.List;

public class ConcreteObserver implements Observer {
    // DONE: Add fields and static variables.
    private static int counter = 0;
    private final int id;
    private Subject attachedSubject;

    public ConcreteObserver(Subject subject) {
        // DONE: Implement constructor.
        this.id = ++counter;
        this.attachedSubject = subject;
        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // DONE: Implement update method.
        System.out.println("Observer " + this.id + " received update from subject : New value is " + subject.getValue());
    }

    public void detach() {
        if (this.attachedSubject != null) {
            this.attachedSubject.detach(this);
            this.attachedSubject = null;
        }
    }
}
