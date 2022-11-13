package lotto.domain.game;

public enum LottoString {
    NO_MATCH_LOTTO_COUNT("[ERROR] 당첨 번호 %d개를 입력해주세요."),
    DUPLICATION_WINNING_NUMBER("[ERROR] 당첨 번호 %d개를 서로 다른 수로 입력해주세요."),
    DUPLICATION_WINNING_NUMBER_AND_BONUS_NUMBER("[ERROR] 당첨 번호와 보너스 번호가 서로 다른 수로 입력해주세요.");

    private final String content;

    LottoString(String content){
        this.content = content;
    }

    public String print(){
        return content;
    }
    public String print(int count){
        return String.format(content, count);
    }
}
