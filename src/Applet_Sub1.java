import java.applet.Applet;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

   static int anInt2685 = -1908992707;
   static int anInt2686 = 0;
   static long aLong2687 = 0L;
   protected static volatile boolean aBool2688 = true;
   boolean aBool2689 = false;
   static int anInt2690 = -732545540;
   static int anInt2691 = 1358855988;
   static boolean aBool2692 = false;
   protected static volatile boolean aBool2693 = false;
   static long[] aLongArray2694 = new long[32];
   protected static int clientFPS = 0;
   static long[] aLongArray2696 = new long[32];
   static volatile long aLong2697 = 0L;
   static Applet_Sub1 anApplet_Sub1_2698 = null;
   static volatile boolean aBool2699 = true;
   public static final int anInt2700 = 154;
   static String aString2701;


   protected final void method3184(int width, int height, int var3, int var4) {
      try {
         if(null != anApplet_Sub1_2698) {
            anInt2686 += 962032645;
            if(anInt2686 * 401291469 >= 3) {
               this.method3246("alreadyloaded", -1271013870);
            } else {
               this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
         } else {
            anApplet_Sub1_2698 = this;
            ProducingGraphicsBuffer.clientWidth = width * -722659069;
            ProducingGraphicsBuffer.clientHeight = height * -1515364509;
            RuntimeException_Sub1.anInt2627 = var3 * -1328331175;
            RuntimeException_Sub1.anApplet2631 = this;
            if(null == ClientScriptMap.pringRequester) {
               ClientScriptMap.pringRequester = new PingRequester();
            }

            ClientScriptMap.pringRequester.method820(this, 1, -1962227119);
         }
      } catch (Exception var6) {
         World.method647((String)null, var6, 926745782);
         this.method3246("crash", -1271013870);
      }
   }

   protected final synchronized void method3185(byte var1) {
      Object var2;
      if(UnderlayDefinition.aFrame2150 != null) {
         var2 = UnderlayDefinition.aFrame2150;
      } else {
         var2 = this;
      }

      if(Class1.aCanvas3 != null) {
         Class1.aCanvas3.removeFocusListener(this);
         ((Container)var2).remove(Class1.aCanvas3);
      }

      Class1.aCanvas3 = new Canvas_Sub1(this);
      ((Container)var2).add(Class1.aCanvas3);
      Class1.aCanvas3.setSize(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229);
      Class1.aCanvas3.setVisible(true);
      if(UnderlayDefinition.aFrame2150 != null) {
         Insets var3 = UnderlayDefinition.aFrame2150.getInsets();
         Class1.aCanvas3.setLocation(var3.left, var3.top);
      } else {
         Class1.aCanvas3.setLocation(0, 0);
      }

      Class1.aCanvas3.addFocusListener(this);
      Class1.aCanvas3.requestFocus();
      aBool2688 = true;
      aBool2693 = false;
      aLong2697 = Player.method3175(849846164) * 516356414042863577L;
   }

   final synchronized void method3188(byte var1) {
      if(!aBool2692) {
         aBool2692 = true;

         try {
            Class1.aCanvas3.removeFocusListener(this);
         } catch (Exception var6) {
            ;
         }

         try {
            this.method3228(612744672);
         } catch (Exception var5) {
            ;
         }

         if(null != UnderlayDefinition.aFrame2150) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
               ;
            }
         }

         if(ClientScriptMap.pringRequester != null) {
            try {
               ClientScriptMap.pringRequester.method839(-818149209);
            } catch (Exception var3) {
               ;
            }
         }

         this.method3201(851563284);
      }
   }

   void process(short var1) {
      long var2 = Player.method3175(849846164);
      long var5 = aLongArray2696[Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033];
      aLongArray2696[Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033] = var2;
      Class108_Sub20_Sub14_Sub6.anInt2607 = (Class108_Sub20_Sub14_Sub6.anInt2607 * 962733033 + 1 & 31) * 737600601;
      if(0L != var5 && var2 > var5) {
         int var4 = (int)(var2 - var5);
         clientFPS = ((var4 >> 1) + 32000) / var4 * 1664500787;
      }

      if((anInt2691 += 1265438097) * 310858609 - 1 > 50) {
         anInt2691 += 1152604590;
         aBool2688 = true;
         Class1.aCanvas3.setSize(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229);
         Class1.aCanvas3.setVisible(true);
         if(null != UnderlayDefinition.aFrame2150) {
            Insets var7 = UnderlayDefinition.aFrame2150.getInsets();
            Class1.aCanvas3.setLocation(var7.left, var7.top);
         } else {
            Class1.aCanvas3.setLocation(0, 0);
         }
      }

      this.method3198((byte)-56);
   }

   public void start() {
      if(this == anApplet_Sub1_2698) {
         if(!aBool2692) {
            aLong2687 = 0L;
         }
      }
   }

   public final void windowClosed(WindowEvent var1) {}

   public void destroy() {
      if(this == anApplet_Sub1_2698) {
         if(!aBool2692) {
            aLong2687 = Player.method3175(849846164) * 258775077807745085L;
            Class108_Sub22.sleep(5000L);
            this.method3188((byte)95);
         }
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if(this == anApplet_Sub1_2698) {
         if(!aBool2692) {
            aBool2688 = true;
            if(null != Class71.aString916) {
               if(Class71.aString916.startsWith("1.5")) {
                  if(Player.method3175(849846164) - -3473457553222264727L * aLong2697 > 1000L) {
                     Rectangle var2 = var1.getClipBounds();
                     if(var2 != null) {
                        if(var2.width < ProducingGraphicsBuffer.clientWidth * 1080367531) {
                           return;
                        }

                        if(var2.height < ProducingGraphicsBuffer.clientHeight * -2030626229) {
                           return;
                        }
                     }

                     aBool2693 = true;
                  }
               }
            }
         }
      }
   }

   public final void windowActivated(WindowEvent var1) {}

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeiconified(WindowEvent var1) {}

   public final void windowIconified(WindowEvent var1) {}

   public final void windowOpened(WindowEvent var1) {}

   protected abstract void method3196(byte var1);

   protected abstract void method3198(byte var1);

   protected abstract void method3201(int var1);

   protected abstract void method3210(int var1);

   public final void windowDeactivated(WindowEvent var1) {}

   public void run() {
      try {
         if(null != PingRequester.aString823) {
            String var1 = PingRequester.aString823.toLowerCase();
            if(var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = Class71.aString916;
               if(var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method3246("wrongjava", -1271013870);
                  return;
               }

               if(var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && UnderlayDefinition.method2282(var2.charAt(var3), 1285636105); ++var3) {
                     ;
                  }

                  String var4 = var2.substring(6, var3);
                  boolean var5 = false;
                  boolean var6 = false;
                  int var7 = 0;
                  int var8 = var4.length();
                  int var9 = 0;

                  boolean var11;
                  while(true) {
                     if(var9 >= var8) {
                        var11 = var6;
                        break;
                     }

                     label165: {
                        char var10 = var4.charAt(var9);
                        if(0 == var9) {
                           if(var10 == 45) {
                              var5 = true;
                              break label165;
                           }

                           if(43 == var10) {
                              break label165;
                           }
                        }

                        int var18;
                        if(var10 >= 48 && var10 <= 57) {
                           var18 = var10 - 48;
                        } else if(var10 >= 65 && var10 <= 90) {
                           var18 = var10 - 55;
                        } else {
                           if(var10 < 97 || var10 > 122) {
                              var11 = false;
                              break;
                           }

                           var18 = var10 - 87;
                        }

                        if(var18 >= 10) {
                           var11 = false;
                           break;
                        }

                        if(var5) {
                           var18 = -var18;
                        }

                        int var12 = var18 + var7 * 10;
                        if(var7 != var12 / 10) {
                           var11 = false;
                           break;
                        }

                        var7 = var12;
                        var6 = true;
                     }

                     ++var9;
                  }

                  if(var11 && VertexNormal.method692(var4, 1850671615) < 10) {
                     this.method3246("wrongjava", -1271013870);
                     return;
                  }
               }

               anInt2685 = -955028943;
            }
         }

         this.setFocusCycleRoot(true);
         this.method3185((byte)95);
         Class63.aClass13_830 = ItemDefinition.method2127(ProducingGraphicsBuffer.clientWidth * 1080367531, ProducingGraphicsBuffer.clientHeight * -2030626229, Class1.aCanvas3, 95766287);
         this.method3196((byte)2);

         Object var16;
         try {
            var16 = new NanoTimer();
         } catch (Throwable var14) {
            var16 = new Class53_Sub1();
         }

         Class36.aClass53_515 = (Timer)var16;

         while(0L == 3640810457273822997L * aLong2687 || Player.method3175(849846164) < 3640810457273822997L * aLong2687) {
            Class100.anInt1384 = Class36.aClass53_515.method714(anInt2690 * -2113736069, anInt2685 * -328177131, -665517638) * -244555733;

            for(int var17 = 0; var17 < Class100.anInt1384 * -969843069; ++var17) {
               this.method3224(760507799);
            }

            this.process((short)23545);
            Renderable.method2491(ClientScriptMap.pringRequester, Class1.aCanvas3, (short)-23977);
         }
      } catch (Exception var15) {
         World.method647((String)null, var15, 926745782);
         this.method3246("crash", -1271013870);
      }

      this.method3188((byte)20);
   }

   void method3224(int var1) {
      long var2 = Player.method3175(849846164);
      long var4 = aLongArray2694[Timer.anInt723 * -1099924813];
      aLongArray2694[Timer.anInt723 * -1099924813] = var2;
      Timer.anInt723 = (1 + Timer.anInt723 * -1099924813 & 31) * 669828219;
      if(0L != var4 && var2 > var4) {
         ;
      }

      synchronized(this) {
         LoginHandler.aBool844 = aBool2699;
      }

      this.method3210(353301511);
   }

   protected abstract void method3228(int var1);

   public void stop() {
      if(anApplet_Sub1_2698 == this) {
         if(!aBool2692) {
            aLong2687 = (Player.method3175(849846164) + 4000L) * 258775077807745085L;
         }
      }
   }

   protected void method3246(String var1, int var2) {
      if(!this.aBool2689) {
         this.aBool2689 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
            ;
         }
      }
   }

   public final void focusLost(FocusEvent var1) {
      aBool2699 = false;
   }

   public final void focusGained(FocusEvent var1) {
      aBool2699 = true;
      aBool2688 = true;
   }

   protected final boolean method3268(int var1) {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if(!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if(!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if(!var2.equals("mechscape.com") && !var2.endsWith(".mechscape.com")) {
               if(var2.endsWith("127.0.0.1")) {
                  return true;
               } else {
                  while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48 && var2.charAt(var2.length() - 1) <= 57) {
                     var2 = var2.substring(0, var2.length() - 1);
                  }

                  if(var2.endsWith("192.168.1.")) {
                     return true;
                  } else {
                     return true;
                  }
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public abstract void init();

   static final void method3281(int var0, int var1, byte var2) {
      int var3 = Class94.b12_full_font.getTextWidth(StringConstants.CHOOSE_OPTION);

      int var5;
      for(var5 = 0; var5 < Client.menuActionRow * 391839991; ++var5) {
         RSFont var4 = Class94.b12_full_font;
         String var6;
         if(Client.menuActionNames[var5].length() > 0) {
            var6 = Client.menuActionNamePrefix[var5] + StringConstants.aString1109 + Client.menuActionNames[var5];
         } else {
            var6 = Client.menuActionNamePrefix[var5];
         }

         int var7 = var4.getTextWidth(var6);
         if(var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var5 = Client.menuActionRow * 1582632569 + 21;
      int var8 = var0 - var3 / 2;
      if(var8 + var3 > 765) {
         var8 = 765 - var3;
      }

      if(var8 < 0) {
         var8 = 0;
      }

      int var9 = var1;
      if(var5 + var1 > 503) {
         var9 = 503 - var5;
      }

      if(var9 < 0) {
         var9 = 0;
      }

      Client.actionMenuOpen = true;
      Class51.actionMenuX = var8 * -1856507955;
      MouseInputHandler.actionMenuY = var9 * 1712577663;
      Class54.actionMenuWidth = var3 * 311400179;
      Item.actionMenuHeight = Client.menuActionRow * 1309415031 - 1473975926;
   }

   static void method3282(byte var0) {
      for(int var1 = 0; var1 < Client.menuActionRow * 391839991; ++var1) {
         int var3 = Client.menuActionIdentifiers[var1];
         boolean var4 = var3 == 57 || var3 == 58 || 1007 == var3 || var3 == 25 || 30 == var3;
         if(var4) {
            if(var1 < Client.menuActionRow * 391839991 - 1) {
               for(int var2 = var1; var2 < Client.menuActionRow * 391839991 - 1; ++var2) {
                  Client.menuActionNamePrefix[var2] = Client.menuActionNamePrefix[var2 + 1];
                  Client.menuActionNames[var2] = Client.menuActionNames[var2 + 1];
                  Client.menuActionIdentifiers[var2] = Client.menuActionIdentifiers[var2 + 1];
                  Client.menuActionParameters[var2] = Client.menuActionParameters[1 + var2];
                  Client.menuActionXInteractions[var2] = Client.menuActionXInteractions[1 + var2];
                  Client.menuActionYInteractions[var2] = Client.menuActionYInteractions[1 + var2];
               }
            }

            Client.menuActionRow += 1954561849;
         }
      }

   }

   static final int method3283(int var0, int var1, short var2) {
      int var3 = Projectile.method2988(var0 - 1, var1 - 1, (byte)45) + Projectile.method2988(var0 + 1, var1 - 1, (byte)89) + Projectile.method2988(var0 - 1, 1 + var1, (byte)53) + Projectile.method2988(1 + var0, 1 + var1, (byte)127);
      int var5 = Projectile.method2988(var0 - 1, var1, (byte)82) + Projectile.method2988(1 + var0, var1, (byte)74) + Projectile.method2988(var0, var1 - 1, (byte)122) + Projectile.method2988(var0, var1 + 1, (byte)48);
      int var4 = Projectile.method2988(var0, var1, (byte)38);
      return var5 / 8 + var3 / 16 + var4 / 4;
   }
}