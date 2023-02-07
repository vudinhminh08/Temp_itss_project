package macphu.Data;

import macphu.Models.BikeModel;

public class BikeSelection {
    private static BikeModel selecedBike = new BikeModel(0, "normal", null, null);

    public static void getBikeInfor(BikeModel bike){
        selecedBike = bike;
    }

    public static BikeModel returnBikeInfor(){
        return selecedBike;
    }

    
}
