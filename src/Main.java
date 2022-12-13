import java.util.Collections;
import java.util.LinkedList;

public class Main {

    /*
    План занятия
    1) LinkedList
     */

    /*
    Теория
    Массив дает доступ к элементу по его индексу.
    Массивы эффективны, когда нужно считывать из них данные, но низкоэффективны, когда нужно вставлять или удалять из них
    элементы.

    Списки - структура данных, в которой каждый элемент содержит ссылку на следующий элемент. Такой подход позволяет упростить
    процедуру вставки и удаления, но в ущерб скорости доступа к элементу

    Совет:
    Если в приложении чаще придется считывать элементы, используйте массивы, если чаще придется изменять структуру данных,
    используйте списки

1   void add(int index, Object element)
Вставляет указанный элемент в указанный указатель позиции в этом списке. Вызывает IndexOutOfBoundsException, если указанный индекс выходит за допустимые пределы (index < 0 || index > size()).
2	boolean add(Object o)
Добавляет указанный элемент в конец этого списка.
3	boolean addAll(Collection c)
Добавляет все элементы в указанной коллекции в конец этого списка в том порядке, в котором они возвращаются итератором указанной коллекции. Выбрасывает NullPointerException, если указанная коллекция имеет значение null (нуль).
4	boolean addAll(int index, Collection c)
Вставляет все элементы указанной коллекции в этот список, начиная с указанной позиции. Вызывает NullPointerException, если указанная коллекция имеет значение null (нуль).
5	void addFirst(Object o)
Вставляет данный элемент в начало этого списка.
6	void addLast(Object o)
Добавляет данный элемент в конец этого списка.
7	void clear()
Удаляет все элементы из этого списка.
8	Object clone()
Возвращает мелкую копию этого LinkedList.
9	boolean contains(Object o)
Возвращает true, если этот список содержит указанный элемент. Если точнее, то возвращает true тогда и только тогда, когда этот список содержит хотя бы один элемент e такой, что (o==null ? e==null : o.equals(e)).
10	Object get(int index)
Возвращает элемент в указанной позиции в этом списке. Вызывает IndexOutOfBoundsException, если указанный индекс выходит за допустимые пределы (index < 0 || index >= size()).
11	Object getFirst()
Возвращает первый элемент в этом списке. Вызывает исключение NoSuchElementException, если этот список пуст.
12	Object getLast()
Возвращает последний элемент в этом списке. Вызывает исключение NoSuchElementException, если этот список пуст.
13	int indexOf(Object o)
Возвращает индекс в этом списке первого упоминания указанного элемента или -1, если список не содержит этот элемент.
14	int lastIndexOf(Object o)
Возвращает индекс в этом списке последнего упоминания указанного элемента или -1, если список не содержит этот элемент.
15	ListIterator listIterator(int index)
Возвращает список-итератор элементов в этом списке (в правильной последовательности), начиная с указанной позиции в списке. Вызывает IndexOutOfBoundsException, если указанный индекс выходит за пределы диапазона (index < 0 || index >= size()).
16	Object remove(int index)
Удаляет элемент в указанной позиции в этом списке. Вызывает исключение NoSuchElementException, если этот список пуст.
17	boolean remove(Object o)
Удаляет первое упоминание указанного элемента в этом списке. Вызывает исключение NoSuchElementException, если этот список пуст. Вызывает IndexOutOfBoundsException, если указанный индекс выходит за пределы диапазона (index < 0 || index >= size()).
18	Object removeFirst()
Удаляет и возвращает первый элемент из этого списка. Выбрасывает исключение NoSuchElementException, если этот список пуст.
19	Object removeLast()
Удаляет и возвращает последний элемент из этого списка. Вызывает исключение NoSuchElementException, если этот список пуст.
20	Object set(int index, Object element)
Заменяет элемент в указанной позиции в этом списке указанным элементом. Вызывает IndexOutOfBoundsException, если указанный индекс выходит за пределы диапазона (index < 0 || index >= size()).
21	int size()
Возвращает количество элементов в этом списке.
22	Object[] toArray()
Возвращает массив, содержащий все элементы в этом списке в правильном порядке. Выбрасывает NullPointerException, если указанный массив равен null (нулю).
23	Object[] toArray(Object[] a)
Возвращает массив, содержащий все элементы в этом списке в правильном порядке; тип выполнения возвращаемого массива - тип указанного массива.


     */

    /*
    Заметки
    Списки и массивы две самые популярные структуры данных
    Вообще существует огромное количество различных структур данных, позволяющих эффективно решать самые разнообразные
    задачи, поэтому хорошо ориентироваться в базовых структурах и алгоритмах для программиста просто необходимо
     */

    public static void main(String[] args) {

        ArrWorking arrWorking = new ArrWorking();

        arrWorking.insert(5);    // Добавляю элементы
        arrWorking.insert(7);
        arrWorking.display();    // Отображаю массив
        arrWorking.clear();      // Удаляю массив

        System.out.println("Массив после удаления: ");
        arrWorking.display();

        arrWorking.remain();   // После условного взлома
        arrWorking.display();

        arrWorking.exterminate();     // Стираю массив
        System.out.println("Массив после стирания: ");
        arrWorking.display();

        arrWorking.remain();  // После условного взлома
        arrWorking.display();

        arrWorking.randomArray(10); // Заполняем псевдослучайными числами
        arrWorking.display();

        LinkedList<Integer> linkedList = new LinkedList<>(); // Создаем список

        linkedList.add(10);                   // Добавляем элементы

        linkedList.add(2);

        linkedList.add(17);

        System.out.println(linkedList);        // Выводим в консоль

        linkedList.add(2, 11);                 // Вставляю по позиции


        System.out.println(linkedList);        // Выводим в консоль

        linkedList.remove(1); // Удаляю элемент

        linkedList.add(7);

        System.out.println(linkedList);



        Collections.sort(linkedList); // Сортируем список через класс Collections

        System.out.println(linkedList);

        linkedList.removeFirst();         // Удаляем первый элемент

        System.out.println(linkedList);

        linkedList.removeLast();          // Удаляем последний элемент

        System.out.println(linkedList);

        linkedList.add(5);
        linkedList.add(16);
        linkedList.add(16);

        System.out.println(linkedList);

        linkedList.removeFirstOccurrence(16);

        System.out.println(linkedList);

        System.out.println(linkedList.get(3)); //  Получаем элемент по его индексу

    }

    /*
    ДЗ
    1) Вдумчиво переписать класс ArrWorking
    2) Сделать его аналог для char(Можно при помощи полиморфизма)
    3*) Сделать аналог класса ArrWorking для своего класса
    4) Продемонстрировать работу LinkedList
     */
}
