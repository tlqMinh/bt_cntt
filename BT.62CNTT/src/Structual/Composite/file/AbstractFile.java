package Structual.Composite.file;

public abstract class AbstractFile {
    String name;

    public AbstractFile(String name) {
        this.name = name;
    }
    public void addFile(AbstractFile file){}
    public void removeFile(AbstractFile file){}
    abstract public String getTreeFolder();
}
