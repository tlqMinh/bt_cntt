package behavioral.observer.BaiTapA4;

public class LopA implements Topic.I_ThongTin{
    Topic topic;
    public LopA(Topic topic){
        this.topic = topic;
        topic.attach(this);
    }
    public void huyDangKy(){topic.detach(this);}

    @Override
    public void update(String tt) {
        if(tt.length() > 0) {
            System.out.println("A: nhan " + tt );
        }else {
            System.out.println("A: not update");
        }
    }
}
