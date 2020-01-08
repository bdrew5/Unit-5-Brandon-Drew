public class Num {
    private int value;

    public Num(int val){
        value = val;
    }

    public String toString() {
        String result = value + "";
        return result;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int myVal) {
        value = myVal;
    }

    public boolean equals(Num otherNum){
       return this.getValue() == otherNum.getValue();
    }
    }
