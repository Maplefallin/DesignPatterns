public class Leaf implements Component{

    private String name;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf:"+name);
    }

    @Override
    public void add(Component c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Component c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
