/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;
/**
 *
 * @author GONZALES
 */
public class color {
    private String Color_lineas;
    private String Color_relleno;
    
    public color(String cl, String cr){
this.Color_lineas=cl;
this.Color_relleno=cr;
}

    public String getColor_lineas() {
        return Color_lineas;
    }

    public String getColor_relleno() {
        return Color_relleno;
    }

    public void setColor_lineas(String Color_lineas) {
        this.Color_lineas = Color_lineas;
    }

    public void setColor_relleno(String Color_relleno) {
        this.Color_relleno = Color_relleno;
    }
}
