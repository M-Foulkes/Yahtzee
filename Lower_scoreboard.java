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
    
    public int getValues(int[] die, String s) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += die[i];
        }
        
        if(s.toUpperCase().equals("A")) {
            if(player[8] == null || bot[8] == null) {
                if(isThreeOfAKind(die))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("B")) {
            if(player[9] == null || bot[9] == null) {
                if(isFourOfAKind(die))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("C")) {
            if(player[10] == null || bot[10] == null) {
                if(isFullHouse(die))
                    return 25;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("D")) {
            if(player[11] == null || bot[11] == null) {
                if(isSmallStraight(die))
                    return 30;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("E")) {
            if(player[12] == null || bot[12] == null) {
                if(isLargeStraight(die))
                    return 40;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("F")) {
            if(player[13] == null || bot[13] == null) {
                if(isChance(die))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("G")) {
            if(player[14] == null || bot[14] == null) {
                if(isYahtzee(die))
                    return 50;
                return 0;
            }
            return -1;
        }
    }
    
    public boolean isThreeOfAKind(int[] die) {
        boolean check = false;
        for(int i = 0; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                for(int k = 2; k < 5; k++) {
                    if(die[i] == die[j] && die[i] == die[k]) {
                        check = true;
                        die[i] = 0;
                        die[j] = 0;
                        die[k] = 0;
                    }
                }
            }
        }
        
        return check;
    }
    
    public boolean isFourOfAKind(int[] die) {
        boolean check = false;
        for(int i = 0; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                for(int k = 2; k < 5; k++) {
                    for(int l = 3; l < 5; l++) {
                        if(die[i] == die[j] && die[i] == die[k] && die[i] == die[l])
                            check = true;
                            die[i] = 0;
                            die[j] = 0;
                            die[k] = 0;
                            die[l] = 0;
                        }
                    }
                }
            }
        }
        
        return check;
    }
    
    public boolean isFullHouse(int[] die) {
        boolean check = false;
        if(isThreeOfAKind(die) && die[i] == 0)

    }
    
    public void setChoice(int points, String name) {
        
    }
    
    public void print() {
        for(int i = 0; i < 16; i++) {
            System.out.println(sets[i]);
        }
    }
}

