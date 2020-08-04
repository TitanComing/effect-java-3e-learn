package learneffectivejava.chapter2.item3.enumtype;

/**
 * Create by peng on 2020/8/4.
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
