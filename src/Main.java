import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        massiv();
        }
        public static void massiv() {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Иванов Иван Иванович", "Директор", "ivivan@mail.ru", "999111111","150000","44");
        empCorp[1] = new Employee("Петров Петр Петрович", "Бухглатер", "petrov@mail.ru", "999222222","100000","33");
        empCorp[2] = new Employee("Смирнов Смирня Смиронович", "Кадровичка", "smirnov@mail.ru", "999333333","50000","22");
        empCorp[3] = new Employee("Попов Поп Попкович", "Менеджер продаж", "popov@mail.ru", "999444444","25000","18");
        empCorp[4] = new Employee("Кузнецов Кузьмин Кузьминович ", "Кузнец своего счастья", "kyznec@mail.ru", "999555555","125","58");

        empCorp[4].info();

    }
}

