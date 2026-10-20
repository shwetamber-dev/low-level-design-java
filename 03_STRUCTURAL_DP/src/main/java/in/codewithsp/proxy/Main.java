package in.codewithsp.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Incorrect Auth");
        VideoService vs = new ProxyVideoService("somerandomstring");
        vs.playVideo("xyz123");

        System.out.println("Correct Auth + not cached");
        VideoService vs1 = new ProxyVideoService("THATSECRETSTRING");
        vs1.playVideo("xyz123");

        System.out.println("Correct Auth + cached");
        vs1.playVideo("xyz123");
    }
}
