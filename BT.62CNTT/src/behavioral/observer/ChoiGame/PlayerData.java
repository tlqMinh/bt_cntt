package behavioral.observer.ChoiGame;
import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private int thoiGian;
    private int countdown;
    private int grade;
    private List<Dashboard> dashboards = new ArrayList<>();

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notifyDashboards();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        notifyDashboards();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyDashboards();
    }

    public void attachDashboard(Dashboard dashboard) {
        dashboards.add(dashboard);
    }

    public void detachDashboard(Dashboard dashboard) {
        dashboards.remove(dashboard);
    }

    private void notifyDashboards() {
        for (Dashboard dashboard : dashboards) {
            dashboard.update(thoiGian, countdown, grade);
        }
    }

}

