package baseball;

public class GameStatusUtil {
    /**
     * 게임 진행 상황을 제어하는 함수
     *
     * @param input
     * @return GameStatus
     */
    static GameStatus setGameStatus(String input) {
        GameStatus status;
        switch (input) {
            case "1":
                status = GameStatus.CONTINUE;
                break;
            case "2":
                status = GameStatus.STOP;
                break;
            default:
                status = GameStatus.EXCEPTION;
                break;
        }
        return status;
    }

    static boolean isStopStatus(GameStatus status) {
        return status.equals(GameStatus.STOP);
    }

    static void validateExceptionStatus(GameStatus status) {
        if (status.equals(GameStatus.EXCEPTION)){
            throw new IllegalArgumentException();
        }
    }
}