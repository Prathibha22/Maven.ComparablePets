package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Pet implements Comparable<Pet> {
    private String _name;

    public Pet(String name) {
        this._name=name;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }
    public String speak(){
        return "";
    }

    public int compareTo(Pet o) {
        return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }

    public static Pet[] sortPetsByTypeThenName(Pet[] pets) {
        Comparator<Pet> byCategory = (o1, o2) -> {
            int compare = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            if (compare == 0) return o1.get_name().compareTo(o2.get_name());
            return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
        };
        List<Pet> petList = Arrays.asList(pets);
        petList.sort(byCategory);
        return petList.toArray(new Pet[0]);
    }
}
