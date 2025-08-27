/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author arane
 */
public class Medicamento {
    //Atributos
    private String nombre, tipo, caducidad;
    private int codigo, stock;
    
    //Contructores
    public Medicamento(String nombre, String tipo, String caducidad, int cogido, int stock) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.caducidad = caducidad;
        this.codigo = cogido;
        this.stock = stock;
    }
    public void vender(Cliente cliente) {
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    

}
