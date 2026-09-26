/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciogit;

/**
 *
 * @author ixpat
 */
public class empleado {
    int id;
    String Nombre;
    

    public empleado(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
            
        
}
