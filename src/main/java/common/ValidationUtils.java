package common;

import enums.ErrorMassage;

public class ValidationUtils {

    public static void lengthValid(String carName) {
        if(carName.length()>5){
            throw new IllegalArgumentException(ErrorMassage.LENGTH_VALID_ERROR.getErrorMessage());
        }

    }

    public static void validateNotBlank(String carName){
        if(carName.contains(" ")){
            throw new IllegalArgumentException(ErrorMassage.NOT_BLANK_VALID_ERROR.getErrorMessage());
        }
    }

    public static void validateInteger(String number){
        try{
            Integer.parseInt(number);
        }catch (NumberFormatException e){
            throw new NumberFormatException(ErrorMassage.NUMBER_FORMAT_ERROR.getErrorMessage());
        }
    }

}
