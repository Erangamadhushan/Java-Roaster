package Basics.Assignment1_2;

public class Q2 {
    public static void main(String[] args) {
        double rhoCopper = 1.78e-8;
        double rhoSilicon = 2300;
        //double rhoAluminum = 2.82e-8;

        double length = 1;
        double diameter = 1e-3;
        double current = 25;

        double copperResistance = rhoCopper * (length/Math.pow(diameter/2,2) );
        double siliconResistance = rhoSilicon * (length/Math.pow(diameter/2, 2));

        System.out.println("Resistance of Copper is :" + copperResistance);
        System.out.println("Resistance of Silicons is :" + siliconResistance);

        double voltageCopperResistance = copperResistance * current;
        double voltageSiliconResistance = siliconResistance * current;

        System.out.println("Voltage of Copper Resistance is :" + voltageCopperResistance + " v");
        System.out.println("Voltage of Silicon Resistance is :" + voltageSiliconResistance + " v");

    }
}
