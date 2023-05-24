package Structual.Composite.file;

public class File extends AbstractFile{
    public File(String name) {
        super(name);
    }
    @Override
    public String getTreeFolder() {
        return name;
    }
}
