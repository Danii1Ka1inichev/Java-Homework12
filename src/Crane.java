public class Crane implements Backroom, priorityShips {

    public static void Crane(){
        new Thread(() -> {
            while (true) {

                try {
                    Cargo.addItemToShip(Backroom.take());
                    Thread.sleep(2000);
                    System.out.println("Грузоподъемный кран погружает товар на корбаль");
//                    System.out.println("На складе " + Backroom.size() + " товара");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


        }).start();

    }
}
