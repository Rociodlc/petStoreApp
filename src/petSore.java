public class petSore {
    private String species;
    private String name;
    private int age;

    public petSore() {
    }

    public petSore(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


