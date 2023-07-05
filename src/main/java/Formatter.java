public class Formatter {
    public String formatPrice(double price){
        if (Math.floor(price) % 10 == 1 && Math.floor(price) != 11){
            return " рубль";
        } else if ((Math.floor(price) % 10 == 2 ||
                Math.floor(price) % 10 == 3 ||
                Math.floor(price) % 10 == 4)
                && (Math.floor(price) % 100 < 10 || Math.floor(price) % 100 > 20)) {
            return " рубля";
        } else {
            return " рублей";
        }
    }
    }

