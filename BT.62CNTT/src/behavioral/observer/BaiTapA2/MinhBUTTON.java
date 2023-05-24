package behavioral.observer.BaiTapA2;

public class MinhBUTTON {
    OnClickListener onClick;

    public void attach(OnClickListener onClick){this.onClick = onClick;}
    public void click(){
        onClick.onClick();
    }
    static public interface OnClickListener{
        void onClick();
    }
}
