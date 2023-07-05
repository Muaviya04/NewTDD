public class CabInvoiceGenerator {
    public static  final  double costperkm=10.0;
    public static  final  double costpermin=1.0;
    public static  final  double min_fare=5;
    public double calculateFare(double distance,int time){
        double totalfare=(distance*costperkm)+(time*costpermin);
        if (totalfare<=min_fare){
            return min_fare;
        }else {
            return  totalfare;
        }
    }
}