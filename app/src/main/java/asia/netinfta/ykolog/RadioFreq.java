package asia.netinfta.ykolog;

/**
 * Created by masaru on 2016/6/25.
 */


public class RadioFreq {

    long hz = -1;
    public static FreqBandList bandList;
    static long Mega = 1000 * 1000;
    static long Kilo = 1000;


    RadioFreq(){setupBandList();}
    RadioFreq(String freqMhz) {
        setupBandList();
        setFreqMhz(freqMhz);
    }
    RadioFreq(long hz) {
        setupBandList();
        this.hz = hz;
    }
    RadioFreq(float mHz) {
        setupBandList();
        this.hz = (long)(mHz * Mega);
    }

    public void setFreqMhz(String mhz){
        String f1, f2;
        /// "123.456" -> length=7, pos=3, pow=(6 - (length - pos - 1))=3
        //  "123.4567" -> length=8, pos=3, pow=(6 - (length(8) - pos(3) - 1))=2
        int pos = mhz.indexOf(".");

        if (pos == -1) {
            this.hz = Long.parseLong(mhz) * Mega;
            return;
        }
        if (mhz.length() > pos + 8 ) {
            throw new IllegalArgumentException("Under Hz format too long");
        }
        this.hz = Long.parseLong(mhz.substring(0, pos)) * Mega;
        this.hz += Long.parseLong(mhz.substring(pos + 1))
                * (long)Math.pow(10, 6 - (mhz.length() - pos -  1));
    }
    public void setFreqMhz(float mhz) {
        this.hz = (long) mhz * Mega;
    }

    public void setFreq(long hz) {
        this.hz = hz;
    }

    public String toString() {
        return String.format("%d.%06d", this.hz / Mega, this.hz % Mega);
    }

    public float toFloat() {
        return ((float) this.hz) / Mega;
    }
    public FreqBand toFreqBand() {
        return bandList.find(hz);
    }

    public long toLong() {
        return hz;
    }

    public void set(long hz) {
        this.hz = hz;
    }
    public void set(float MHz) {
        this.hz = (long)(MHz * Mega);
    }

    private void setupBandList() {
        if (bandList == null) bandList = new FreqBandList();
        if (bandList.size() != 0) return;
        bandList.add(new FreqBand("1.9M", "160m", 1800 * Kilo, 2000*Kilo));
        bandList.add(new FreqBand("3.5M", "80m", 3500 * Kilo, 4000*Kilo));
        bandList.add(new FreqBand("5M", "60m", 5300 * Kilo, 5500*Kilo));
        bandList.add(new FreqBand("7M", "40m", 7000 * Kilo, 7300*Kilo));
        bandList.add(new FreqBand("10M", "30m", 10000 * Kilo, 10150*Kilo));
        bandList.add(new FreqBand("14M", "20m", 14000 * Kilo, 14350*Kilo));
        bandList.add(new FreqBand("18M", "17m", 18068 * Kilo, 18168*Kilo));
        bandList.add(new FreqBand("21M", "15m", 21000 * Kilo, 21450*Kilo));
        bandList.add(new FreqBand("24M", "12m", 24890 * Kilo, 24990*Kilo));
        bandList.add(new FreqBand("28M", "10m", 28000 * Kilo, 29700*Kilo));
        bandList.add(new FreqBand("50M", "6m", 50000 * Kilo, 54000*Kilo));
        bandList.add(new FreqBand("144M", "2m", 144*Mega, 146*Mega));
        bandList.add(new FreqBand("430M", "70cm", 430*Mega, 440*Mega));
    }
}
