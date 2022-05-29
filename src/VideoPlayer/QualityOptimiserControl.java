package VideoPlayer;

public class QualityOptimiserControl extends Control{

    private int internet;

    public QualityOptimiserControl(int internet) {
        this.internet = internet;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }
   // public void izvrsiAkciju(VideoPlayer vp){

       //// double a = 8.4;
       // double Mbps = getInternet() * a;
      //  if( Mbps < 144){
           // internet = Mbps/a;

      // }
   // }

    @Override
    public void izrvsiAkciju(VideoPlayer vp) {
        double konekcija = this.internet*8.4;
        if(konekcija < 144){
            vp.setKvalitetVidea(144);

        }else if(konekcija < 240){
            vp.setKvalitetVidea(240);
        } else if (konekcija < 360) {
            vp.setKvalitetVidea(360);

        } else if (konekcija < 480) {
            vp.setKvalitetVidea(480);

        } else if (konekcija < 720) {
            vp.setKvalitetVidea(720);

        } else if(konekcija < 1080) {
            vp.setKvalitetVidea(1080);

        }


    }
}
