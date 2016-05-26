/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.alex1;
import java.util.ArrayList;
/**
 *
 * @author alex-pc
 */
public class EcEduUniandesAlex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<clsanimales> anim=new ArrayList<clsanimales>();
        
        clsanimales anim1= new clsanimales (1,"vaca",20,clsanimales.animal1.vertebrados,clsanimales.animal2.mamiferos);
        clsanimales anim2= new clsanimales (2,"culebra",5,clsanimales.animal1.invertebrados,clsanimales.animal2.oviparos);
        clsanimales anim3= new clsanimales (3,"caballo",200,clsanimales.animal1.vertebrados,clsanimales.animal2.mamiferos);
        clsanimales anim4= new clsanimales (4,"gallina",10,clsanimales.animal1.vertebrados,clsanimales.animal2.oviparos);
        clsanimales anim5= new clsanimales (5,"sapo",7,clsanimales.animal1.vertebrados,clsanimales.animal2.oviparos);
        clsanimales anim6= new clsanimales (6,"elefante",500,clsanimales.animal1.vertebrados,clsanimales.animal2.mamiferos);
        clsanimales anim7= new clsanimales (7,"peces",2,clsanimales.animal1.vertebrados,clsanimales.animal2.oviparos);
        clsanimales anim8= new clsanimales (8,"ballena",400,clsanimales.animal1.vertebrados,clsanimales.animal2.mamiferos);
        clsanimales anim9= new clsanimales (9,"perro",20,clsanimales.animal1.vertebrados,clsanimales.animal2.mamiferos);
        clsanimales anim10= new clsanimales (10,"lombriz",05,clsanimales.animal1.invertebrados,clsanimales.animal2.oviparos);
          
        anim.add(anim1);
        anim.add(anim2);
        anim.add(anim3);
        anim.add(anim4);
        anim.add(anim5);
        anim.add(anim6);
        anim.add(anim7);
        anim.add(anim8);
        anim.add(anim9);
        anim.add(anim10);
        
         imprimir (anim);
    }
    private static void imprimir (ArrayList<clsanimales>anim){
        for (clsanimales animales :anim){
            System.out.println("**********");
            System.out.println("  Id:"+animales.getId());
            System.out.println("  Nombre:"+animales.getNombre());
            System.out.println("  Peso:"+animales.getPeso());
           System.out.println("  Reino Animal:"+animales.getAnimal1());
        System.out.println("  Titpo de reproduccion:"+animales.getAnimal2());
    }
    
}
    }
