package basic.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new MovieThread();

        Runnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);

        movieThread.start();
        musicThread.start();
    }

}
