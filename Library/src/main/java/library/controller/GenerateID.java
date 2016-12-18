package library.controller;

/**
 * Created by berloc on 2016.12.18..
 */
public abstract class GenerateID {

    public static int generateId() {
        return ((int) (Math.random() * (1000000 - 100000)) + 100000);
    }
}
