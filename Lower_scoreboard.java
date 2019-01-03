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
    
    public int getValues(int[] dice, String s) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += dice[i];
        }
        
        if(s.toUpperCase().equals("A")) {
            if(player[8] == null || bot[8] == null) {
                if(isThreeOfAKind(dice))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("B")) {
            if(player[9] == null || bot[9] == null) {
                if(isFourOfAKind(dice))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("C")) {
            if(player[10] == null || bot[10] == null) {
                if(isFullHouse(dice))
                    return 25;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("D")) {
            if(player[11] == null || bot[11] == null) {
                if(isSmallStraight(dice))
                    return 30;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("E")) {
            if(player[12] == null || bot[12] == null) {
                if(isLargeStraight(dice))
                    return 40;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("F")) {
            if(player[13] == null || bot[13] == null) {
                if(isChance(dice))
                    return sum;
                return 0;
            }
            return -1;
        }
        else if(s.toUpperCase().equal("G")) {
            if(player[14] == null || bot[14] == null) {
                if(isYahtzee(dice))
                    return 50;
                return 0;
            }
            return -1;
        }
    }
    
    public boolean isThreeOfAKind(int[] dice) {
        boolean check = false;
        for(int i = 0; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                for(int k = 2; k < 5; k++) {
                    if(dice[i] == dice[j] && dice[i] == dice[k]) {
                        check = true;
                        dice[i] = 0;
                        dice[j] = 0;
                        dice[k] = 0;
                    }
                }
            }
        }
        
        return check;
    }
    
    public boolean isFourOfAKind(int[] dcie) {
        boolean check = false;
        for(int i = 0; i < 5; i++) {
            for(int j = 1; j < 5; j++) {
                for(int k = 2; k < 5; k++) {
                    for(int l = 3; l < 5; l++) {
                        if(dice[i] == dice[j] && dice[i] == dice[k] && dice[i] == dice[l])
                            check = true;
                            dice[i] = 0;
                            dice[j] = 0;
                            dice[k] = 0;
                            dice[l] = 0;
                        }
                    }
                }
            }
        }
        
        return check;
    }
    
    public boolean isFullHouse(int[] dice) {
        boolean check = false;
        for (int i = 0; i<5;i++)
        if(isThreeOfAKind(dice) && dice[i] == 0 && dice[i+1] == 0)
            check = true;
        return check;
 
    }
    public boolean isSmallStraight(int[] dice){
        boolean check = false;
        for (int i = 0; i < 5; i++)
        {
            if (dice[i] == 1 && dice[i+1] == 2 && dice[i+2] == 3 && dice[i+3] == 4)
                check = true;
            else if (dice[i] == 2 && dice[i+1] == 3 && dice[i+2] == 4 && dice[i+3] == 5)
                check = true;                
        }
        return check;
    }
    public boolean isLargeStraight(int[] dice){
        boolean check = false;
        for (int i = 0; i < 5; i++)
        {
            if (dice[i] == 1 && dice[i+1] == 2 && dice[i+2] == 3 && dice[i+3] == 4 && dice[i+4] == 5)
                check = true;               
        }
        return check;
    }

    public boolean isYahtzee(int[] dice){
        boolean check = false;
        for (int i = 0; i < 5 ; i++)
            if (dice[i] == dice[i+1] && dice[i+1] == dice[i+2] && dice[i+2] == dice[i+3] && dice[i+3] == dice[i+4])
                check = true;
        return check;
    }
    
    public void print() {
        for(int i = 0; i < 16; i++) {
            System.out.println(sets[i]);
        }
    }
}

