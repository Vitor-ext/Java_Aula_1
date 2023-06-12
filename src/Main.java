 /* Autor: Vitor de Jesus 🚀
    Data: 12/06/2023 */

 import javax.swing.*;
 import java.awt.*;

 public class Main {
    public static void main(String[] args) {

        JFrame Frame = new JFrame("Funcionou");

        Frame.setBounds(50, 50 , 500, 200);

        JLabel label = new JLabel("Hello World !");
        label.setBounds(20, 20, 20, 20);
        JButton button = new JButton("OK");
        button.setBounds(20, 20, 20, 20'');

        Frame.add(label);
        Frame.add(button);
        Frame.setVisible(true);

        System.out.println("Hello World!");

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Contador = " + cont);
        }
    }
}