package io.zipcoder;

//import javax.crypto.spec.PSource;
import java.util.*;
import java.lang.System;


public class MainApplication {
    public static void main(String[] args) {
        System.out.println("How many pets you have?");
        Scanner input=new Scanner(System.in);
        int numerOfPets=input.nextInt();
        input.nextLine();
        Map<String,String> petDetails=new HashMap<String,String>();
        for(int i=0;i<numerOfPets;i++){
            System.out.println("What kind of Pet you have");
            String kind=input.nextLine();
            System.out.println("What is the name of Pet");
            String name=input.nextLine();
            petDetails.put(name,kind);
        }
        //Part 1
//        for(Map.Entry<String,String> ele:petDetails.entrySet()){
//            System.out.println("Hello your pet is of kind "+ele.getValue()+" and name is "+ele.getKey());
//        }
        //Part 3
        Pet objPet;
        for(Map.Entry<String,String> ele:petDetails.entrySet()){
            if(ele.getValue().equalsIgnoreCase("dog")) {
                objPet=new Dog(ele.getKey());
                System.out.println("Name of the animal "+ele.getKey()+" and makes noise as "+ objPet.speak());
            }
            else if(ele.getValue().equalsIgnoreCase("cat")) {
                objPet=new Cat(ele.getKey());
                System.out.println("Name of the animal "+ele.getKey()+" and makes noise as "+ objPet.speak());
            }
            else if(ele.getValue().equalsIgnoreCase("fish")){
                objPet=new Fish(ele.getKey());
                System.out.println("Name of the animal "+ele.getKey()+" and makes noise as "+ objPet.speak());
            }

        }

    }
}
