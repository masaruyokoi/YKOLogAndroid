package asia.netinfta.ykolog;

import java.util.ArrayList;

/**
 * Created by masaru on 2016/6/26.
 */
public class FreqBandList extends ArrayList<FreqBand> {
    public FreqBand find(long hz) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).inRange(hz)) {
                return this.get(i);
            }
        }
        return null;
    }
    public FreqBand findByHzString(String hzString) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getBandString() == hzString) {
                return this.get(i);
            }
        }
        return null;
    }
    public FreqBand findByWaveLengthString(String waveLengthString) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getWaveLengthString() == waveLengthString) {
                return this.get(i);
            }
        }
        return null;
    }
}
