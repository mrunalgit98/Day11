
public class DeckOfCard {

    public static void main(String[] args) {
        String[] Suit = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int num = Suit.length * Rank.length;

        String[] deck = new String[num];

        for (int i = 0; i < Rank.length; i++) {
            for (int j = 0; j < Suit.length; j++) {
                deck[Suit.length*i + j] = Rank[i]  + Suit[j];
            }
        }

        for (int i = 0; i < num; i++) {
            int K = i + (int) (Math.random() * (num-i));
            String temp = deck[K];
            deck[K] = deck[i];
            deck[i] = temp;
        }

        for(int j=0; j<4;j++){
            System.out.println("Player number : "+ (j+1));
            int k =9*j;
            for (int i = k; i < 36; i++) {
                System.out.println(deck[i]);
                if(i==8 || i==17 || i==26){
                    break;
                }
            }
        }
    }
}

