package entities;

public class ImportedProduct extends Product{
    private Double customsFee;
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totaPrice(){
        return super.getPrice() + getCustomsFee();
    }
    @Override
    public String priceTag() {
        return "Name: "+getName()+ ", Price: $ "+ String.format("%.2f",totaPrice()) + " (Customs Fee: $"+ String.format("%.2f",getCustomsFee())+")";
    }

}
