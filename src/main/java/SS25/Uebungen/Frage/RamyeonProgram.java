package SS25.Uebungen.Frage;

public class RamyeonProgram {

    public static void main(String[] args) {
        try {
            RamyeonCook ramyeonCook = new RamyeonCook(Integer.parseInt(args[0])); // args[0]: Terminal argument
            new Thread(ramyeonCook, "A").start();
            new Thread(ramyeonCook, "B").start();
            new Thread(ramyeonCook, "C").start();
            new Thread(ramyeonCook, "D").start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class RamyeonCook implements Runnable {

    private int ramyeonCount;
    private String[] burners = {"_", "_", "_", "_"};

    public RamyeonCook(int count) {
        ramyeonCount = count;
    }

    @Override
    public void run() {
        while (ramyeonCount > 0) {

            synchronized (this) { // this가 무엇?
                ramyeonCount--;
                System.out.println(Thread.currentThread().getName() + ": " + ramyeonCount + " left");
            }

            for (int i = 0; i < burners.length; i++) { // burner 비어있는지 확인
                if (!burners[i].equals("_")) continue;

                synchronized (this) { // "_" 인 경우에만
                    burners[i] = Thread.currentThread().getName();
                    System.out.println(
                            "             " + Thread.currentThread().getName() + ": Bunner [" + (i + 1) + "] on");
                    showBurners();
                }

                try {
                    Thread.sleep(2000); // 라면 끓이는데 2초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (this) {
                    burners[i] = "_";
                    System.out.println("                                "
                            + Thread.currentThread().getName()
                            + ": Bunner[" + (i + 1) + "] off");
                    showBurners();
                }
                break;
            }

            try {
                Thread.sleep(Math.round(1000 * Math.random())); // 쉬는 시간 (동시에 여러 쓰레드가 버너를 차지하려고 하지 않도록 랜덤하게 지연시켜서 충돌분산)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void showBurners() {
        String stringToPrint = "                                                       ";
        for (int i = 0; i < burners.length; i++) {
            stringToPrint += (" " + burners[i]);
        }
        System.out.println(stringToPrint);
    }
}
