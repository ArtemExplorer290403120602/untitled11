package Task2;
//Создать программу для реализации поверхностного и глубокого клонирования объекта
//класса User. Пусть на вход программе будет передаваться тип операции клонирования
//(поверхностное клонирование или глубокое), а также id юзера для клонирования.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1=new User(20,180,"Artem","Mekhanikov");
        User user2=new User(user1.clone());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
