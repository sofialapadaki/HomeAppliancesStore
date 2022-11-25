public class AirCondition extends Device{
     private float length;
    private float height;
    private float vathos;
    private String kataskeuastis;
    private String typesiskeuis;
    private float energy;
    private float price;
    private float eggyish;
    private float weight;
    private float diarkeiazwhs;
    private float temperature;

    public float getLength() {
        return length;
    }
    public void setLength(float newLenght){
        this.length = newLenght;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float newHeight){
        this.height = newHeight;
    }

    public float getVathos() {
        return vathos;
    }
    public void setVathos(float newVathos) {
        this.vathos = newVathos;
    }

    public String getKataskeuastis() {
        return kataskeuastis;
    }
    public void setKataskeuastis(String newKataskeuastis) {
        this.kataskeuastis = newKataskeuastis;
    }

    public String getTypesiskeuis() {
        return typesiskeuis;
    }
    public void setTypesiskeuis(String newTypesiskeuis) {
        this.typesiskeuis = newTypesiskeuis;
    }

    public float getEnergy() {
        return energy;
    }
    public void setEnergy(float newEnergy){
        this.energy = newEnergy;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public float getEggyish() {
        return eggyish;
    }
    public void setEggyish(float newEggyish) {
        this.eggyish = newEggyish;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    public float getDiarkeiazwhs() {
        return diarkeiazwhs;
    }
    public void setDiarkeiazwhs(float newDiarkeiazwhs) {
        this.diarkeiazwhs = newDiarkeiazwhs;
    }

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float newTemperature) {
        this.temperature = newTemperature;
    }

   // float q1,q2,q3,q4,q5,q6,q7,q8;
   // String q9,q10;
    AirCondition (float a, float b, float c, String d, String e, float f, float g, float h, float i, float j,float k) {
        length= a;
        height = b;
        vathos = c;
        kataskeuastis = d;
        typesiskeuis = e;
        energy = f;
        price = g;
        eggyish= h;
        weight= i;
        diarkeiazwhs= j;
        temperature = k;
    }
    AirCondition(){

    }
    static int arithmosSyskeuwn;    //static metablith
    //epistrofh ths timhs arithmosSyskeuwn
    int syskeues(){
        return arithmosSyskeuwn;
    }
    //private sinartisi
    private void periodicMantainance(){

    }

    //sinartish pou ektipwnei ta stoixeia kathe syskeuhs
    void airCondition(){
        System.out.println("The length is " +length);
        System.out.println("The height is " +height);
        System.out.println("The depth is " +vathos);
        System.out.println("The creator is " +kataskeuastis);
        System.out.println("The type is " +typesiskeuis);
        System.out.println("The energy is " +energy);
        System.out.println("The price is " +price);
        System.out.println("The maintenance is " +eggyish);
        System.out.println("The weight is " +weight);
        System.out.println("The lifespan is " +diarkeiazwhs);
        System.out.println("The temperature is " +temperature);
    }
}
