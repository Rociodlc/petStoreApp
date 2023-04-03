public class reptile extends petSore {
    private String category;
    private String Species;
    private int age;

    public reptile() {
    }
    public reptile(String species, String name, int age) {
        super(species, name, age);
    }

    public reptile(String species, String name, int age, String category, String species1, int age1) {
        super(species, name, age);
        this.category = category;
        Species = species1;
        this.age = age1;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getSpecies() {
        return Species;
    }

    @Override
    public void setSpecies(String species) {
        Species = species;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}



