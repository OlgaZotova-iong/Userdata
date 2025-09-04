public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.birthday = new FormDate(13, 6, 1999);
        //post.day = 13;
        //post.month = 6;
        //post.year = 1999;
        post.subscription = true;


        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Дата рождения: " + post.birthday.getDay() + "." + post.birthday.getMonth() + "." + post.birthday.getYear());
        //System.out.println("День рождения: " + post.day + "." + post.month + "." + post.year);
        System.out.println("Подписка: " + post.subscription);
    }
}


