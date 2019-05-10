package racingcar;

import java.util.List;

public class RacingCarController {
    public static void main(String[] args) {
        String userInput = InputView.getUserCarNames();
        int numOfGame = InputView.getNumberOfGame();

        RacingCar racingCar = new RacingCar();
        List<Car> cars = racingCar.process(userInput, numOfGame);

        RacingResult.process(cars);
    }
}
