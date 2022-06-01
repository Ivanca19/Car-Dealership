/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivanca19
 */

// This class is entirely data for a Car object
public class Cars {
    
    private String Honda;
    private String Hyundai;
    private String Kia;
    private String Nissan;
    private String Subaru;
    private String Toyota;
    
    private String Accord;
    private String Civic;
    private String CRV;
    
    private String Accent;
    private String Elantra;
    private String SantaFe;
    
    private String Forte;
    private String Rio;
    private String Soul;
    
    private String Altima;
    private String GTR;
    private String Sentra;
    
    private String Ascent;
    private String BRZ;
    private String Impreza;
    
    private String CHR;
    private String Camry;
    private String Corolla;
    private String Supra;
    private String GR86;
    private String Prius;
    
    double pAccord = 27135;
    double pCivic = 23365;
    double pCRV = 27625;
    
    double pAccent = 17690;
    double pElantra = 20995;
    double pSantaFe = 28445;
        
        
    double pForte = 20115;
    double pRio = 17275;
    double pSoul = 20505;
        
        
    double pAltima = 25675;
    double pGTR = 115335;
    double pSentra = 20635;
        
        
    double pAscent = 33470;
    double pBRZ = 28990;
    double pImpreza = 19790;
                
        
    double pCHR = 22910;
    double pCamry = 26420;
    double pCorolla = 21200;
    double pSupra = 44315;
    double pGR86 = 28725;
    double pPrius = 25650;
    
    private String color;
    private String pac;
    private String Make;
    private String Model; 
    private double price;
    
    public Cars() {
        
    }
    
    public Cars(String color, String pac, String Make, String Model, double price){
        this.color = color;
        this.pac = pac;
        this.Make = Make;
        this.Model = Model;
        this.price = price;
    }

    public String toString() {
        return pac + " " + Make + " " + Model + " " + price;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPac() {
        return pac;
    }

    public void setPac(String pac) {
        this.pac = pac;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    public double getpAccord() {
        return pAccord;
    }

    public double getpCivic() {
        return pCivic;
    }

    public double getpCRV() {
        return pCRV;
    }

    public double getpAccent() {
        return pAccent;
    }

    public double getpElantra() {
        return pElantra;
    }

    public double getpSantaFe() {
        return pSantaFe;
    }

    public double getpForte() {
        return pForte;
    }

    public double getpRio() {
        return pRio;
    }

    public double getpSoul() {
        return pSoul;
    }

    public double getpAltima() {
        return pAltima;
    }

    public double getpGTR() {
        return pGTR;
    }

    public double getpSentra() {
        return pSentra;
    }

    public double getpAscent() {
        return pAscent;
    }

    public double getpBRZ() {
        return pBRZ;
    }

    public double getpImpreza() {
        return pImpreza;
    }

    public double getpCHR() {
        return pCHR;
    }

    public double getpCamry() {
        return pCamry;
    }

    public double getpCorolla() {
        return pCorolla;
    }

    public double getpSupra() {
        return pSupra;
    }

    public double getpGR86() {
        return pGR86;
    }

    public double getpPrius() {
        return pPrius;
    }

    public String getAccord() {
        return Accord;
    }

    public void setAccord(String Accord) {
        this.Accord = Accord;
    }

    public String getCivic() {
        return Civic;
    }

    public void setCivic(String Civic) {
        this.Civic = Civic;
    }

    public String getCRV() {
        return CRV;
    }

    public void setCRV(String CRV) {
        this.CRV = CRV;
    }

    public String getAccent() {
        return Accent;
    }

    public void setAccent(String Accent) {
        this.Accent = Accent;
    }

    public String getElantra() {
        return Elantra;
    }

    public void setElantra(String Elantra) {
        this.Elantra = Elantra;
    }

    public String getSantaFe() {
        return SantaFe;
    }

    public void setSantaFe(String SantaFe) {
        this.SantaFe = SantaFe;
    }

    public String getForte() {
        return Forte;
    }

    public void setForte(String Forte) {
        this.Forte = Forte;
    }

    public String getRio() {
        return Rio;
    }

    public void setRio(String Rio) {
        this.Rio = Rio;
    }

    public String getSoul() {
        return Soul;
    }

    public void setSoul(String Soul) {
        this.Soul = Soul;
    }

    public String getAltima() {
        return Altima;
    }

    public void setAltima(String Altima) {
        this.Altima = Altima;
    }

    public String getGTR() {
        return GTR;
    }

    public void setGTR(String GTR) {
        this.GTR = GTR;
    }

    public String getSentra() {
        return Sentra;
    }

    public void setSentra(String Sentra) {
        this.Sentra = Sentra;
    }

    public String getAscent() {
        return Ascent;
    }

    public void setAscent(String Ascent) {
        this.Ascent = Ascent;
    }

    public String getBRZ() {
        return BRZ;
    }

    public void setBRZ(String BRZ) {
        this.BRZ = BRZ;
    }

    public String getImpreza() {
        return Impreza;
    }

    public void setImpreza(String Impreza) {
        this.Impreza = Impreza;
    }

    public String getCHR() {
        return CHR;
    }

    public void setCHR(String CHR) {
        this.CHR = CHR;
    }

    public String getCamry() {
        return Camry;
    }

    public void setCamry(String Camry) {
        this.Camry = Camry;
    }

    public String getCorolla() {
        return Corolla;
    }

    public void setCorolla(String Corolla) {
        this.Corolla = Corolla;
    }

    public String getSupra() {
        return Supra;
    }

    public void setSupra(String Supra) {
        this.Supra = Supra;
    }

    public String getGR86() {
        return GR86;
    }

    public void setGR86(String GR86) {
        this.GR86 = GR86;
    }

    public String getPrius() {
        return Prius;
    }

    public void setPrius(String Prius) {
        this.Prius = Prius;
    }
    
    private String red = "Red";
    private String blue = "Blue";
    private String black = "Black";
    private String white = "White";
    private String grey = "Grey";
    private String yellow = "Yellow";
    private String green = "Green";

    
    

    public String getHonda() {
        return Honda;
    }

    public void setHonda(String Honda) {
        this.Honda = Honda;
    }

    public String getHyundai() {
        return Hyundai;
    }

    public void setHyundai(String Hyundai) {
        this.Hyundai = Hyundai;
    }

    public String getKia() {
        return Kia;
    }

    public void setKia(String Kia) {
        this.Kia = Kia;
    }

    public String getNissan() {
        return Nissan;
    }

    public void setNissan(String Nissan) {
        this.Nissan = Nissan;
    }

    public String getSubaru() {
        return Subaru;
    }

    public void setSubaru(String Subaru) {
        this.Subaru = Subaru;
    }

    public String getToyota() {
        return Toyota;
    }

    public void setToyota(String Toyota) {
        this.Toyota = Toyota;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String tradeIn1) {
        this.red = tradeIn1;
    }

    public String getBlue() {
        return blue;
    }

    public void setBlue(String tradeIn2) {
        this.blue = tradeIn2;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String tradeIn3) {
        this.black = tradeIn3;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String tradeIn4) {
        this.white = tradeIn4;
    }

    public String getGrey() {
        return grey;
    }

    public void setGrey(String tradeIn5) {
        this.grey = tradeIn5;
    }
    
    public String getYellow() {
        return yellow;
    }

    public void setYellow(String tradeIn5) {
        this.yellow = tradeIn5;
    }
    
    public String getGreen() {
        return green;
    }

    public void setGreen(String tradeIn5) {
        this.green = tradeIn5;
    }
    
    
    
    
}
