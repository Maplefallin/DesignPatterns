import java.util.ArrayList;

public class Composite implements Component {

    private String name;
    private ArrayList<Component> components = new ArrayList<Component>();
    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Composite:"+name);
        for (Component component : components) {
            component.operation();
        }
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void remove(Component c) {
        int index = components.indexOf(c);
        if (index != -1) {
            components.remove(index);
        }else{
            throw new IllegalArgumentException("Component not found");
        }

    }

    @Override
    public Component getChild(int index) {
        Component c = components.get(index);
        if(c != null){
            return c;
        }else {
            throw new IllegalArgumentException("Component not found");
        }
    }
}
