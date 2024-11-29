public class Main {
    public static void main(String[] args) {
        String phone = "8900 954 18-61";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.startsWith("8")) {
            phone = '7' + phone.substring(1);
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас чужой");
        }
        System.out.println("phone = " + phone);
        String expctedPhone = "79009541861";
        if (phone.equals(expctedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }
}
