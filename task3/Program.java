package ua.univer.task3;

import java.util.*;

import ua.univer.task3.Objects.Gem;
import ua.univer.task3.function.*;

public class Program {
    public static void main(String[] args) {
/*Камни.  Определить  иерархию  драгоценных  иполудрагоценных  камней.
Отобрать камни для ожерелья.
Подсчитать общий вес (вкаратах) истоимость.
Провести сортировку камней ожерелья наоснове ценности.
Найти камни в ожерелье, соответствующие заданному диапазону параметров про-зрачности.*/

        Gem[] listOfGems = createListOfGems. createListOfGems();
        Gem[] newNecklace = new Gem[0];

        Scanner sc = new Scanner(System.in);
        System.out.println("Main menu");
        System.out.println("1. Show list of gems");
        System.out.println("2. Sort gems by price");
        System.out.println("3. Create your necklace");
        System.out.println("4. Count weight and price of new necklace");
        System.out.println("5. Find transparent gems in new necklace");

        while(true){
            int key = sc.nextInt();
            switch (key){
                case 1:{
                    printListOfGems. printListOfGems(listOfGems);
                }
                break;
                case 2: {   Arrays.sort(listOfGems, Gem.PriceComparator);
                    System.out.println("Sorted list of gems: ");
                    printListOfGems. printListOfGems(listOfGems);
                }
                break;
                case 3: {
                    newNecklace = createNewNecklace. createNewNecklace(listOfGems, sc);
                    printListOfGems. printListOfGems(newNecklace);
                }
                break;
                case 4: {
                    getTotalWeigthOfNecklace.getTotalWeigthOfNecklace(newNecklace);
                    getTotalPriceOfNecklace.getTotalPriceOfNecklace(newNecklace);
                }
                break;
                case 5: {
                    getListOfTransparentGemsInNecklaceAndPrintList. getListOfTransparentGemsInNecklaceAndPrintList(listOfGems, newNecklace);
                    break;
                }
            }
        }
    }
}



