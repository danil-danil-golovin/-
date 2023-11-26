public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        String TrueFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — "  + TrueFullName);
    }
}
