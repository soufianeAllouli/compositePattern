public class Main {

    public static void main(String[] args) {
        Component file1=new File("file1");
        Component folder=new Folder("folder1");
        ((Folder)folder).addComponent(file1);
        ((Folder)folder).addComponent(new File("file2"));
        ((Folder)folder).addComponent(new Folder("folder2"));
        folder.show();
    }
}
