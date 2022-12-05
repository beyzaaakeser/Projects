package okul_kucukproje;

public class Student {

    private String ogrenciAd;
    private String ogrenciSoyAd;
    private String ogrenciNo;
    private Integer ogrenciYas;


    public Student(String ogrenciAd, String ogrenciSoyAd, String ogrenciNo,Integer ogrenciYas) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyAd = ogrenciSoyAd;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciYas =ogrenciYas;
    }
    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public String getOgrenciSoyAd() {
        return ogrenciSoyAd;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public Integer getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public void setOgrenciSoyAd(String ogrenciSoyAd) {
        this.ogrenciSoyAd = ogrenciSoyAd;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setYas(Integer yas) {
        this.ogrenciYas=ogrenciYas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", ogrenciSoyAd='" + ogrenciSoyAd + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", ogrenciYas=" + ogrenciYas +
                '}';
    }
}
