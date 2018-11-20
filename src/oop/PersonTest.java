package oop;


public class PersonTest {
    public static void main(String[] args) {
        Person vito = new Person( "Don Vito",100);
        Person sony = new Person( "Supersonic", 200);
        Child alex = new Child("Alex", 50);

        alex.run();
        alex.sleep();
        alex.showEnergy();

        vito.run();
        vito.run();
        vito.run();
        vito.showEnergy();
        vito.sleep();
        vito.showEnergy();

        for(int i=0; i<10; i++) {
            sony.run();
        }
        sony.showEnergy();

    }
}
