public class TitleCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
}