public class Espacial extends Plana{
    float r, AbP;
    
    
    public float esferaV(){
        System.out.println("///////Volume da esfera///////");
        System.out.println("Digite o raio:");
        r = sc1.nextFloat();
        double Vcirc = (4*(r*r*r)*Math.PI)/3;
        return (float)Vcirc;
    }
    public float esferaA(){
        System.out.println("///////Area da esfera///////");
        System.out.println("Digite o raio:");
        r = sc1.nextFloat();
        double Vcirc = (4*(r*r)*Math.PI);
        return (float)Vcirc;
    }
    public float piramide(){
        System.out.println("///////Volume da piramide///////");
        System.out.println("Digite a area da base do triangulo:");
        AbP = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        return (AbP*a)/3;
    }
    public float prisma(){
        System.out.println("///////Area do prisma///////");
        System.out.println("Digite a area da base do prisma:");
        AbP = sc1.nextFloat();
        System.out.println("Digite a altura:");
        a = sc1.nextFloat();
        return (AbP*a);
    }
    public float cilindro(){
        System.out.println("///////Volume do cilindro///////");
        System.out.println("Digite o raio da base do cilindro:");
        r = sc1.nextFloat();
        double Vcilindro = (r*r)*a*Math.PI;
        return (float)Vcilindro;
    }
    
    
    public static void main(String[] args) {
        Espacial esp = new Espacial();
        System.out.println("O volume da esfera é " + esp.esferaV() + "\n");
        System.out.println("A area da esfera é " + esp.esferaA() + "\n");
        System.out.println("O volume da piramide é " + esp.piramide() + "\n");
        System.out.println("O volume do pisma é " + esp.prisma() + "\n");
        System.out.println("O volume do cilindro é " + esp.cilindro() + "\n");
    }
}
