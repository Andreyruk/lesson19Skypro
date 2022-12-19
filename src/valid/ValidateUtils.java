package valid;

import java.time.LocalDate;

public class ValidateUtils {
    public static Double validateEngineVolume(Double value) {
        return value == null || value < 0 ? 1.5 : value;
//        return value < 0 ? Math.abs(value) : value;
    }

    public static boolean expirationDate(LocalDate time) {
        if (LocalDate.now().compareTo(time) >= 0) {
            return false;
        }
        return true;
    }

    public static Integer validateYear(Integer value) {
        return value == null || value <= 0 ? 2000 : value;
//        return value < 0 ? Math.abs(value) : value;
    }

    public static Number validateYearAndNumber(Number figure) {
        return figure == null || figure.intValue() <= 0 ? 0 : figure;
//        return figure < 0 ? Math.abs(figure) : figure;
    }

    public static Number validateMathNumber(Number value) {
        return (Double) value < 0 ? Math.abs((Double) value) : value;
    }

    public static String validateString(String value, String defaultMessage) {
        return value == null || value.isBlank() || value.isEmpty() ? defaultMessage : value;
    }

    public static String validateColor(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "белый" : value;
    }

    public static String validateNumber(String number, String defaultMessage) {
        if (number.matches("[а-яa-z]\\d\\d\\d[а-яa-z][а-яa-z]\\d\\d\\d")) {
            return number;
        }
        return defaultMessage;   // - проверка через регулярные выражения, короче чем ниже
    }

    // или
//        String regex = "[а-яa-z]\\d\\d\\d[а-яa-z][а-яa-z]\\d\\d\\d";
//        Pattern p1 = Pattern.compile(regex);
//        Matcher m1 = p1.matcher( number );
//        boolean r= m1.matches();
//        if (r) {
//            return number;
//        }
//        return defaultMessage;   // - проверка через регулярные выражения
//    }

// или
//        char[] ar = number.toCharArray();
//        if (String.valueOf(ar[0]).matches("[а-яa-z]") && Character.isDigit(ar[1]) && Character.isDigit(ar[2])
//                && Character.isDigit(ar[3]) &&
//                String.valueOf(ar[4]).matches("[а-яa-z]") && String.valueOf(ar[5]).matches("[а-яa-z]")
//                && Character.isDigit(ar[6]) && Character.isDigit(ar[7])
//                && Character.isDigit(ar[8]) && ar.length == 9) {
//            return number;
//        }
//        return defaultMessage;   // - проверка на буквы, цифры и символы!!!
//    }

// или
//        char[] ar = number.toCharArray();
//        if (!Character.isDigit(ar[0]) && Character.isDigit(ar[1]) && Character.isDigit(ar[2])
//                && Character.isDigit(ar[3]) && !Character.isDigit(ar[4]) && !Character.isDigit(ar[5])
//                && Character.isDigit(ar[6]) && Character.isDigit(ar[7])
//                && Character.isDigit(ar[8]) && ar.length == 9) {
//            return number;
//        }
//            return defaultMessage;  // - проверка на цифры
//        }

}