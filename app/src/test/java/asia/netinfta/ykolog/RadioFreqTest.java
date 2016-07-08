package asia.netinfta.ykolog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


/**
 * Created by masaru on 2016/6/28.
 */
public class RadioFreqTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSetFreqMhz() throws Exception {
        RadioFreq freq;

        freq = new RadioFreq("7.012345");
        assertEquals("\"7.012345\" should be 7012345",
                freq.toLong(), 7012345);
        freq = new RadioFreq("145");
        assertEquals("\"145\" should be 145000000",
                freq.toLong(), 145000000);
        freq = new RadioFreq();
        freq.set((float)1.234567);
        assertEquals(1234567, freq.toLong());

    }



    @Test
    public void testToString() throws Exception {

        RadioFreq freq;
        freq = new RadioFreq("7.012345");
        assertEquals("7.012345", freq.toString());
        freq .setFreqMhz("145");
        assertEquals("145.000000", freq.toString());
        freq.setFreqMhz("7.123456");
        assertEquals("7.123456", freq.toString());
        freq.setFreqMhz("1.801");
        assertEquals("1.801000", freq.toString());
    }

    @Test
    public void testToFloat() throws Exception {
        RadioFreq freq;
        freq = new RadioFreq("7.012345");
        assertTrue("\"7.012345\" should be (float)7.012345",
                freq.toFloat() == (float)7.012345);

    }

    private void testToFreqEach(RadioFreq radioFreq, String mhz, String band, String waveLength) {
        radioFreq.setFreqMhz(mhz);
        FreqBand freqBand = radioFreq.toFreqBand();
        assertNotNull("FreqBand for " + mhz + " should not null", freqBand);
        assertEquals(mhz + "MHz should be band=" + band, band, freqBand.getBandString());
        assertEquals(mhz + "MHz should be waveLength=" + waveLength,
                waveLength, freqBand.getWaveLengthString());
    }
    @Test
    public void testToFreqBand() throws Exception {
        RadioFreq radioFreq = new RadioFreq();


        //freq = new RadioFreq("7.012");


        //  bandList.add(new FreqBand("1.9M", "160m", 1800 * 1000, 2000*1000));
        testToFreqEach(radioFreq, "1.801", "1.9M", "160m");

        //bandList.add(new FreqBand("3.5M", "80m", 3500 * 1000, 4000*1000));
        testToFreqEach(radioFreq, "3.501", "3.5M", "80m");

        //bandList.add(new FreqBand("5M", "60m", 5300 * 1000, 5500*1000));
        testToFreqEach(radioFreq, "5.301", "5M", "60m");

        //bandList.add(new FreqBand("7M", "40m", 7000 * 1000, 7300*1000));
        testToFreqEach(radioFreq, "7.101", "7M", "40m");

        //bandList.add(new FreqBand("10M", "30m", 10000 * 1000, 10150*1000));
        testToFreqEach(radioFreq, "10.101", "10M", "30m");

        //bandList.add(new FreqBand("14M", "20m", 14000 * 1000, 14350*1000));
        testToFreqEach(radioFreq, "14.101", "14M", "20m");

        //bandList.add(new FreqBand("18M", "17m", 18068 * 1000, 18168*1000));
        testToFreqEach(radioFreq, "18.151", "18M", "17m");

        //bandList.add(new FreqBand("21M", "15m", 21000 * 1000, 21450*1000));
        //bandList.add(new FreqBand("24M", "12m", 24890 * 1000, 24990*1000));
        //bandList.add(new FreqBand("28M", "10m", 28000 * 1000, 29700*1000));
        //bandList.add(new FreqBand("50M", "6m", 50000 * 1000, 54000*1000));
        //bandList.add(new FreqBand("144M", "2m", 144*1000 * 1000, 146*1000*1000));
        //bandList.add(new FreqBand("430M", "70cm", 430*1000 * 1000, 440*1000*1000));


    }

    @Test
    public void testToLong() throws Exception {

    }

    @Test
    public void testSet() throws Exception {

    }

    @Test
    public void testSet1() throws Exception {

    }
}