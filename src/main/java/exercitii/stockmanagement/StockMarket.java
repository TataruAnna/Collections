package exercitii.stockmanagement;

import java.util.Map;

public class StockMarket {
   private Map<String, Integer> stockPriceByCompany; //retine numele companniei si pretul

    public StockMarket(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }

    public Map<String, Integer> getStockPriceByCompany() {
        return stockPriceByCompany;
    }

    public void setStockPriceByCompany(Map<String, Integer> stockPriceByCompany) {
        this.stockPriceByCompany = stockPriceByCompany;
    }

    public String getMostExpensiveCompany(){
        int maxPrice = 0;
        String mostExpensiveCompany = " ";
        for (String companyName :stockPriceByCompany.keySet()){
            if(stockPriceByCompany.get(companyName)>maxPrice){
                maxPrice = stockPriceByCompany.get(companyName);
                mostExpensiveCompany = companyName;

            }
        }

   // cealalta varianta de parcurgere
//        for(Map.Entry<String, Integer> entry : stockPriceByCompany.entrySet()){
//            if(entry.getValue()>maxPrice){
//                maxPrice = entry.getValue();
//                mostExpensiveCompany = entry.getKey();
//            }
//        }


        return  mostExpensiveCompany;
    }

    public double getAverageSharePrice() {
        double sum = 0;

        for (String companyName : stockPriceByCompany.keySet()) {
            sum += stockPriceByCompany.get(companyName);
        }
        return sum/ stockPriceByCompany.size();
    }



}
