package Calculator;
import javax.swing.*;

public class CalculatorUi {
    JButton btnAdd, btnSubtract, btnDivide, btnMultiply, btnClear, btnEquals, btnpoint;
    private static JTextField output;
    private static String addAval;
    public static void main(String... args){
        // Instantiate action listeners
//        NumberBtnHandler numBtnHandler = new NumberBtnHandler();
        OtherBtnHandler otherBtnHandler = new OtherBtnHandler();
        OperatorBtnHandler opBtnHandler = new OperatorBtnHandler();


        JFrame mashinhesab = new JFrame("Mashin Hesab");
        mashinhesab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mashinhesab.setSize(225,300);
        output = new JTextField();
        output.setBounds(0,0,150,50);
        output.setEditable(false);

        JButton btnClear = new JButton("C");
        btnClear.setBounds(150,0,50,50);
        btnClear.addActionListener(otherBtnHandler);

        JButton one = getjButton("1", 0, 50);
        one.addActionListener(e -> output.setText(one.getText()));
        JButton two = getjButton("2", 50, 50);
        JButton three = getjButton("3", 100, 50);

        JButton btnAdd = new JButton("+");
        btnAdd.setBounds(150,50,50,50);
        btnAdd.addActionListener(opBtnHandler);

        JButton four = getjButton("4", 0, 100);
        JButton five = getjButton("5", 50, 100);
        JButton six = getjButton("6", 100, 100);

        JButton btnSubtract = new JButton("-");
        btnSubtract.setBounds(150,100,50,50);
        btnSubtract.addActionListener(opBtnHandler);

        JButton seven = getjButton("7", 0, 150);
        JButton eight = getjButton("8", 50, 150);
        JButton nine = getjButton("9", 100, 150);

        JButton btnMultiply = new JButton("x");
        btnMultiply.setBounds(150,150,50,50);
        btnMultiply.addActionListener(opBtnHandler);

        JButton btnpoint = getjButton(".", 0, 200);
        JButton zero = getjButton("0", 50, 200);
       // btnpoint.addActionListener(numBtnHandler);


        JButton btnEquals= new JButton("=");
        btnEquals.setBounds(100,200,50,50);
        btnEquals.addActionListener(otherBtnHandler);


        JButton btnDivide = new JButton("/");
        btnDivide.setBounds(150,200,50,50);
        btnDivide.addActionListener(opBtnHandler);

        mashinhesab.add(btnClear);
        mashinhesab.add(btnDivide);
        mashinhesab.add(btnEquals);
        mashinhesab.add(zero);
        mashinhesab.add(btnpoint);
        mashinhesab.add(btnMultiply);
        mashinhesab.add(nine);
        mashinhesab.add(eight);
        mashinhesab.add(seven);
        mashinhesab.add(btnSubtract);
        mashinhesab.add(six);
        mashinhesab.add(five);
        mashinhesab.add(four);
        mashinhesab.add(btnAdd);
        mashinhesab.add(three);
        mashinhesab.add(two);
        mashinhesab.add(one);
        mashinhesab.add(output);
        mashinhesab.setLayout(null);
        mashinhesab.setVisible(true);

    }






    private static JButton getjButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.setBounds(x, y,50,50);
        button.addActionListener(e -> {
            Calculator calculator = new Calculator();
            calculator.appendToOutput(button.getText());
            calculator.updateOutput();
        });
        return button;
    }

}
