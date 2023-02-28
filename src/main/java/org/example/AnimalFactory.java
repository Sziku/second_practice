package org.example;

public class AnimalFactory {
    public Animal create(String animal) {
        // implement this method so that it returns
        // the correct Animal instance
        // based on the animal
        if(animal.equals("cow")){
            return  new Cow();
        } else if (animal.equals("dog")) {
           return new Dog();
        } else if (animal.equals("cat")) {
           return new Cat();
        } else if (animal.equals("duck")) {
           return new Duck();
        }
        return null;
    }
}
