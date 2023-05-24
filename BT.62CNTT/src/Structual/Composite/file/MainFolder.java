package Structual.Composite.file;

import java.util.ArrayList;

public class MainFolder {
    public static void main(String[] args) {
        ArrayList ConChoNgu = new ArrayList();
        AbstractFile abstractFile = new Folder("Con Cho Ngu ",ConChoNgu);
        AbstractFile abstractFile1 = new File("Con cho ngu 1");
        AbstractFile abstractFile2 = new File("Con Cho Ngu 2");

        abstractFile.addFile(abstractFile1);
        abstractFile.addFile(abstractFile2);
        System.out.println(abstractFile.getTreeFolder());
    }
}
