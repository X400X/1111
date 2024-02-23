import java.util.Random;

public class Test{
    public static void main(String[] args){
        final Random r = new Random();

        String[][] testlist = {{"dog","koira"}, {"cat","kissa"}, {"mouse","hiiri"},
                {"duck","ankka"}, {"horse","hevonen"}, {"house","talo"},
                {"red","punainen"}, {"black", "musta"}, {"white","valkoinen"},
                {"programmer", "ohjelmoija"}};

        for (int test=1; test<=3; test++) {
            System.out.println("Test " + test);

            String[] testEntries = testlist[r.nextInt(testlist.length)];
            String en = testEntries[0];
            String fi = testEntries[1];

            System.out.println("Creating object with values (" + en + ", " + fi + ")");
            Translation tr = new Translation(en, fi);
            System.out.println("Object created!");

            System.out.println("Calling getter methods:");
            System.out.println("getEnglish: " + tr.getEnglish());
            System.out.println("getFinnish: " + tr.getFinnish());

            System.out.println("Calling setter methods: ");
            testEntries = testlist[r.nextInt(testlist.length)];
            en = testEntries[0];
            fi = testEntries[1];

            System.out.println("Calling setEnglish(" + en + ")");
            tr.setEnglish(en);
            System.out.println("getEnglish: " + tr.getEnglish());

            System.out.println("Calling setFinnish(" + fi + ")");
            tr.setFinnish(fi);
            System.out.println("getFinnish: " + tr.getFinnish());


            System.out.println("Calling toString: " + tr);

            System.out.println("");
        }


    }

}


class Translation {
    private String english;
    private String finnish;

    public Translation(String english, String finnish) {
        this.english = english;
        this.finnish = finnish;
    }

    public String getEnglish() {
        return english;
    }

    public String getFinnish() {
        return finnish;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setFinnish(String finnish) {
        this.finnish = finnish;
    }

    @Override
    public String toString () {
        String s = this.english + " (en), " + this.finnish + " (fi)";
        return s;
    }
}