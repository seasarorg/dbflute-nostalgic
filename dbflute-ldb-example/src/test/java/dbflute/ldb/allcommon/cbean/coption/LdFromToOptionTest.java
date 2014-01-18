package dbflute.ldb.allcommon.cbean.coption;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import dbflute.PlainTestCase;

/**
 * The test of from-to option.
 * @author jflute
 * @since 0.8.3 (2008/11/11 Tuesday)
 */
public class LdFromToOptionTest extends PlainTestCase {

    // ===================================================================================
    //                                                                         Filter Date
    //                                                                         ===========
    public void test_compareAsDate_filterFromDate_filterToDate_limitDateCheck() {
        // ## Arrange ##
        LdFromToOption option = new LdFromToOption();
        option.compareAsDate();
        Date fromDate = new Date(Timestamp.valueOf("1111-01-01 00:00:00").getTime());
        Date toDate = new Date(Timestamp.valueOf("9999-12-31 12:34:56").getTime());

        // ## Act ##
        Date filteredFromDate = option.filterFromDate(fromDate);
        Date filteredToDate = option.filterToDate(toDate);

        // ## Assert ##
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        log(format.format(filteredFromDate) + " - " + format.format(filteredToDate));
        assertEquals("10000-01-01 00:00:00.000", format.format(filteredToDate));
    }

    public void test_compareAsDate_filterFromDate_filterToDate_superDateCheck() {
        // ## Arrange ##
        LdFromToOption option = new LdFromToOption();
        option.compareAsDate();
        Date fromDate = new Date(Timestamp.valueOf("1111-01-01 00:00:00").getTime());
        Date toDate = new Date(Timestamp.valueOf("999999-12-31 12:34:56").getTime());

        // ## Act ##s
        Date filteredFromDate = option.filterFromDate(fromDate);
        Date filteredToDate = option.filterToDate(toDate);

        // ## Assert ##
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        log(format.format(filteredFromDate) + " - " + format.format(filteredToDate));
        assertEquals("1000000-01-01 00:00:00.000", format.format(filteredToDate));
    }
}
