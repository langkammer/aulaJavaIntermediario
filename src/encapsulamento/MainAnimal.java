package encapsulamento;

public class MainAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAltura(0.5);
        animal.setCor("Branco");
        animal.setPeso(1.0);
        animal.setRaca("Cachorro");

        calcular(animal);

        System.out.println("Preço da Tosa R$ " + animal.getPrecoTosa());

    }



    public static void calcular(Animal animal) {


        if (animal.ehPorteGrande()) {
            animal.setPrecoTosa(40.00);
        } else {
            animal.setPrecoTosa(20.00);
        }

    }


}
