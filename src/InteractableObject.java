
public final class InteractableObject {

   int anInt570;
   int anInt571;
   int anInt572;
   int anInt573;
   public Renderable renderableObject;
   int anInt575;
   static final int anInt576 = 8;
   int xPos;
   int yPos;
   int anInt579;
   int anInt580;
   int anInt581;
   int anInt582;
   int anInt583 = 0;
   static int[] anIntArray584;
   static final int anInt585 = 27;
   public int anInt586 = 0;


   static final void method648(int var0) {
      if(null != Varp.loginConnection) {
         Varp.loginConnection.disconnect();
         Varp.loginConnection = null;
      }

      Class68.method929(-1417557093);
      Class56.gameScene.method466();

      for(int var1 = 0; var1 < 4; ++var1) {
         Client.clippingPlanes[var1].method1402(1566511345);
      }

      System.gc();
      Class15.method288(2, 2134470595);
      Client.anInt2937 = 834881831;
      Client.aBool2938 = false;
      ChatMessage.method2010((short)-6014);
      IsaacRandomGen.method725(10, 1843447412);
   }
}