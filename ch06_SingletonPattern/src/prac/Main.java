package prac;

public class Main {
    private static final int THREAD_NUM = 5;
    public static void main(String[] args) {
        User[] user = new User[THREAD_NUM];
        for (int i=0; i<THREAD_NUM; i++) {
            user[i] = new User((i+1) + "-user");
            user[i].start();
        }
    }
}