package Calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherBtnHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedBtn = (JButton) e.getSource();
        Calculator calculator = new Calculator();
        CalculatorUi ui = new CalculatorUi();

        if (selectedBtn == ui.btnClear) {
            calculator.clear();
        } else if (selectedBtn == ui.btnEquals) {
            calculator.calculate();
        }
        calculator.updateOutput();
    }
}

