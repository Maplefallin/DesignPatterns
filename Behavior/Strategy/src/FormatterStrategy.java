// 枚举类
public enum FormatterStrategy {
    UPPER_CASE(new UpperCaseFormatter()),
    LOWER_CASE(new LowerCaseFormatter()),
    TITLE_CASE(new TitleCaseFormatter());

    private TextFormatter formatter;

    FormatterStrategy(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public TextFormatter getFormatter() {
        return formatter;
    }
}