public class Run {
    public static void main(String[] args){
        seaport();

    }
    public static void seaport(){
        new Thread(() -> {

            supplier.supplier();
            // количество кранов
            Crane.Crane();
            Crane.Crane();
            Cargo.CreateCargo();







        }).start();

    }
}
