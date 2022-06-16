class Translate {



    boolean isRome(String income){
        return income.charAt(0) == 'I' || income.charAt(0) == 'V' || income.charAt(0) == 'X';
    }

    String translateToRome(int value){

        String result = "";
        int value_C = value / 100;
        value %= 100;
        int value_L = value / 50;
        value %= 50;
        int value_X = value / 10;
        value %= 10;
        for (int i = 0; i < value_C; i++)
            result += "C";
        for (int i = 0; i < value_L; i++) {
            if (value_X == 4) {
                result += "XC";
                break;
            }
            result += "L";
        }
        if (value_L == 0 || value_X < 4) for (int i = 0; i < value_X; i++) {
            if (value_X == 4) {
                result += "XL";
                break;
            }

            result += "X";
        }
        switch (value) {
            case 1 -> result += "I";
            case 2 -> result += "II";
            case 3 -> result += "III";
            case 4 -> result += "IV";
            case 5 -> result += "V";
            case 6 -> result += "VI";
            case 7 -> result += "VII";
            case 8 -> result += "VIII";
            case 9 -> result += "IX";
        }
        return  result;
    }
     int romeToArabian(String operand) {
        int result = switch (operand){
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
        return result;
    }
}