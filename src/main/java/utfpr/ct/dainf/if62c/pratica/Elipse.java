/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author davip_000
 */
public class Elipse implements FiguraComEixos {
    private final double eixo1;
    private final double eixo2;
    
    public Elipse(double eixo1, double eixo2){
        this.eixo1=eixo1;
        this.eixo2=eixo2;
    }
    
    @Override
    public double getEixoMenor() {
        if(eixo1<eixo2) 
            return eixo1;
        return eixo2;
    }
    
    @Override
    public double getEixoMaior() {
        if(eixo1>eixo2) 
            return eixo1;
        return eixo2;
    }
    
    @Override
    public double getArea(){
        return (Math.PI*eixo1*eixo2/4);
    }
    
    @Override
    public double getPerimetro(){
        double r=eixo1/2;
        double s=eixo2/2;
        return (Math.PI*(3*(r+s)-Math.sqrt((3*r+s)*(r+3*s))));
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }
}
