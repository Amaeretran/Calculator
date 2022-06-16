class Calculator {

    int calculate(String income){

        String[] operands = income.split(" ");
        int operand1;
        int operand2;
        int result;

        Translate translator = new Translate();

        if (translator.isRome(income)){
            operand1 = translator.romeToArabian(operands[0]);
            operand2 = translator.romeToArabian(operands[2]);}
        else{
            operand1 = Integer.parseInt(operands[0]);
            operand2 = Integer.parseInt(operands[2]);
        }

        result = switch (operands[1]) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> 0;
        };
        return result;
    }

}