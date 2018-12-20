public class Scoreboard {
    public static String[] sets = {"Ones(1):", "Twos(2):", "Threes(3):", "Fours(4):", "Fives(5):", "Sixes(6):", 
                            "Sum:", "Bonus:", "Three of a Kind(A):", "Four of a Kind(B):", "Small Straight(C):",
                            "Large Straight(D):", "Full House(E):", "Chance(F):", "Yahtzee(G):", "Total:"};
    public int sum;
    public int total;
    
    
    public Scoreboard() {
        int[] player = new int[16];
        int[] bot = new int[16];
    }
    
    public int getScore() {
        return 0;
    }
    
    public int getValues(int d1, int d2, int d3, int d4, int d5, String s) {
        int[] die = {d1, d2, d3, d4, d5};
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += die[i];
        }
        
        if(s.toUpperCase().equals("A")) {
            if(player[8] == null || bot[8] == null) {
                if(isThreeOfAKind())
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("B")) {
            if(player[9] == null || bot[9] == null) {
                if(isFourOfAKind())
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("C")) {
            if(player[10] == null || bot[10] == null) {
                if(isFullHouse())
                    return 25;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("D")) {
            if(player[11] == null || bot[11] == null) {
                if(isSmallStraight())
                    return 30;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("E")) {
            if(player[12] == null || bot[12] == null) {
                if(isLargeStraight())
                    return 40;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("F")) {
            if(player[13] == null || bot[13] == null) {
                if(isChance())
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("G")) {
            if(player[14] == null || bot[14] == null) {
                if(isYahtzee())
                    return 50;
                return 0;
            }
            return -1;
        }
        
    }
    
    public void print() {
        for(int i = 0; i < 16; i++) {
            System.out.println(sets[i]);
        }
    }
}