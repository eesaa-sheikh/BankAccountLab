import java.util.Date;

public class mainBank {
    public static void main(String[] args) {
        // current date
        Date currentDate = new Date();
        System.out.println("Date:" + currentDate);

        bankAccount eesaa = new bankAccount("eesaa","sheikh", 1234, 01.1999, 150);
        eesaa.optionMenu();

    }


}
