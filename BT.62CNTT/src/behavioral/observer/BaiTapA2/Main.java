package behavioral.observer.BaiTapA2;

public class Main {
    public static void main(String[] args) {
        MinhBUTTON button = new MinhBUTTON();
        Activity a1 = new Activity(button);
        button.click();
        button.click();
        button.click();
    }
}
