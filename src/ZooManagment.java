public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Cats","simba",8,true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Aquatic fish =new Aquatic("Fish","Nemo", 1, true);
        Aquatic dolphin = new Aquatic("Dolphin", "Flipper", 5, true);
        Aquatic turle = new Aquatic ("Turtle", "Squirtle", 3, false);



        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();
        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(dolphin);
        myZoo.addAquaticAnimal(turle);
        myZoo.addAquaticAnimalsSwim();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lio