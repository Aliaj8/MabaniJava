package Calculator;
import javax.swing.*;
public class Calculator extends JFrame {
    String previous;
    String current;
    String operator;
    static JTextField output;

    public void appendToOutput(String num) {
        if (num.equals(".") && current.contains(".")) {
            return;
        }
        current += num;
    }
    public void clear(){
        current = "";
        previous = "";
        operator = null;
    }
    public void updateOutput() {
        output.setText(current);
    }
    public void calculate() {
        if (previous.length() < 1 || current.length() < 1) {
            return;
        }
        double result = 0.0;
        double num1 = Double.parseDouble(previous);
        double num2 = Double.parseDouble(current);
        switch (operator) {
            case "*":
                result=getmul(num1,num2);
                break;
            case "+":
                result = getadd(num1,num2);
                break;
            case "-":
                result =getsub(num1,num2);
                break;
            case "÷":
                result = getdiv(num1,num2);
                break;
            default:
                break;
        }
        current = String.valueOf(result);
        operator = null;
        previous = "";
    }

    public void selectOperator(String newOperator) {
        // if no number is entered yet
        if (current.isEmpty()) {
            operator = newOperator;
            return;
        }
        if (!previous.isEmpty()) {
            calculate();
        }
        operator = newOperator;
        previous = current;
        current = "";
    }
    public double getadd(double number_1,double number_2) {return number_1+number_2;
    }
    public double getsub(double number_1, double number_2) {return number_1-number_2;
    }
    public double getmul(double number_1, double number_2) {return number_1*number_2;
    }
    public double getdiv(double number_1, double number_2) {return number_1 / number_2;
    }

}
