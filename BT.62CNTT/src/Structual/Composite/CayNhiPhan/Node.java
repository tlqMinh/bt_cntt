package Structual.Composite.CayNhiPhan;

import java.util.ArrayList;
import java.util.List;

public class Node extends Cay {
    List<Cay> nodeList = new ArrayList<>();

    public Node(String gTri, List<Cay> nodeList) {
        super(gTri);
        this.nodeList = nodeList;
    }

    @Override
    public void addNode(Cay node) {
        nodeList.add(node);
    }

    @Override
    public void removeNode(Cay node) {
        nodeList.remove(node);
    }

    @Override
    public String duyetCay() {
        return gTri;
    }
}
