public class Main {
    public static void main(String[] args) {
        // 使用Swing渲染
        Render swingRender = new SwingRender();
        Button buttonSwing = new ConcreteButton(swingRender);
        buttonSwing.paint();

        // 更换为JavaFX渲染
        Render javaFXRender = new JavaFXRender();
        Button buttonJavaFX = new ConcreteButton(javaFXRender);
        buttonJavaFX.paint();
    }
}