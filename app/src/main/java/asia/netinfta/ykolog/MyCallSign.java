package asia.netinfta.ykolog;

/**
 * Created by masaru on 2016/6/25.
 */
public class MyCallSign {
    String callsign;
    String qra;
    boolean saveUtc = false;
    OwnRigList rigs;
    public void MyCallSign() {

    }
    public void MyCallSign(String callsign, String qra, boolean saveUtc) {
        this.callsign = callsign;
        this.qra = qra;
        this.saveUtc = saveUtc;
    }
    public void appendRig(OwnRig rig) {
    }
    public OwnRigList getRigList() {
        return null;

    }


}
