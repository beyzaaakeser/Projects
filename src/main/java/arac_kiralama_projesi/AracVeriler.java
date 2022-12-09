package arac_kiralama_projesi;

public class AracVeriler {
    // arac kiralama icin model marka yakit tipi vites ve gunluk ucret olustur.
    private String model;
    private String marka;
    private String yakitTipi;
    private String vites;
    private int gunlukUcret;


    public AracVeriler(String model, String marka, String yakitTipi, String vites, int gunlukUcret) {
        this.model = model;
        this.marka = marka;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }  // CONSTRUCTORDAN MAP'IN KEY'SINI SILMEYI UNUTMA

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "Arac VerilerI : " +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret ;
    }
}
