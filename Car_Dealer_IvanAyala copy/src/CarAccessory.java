/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivanca19
 */
public class CarAccessory {
    
    private double _iStereo = 103.49;
    private double _modified = 500.78;
    private double _customized = 2000.49;
    private double _leather = 1003.90;
    private double _gps = 180.29;
    public double accessoryCost;

    
    public double getiStereo() {
        return _iStereo;
    }

    public void setiStereo(double _iStereo) {
        this._iStereo = _iStereo;
    }

    public double getModified() {
        return _modified;
    }

    public void setModified(double _modified) {
        this._modified = _modified;
    }

    public double getCustomized() {
        return _customized;
    }

    public void setCustomized(double _customized) {
        this._customized = _customized;
    }

    public double getLeather() {
        return _leather;
    }

    public void setLeather(double _leather) {
        this._leather = _leather;
    }

    public double getGps() {
        return _gps;
    }

    public void setGps(double _gps) {
        this._gps = _gps;
    }
    
    
    public double getAccessoryCost() {
        accessoryCost = _iStereo + _modified + _customized + _leather + _gps;
        return accessoryCost;
    }
    
}
