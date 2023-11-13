public class StringReplacer implements StringTransformer{
     private char a;
     private char b;
    public StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(a, b));
    }

    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(b, a));
    }
}
