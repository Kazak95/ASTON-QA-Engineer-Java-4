// как поняла суть задания, нам нужно создать класс с подклассом,
// где создать конструктор массива, куда со временем будут вносится значания, которые его заполнят

public class Park {
    public static class Attraccions {
        private String infoAttrac;
        private String timeWork;
        private String costAttrac;

        public Attraccions (String infoAttrac, String timeWork, String costAttrac) {
            this.infoAttrac = infoAttrac;
            this.timeWork = timeWork;
            this.costAttrac = costAttrac;
        }
        // В Java геттер и сеттер — это два обычных метода,
        // которые используются для получения значения поля класса или его изменения.
        //Поскольку в классе перемнная является private,
        // то обратиться к ней напрямую за пределами данного класса не получится (обезопасит изменения извне)
        // Чтобы таких проблем не было, внешний код должен вызывать
        // геттер getПЕРЕМЕННАЯ() и сеттер setПЕРЕМЕННАЯ(), чтобы получить или обновить значение переменной
        //Итак, сеттер — это метод, который изменяет (устанавливает; от слова set) значение поля.
        // А геттер — это метод, который возвращает (от слова get) нам значение какого-то поля.
        //И на основании этой информации - я решила выполнить это задание через них.
//1
        public String getInfoAttrac() {
            return infoAttrac;
        }
        public void SetInfoAttrac(String infoAttrac){
            this.infoAttrac = infoAttrac;
        }
//2
        public String getTimeWork() {
            return timeWork;
        }
        public void SetTimeWork(String timeWork){
            this.timeWork = timeWork;
        }
//3
        public String getCostAttrac() {
            return costAttrac;
        }
        public void SetCostAttrac(String costAttrac){
            this.costAttrac = costAttrac;
        }

    }


}