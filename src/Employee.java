public class Employee {
    private  String fio;
    private  String jobTitle;
    private  String email;
    private  String phoneNumber;
    private  String salary;
    private  String age;

    public Employee(String fio, String jobTitle, String email, String phoneNumber,
                    String salary, String age) {
        this.fio = fio;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fio + " Должность: " + jobTitle + " Почта: " + email +
                " Номер телефона: " + phoneNumber + " Зарплата: " + salary + " Возвраст: " + age);
    }
}

