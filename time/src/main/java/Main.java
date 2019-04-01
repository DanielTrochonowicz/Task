import org.joda.time.DateTime;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        DateTime time = new DateTime();

        int month = time.getMonthOfYear();
        int year = time.getYear();
        System.out.println("Miesiac: " + month +" " + "Rok: " + year );

        String stringMonth = null;

        switch (month){
            case 1:
                stringMonth = "Styczen";
                break;
            case 2:
                stringMonth = "Luty";
                break;
            case 3:
                stringMonth = "Marzec";
                break;
            case 4:
                stringMonth = "Kwiecien";
                break;
            case 5:
                stringMonth = "Maj";
                break;
        }
        System.out.println("Miesiace: " + month);
        System.out.println("Rok: " + year);
        JOptionPane.showMessageDialog(null,"dzisiaj jest " + time.getDayOfMonth() + " "+ stringMonth + " " + year);
    }
}
