package ua.univer.task2;

import ua.univer.task2.Data.Country;
import ua.univer.task2.Data.Region;
import ua.univer.task2.function.function;

public class Program {
    public static void main(String[] args) {
        /*Создать  объект  класса Государство,  используя  классы Область,Район,Город.
         Методы:  вывести  наконсоль  столицу,  количество  областей,  пло-щадь, областные центры*/

        Region[] regionsUkraine = function. CreateArrayOfRegions();

        Country Ukraine = new Country("Kiev", regionsUkraine);
        System.out.println("The capital is: " + Ukraine.getCountryCapital());

        function. PrintRegionsInformation(regionsUkraine);
    }




}
