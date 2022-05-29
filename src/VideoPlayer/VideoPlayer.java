package VideoPlayer;

public class VideoPlayer {

    private double duzinaVidea;
    private int jacinaZvuka;
    private double trenutnoVremeVidea;
    private int kvalitetVidea;

    public VideoPlayer(double duzinaVidea, int jacinaZvuka, double trenutnoVremeVidea, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {

        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {

        this.duzinaVidea = duzinaVidea;
    }

    public int getJacinaZvuka() {

        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {

        this.jacinaZvuka = jacinaZvuka;
    }

    public double getTrenutnoVremeVidea() {

        return trenutnoVremeVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {

        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public int getKvalitetVidea() {

        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {

        this.kvalitetVidea = kvalitetVidea;
    }
   /* public void stampanje(){
        System.out.println(" Trenutno vreme videa : " + this.trenutnoVremeVidea);
        System.out.println("Trenutna jacina zvuka : " + this.jacinaZvuka);
        System.out.println("Trenutni kvalitet videa : " + this.kvalitetVidea);
        System.out.println("--------------------------------------------------");
    }*/
    @Override
    public String toString(){
        return "Trenutno vreme videa : " + trenutnoVremeVidea +
                "\nTrenutna jacina zvuka : " + jacinaZvuka +
                "\nTrenutni kvalitet videa : " + kvalitetVidea;

    }
}
