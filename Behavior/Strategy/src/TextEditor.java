// 上下文类
public class TextEditor {
    private FormatterStrategy strategy;

    public void setStrategy(FormatterStrategy strategy) {
        this.strategy = strategy;
    }

    public String formatText(String text) {
        return strategy.getFormatter().format(text);
    }
}
