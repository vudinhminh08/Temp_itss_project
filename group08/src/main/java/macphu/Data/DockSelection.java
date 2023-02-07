package macphu.Data;

public class DockSelection {
    private static int  dockNumber = 0;

    public static void getDockNumber(int dockId){
        dockNumber = dockId;
    }

    public static int returnDocNumber(){
        return dockNumber;
    }
}
