package VideoPlayer;

public class GlavnaKlasa {
    public static void main(String[] args) {

        VideoPlayer v1 = new VideoPlayer(500,32,45,360);
        System.out.println(v1);

        TimeControl t1 = new TimeControl(true);
        TimeControl t2 = new TimeControl(false);

        t1.izrvsiAkciju(v1);
        t1.izrvsiAkciju(v1);
        System.out.println(v1);

        t2.izrvsiAkciju(v1);
       // v1.stampanje();

        AudioControl a1 = new AudioControl(true);
        AudioControl a2  = new AudioControl(false);

        a1.izrvsiAkciju(v1);
       // v1.stampanje();
        for (int i  = 0; i<100; i++){
            a1.izrvsiAkciju(v1);
        }
       // v1.stampanje();
        a2.izrvsiAkciju(v1);
       // v1.stampanje();

        QualityOptimiserControl q1 = new QualityOptimiserControl(20);
        q1.izrvsiAkciju(v1);
        System.out.println(v1);
    }
}
