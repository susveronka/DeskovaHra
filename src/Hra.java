public class Hra {
    private String nazev;
    private boolean jeHraKoupena;
    private int oblibenost;

    public Hra(String nazev, boolean jeHraKoupena, int oblibenost) {
        this.nazev = nazev;
        this.jeHraKoupena = jeHraKoupena;
        this.oblibenost = oblibenost;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public boolean isJeHraKoupena() {
        return jeHraKoupena;
    }

    public void setJeHraKoupena(boolean jeHraKoupena) {
        this.jeHraKoupena = jeHraKoupena;
    }

    public int getOblibenost() {
        return oblibenost;
    }

    public void setOblibenost(int oblibenost) {
        this.oblibenost = oblibenost;
    }
}
