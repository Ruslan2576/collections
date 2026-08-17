import java.util.ArrayList;

public class ArrayListDemo {
    static void main() {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер al после добавления элементов: " + al.size());

        // Отобразить списковый массив.
        System.out.println("Содержимое al: " + al);

        // Удалить элементы из спиского массива.
        al.remove("F");
        al.remove(2);

        System.out.println("Размер al после удаления элементов: " + al.size());
        System.out.println("Содержимое al: " + al);
    }
}
