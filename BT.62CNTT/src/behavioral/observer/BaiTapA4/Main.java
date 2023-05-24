package behavioral.observer.BaiTapA4;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        LopA tvLopA = new LopA(topic);
        LopB tvLopB = new LopB(topic);

//        topic.attach(tvLopA);
//        topic.attach(tvLopB);

        topic.notifyThongTin("thong tin 1");
        topic.notifyThongTin("thong tin 2");
        tvLopA.update("thong tin moi");
        tvLopB.update("thong tin moi");
        tvLopB.huyDangKy();
        topic.notifyThongTin("thong tin 3");

    }
}
