package Task1;

//Создать класс для описания пользователя системы. Переопределить в классе методы
//toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
//значением полей и сравнить с помощью метода equals.
public class Main {
    public static void main(String[] args) {
        UserSY user = new UserSY("Artem", "Mekhanikov", 20, 180);
        UserSY user1 = new UserSY("Artem", "Mekhanikov", 20, 180);
        UserSY user2 = new UserSY("Fedia", "Kunchevich", 19, 175);

        /**
         * Здесь я решил создать свою формулу и проверить отличие hashcoda
         * у троих пользователей ( 1 и 2 одинаковый , а 3 разный
         */

        System.out.println("-------------------");
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println("-------------------");

        /**
         * Здесь идет сравнение между 1 и 2 они получат true
         * а сравнение между 2 и 3 получат false , так же как и для 1 и 3
         */

        System.out.println(user.equals(user1)); //true
        System.out.println(user.equals(user2)); //false
        System.out.println(user1.equals(user2)); //false
        System.out.println("-------------------");

        /**
         * Здесь я просмотрю информацию для каждого пользователя
         */

        System.out.println(user.toString());
        System.out.println("-------------------");
        System.out.println(user1.toString());
        System.out.println("-------------------");
        System.out.println(user2.toString());
        System.out.println("-------------------");
    }
}
