public class HomeAppliancesStore {
    static String nameCompany = "Kotsovolos";
    static int number = 35;
    static String address = "athinwn 51";
   // static int x;
   static void setNameCompany(int a){
       nameCompany = String.valueOf(a);
   }
   static void setAddress(int b){
       address = String.valueOf(b);
   }
    static void setNumber(int x) {
        number=x;
    }

    void deviceStatus(boolean fridge) {
       System.out.println(fridge);
    }

    public static void main(String[] args){

     //   System.out.println("The name of the company is " +nameCompany);
     //   System.out.println("The address of the company is " +address);
     //   System.out.println("The number of employees is " +number);

        if(nameCompany == null)
        {
            System.out.println("ERROR");
        }
        else {
            System.out.println("The name of the company is " + nameCompany);
        }
        if(address == null)
        {
            System.out.println("ERROR");
        }
        else {
            System.out.println("The address of the company is " + address);
        }
        if(number == 0)
        {
            System.out.println("ERROR");
        }
        else {
            System.out.println("The number of employees is " + number);
        }

        //plithos syskeuwn,xrhsimopoioume tis klaseis
        Fridge fridge1 = new Fridge();
        WashineMachine washineMachine1 = new WashineMachine();
        Oven oven1 = new Oven();
        AirCondition airCondition1 = new AirCondition();

       // fr = fridge1.fridge();
        //to plithos olwn twn syskeuwn
        int fr;
        fr = fridge1.syskeues();
        System.out.println("The number of the product is " +fr);
        fr = washineMachine1.syskeues();
        System.out.println("The number of the product is " +fr);
        fr = oven1.syskeues();
        System.out.println("The number of the product is " +fr);
        fr = airCondition1.syskeues();
        System.out.println("The number of the product is " +fr);

        }
    }

