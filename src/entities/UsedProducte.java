package entities;

import java.util.Date;

public class UsedProducte extends Product{
    private Date manufactureDate;

    public UsedProducte(){
        super();
    }

    public UsedProducte(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String priceTag(){
        return super.priceTag() + "(Manufacture Date: "+getManufactureDate()+ ")";
    }
}
