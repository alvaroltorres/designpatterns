public class StringInverter implements StringTransformer {
    public StringDrink drink;
    @Override
    public void execute(StringDrink drink) {
        StringBuilder rdrink = new StringBuilder(drink.getText());
        rdrink.reverse();
        drink.setText(rdrink.toString());
    }
}
