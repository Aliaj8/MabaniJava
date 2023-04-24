//package Calculator;
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class NumberBtnHandler implements ActionListener {
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        Calculator calculator = new Calculator();
//        JButton selectedBtn = (JButton) e.getSource();
//        CalculatorUi ui = new CalculatorUi();
//
//
//        for (JButton btn : ui.numBtn) {
//            if (selectedBtn == btn) {
//                calculator.appendToOutput(btn.getText());
//                CalculatorUi.updateOutput();
//            }
//        }
//    }
//    }
//
