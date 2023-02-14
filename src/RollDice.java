public class RollDice {
    public static int Dfour(){
        int roll = (int)(Math.random() * 4) + 1;
        return roll;
    }
    public static int Dsix(){
        int roll = (int)(Math.random() * 6) + 1;
        return roll;
    }
    public static int Deight(){
        int roll = (int)(Math.random() * 8) + 1;
        return roll;
    }
    public static int Dten(){
        int roll = (int)(Math.random() * 10) + 1;
        return roll;
    }
    public static int Dtwelve(){
        int roll = (int)(Math.random() * 12) + 1;
        return roll;
    }
    public static int Dtwenty(){
        int roll = (int)(Math.random() * 20) + 1;
        return roll;
    }
    public static int Dhundred(){
        int roll = (int)(Math.random() * 100) + 1;
        return roll;
    }

    public static String getModifier(String s){
        int m;
        String mod = "";
        if(Integer.parseInt(s) <= 5){
            m = -3;
        }
        else if(Integer.parseInt(s) <= 7){
            m = -2;
        }
        else if(Integer.parseInt(s) <= 9){
            m = -1;
        }
        else if(Integer.parseInt(s) <= 11){
            m = 0;
        }
        else if(Integer.parseInt(s) <= 13){
            m = 1;
        }
        else if(Integer.parseInt(s) <= 15){
            m = 2;
        }
        else if(Integer.parseInt(s) <= 17){
            m = 3;
        }
        else{
            m = 4;
        }
        mod = Integer.toString(m);
        return mod;
    }

    public static String rollStat(){
        int s = (int) (Math.random() * 14) + 4;
        String stat = Integer.toString(s);
        if(Integer.parseInt(getModifier(stat)) > 0){
            stat = stat + " ( +" + getModifier(stat) + " ) "; 
        }
        else{
            stat = stat + " ( " + getModifier(stat) + " ) "; 
        }
        return stat;
    }
}
