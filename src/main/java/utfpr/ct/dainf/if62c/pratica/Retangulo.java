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
public class Retangulo implements FiguraComLados {
    private final double base;
    private final double altura;
    
    public Retangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double getLadoMenor() {
        if(base<altura)
            return base;
        return altura;
    }

    @Override
    public double getLadoMaior() {
        if(base>altura)
            return base;
        return altura;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPerimetro() {
        return (2*base+2*altura);
    }

    @Override
    public double getArea() {
        return(base*altura);
    }
}
