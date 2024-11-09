abstract class Button {
    protected Render render;
    public Button(Render render) {
        this.render = render;
    }

    public abstract void paint();
}
