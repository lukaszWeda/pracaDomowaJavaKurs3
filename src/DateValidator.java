import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateValidator {

    public boolean validate(String givenDate) {
        boolean result = false;
            try {
                LocalDate.parse(givenDate);
                result = true;
            } catch (DateTimeParseException e) {
                System.out.println("Błędny format daty, podaj datę w prawidłowym formacie");
            }
            return result;
        }
    }

