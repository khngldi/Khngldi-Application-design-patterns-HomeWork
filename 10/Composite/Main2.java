public class Main2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.jpg", 200);
        File file3 = new File("file3.mp3", 300);

        Directory folder1 = new Directory("Папка1");
        Directory folder2 = new Directory("Папка2");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        Directory rootFolder = new Directory("Root");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        rootFolder.display();
        System.out.println("Общий размер папки Root: " + rootFolder.getSize() + " KB");
    }
}