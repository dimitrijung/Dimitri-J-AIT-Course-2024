package classwork_25.sb_vs_string;
// 100 000 сказать "Meow"
// String vs StringBuilder

public class PerformanceTest {

    private static final int N_ITERATION = 100_000;
    private static final String WORD = "Meow";

    public static void main(String[] args) {

        //String
        long t1 = System.currentTimeMillis(); // старт нашего секундомера
        String str = "";
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis(); //финишь нашего замера
        System.out.println("Time = " + (t2-t1));

        // StringBuilder
        t1 = System.currentTimeMillis(); // старт нашего секундомера
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N_ITERATION; i++) {
            sb = sb.append(WORD);
        }
        t2 = System.currentTimeMillis(); //финишь нашего замера
        System.out.println("Time StringBuilder = " + (t2-t1));


    }// end of main
}// end of class
