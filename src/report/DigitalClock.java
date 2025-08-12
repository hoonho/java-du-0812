package report;

public class DigitalClock {
  public static void main(String[] args) {
    while (true) {
      long currentTimeMillis = System.currentTimeMillis();
      java.util.Date date = new java.util.Date(currentTimeMillis);
      System.out.println("Current Time: " + date.toString());

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted: " + e.getMessage());
      }
    }
  }
}
