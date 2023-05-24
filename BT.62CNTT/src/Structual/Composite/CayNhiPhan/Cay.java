package Structual.Composite.CayNhiPhan;

public abstract class Cay{
    String gTri;
    public Cay(String gTri){
        this.gTri = gTri;
    }
    abstract public String duyetCay();
    public void addNode(Cay node){}
    public void removeNode(Cay node){}
}
