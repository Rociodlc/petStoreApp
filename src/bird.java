public class bird extends petSore {

    private String type;
    private String abilitytofly;
    private  String color;

    public bird(){
    }
    public bird(String species, String name, int age) {
        super(species, name, age);
    }

    public bird(String species, String name, int age, String type, String abilitytofly, String color) {
        super(species, name, age);
        this.type = type;
        this.abilitytofly = abilitytofly;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbilitytofly() {
        return abilitytofly;
    }

    public void setAbilitytofly(String abilitytofly) {
        this.abilitytofly = abilitytofly;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



