import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.setLado1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado 1 do triangulo: ")));
        triangulo.setLado2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado 2 do triangulo: ")));
        triangulo.setLado3(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do lado 3 do triangulo: ")));

        JOptionPane.showMessageDialog(null, "Lado 1 do triângulo: " + triangulo.getLado1() + "\nLado 2 do triângulo: " + triangulo.getLado2()
                        + "\nLado 3 do triângulo: " + triangulo.getLado3() + "\nTipo do triângulo: " + triangulo.tipoTriangulo() + "\nÁrea do triângulo: "
                        + triangulo.calculoArea() + "\nPerímetro do triângulo: " + triangulo.calculoPerimetro());


    }
}