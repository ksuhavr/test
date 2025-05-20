public class Park {
    public class Info {
        private String name;
        private String workingHours;
        private double price;
        public Info (String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void info () {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " BYN");
        }
    }

    public static void main(String[] args) {
        Park.Info ferrisWheel = new Park().new Info("Колесо обозрения", "9:00-21:00", 21.90);
        ferrisWheel.info();
    }
}