public class PetScoreApp {

    public static void main(String[] args) {
            bird bird1 = new bird(  "canary", "Piolin" ,6 );

            reptile reptile1 = new reptile("lizard", "Rock", 7);

            System.out.println( "el nombre del bird1 = " + bird1.getSpecies() + " " + bird1.getName());
            System.out.println("El nombre de reptile1 = " + reptile1.getSpecies()+ " " + reptile1.getName());


            bird1.getColor();
            System.out.println("El color del ave  =" + bird1.getName() + "es" + bird1.getColor());

            bird1.getType();
            System.out.println("El color del ave  = " + bird1.getName() + "es" + bird1.getColor());

            bird1.getAbilitytofly();
            System.out.println("El ave = " + bird1.getName() + "tiene la capacidad de volar" + bird1.getAbilitytofly());

            reptile1.getCategory();
            System.out.println("El reptil llamado" + reptile1.getName() + "es de la categoria " + reptile1.getCategory());

            reptile1.getSpecies();
            System.out.println("El reptil llamado" + reptile1.getName() + " es un " + reptile1.getSpecies());

            reptile1.getAge();
            System.out.println("La edad del reptil es de " + reptile1.getAge());


        }
    }


