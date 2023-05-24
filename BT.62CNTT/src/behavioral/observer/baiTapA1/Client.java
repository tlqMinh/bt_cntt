package behavioral.observer.baiTapA1;

public class Client<T> implements Stream.StreamListener<T> {
    Stream<T> stream;

    public Client(Stream stream) {
        this.stream = stream;
        stream.addEvent(this);
    }

    @Override
    public void handle(T t) {

    }
}

