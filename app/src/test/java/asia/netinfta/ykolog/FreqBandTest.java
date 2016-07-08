package asia.netinfta.ykolog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by masaru on 2016/6/28.
 */
public class FreqBandTest {
    static long MHz = 1000 * 1000;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCompareHz() throws Exception {
        FreqBand testBand = new FreqBand("430M", "70cm", 430*MHz, 440*MHz);

        assertEquals(testBand.compareHz(429*MHz), -1);
        assertEquals(testBand.compareHz(431*MHz) , 0);
        assertEquals(testBand.compareHz(441*MHz) , 1);

    }

    @Test
    public void testInRange() throws Exception {

        FreqBand testBand = new FreqBand("430M", "70cm", 430*MHz, 440*MHz);

        assertFalse(testBand.inRange(429*MHz));
        assertTrue (testBand.inRange(431*MHz));
        assertFalse(testBand.inRange(441*MHz));
    }

    @Test
    public void testGetHzString() throws Exception {

    }

    @Test
    public void testGetWaveLengthString() throws Exception {

    }

    @Test
    public void testGetLowerHz() throws Exception {

    }

    @Test
    public void testGetUpperHz() throws Exception {

    }
}