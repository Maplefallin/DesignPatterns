class ConcreteButton extends Button{

    public ConcreteButton(Render render){
        super(render);
    }
    @Override
    public void paint() {
        render.draw();
        System.out.println("Button is painted");
    }
}
