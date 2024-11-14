
import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components;

    public Directory(String name) {
        super(name);
        this.components = new ArrayList<>();
    }

    public void add(FileSystemComponent component) {
        if (!components.contains(component)) {
            components.add(component);
        }
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Папка: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}