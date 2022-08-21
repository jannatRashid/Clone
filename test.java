
import java.lang.Cloneable;
import java.io.*;
import java.util.*;

// public interface Cloneable;

class Alpha implements Cloneable {
    int ta;
    String name;

    public Alpha(int ta, String name) {
        this.ta = ta;
        this.name = name;
    }

    public Alpha clone()
            throws CloneNotSupportedException {
        return (Alpha) super.clone();
    }

}

public class test {
    public static void main(String[] args)
            throws CloneNotSupportedException {
        Alpha a = new Alpha(26, "jannat");
        Alpha b = (Alpha) a.clone();
        System.out.println(b.ta);
        System.out.println(b.name);

    }

}