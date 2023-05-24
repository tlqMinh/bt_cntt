package behavioral.observer.ChoiGame;

public class MainChoiGame {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        Dashboard dashboard = new GameDashboard();
        playerData.attachDashboard(dashboard);

        // thay đổi thông tin trong trò chơi
        playerData.setThoiGian(120);
        playerData.setCountdown(3);
        playerData.setGrade(1500);
    }
}
