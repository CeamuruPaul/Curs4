package oop;

public class AnimalTest {
    public static void main(String[] args) {
        Girffe x = new Girffe();
        Hipo y = new Hipo();

        PetOwner bob = new PetOwner(x, y);
        Vet marley = new Vet();

        bob.takePetsToVet(marley);
        x.sleep();

    }
}
