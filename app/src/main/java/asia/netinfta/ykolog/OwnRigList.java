package asia.netinfta.ykolog;

import java.util.ArrayList;

/**
 * Created by masaru on 2016/6/26.
 */
public class OwnRigList extends ArrayList<OwnRig> {

    int callsign_id;
    OwnRigList(){}
    OwnRigList(MyCallSign callSign) {
        // find rigs from db
    }
    public void append(String rigname) {
        this.add(new OwnRig(rigname));
    }


}
