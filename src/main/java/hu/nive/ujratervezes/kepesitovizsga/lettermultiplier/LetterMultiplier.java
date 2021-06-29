package hu.nive.ujratervezes.kepesitovizsga.lettermultiplier;

public class LetterMultiplier {
    public String multiply(String input, int number){
        String result="";
        if(input == null || input == "" || number <0){
            throw new IllegalArgumentException("Parameters are not allowed!");
        }

        for (Character c:input.toCharArray()) {
            for (int i = 0; i < number; i++) {
                result+=c;
            }
        }
        return result;
    }
}
