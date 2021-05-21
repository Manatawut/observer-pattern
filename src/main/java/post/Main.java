package post;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FacebookPage Master = new FacebookPage("Master");
        User Nac = new User("Nac");
        Nac.follow(Master);
        User Man = new User("Man");
        Man.follow(Master);

        BackupService service = new BackupService("backup.txt", Master);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.nextLine();
            Master.post(message);
        }
    }

}
