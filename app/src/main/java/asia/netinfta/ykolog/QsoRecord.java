package asia.netinfta.ykolog;

import io.realm.RealmObject;

/**
 * Created by masaru on 2016/7/8.
 */
public class QsoRecord extends RealmObject {
    private String callsign;

    private String address, adressIntl;
    private int age, aIndex, antennaAzimuth, antennaElevation;

    private enum antennaPath {glayline, other, shotPath, longPath};



    public String getAntennaPath() {
        switch(this.antennaPath) {

        }
    }


}
