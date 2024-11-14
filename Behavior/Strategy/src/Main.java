public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.setStrategy(FormatterStrategy.UPPER_CASE);
        System.out.println("Formatted text (Upper Case): " + editor.formatText("hello world"));

        editor.setStrategy(FormatterStrategy.LOWER_CASE);
        System.out.println("Formatted text (Lower Case): " + editor.formatText("HELLO WORLD"));

        editor.setStrategy(FormatterStrategy.TITLE_CASE);
        System.out.println("Formatted text (Title Case): " + editor.formatText("hello WORLD"));
    }
}