class E {
  int x22;
  int x24;
  int x11;
  int x16;
  int x30;
  long x29;
  long x33;
  long x36;
  int[] x1 = {3, 3, -3, -1, -3};
  int[] x15 = {-1, -3, 0, -2};
  int[] x7 = {-1, -2, 3, 0, 2};
  static int x14;
  static int x23;
  static int x3;
  static int x32;
  static int x26;
  public E() {
    x22 = 0;
    x24 = 7;
    x11 = 6;
    x16 = 6;
    x30 = 9;
    x29 = 6L;
    x33 = 0L;
    x36 = 3L;
  }
  public void x31() {
    System.out.println("метод x31 в классе E");
    System.out.println(x30 >> 2);
  }
  public void x17() {
    System.out.println("метод x17 в классе E");
    System.out.println(x7[1] + x7[1]);
  }
  public void x37() {
    System.out.println("метод x37 в классе E");
    System.out.println(x30 - 3);
  }
  public void x9() {
    System.out.println("метод x9 в классе E");
    System.out.println(x14++);
  }
  public void x10() {
    System.out.println("метод x10 в классе E");
    System.out.println(x24);
  }
  public void x20() {
    System.out.println("метод x20 в классе E");
    System.out.println(++x22);
  }
  public static void x19() {
    System.out.println("метод x19 в классе E");
    System.out.println(x32);
  }
  public static void x34() {
    System.out.println("метод x34 в классе E");
    System.out.println((x32 - 2));
  }
  public static void x28() {
    System.out.println("метод x28 в классе E");
    System.out.println(x26);
  }
  public static void x35() {
    System.out.println("метод x35 в классе E");
    System.out.println((x26 + 4));
  }
  public void x25(E r) {
    r.x31();
  }
  public void x25(C r) {
    r.x17();
  }
}
