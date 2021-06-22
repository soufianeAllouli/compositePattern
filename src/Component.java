public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    public abstract void show();

    public String tabs(){
        String tabs="";
        for (int i = 0; i <level ; i++) {
            tabs+="\t";
        }
        return tabs;
    }
}
