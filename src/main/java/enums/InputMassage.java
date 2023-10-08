package enums;

public enum InputMassage {
    START_GAME("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)"),
    GENERATE_GAME_ROUND("시도할 회수는 몇회인가요?");

    private final String inputMassage;


    InputMassage(String inputMassage) {
        this.inputMassage = inputMassage;
    }

    public String getInputMassage(){
        return inputMassage;
    }
}
