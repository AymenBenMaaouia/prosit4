public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticanimals = new Animal[10];
        setName(name);
        this.city = city;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("name must contain caractere");
            this.name = name;
        }
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    boolean addAnimal(Animal animal) {
        if (isZooFull())
            return false;
        if (searchAnimal(animal) != -1)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    public void addAquaticAnimal(Aquatic aquatic){
        if (nbrAquaticAnimals < aquaticAnimals.length){
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
            System.out.println("Aquatic animal added succesfully.");
        }else{
            System.out.println("Aquatic animal addition failed: Aquatic animals array is full.");
        }
    }
    public class Aquatic extends Animal{
        public Aquatic(String species, String name, int age, boolean isMale) {
            super(species, name, age, isMale);
        }
        public boolean equals(Object obj){
            if (this == obj){
                return true;
            }
            if (obj == null || getClass() != obj.getClass()){
                return false;
            }
            Aquatic aquatic = (Aquatic) obj;
            return getName().equals(aquatic.getName())&&
                    getAge() == aquatic;getAge() &&
