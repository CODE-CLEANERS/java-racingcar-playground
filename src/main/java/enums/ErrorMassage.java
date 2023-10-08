package enums;

public enum ErrorMassage {
    LENGTH_VALID_ERROR("자동차 이름은 5자미만이어야 합니다."),
    NOT_BLANK_VALID_ERROR("자동차 이름에 공백이 있으면 안됩니다."),
    NUMBER_FORMAT_ERROR("숫자만 입력하세요."),

    INPUT_ERROR("입력값을 바르게 입력해주세요.")
    ;

    private final String errorMessage;


    ErrorMassage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

}
