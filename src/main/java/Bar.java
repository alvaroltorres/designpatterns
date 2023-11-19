import java.util.List;

public abstract class Bar {
    abstract public boolean isHappyHour();
    abstract public void startHappyHour();
    abstract public void endHappyHour();

    public List<BarObserver> observers;

    public Bar(List<BarObserver> observers) {
        this.observers = observers;
    }

    public List<BarObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<BarObserver> observers){
        this.observers = observers;
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers) {
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
        }
    }

}
