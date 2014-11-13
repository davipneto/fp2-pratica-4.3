
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica43 {
    public static void main(String[] args) {
        
        Elipse e = new Elipse(6,8);
        Circulo c = new Circulo(10);
        System.out.println("Área da Elipse: " + e.getArea());
        System.out.println("Área do Círculo: " + c.getArea());
        System.out.println("Perímetro da Elipse: " + e.getPerimetro());
        System.out.println("Perímetro do Círculo: " + c.getPerimetro());

        Retangulo r = new Retangulo(4,8);
        Quadrado q = new Quadrado(6);
        TrianguloEquilatero t = new TrianguloEquilatero(5);
        System.out.println("Área do Retângulo: " + r.getArea());
        System.out.println("Área do Quadrado: " + q.getArea());
        System.out.println("Área do Triângulo: " + t.getArea());
        System.out.println("Perímetro do Retângulo: " + r.getPerimetro());
        System.out.println("Perímetro do Quadrado: " + q.getPerimetro());
        System.out.println("Perímetro do Triângulo: " + t.getPerimetro());
    }
}
