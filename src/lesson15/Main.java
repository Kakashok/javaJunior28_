package lesson15;

public class Main {
    public static void main(String[] args) {
        String text = null;
        try{
            System.out.println(text.length());
            System.out.println("Все ОК");
        } catch(NullPointerException e){
            System.out.println("Что-то пошло не так");
        }
         // автоматическая генерация исключения
        System.out.println("Hello");
        // 1 - создание объекта класса Exception
        // 2 - вызов метода printStackTrace() у этого объекта
        // 3 - вызов System.exit(); остановка программы
    }
}
