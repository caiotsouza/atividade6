public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double calculoPerimetro() {

        return lado1 + lado2 + lado3;
    }

    public String tipoTriangulo() {
        if (lado1 == lado2 && lado1 == lado3){
            return "Triângulo equilátero";

        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            return "Triângulo isósceles";

        }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            return "Triângulo escaleno";

        }else{
            return "Esse triângulo não é isósceles, equilátero ou escaleno";
        }
    }

    public double calculoArea(){
        double semiPerimetro = calculoPerimetro() / 2;
        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        double base = Math.max(Math.max(lado1, lado2), lado3);
        double altura = (2 * area) / base;

        return base * altura / 2;
    }
}
