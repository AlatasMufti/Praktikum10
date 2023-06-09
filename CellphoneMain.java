package Praktikum10;

public class CellphoneMain {
    public static void main(String[] args) {
      Cellphone cp = new Cellphone("Mito", "Tab");
      cp.powerOn();
      cp.volumeUp();
      cp.volumeUp();
      cp.volumeDown();
      cp.powerOff();
      cp.powerOff();
      cp.topUpPulsa(70000);
      int sisaPulsa = cp.getSisaPulsa();
      System.out.println("Sisa pulsa: " + sisaPulsa);
      cp.tambahKontak("Alatas", "082262412580");
      cp.tambahKontak("Ayu", "081789237890");
      cp.lihatSemuaKontak();
      cp.cariKontak("Bowo");
      cp.cariKontak("Ronal");
    }
  }
