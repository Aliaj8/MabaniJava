package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperatorBtnHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedBtn = (JButton) e.getSource();
        Calculator calculator = new Calculator();
        CalculatorUi ui = new CalculatorUi();

        if (selectedBtn == ui.btnMultiply) {
            calculator.selectOperator(ui.btnMultiply.getText());
        } else if (selectedBtn == ui.btnAdd) {
            calculator.selectOperator(ui.btnAdd.getText());
        } else if (selectedBtn == ui.btnSubtract) {
            calculator.selectOperator(ui.btnSubtract.getText());
        } else if (selectedBtn == ui.btnDivide) {
            calculator.selectOperator(ui.btnDivide.getText());
        }
        calculator.updateOutput();
    }
}

