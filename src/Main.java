//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            output += multipleOf(3, i, "Fizz");
            output += multipleOf(5, i, "Buzz");
            if(output.isEmpty())
                System.out.println(i);
            else
                System.out.println(output);
        }
    }

    public static String multipleOf(int multiplier, int input, String phrase) {
        if (input % multiplier == 0)
            return phrase;
        else
            return "";
    }
}