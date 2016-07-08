package asia.netinfta.ykolog;

/**
 * Created by masaru on 2016/6/25.
 */

public class FreqBand {
    String bandString;
    String waveLengthString;
    long lowerHz;
    long upperHz;

    FreqBand(String bandString, String waveLengthString, long lowerHz, long upperhz) {
        this.bandString = bandString;
        this.waveLengthString = waveLengthString;
        this.lowerHz = lowerHz;
        this.upperHz = upperhz;
    }

    int compareHz(long hz) {
        boolean ret;
        if ( hz < this.lowerHz) {
            return -1;
        }
        else if (hz > this.upperHz) {
            return 1;
        }
        return 0;
    }

    boolean inRange(long hz) {
        return (this.compareHz(hz) == 0);
    }

    String getBandString() { return this.bandString;}
    String getWaveLengthString() { return this.waveLengthString;}
    long getLowerHz() { return this.lowerHz;}
    long getUpperHz() { return this.upperHz;}

}
