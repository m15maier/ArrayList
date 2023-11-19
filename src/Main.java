import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//Создать ArrayList. заполните его числами от 0 до 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        int sum = numbers.stream()
                .map(num -> num / 2)        // Делит все числа на 2
                .filter(num -> num > 25)    // Оставляет только те, которые больше, чем 25
                .map(num -> num - 30)       // Вычитает 30 из каждого числа
                .sorted()                   // Сортирует
                .limit(5)           // Выбирает только первых 5 элементов
                .reduce(0, Integer::sum);       // подсчитывает сумму оставшихся элементов

// Вывести результат на экран
        System.out.println("Сумма первых 5 элементов после обработки: " + sum);
    }
}