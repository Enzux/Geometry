import java.util.Scanner;
import java.lang.Math;



public class Plana{
    float a, b, r, B, d, D; 
    String rForma;
    Scanner sc1 = new Scanner(System.in);

    
    public float quadrado(){
        System.out.println("///////Area do quadrado///////");
        System.out.println("Digite o tamanho da aresta:");
        a = sc1.nextFloat();
        if (a < 0) {
            System.out.println("Não pode incluir números negativos");
            quadrado();
            System.out.println("\n");
        }
        return a*a;
    }
    public float retangulo(){
        System.out.println("///////Area do retangulo///////");
        System.out.println("Digite o tamanho da altura:");
        a = sc1.nextFloat();
        System.out.println("Digite o tamanho da base:");
        b = sc1.nextFloat();
        if (a < 0 || b < 0) {
            System.out.println("Não pode incluir números negativos");
            retangulo();
            System.out.println("\n");
        }
        return a*b;
    }
    public float circulo(){
        rForma = "c";
        System.out.println("///////Area do circulo///////");
        System.out.println("Digite o raio do circulo:");
        r = sc1.nextFloat();
        double areaC = (r* 2)* Math.PI;
         if (r < 0) {
            System.out.println("Não pode incluir números negativos");
            circulo();
            System.out.println("\n");
        }
        return (float)areaC;
    }
    public float trapezio(){
        System.out.println("///////Area do trapezio///////");
        System.out.println("Digite a base maior:");
        B = sc1.nextFloat();
        System.out.println("Digite a base menor:");
        b = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        if (B < 0 || b < 0 || a < 0) {
            System.out.println("Não pode incluir números negativos");
            trapezio();
            System.out.println("\n");
        }
        return ((B + b)* a)/2;
    }
    public float losangulo(){
        System.out.println("///////Area do losangulo///////");
        System.out.println("Digite a diagonal maior:");
        D = sc1.nextFloat();
        System.out.println("Digite a diagonal menor:");
        d = sc1.nextFloat();
        if (a < 0) {
            System.out.println("Não pode incluir números negativos");
            losangulo();
            System.out.println("\n");
        }
        return (D*d)/2;
    }
    public float triangulo(){
        System.out.println("///////Area do triangulo///////");
        System.out.println("Digite o tamanho da altura:");
        a = sc1.nextFloat();
        System.out.println("Digite o tamanho da base:");
        b = sc1.nextFloat();
        if (a < 0) {
            System.out.println("Não pode incluir números negativos");
            triangulo();
            System.out.println("\n");
        }
        return (a*b)/2;
    }
    
    // renderiza o grafico das formar //


    
    
    
    
    

}