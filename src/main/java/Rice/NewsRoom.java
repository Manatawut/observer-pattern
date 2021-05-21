package Rice;

public class NewsRoom implements Observer{

    private Subject subject;

    public NewsRoom(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(double data) {
        System.out.println("Current Price : " + data);
    }
}
