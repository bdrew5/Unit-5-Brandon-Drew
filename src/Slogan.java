public class Slogan implements Lockable{
    private String phrase;
    private static int count = 0;
    private int key;
    private boolean lock = false;

    public Slogan(String phr, int key){
        phrase = phr;
        count++;
        this.key = key;
    }

    public String toString() {
        if (!lock)
            return phrase;
        else
            return "Locked";
    }

    public static int getCount(){
        return count;
    }

    public void setKey(int key){
        this.key = key;
    }

    public void lock(int key){
        if (this.key == key)
            lock = true;
    }

    public void unlock(int key){
        if (this.key == key)
            lock = false;
    }

    public boolean locked(){
        return lock;
    }
}
