package io.zipcoder;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Arrays;

public class PetTest extends TestCase {

    public void testCompareTo() {
        Cat cat0 = new Cat("cat1");
        Dog dog1 = new Dog("dog");
        Cat cat1 = new Cat("cat2");
        Assert.assertTrue(cat1.compareTo(dog1) < 0);
        Assert.assertTrue(dog1.compareTo(cat0) > 0);
    }

    public void testComparePets(){
        Pet[] pets=new Pet[4];
        pets[0]=new Cat("fish1");
        pets[1]=new Dog("dog");
        pets[2]=new Dog("cat2");
        pets[3]=new Fish("cat1");
        Pet[] actual=Pet.sortPetsByTypeThenName(pets);
        for (Pet p : actual) {
            System.out.println(p.get_name());
        }
        Assert.assertEquals("cat1",pets[0].get_name());

    }
}