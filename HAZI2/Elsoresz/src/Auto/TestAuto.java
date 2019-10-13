package Auto;

import java.util.Arrays;
import java.util.Collections;

public class TestAuto {

    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] teher)
    {
        int[] suly = new int[teher.length];

        for (int i = 0; i < teher.length; i++) {
            suly[i] = teher[i].getMaxSzallithatoTeher();
        }

        Arrays.sort(suly);

        for (int i = teher.length - 1; i >= 0; i--) {
            System.out.println(suly[i]);
        }
    }

    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto)
    {
        int[] teljesitmeny = new int[auto.length];

        for (int i = 0; i < auto.length; i++) {
            teljesitmeny[i] = auto[i].getMotorTeljesitmeny();
        }

        Arrays.sort(teljesitmeny);
        int i = 0;
        for (i = 0; i < auto.length; i++) {
            if(auto[i].getMotorTeljesitmeny() == teljesitmeny[auto.length-1])
                break;
        }
        return auto[i];
    }

    public static void main(String[] args) {
        Auto[] auto = new Auto[10];
        Teherauto[] teherauto = new Teherauto[10];

        auto[0] = new Auto("AAA111",1526);
        auto[1] = new Auto("BBB222",1842);
        auto[2] = new Auto("CCC333",2891);
        auto[3] = new Auto("DDD444",10000);
        auto[4] = new Auto("EEE555",998);
        auto[5] = new Teherauto("FFF666",8812,25000);
        auto[6] = new Teherauto("GGG777",8712,28000);
        auto[7] = new Teherauto("HHH888",8912,24000);
        auto[8] = new Teherauto("III999",8312,30000);
        auto[9] = new Teherauto("JJJ001",8212,27000);

        teherauto[0] = new Teherauto("KKK002",9201,45000);
        teherauto[1] = new Teherauto("LLL003",9210,45001);
        teherauto[2] = new Teherauto("MMM004",9270,45002);
        teherauto[3] = new Teherauto("NNN005",9381,45000);
        teherauto[4] = new Teherauto("OOO006",9891,45005);
        teherauto[5] = new Teherauto("PPP007",9678,45005);
        teherauto[6] = new Teherauto("QQQ008",9987,45007);
        teherauto[7] = new Teherauto("RRR009",9999,45000);
        teherauto[8] = new Teherauto("SSS010",4123,45009);
        teherauto[9] = new Teherauto("TTT011",9254,43000);

        rendezMaxSzallithatoTeherCsokkenoleg(teherauto);
        System.out.println(keresMaxMotorTeljesitmeny(auto));
    }
}
