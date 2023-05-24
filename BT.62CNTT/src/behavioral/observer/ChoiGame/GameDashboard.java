package behavioral.observer.ChoiGame;

public class GameDashboard implements Dashboard {
    @Override
    public void update(int thoiGian, int countdown, int grade) {
        System.out.println("Thời gian còn lại: " + thoiGian);
        System.out.println("Số lượt chơi còn lại: " + countdown);
        System.out.println("Điểm số: " + grade);
        System.out.println("---------------");
    }
}
