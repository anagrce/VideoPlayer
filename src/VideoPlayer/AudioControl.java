package VideoPlayer;

public class AudioControl extends Control{

    private boolean pojaca;

    public AudioControl(boolean pojaca) {
        this.pojaca = pojaca;
    }

    public boolean isPojaca() {
        return pojaca;
    }

    public void setPojaca(boolean pojaca) {
        this.pojaca = pojaca;
    }

  /*  @Override
    public void izvrsiAkciju(VideoPlayer vp) {
        if (pojaca) {
            if (vp.getJacinaZvuka() < 100) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()+1);
            } else {
                vp.setJacinaZvuka(100);
            }
        } else {
            if (vp.getJacinaZvuka() > 0) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()-1);
            } else {
                vp.setJacinaZvuka(0);
            }
        }
    }*/


    @Override
    public void izrvsiAkciju(VideoPlayer vp) {
        if (pojaca) {
            if (vp.getJacinaZvuka() < 100) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()+1);
            } else {
                vp.setJacinaZvuka(100);
            }
        } else {
            if (vp.getJacinaZvuka() > 0) {
                vp.setJacinaZvuka(vp.getJacinaZvuka()-1);
            } else {
                vp.setJacinaZvuka(0);
            }
        }
    }


}
