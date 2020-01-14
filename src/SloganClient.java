public class SloganClient {
    public static void main(String[] args){
        Slogan s1 = new Slogan("a" , 1);
        System.out.println(s1);

        Slogan s2 = new Slogan("b", 1);
        System.out.println(s2);

        Slogan s3 = new Slogan("c",1);
        System.out.println(s3);

        Slogan s4 = new Slogan("d",1);
        System.out.println(s4);

        Slogan s5 = new Slogan("e",1);
        System.out.println(s5);

        s1.setKey(111);
        s1.lock(111);
        s1.locked();
        System.out.println(s1);
        s1.unlock(112);
        System.out.println(s1);
        s1.unlock(111);
        System.out.println(s1);
    }
}
