import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> numbers = new ArrayList<>();
        List<String> numbers2 = new ArrayList<>();
        char[] chars ={'C', 'M', 'T', 'B', 'A', 'P', 'O', 'H', 'E', 'Y'};
        int[] numbs = {0,1,2,3,4,5,6,7,8,9};
        int[] regions = new int[99];
        for (int i = 0; i < regions.length ; i++) {
            regions[i] = i;
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < regions.length; j++) {
                for (int k = 0; k <= 999 ; k++) {
                    for (int l = 0; l < numbs.length ; l++) {
                char autoChar = chars[i];
                String number = String.format("%s%d%d%d%s%s%02d", autoChar, numbs[l], numbs[l] ,numbs[l], autoChar, autoChar, regions[j]);
                String number2 = new StringBuilder().append(autoChar).append(numbs[l]).append(numbs[l]).append(numbs[l]).append(autoChar).append(autoChar).append(regions[j]).toString();
                numbers.add(number);
                numbers2.add(number2);
                    }
                }
            }
        }

        Set<String> hSet = new HashSet<>();
        hSet.addAll(numbers);

        Set<String> tSet = new TreeSet<>();
        tSet.addAll(numbers);

        Scanner scanner = new Scanner(System.in);
        for (;;) {
            //прямой перебор
            System.out.println("Введите номер для поиска: ");
            String carNumber = scanner.next();
            long startTime1 = System.nanoTime();
            if(numbers.contains(carNumber)) {
                long timeSpent1 = System.nanoTime() - startTime1;
                System.out.println("Прямой перебор: ");
                System.out.println("С помощью format");
                System.out.println("Программа  выполнялась " + timeSpent1 + "миллисекунд");
                System.out.println();
            }

            long startTime12 = System.nanoTime();
            if(numbers2.contains(carNumber)) {
                long timeSpent12 = System.nanoTime() - startTime12;
                System.out.println("Прямой перебор: ");
                System.out.println("С помощью append");
                System.out.println("Программа  выполнялась " + timeSpent12 + "миллисекунд");
                System.out.println();
            }



            //Бинарный поиск
            Collections.sort(numbers);
            long startTime2 = System.nanoTime();
            Collections.binarySearch(numbers,carNumber);
            long timeSpent2 = System.nanoTime()-startTime2;
            System.out.println("Бинарный поиск: ");
            System.out.println("С помощью format ");
            System.out.println("Программа выполнялась " + timeSpent2 + "миллисекунд");
            System.out.println();

            long startTime22 = System.nanoTime();
            Collections.binarySearch(numbers,carNumber);
            long timeSpent22 = System.nanoTime()-startTime22;
            System.out.println("Бинарный поиск: ");
            System.out.println("С помощью append");
            System.out.println("Программа выполнялась " + timeSpent22 + "миллисекунд");
            System.out.println();

            //HashSet
            long startTime3 = System.nanoTime();
            if(hSet.contains(carNumber)) {
                long timeSpent3 = System.nanoTime() - startTime3;
                System.out.println("Поиск в HashSet: ");
                System.out.println("С помощью format");
                System.out.println("Программа выполнялась " + timeSpent3 + "миллисекунд");
                System.out.println();
            }
            long startTime33 = System.nanoTime();
            if(hSet.contains(carNumber)) {
                long timeSpent33 = System.nanoTime() - startTime33;
                System.out.println("Поиск в HashSet: ");
                System.out.println("С помощью append");
                System.out.println("Программа выполнялась " + timeSpent33 + "миллисекунд");
                System.out.println();
            }

            //TreeSet
                long startTime4 = System.nanoTime();
             if(tSet.contains(carNumber)) {
                 long timeSpent4 = System.nanoTime()-startTime4;
                 System.out.println("Поиск в TreeSet: ");
                 System.out.println("С помощью format ");
                 System.out.println("Программа выполнялась " + timeSpent4 + "миллисекунд");
                 System.out.println();
             }

            long startTime44 = System.nanoTime();
            if(tSet.contains(carNumber)) {
                long timeSpent44 = System.nanoTime()-startTime44;
                System.out.println("Поиск в TreeSet: ");
                System.out.println("С помощью append ");
                System.out.println("Программа выполнялась " + timeSpent44 + "миллисекунд");
                System.out.println();
            }
            }
        }
    }

