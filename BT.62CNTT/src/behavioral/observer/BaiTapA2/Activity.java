package behavioral.observer.BaiTapA2;

public class Activity implements MinhBUTTON.OnClickListener{

    MinhBUTTON button;
    int clickCount = 0;
    public Activity(MinhBUTTON button) {
        this.button = button;
        button.attach(this);
    }

    @Override
    public void onClick() {
        clickCount++;
        System.out.println("Bạn đã click "+clickCount );
    }
}
