package Section2;

public class SecondTask {





    public static void main(String[] args) {
        String g = "c:\"WebServers\"home\"testsite\"www\"myfile.txt";

        String start = "www\"";
        String end = ".";

        g = g.substring(g.indexOf(start) + start.length());
        String cs = g.substring(0, g.indexOf(end) - 0).trim();
        System.out.println(cs);

    }

}

