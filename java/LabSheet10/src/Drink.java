public class Drink {
    private int type;
    private char size;

    Drink (int type , char size){
        this.type = type;
        this.size = size;
    }
    Drink (){
        this.type = 0;
        this.size = ' ';
    }

    public String getTypeName() {
        switch (type) {
            case 1: return "Hot";
            case 2: return "Cold";
            default: return null;
        }
    }

    public int getTypePrice() {
        switch (type) {
            case 1: return 10;
            case 2: return 20;
            default: return 0;
        }
    }

    public String getSizeName() {
        switch (size) {
            case 'S': return "Small";
            case 'M': return "Medium";
            case 'L': return "Large";
            default: return null;
        }
    }

    public int getSizePrice() {
        switch (size) {
            case 'S': return 150;
            case 'M': return 200;
            case 'L': return 250;
            default: return 0;
        }
    }

    public int getTotalPrice() {
        return getTypePrice() + getSizePrice();
    }
}