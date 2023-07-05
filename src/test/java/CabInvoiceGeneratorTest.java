
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
        public void distancetime() {
            double distance = .01;
            int time = 1;
            CabInvoiceGenerator cb = new CabInvoiceGenerator();
            double result = cb.calculateFare(distance, time);
            Assert.assertEquals(5.0, result, 0);
        }
        @Test
    public void MultipleRides(){
            CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
            Ride[] ride = {
                    new Ride(2.0,5),
                    new Ride(0.1,1)
            };
            double fare = invoiceGenerator.calculateFare(ride);
            Assert.assertEquals(30,fare,0.0);
        }
    }