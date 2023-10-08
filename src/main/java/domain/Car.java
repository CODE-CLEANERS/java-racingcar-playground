package domain;

import common.ValidationUtils;

public class Car {
    String name;
    int forwardCondition;
    String position;

    public Car(String name, int forwardCondition) {
        ValidationUtils.lengthValid(name);
        ValidationUtils.validateNotBlank(name);
        this.name = name;
        this.forwardCondition = forwardCondition;
        this.position = "";
    }


    public void updateForwardCondition(int forwardCondition){
        this.forwardCondition = forwardCondition;
    }

    public void updatePosition(){
        position+="-";
    }


    public String getName() {
        return name;
    }

    public int getForwardCondition() {
        return forwardCondition;
    }

    public String getPosition() {
        return position;
    }
}
