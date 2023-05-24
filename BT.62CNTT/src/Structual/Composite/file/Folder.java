package Structual.Composite.file;

import java.util.ArrayList;

public class Folder extends AbstractFile{
    ArrayList<AbstractFile> children = new ArrayList<>();
    public Folder(String name, ArrayList<AbstractFile> children) {
        super(name);
        this.children = children;
    }

    @Override
    public void addFile(AbstractFile file) {
        children.add(file);
    }

    @Override
    public void removeFile(AbstractFile file) {
        children.remove(file);
    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append("Folder:" + name);
        for (var child : children){
            builder.append("\nFile: ").append(child.getTreeFolder());
        }
        return builder.toString();
    }
}
