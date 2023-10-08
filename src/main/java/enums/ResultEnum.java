package enums;

public enum ResultEnum {
    WINNER("가 최종 우승했습니다.");

    private final String resultMassage;

    ResultEnum(String resultMassage) {
        this.resultMassage = resultMassage;
    }

    public String getResultMassage(){
        return resultMassage;
    }
}
