import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{
    private boolean active;

    public StringBar() {
        this(new ArrayList<>());
    }

    public StringBar(List<BarObserver> observers) {super(observers);}
    @Override
    public boolean isHappyHour() {
        if (active == true) return true;
        return false;
    }

    @Override
    public void startHappyHour() {
        active = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        active = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
