package service;

import domain.Car;
import enums.ErrorMassage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CarServiceTest {


    @DisplayName("각 자동차에 이름을 부여할 수 있다.")
    @Test
    void createCarName() {
        //given
        InputView input = new InputView();
        List<Car> cars = new ArrayList<>();
        CarService carService = new CarService(cars);
        String inputName = "nana,marin,dodo,baba";


        //when
        List<Car> carList = carService.createCar(inputName);

        //then
        org.assertj.core.api.Assertions.assertThat(carList).hasSize(4);
        for (Car carName:carList) {
            System.out.print(carName.getName() + " ");
        }

    }


    @DisplayName("자동차 이름이 5자를 초과하면 에러가 발생한다.")
    @Test
    void lengthValid() {
        //given
        InputView input = new InputView();
        List<Car> cars = new ArrayList<>();
        CarService carService = new CarService(cars);
        String inputName = "nana,marin,ganada,baba";


        //when
//        List<String> carList = carService.createCar(inputName, carNameList);

        //then
        Assertions.assertThatThrownBy(()-> carService.createCar(inputName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMassage.LENGTH_VALID_ERROR.getErrorMessage());
        System.out.println(ErrorMassage.LENGTH_VALID_ERROR.getErrorMessage());

    }


    @DisplayName("이름을 생성할 때 공백이 있으면 안된다.")
    @Test
    void validateNotBlank() {
        //given
        InputView input = new InputView();
        List<Car> cars = new ArrayList<>();
        CarService carService = new CarService(cars);
        String inputName = "nana,marin,do do,baba";


        //when
//        List<Car> carList = carService.createCar(inputName, cars);

        //then
        Assertions.assertThatThrownBy(()-> carService.createCar(inputName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMassage.NOT_BLANK_VALID_ERROR.getErrorMessage());
        System.out.println(ErrorMassage.NOT_BLANK_VALID_ERROR.getErrorMessage());
    }

    @DisplayName("랜덤값이 4보다 작으면 자동차 위치가 업데이트 되면 안된다.")
    @Test
    void isCheckForwardCondition(){
    //given
        InputView input = new InputView();
        List<Car> cars = new ArrayList<>();
        CarService carService = new CarService(cars);
        String inputName = "nana,marin,dodo,baba";
        List<Car> carList = carService.createCar(inputName);
    //when
        for (Car car : carList) {
            car.updateForwardCondition(3);
            carService.isCheckForwardCondition(car);
        }
    //then
        Assertions.assertThat(carList.get(0).getPosition()).isEqualTo("");
    }


}