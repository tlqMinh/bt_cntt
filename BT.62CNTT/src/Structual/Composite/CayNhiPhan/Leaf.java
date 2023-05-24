package Structual.Composite.CayNhiPhan;

public class Leaf extends Cay{
    int leaf;

    public Leaf(String gTri, int leaf) {
        super(gTri);
        this.leaf = leaf;
    }

    @Override
    public String duyetCay() {
        return gTri;
    }
}
