package Rice;

public class Main {

    public static void main(String[] args) {
        Rice rice = new Rice();
        NewsRoom newsRoom = new NewsRoom(rice);
        EconStat econStat = new EconStat(rice);

        rice.setPrice(30);
        System.out.println("-----------");
        rice.setPrice(32);
        System.out.println("-----------");
        rice.setPrice(29);
        System.out.println("-----------");
        rice.setPrice(35);
    }
}
