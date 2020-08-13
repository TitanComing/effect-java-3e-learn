package learneffectivejava.chapter4.item22;

/**
 * Created by peng on 2020/8/13.
 */
public class PhysicalConstants {
    private PhysicalConstants(){
        throw new AssertionError("常量类不允许创建实例");
    }

    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;

    // Boltzmann constant (J/K)
    public static final double BOLTZMANN_CONST  = 1.380_648_52e-23;

    // Mass of the electron (kg)
    public static final double ELECTRON_MASS    = 9.109_383_56e-31;
}
