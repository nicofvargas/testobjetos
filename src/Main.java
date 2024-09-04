import personajes.Guerrero;
import personajes.Mago;

public class Main {
    public static void main (String [] args) {
        Mago mago = new Mago("npc1", 100, 25, 52);
        Guerrero warrior = new Guerrero("npc2", 100, 50, 10);

        System.out.println(mago.getNombre() + " salud: " + mago.getSalud());
        System.out.println(warrior.getNombre() + " salud: " + warrior.getSalud());

        //desppues de ataque
        mago.ataqueBasico(warrior);
        System.out.println(warrior.getNombre() + " salud: " + warrior.getSalud());


    }
}
