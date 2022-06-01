
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivanca19
 */
public class CarAvailable {
    private ArrayList<Cars> carList;
    private ArrayList<Cars> rCarList;
    private Cars[] arrCars;
    /*
        Honda
    Accord = 27135;
    Civic = 23365;
    CRV = 27625;
    
        Hyundai
    Accent = 17690;
    Elantra = 20995;
    SantaFe = 28445;
    
        Kia
    Forte = 20115;
    Rio = 17275;
    Soul = 20505;
    
        Nissan
    Altima = 25675;
    GTR = 115335;
    Sentra = 20635;
    
        Subaru
    Ascent = 33470;
    BRZ = 28990;
    Impreza = 19790;
    
        Toyota
    CHR = 22910;
    Camry = 26420;
    Corolla = 21200;
    Supra = 44315;
    GR86 = 28725;
    Prius = 25650;
    
    */

    public Cars[] getArrCars() {
        return arrCars;
    }
    
    public CarAvailable() {
        carList = new ArrayList<Cars>();
        rCarList = new ArrayList<Cars>();
        
        Cars greySHAccord = new Cars("Grey", "Standard", "Honda", "Accord", 27135);
        Cars wSHAccord = new Cars("White", "Standard", "Honda", "Accord", 27135);
        Cars bDHAccord = new Cars("Black", "Deluxe", "Honda", "Accord", 29135);
        
        Cars wSHCivic = new Cars("White", "Standard", "Honda", "Civic", 23365);
        Cars wSHCivic2 = new Cars("White", "Standard", "Honda", "Civic", 23365);
        Cars bDHCivic = new Cars("Black", "Deluxe", "Honda", "Civic", 25565);
        Cars rPHCivic = new Cars("Red", "Premium", "Honda", "Civic", 33365);
        
        Cars bSHCRV = new Cars("Blue", "Standard", "Honda", "CRV", 27625);
        
        Cars wSHyAccent = new Cars("White", "Standard", "Hyundai", "Accent", 17690);
                
        Cars wSHyElantra = new Cars("White", "Standard", "Hyundai", "Elantra", 20995);

        Cars wSHySantaFe = new Cars("White", "Standard", "Hyundai", "SantaFe", 28445);

        Cars greySKForte = new Cars("Grey", "Standard", "Kia", "Forte", 20115);
        
        Cars wSKRio = new Cars("White", "Standard", "Kia", "Rio", 17275);
        
        Cars wSKSoul = new Cars("White", "Standard", "Kia", "Soul", 20505);
        
        Cars wSNAltima = new Cars("White", "Standard", "Nissan", "Altima", 25675);
        
        Cars wSNGTR = new Cars("White", "Standard", "Nissan", "GTR", 115335);      
        
        Cars wSNSentra = new Cars("White", "Standard", "Nissan", "Sentra", 20635);
        
        Cars wSSAscent = new Cars("White", "Standard", "Subaru", "Ascent", 33470);
        
        Cars wSSBRZ = new Cars("White", "Standard", "Subaru", "BRZ", 28990);
        
        Cars wSSImperza = new Cars("White", "Standard", "Subaru", "Imperza", 19790);
        
        Cars wSTCHR = new Cars("White", "Standard", "Toyota", "Imperza", 22910);
        
        Cars wSTCamry = new Cars("White", "Standard", "Toyota", "Imperza", 26420);

        Cars wSTCorolla = new Cars("White", "Standard", "Toyota", "Imperza", 21200);

        Cars wSTSupra = new Cars("White", "Standard", "Toyota", "Imperza", 44315);
        
        Cars wSTGR86 = new Cars("White", "Standard", "Toyota", "Imperza", 28725);

        Cars wSTPrius = new Cars("White", "Standard", "Toyota", "Imperza", 25650);


        Cars[] arrCars = {greySHAccord, wSHAccord, bDHAccord, wSHCivic, wSHCivic2, bDHCivic,
                rPHCivic, bSHCRV, wSHyAccent, wSHyElantra, wSHySantaFe, greySKForte, wSKRio, wSKSoul, 
                wSNAltima, wSNGTR, wSNSentra, wSNSentra, wSSAscent, wSSBRZ, wSSImperza, wSTCHR, 
                wSTCamry, wSTCorolla, wSTSupra, wSTGR86, wSTPrius};
        
        
        for(Cars i : arrCars)
            carList.add(i);
    }
    public void remCarList(Cars car) {
        int x = -1;
        for(int i = 0; i < carList.size(); i++) {
            if(carList.get(i) == car) {
                rCarList.add(car);
                x = i;
            }
        }
        if(x!=-1)
            carList.remove(x);
    }
    
    public ArrayList<Cars> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Cars> carList) {
        this.carList = carList;
    }

    public ArrayList<Cars> getrCarList() {
        return rCarList;
    }

    public void setrCarList(ArrayList<Cars> rCarList) {
        this.rCarList = rCarList;
    }
    
    
}
