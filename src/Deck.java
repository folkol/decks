import java.util.ArrayList;
import java.util.List;

public class Deck {

    private final List<Card> objects;

    public Deck() {
        objects = new ArrayList<>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                objects.add(new Card(suits[i], ranks[j]));
            }
        }
        System.out.println(objects);
    }

    public static void main(String[] args) {
        new Deck();
    }
}
