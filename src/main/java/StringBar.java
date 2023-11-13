public class StringBar extends Bar{
    private boolean active;
    @Override
    public boolean isHappyHour() {
        if (active == true) return true;
        return false;
    }

    @Override
    public void startHappyHour() {
        active = true;
    }

    @Override
    public void endHappyHour() {
        active = false;
    }
}
