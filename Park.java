import java.util.ArrayList;
import java.util.List;

public class Park extends main{
    
    public List<Attraction> attractions = new ArrayList<>();
    
    public void addAttraction(String name, int openHour, int closeHour, int price) {
        Attraction attraction = new Attraction(name, openHour, closeHour, price);
        attractions.add(attraction);
    }
    
    public static class Attraction {
        private String name;
        private int openHour;
        private int closeHour;
        private int price;
        
        public Attraction(String name, int openHour, int closeHour, int price) {
            this.name = name;
            this.openHour = openHour;
            this.closeHour = closeHour;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }

        public int getOpenHour() {
            return openHour;
        }

        public int getCloseHour() {
            return closeHour;
        }

        public int getPrice() {
            return price;
        }
    }
}