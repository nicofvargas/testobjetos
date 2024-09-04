package personajes;

public abstract class Personaje {
    protected String nombre;
    protected int salud;
    protected int armadura;
    protected int ataque;
    protected int saludMax = 100;
    protected int energia=0;
    protected int energiaMax=100;


    public Personaje (String nombre, int salud, int armadura, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.armadura = armadura;
        this.ataque = ataque;
    }

    //metodos para acceder y modificar atributos

    public String getNombre() {
        return nombre;
    }
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalud() {
        return salud;
    }
    void setSalud(int salud) {
        this.salud = salud;
    }
    public int getArmadura() {
        return armadura;
    }
    void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public int getAtaque() {
        return ataque;
    }
    void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getEnergia() {
        return energia;
    }
    void aumentarEnergia(int cantidad) {
        this.energia = Math.min(energiaMax, this.energia + cantidad); // Aumenta sin sobrepasar el máximo
    }

    void reducirEnergia(int cantidad) {
        this.energia = Math.max(0, this.energia - cantidad); // Reduce sin ir por debajo de 0
    }

    public boolean tieneSuficienteEnergia(int cantidad) {
        return this.energia >= cantidad;
    }
    //metodos de accion

    public void ataqueBasico(Personaje enemigo) {
        int damage = this.ataque - enemigo.getArmadura();
        if (damage > 0) {
            enemigo.recibirDmg(damage);
            this.aumentarEnergia(10); //aumenta 10 si es ataque efectivo
            System.out.println(this.nombre + " ha atacado a " + enemigo.getNombre());
        }
        else {
            System.out.println(enemigo.getNombre() + " ha bloqueado el ataque");
        }
    }
    //los metodos abstractos son usados por otras subclases que hereden de esta clase Personaje
    public abstract void atacar();

    public void recibirDmg(int damage) {
        this.salud -= damage;
        if (this.salud<=0) {
            System.out.println(this.getNombre() + " ha sido derrotado.");
            this.salud = 0;
        }
        else {
            System.out.println(this.getNombre() + " recibe " + damage + " y tiene " + this.salud);
        }
    }

    public abstract Personaje obtenerEnemigo();

    //metodos de tipo personaje

}
