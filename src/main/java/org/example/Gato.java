package org.example;
import java.util.Random;

public class Gato {

    String raza;
    String color;
    Double peso;
    Boolean peludo;
    String nombre;

    public void comer(){
        System.out.println("¡" + nombre+" ha comido mucho! +0.5 kg");
        peso+=0.5;
    }
    public void dormir(){
        System.out.println("Zzzzz...");
    }
    public void jugar(){
        System.out.println("¡Tus cortinas están destrozadas!");
        System.out.println("Pero al menos " +nombre + " quemó energía. -0.25 kg");
        peso-=0.25;
    }
    public void botarPelo(){
        if (peludo){
            System.out.println("Un asmático no podría vivir en tu casa,");
            System.out.println("¡" +nombre +" dejó lleno de pelos!");
        } else {
            System.out.println("Agradeces a los dioses por la falta de pelo de " + nombre);
        }
    }
    public void usarCajaArena(){
        System.out.println("¡Ahora la casa apesta!");
    }

}
