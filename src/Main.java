import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witam, podaj mi swoją datę urodzenia w formacie rrrr-mm-dd");
        Scanner scanner = new Scanner(System.in);
        String givenDate = scanner.nextLine();

        DateValidator dateValidator = new DateValidator();
        boolean isValid = dateValidator.validate(givenDate);

        if (isValid = true) {
                LocalDate localDate = LocalDate.parse(givenDate);
                System.out.println(localDate.getDayOfWeek());
        } else {
                givenDate = scanner.nextLine();
        }
    }
}







