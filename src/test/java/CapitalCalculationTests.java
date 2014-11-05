import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;

public class CapitalCalculationTests extends TestCase {
    private static final int HIGH_RISK_RATING = 1;
    private static final int TWO_DIGIT_PRECISION = 2;
    private static final double LOAN_AMOUNT = 1000.00;

    public void testTermLoanSamePayments() {
        Date start = november(20, 2003);
        Date maturity = november(20, 2006);
        Loan termLoan = Loan.newTermLoan(LOAN_AMOUNT, start, maturity, HIGH_RISK_RATING);
        termLoan.payment(1000.00, november(20, 2004));
        termLoan.payment(1000.00, november(20, 2005));
        termLoan.payment(1000.00, november(20, 2006));
        assertEquals("duration", 2.0, termLoan.duration(), TWO_DIGIT_PRECISION);
        assertEquals("capital", 210.00, termLoan.capital(), TWO_DIGIT_PRECISION);
    }

    private Date november(int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0);
        cal.set(year, Calendar.NOVEMBER, day);
        return cal.getTime();
    }
}