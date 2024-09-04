package personajes.mobs;

import personajes.Personaje;

public class Gnoll extends Personaje {
    public Gnoll(String nombre, int salud, int armadura, int ataque) {
        super(nombre, salud, armadura, ataque);
    }

    @Override
    public void atacar() {

    }

    @Override
    public Personaje obtenerEnemigo() {
        return null;
    }
}
