package pl.jkan.creditcard;

class CreditCard {
    
    private boolean blockade = false;
    private double limit = 0;
    
    public void assignLimit(double limit) {
        this.limit = limit;
    }   
    
    public double getLimit() {
        return 2000;
    }
    public void block(){
        this.blockade = true;
    }
    public boolean isBlocked(){
        return this.blockade = true;
    }
}