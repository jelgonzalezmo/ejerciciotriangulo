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
public class coordenadas {
    private double X;
    private double Y;
    public double area;
    public double altura;
    public double base;
    public double perimetro;
public coordenadas(double x, double y){
this.X=x;
this.Y=y;
}

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
  public double Calcular_area(){
  this.area=(this.base*this.altura)/2;
  return this.area;}
  public double Calcular_perimetro(){
  this.perimetro=(this.base+(2*()));
    }
  
  
}
