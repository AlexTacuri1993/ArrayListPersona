/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.alex1;

/**
 *
 * @author alex-pc
 */
public class clsanimales {

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        this._nombre = nombre;
    }

    public float getPeso() {
        return _peso;
    }

    public void setPeso(float peso) {
        this._peso = peso;
    }

    public animal1 getAnimal1() {
        return _animal1;
    }

    public void setAnimal1(animal1 animal1) {
        this._animal1 = animal1;
    }

    public animal2 getAnimal2() {
        return _animal2;
    }

    public void setAnimal2(animal2 animal2) {
        this._animal2 = animal2;
    }

    

   
    

    public enum animal1{vertebrados,invertebrados};
    public enum animal2{oviparos,mamiferos};
    
     private int _id;
     private String _nombre;
     private float _peso;
     private animal1 _animal1;
private animal2 _animal2;

    public clsanimales() {
    }

    public clsanimales(int _id, String _nombre, float _peso, animal1 _animal1, animal2 _animal2) {
        this._id = _id;
        this._nombre = _nombre;
        this._peso = _peso;
        this._animal1 = _animal1;
        this._animal2 = _animal2;
    }
    
    
   
    
    
    
    }