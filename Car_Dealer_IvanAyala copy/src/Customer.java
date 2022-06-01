
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivanca19
 */
public class Customer {
    
    private String _customerID;
    private String _firstN;
    private String _lastN;
    private String _address;
    private String _postCode;
    private String _city;
    private String _proofOfID;
    private double _deposit;
    private double _down;
    private JFrame _frame;

    public String getCustomerID() {
        return _customerID;
    }

    public void setCustomerID(String _customerID) {
        this._customerID = _customerID;
    }

    public String getFirstN() {
        return _firstN;
    }

    public void setFirstN(String _firstN) {
        this._firstN = _firstN;
    }

    public String getLastN() {
        return _lastN;
    }

    public void setLastN(String _lastN) {
        this._lastN = _lastN;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String _address) {
        this._address = _address;
    }

    public String getPostCode() {
        return _postCode;
    }

    public void setPostCode(String _postCode) {
        this._postCode = _postCode;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String _city) {
        this._city = _city;
    }

    public String getProofOfID() {
        return _proofOfID;
    }

    public void setProofOfID(String _proofOfID) {
        this._proofOfID = _proofOfID;
    }

    public double getDeposit() {
        return _deposit;
    }

    public void setDeposit(double _deposit) {
        this._deposit = _deposit;
    }

    public double getDown() {
        return _down;
    }

    public void setDown(double _down) {
        this._down = _down;
    }
    
    public void iExitSystem() {
        _frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(_frame, "Confirm if you want to exit", "Ayala Dealer System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    
}
