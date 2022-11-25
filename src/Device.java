public class Device {
    private float length;
    private float height;
    private float vathos;
    private String kataskeuastis;
    private String typesiskeuis;
    private float energy;

    boolean status;
    void powerOn(){
        status = true;
    }
    void powerOff(){
        status = false;
    }
    boolean status(){
        return status;
    }
}
