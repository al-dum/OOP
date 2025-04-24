package zoo;

import java.util.*;
import java.lang.*;

public class Menu {

    private Scanner sc;
    private List<Animal> animales;

    /**
     * Constructor
     * Inicializa el Scanner
     */
    public Menu() {
        sc = new Scanner(System.in);
        animales = new ArrayList<>();
    }

    public void menuInicial() {
        int opcion;
        do {
            System.out.println("1. Crear");
            System.out.println("2. Vizualizar");
            System.out.println("3. actalizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Buscar");


            opcion = sc.nextInt();
        }

        while (opcion != 0);

        switch(opcion){
            case 1:
                create();
                break;
            case 2:
                read();
                break;
//            case 3:
//                update();
//                break;
        }
    }

    public void create(){
        System.out.println("introduce nombre");
        String nombre = sc.next();
        System.out.println("introduce el peso");
        float peso = sc.nextFloat();
        System.out.println("introduce la edad");
        int edad = sc.nextInt();
        System.out.println("introduce la especie");
        String especie = sc.next();

        System.out.println("Introduce mamifero(1) o ave (otra tecla)");
        int tipo = sc.nextInt();

        if(tipo ==1){
            System.out.println("tiene pelo? Si(1) No(0)");
            boolean tienePelo = (sc.nextInt()!=0)?true:false;
            Animal animal = new Animal(nombre, peso, edad, especie, tienePelo);



    }
        else{
            System.out.println("vuela? Si(1) No(0)");
            boolean vuela = (sc.nextInt()!=0)?true:false;
            Animal animal = new Animal(nombre, peso, edad, especie, vuela);
        }

        Animal animal = null;
        animales.add(animal);
    }

    public void read(){
        for(int i =0; i< animales.size(); i++){
            System.out.println(animales.get(i).getNombre());
            System.out.println(animales.get(i).getPeso());
            System.out.println(animales.get(i).getEdad());
            System.out.println(animales.get(i).getEspecie());
        }
    }

//    public void update(){
//        animales.update
//    }

}