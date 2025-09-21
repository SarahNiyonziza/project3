import java.util.Scanner;

public class Main{
    public  static  void main(String []args){
        AutomaticMachine auto = new AutomaticMachine();

        auto.deposit (5000);
        auto.deposit ("chk12345",5000);
       auto.deposit("0782956345",5000);

    }

}
