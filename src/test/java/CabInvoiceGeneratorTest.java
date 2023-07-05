
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
    }