import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    private List<Component> components=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(tabs()+"|- folder : "+name);
        components.forEach(c->c.show());
    }

    public void addComponent(Component component){
        components.add(component);
        component.level=this.level+1;
    }
}
