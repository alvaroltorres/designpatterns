public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder ccdrink = new StringBuilder(drink.getText());
        for (int i = 0; i < ccdrink.length(); i++){
            char c = ccdrink.charAt(i);
            if (Character.isLowerCase(c)) {
                ccdrink.setCharAt(i, Character.toUpperCase(c));
            }
            if (!Character.isLowerCase(c)){
                ccdrink.setCharAt(i, Character.toLowerCase(c));
            }
        }
        drink.setText(ccdrink.toString());
    }
}
