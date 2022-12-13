import java.util.Random;

public class ArrWorking {

    /*
    Задача заполнить массив случайными числами
     */



    Random random = new Random();

    private int[] arr;                // Массив
    private int count;                // Указатель на элементы массива


    public ArrWorking(){
        arr = new int[10];      // Начинаем работу с массивом
        count = 0;
    }

    public void insert(int value){
        if(count >= arr.length){      // Проверяю не закончилась ли память
            increaseMemory();
        }
        arr[count] = value;            // Добавляю элемент в массив
        count++;
    }

    private void increaseMemory() {     //Выделяем дополнительную память
        int[] temp = arr;               // Скопировали массив
        arr = new int[arr.length*2];    // Выделили новую память
        copyArray(temp);                // Копирую старый массив в новый
    }

    private void copyArray(int[] arr1) {        // Скопировали массив
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

    }

    public void deleteInd(int index){ // Удаляет элемент
        for (int i = index; i < count; i++) {  // Сдвигаем элементы
            arr[i] = arr[i+1];

        }
        count--;                      // Сокращаем счетчик добавленных элементов
    }

    public void deleteValue(int value){    // Удаляем по значению
        int index = -1;                    // Устанавливаем индекс по умолчанию
        for (int i = 0; i < arr.length; i++) {    // Ищем совпадения в массиве
            if (arr[i] == value) {           // Если нашли
                index = i;                   // Запоминаем индекс
                break;                       // Выходим из цикла
            }
        }
        if(index != -1) {                     // Если найден индекс, делаем сдвиг
            for (int k = index; k < count; k++) {
                arr[k] = arr[k + 1];
            }
            count--;
        }

    }

    public void display(){               // Вывожу массив
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void clear(){     // Удаление простая процедура
        count = 0;
    }

    public void exterminate(){        // Стирание более трудоемкая
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    // -------F||||||||F-------
    //--------|||||||||-------  Удаление
    //-------------------------  Стирание

    public void remain(){      // Условно взломали приложение и добавили метод, для восстановления счетчика
        count = arr.length;
    }

    public void randomArray(int bound){
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
            count++;
        }
    }
}
