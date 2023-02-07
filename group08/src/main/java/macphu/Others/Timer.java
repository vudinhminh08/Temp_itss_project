package macphu.Others;

public class Timer extends Thread {
        public void run() {
            int deltaTime = 0;
            try {
                while (true) {
                    
                    long hh = deltaTime / 3600 % 60;
                    long mm = deltaTime / 60 % 60;
                    long ss = deltaTime % 60;
        
                    String format = "%1$s:%2$s:%3$s";
                    String strMS = String.format(format, hh, mm, ss);
                    System.out.print(strMS);
                    deltaTime++;
                    Thread.sleep(1000);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }   
}
