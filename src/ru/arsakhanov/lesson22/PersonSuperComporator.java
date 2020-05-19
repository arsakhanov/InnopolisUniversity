package ru.arsakhanov.lesson22;

import java.util.Comparator;


/**
 * Класс который имплементится от Comparator
 * в классе написан только один метод compare, который сравнивает объекты Person по двум полям String name и int age
 */
class PersonSuperComparator implements Comparator<Person> {

    /**
     * Переопределенный метод compare, который сравнивает по двум полям
     * @param object1 в качестве параметра передается объект класса Person
     * @param object2 в качестве параметра передается объект класса Person
     * @return возвращает 0, если объекты равны, >0 если объект1 больше объекта2 и <0 если он меньше
     */
    @Override
    public  int compare(Person object1, Person object2) {
        String name1 = object1.getName();
        String name2 = object2.getName();
        int age1 = object1.getAge();
        int age2 = object2.getAge();

        int result = name1.compareTo(name2);
        if(result != 0){
            return result;
        }

        result = age1 - age2;
        if(result!=0){
            return result/Math.abs(result);
        }
        return 0;
    }
}
