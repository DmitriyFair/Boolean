public class Main {
    // // Дано 2 параметра типа boolean (ночь и хорошая погода). В зависимости от условий даём различные команды
    public static void main(String[] args) {
        int time = 13;
        boolean goodWeather = false;
        boolean night = time >= 23 || time <= 5;
        if (night) {
            System.out.println("Go to sleep!");
        }
        if (!night && goodWeather) {
            System.out.println("Go to the walk!");
        }
        if (!night && !goodWeather) {
            System.out.println("Go to reading a book!");
        }
    }
}
