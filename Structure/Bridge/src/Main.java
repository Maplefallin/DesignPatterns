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

        //bridge设计模式在与将事物的抽象与实现抽离
        //本体发生变化时，才会使用bridge设计模式
    }
}