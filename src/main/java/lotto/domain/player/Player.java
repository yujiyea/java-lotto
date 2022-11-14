package lotto.domain.player;

import lotto.domain.game.CreateLotto;
import lotto.domain.game.Ranking;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static lotto.domain.player.PlayerString.NO_DIVIDE_MONEY;

public class Player {
    public static int LOTTO_PRICE = 1000;
    private final long money;
    private List<List<Integer>> lottoTickets;
    private Map<Ranking, Long> winningResult;
    private double returnRate;

    public Player(long money){
        validateMoney(money);
        this.money = money;
        buyLottos();
    }

    public void validateMoney(long money){
        if(money % LOTTO_PRICE > 0){
            throw new IllegalArgumentException(NO_DIVIDE_MONEY.print(LOTTO_PRICE));
        }
    }

    public void buyLottos(){
        int lottoCount = (int) (money / LOTTO_PRICE);

        for(int i = 0; i < lottoCount; i++){
            CreateLotto lottoTicket = new CreateLotto();
            lottoTickets.add(lottoTicket.getLotto());
        }
    }
}
