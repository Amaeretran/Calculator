class IfInputCorrect {

    boolean check(String input){
        boolean result = input.matches("^(\\d|10)\\s([+\\-*/])\\s(\\d|10)$");
        if (!result)
            result = input.matches( "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s([+\\-*/])\\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$");
        return result;
    }

}