public class File extends FileSystemComponent {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Файл: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}