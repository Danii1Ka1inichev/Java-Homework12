import java.util.concurrent.ArrayBlockingQueue;

public class Cargo implements priorityShips {
    public static void CreateCargo(){
        new Thread(() -> {
            while (true) {
                try {
                    int i = (int) (1 + Math.random() * 20);
//                ArrayList<Item> Sheep = new ArrayList<>(i);
                    ArrayBlockingQueue<Item> Cargo = new ArrayBlockingQueue<>(i);
                    priorityShips.add(Cargo);
                    System.out.println("Прибыл корабль вместимостью:" + i);
                    System.out.println("КОРАБЛЕЙ В ОЧЕРЕДИ: "+ priorityShips.size());
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();


    }
    public static void addItemToShip(Item item){
        try {
            ArrayBlockingQueue<Item> cargo = priorityShips.get(0);
            try {
                cargo.add(item);
                System.out.println("На корабль погружен товар!");

            } catch (IllegalStateException e){
                System.out.println("Погрузка завершена, ОТШВАРТОВЫВАЕМСЯ!");
                priorityShips.remove(cargo);
            }

        } catch (IndexOutOfBoundsException e){
            System.out.println("Корабль еще не пришвартовался, некуда погрузить товар!");
        }
    }

}
