import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaFiguras {
    public JPanel mainPanel;
    private JPanel panelTriangulo;
    private JLabel subtitle1;
    private JTextField textFieldTriangulo1;
    private JTextField textFieldTriangulo2;
    private JLabel lblLadoBase;
    private JLabel lblAltura;
    private JLabel lblResultadoTriangulo;
    private JLabel resultadoTriangulo;
    private JButton btnPerimetroTriangulo;
    private JButton btnAreaTriangulo;
    private JPanel panelCuadrado;
    private JLabel subtitle2;
    private JTextField textFieldCuadrado1;
    private JLabel lblLadoCuadrado;
    private JLabel resultadoCuadrado;
    private JLabel lblResultadoCuadrado;
    private JButton btnPerimetroCuadrado;
    private JButton btnÁreaCuadrado;
    private JPanel panelCirculo;
    private JLabel title3;
    private JTextField textFieldCirculo;
    private JLabel lblRadio;
    private JLabel lblResultadoCirculo;
    private JLabel resultadoCirculo;
    private JButton btnPerimetroCirculo;
    private JButton btnArea;
    private JPanel panelRectangulo;
    private JLabel title4;
    private JTextField textFieldRectangulo1;
    private JTextField textFieldRectangulo2;
    private JLabel lblAnchoRectangulo;
    private JLabel lblAlturaRectangulo2;
    private JLabel lblResultadoRectangulo;
    private JLabel resultadoRectangulo;
    private JButton btnPerimetroRectangulo;
    private JButton btnAreaRectangulo;
    private JLabel title;
    private JLabel title5;
    private JTextField textFieldTrapecio1;
    private JTextField textFieldTrapecio2;
    private JTextField textFieldTrapecio3;
    private JTextField textFieldTrapecio4;
    private JLabel ladoInferior;
    private JLabel ladoSuperior;
    private JLabel ladosLaterales;
    private JLabel altura;
    private JLabel lblResultadoTrapecio;
    private JLabel resultadoTrapecio;
    private JButton btnPerimetroTrapecio;
    private JButton btnAreaTrapecio;
    private JPanel panelTrapecio;

    public ventanaFiguras() {
        btnPerimetroTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double base = Double.parseDouble(textFieldTriangulo1.getText());
                resultadoTriangulo.setText(String.valueOf(base * 3));
            }
        });
        btnAreaTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double base = Double.parseDouble(textFieldTriangulo1.getText());
                double altura = Double.parseDouble(textFieldTriangulo2.getText());

                resultadoTriangulo.setText(String.valueOf((base * altura) /2));
            }
        });
        btnPerimetroCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double lado = Double.parseDouble(textFieldCuadrado1.getText());
                resultadoCuadrado.setText(String.valueOf(lado * 4));
            }
        });
        btnÁreaCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double lado = Double.parseDouble(textFieldCuadrado1.getText());
                resultadoCuadrado.setText(String.valueOf(lado * lado));
            }
        });
        btnPerimetroCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double radio = Double.parseDouble(textFieldCirculo.getText());
                resultadoCirculo.setText(String.valueOf(2*Math.PI*radio));
            }
        });
        btnArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double radio = Double.parseDouble(textFieldCirculo.getText());
                resultadoCirculo.setText(String.valueOf(Math.PI*(radio*radio)));
            }
        });
        btnPerimetroRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double base = Double.parseDouble(textFieldRectangulo1.getText());
                double altura = Double.parseDouble(textFieldRectangulo2.getText());

                resultadoRectangulo.setText(String.valueOf(base*2 + altura*2));
            }
        });
        btnAreaRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double base = Double.parseDouble(textFieldRectangulo1.getText());
                double altura = Double.parseDouble(textFieldRectangulo2.getText());

                resultadoRectangulo.setText(String.valueOf(base*altura));
            }
        });
        btnPerimetroTrapecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double baseInferior = Double.parseDouble(textFieldTrapecio1.getText());
                double baseSuperior = Double.parseDouble(textFieldTrapecio2.getText());
                double ladosLaterales = Double.parseDouble(textFieldTrapecio3.getText());

                resultadoTrapecio.setText(String.valueOf(baseInferior+(ladosLaterales*2)+baseSuperior));
            }
        });
        btnAreaTrapecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double baseInferior = Double.parseDouble(textFieldTrapecio1.getText());
                double baseSuperior = Double.parseDouble(textFieldTrapecio2.getText());
                double ladosLaterales = Double.parseDouble(textFieldTrapecio3.getText());
                double altura = Double.parseDouble(textFieldTrapecio4.getText());

                resultadoTrapecio.setText(String.valueOf(((baseInferior+baseSuperior)/2)*altura));
            }
        });
    }
}
