import java.net.URL;

public final class Player extends Entity {

	int pkicon = 1024554621;
	int anInt2664;
	int anInt2665 = 0;
	int prayicon = 2079409549;
	int playerTeamID = 0;
	int skillLevel = 0;
	int anInt2669;
	int anInt2670 = 0;
	EquipmentKit bodyEquipmentKit;
	int anInt2672;
	int anInt2673;
	int anInt2674;
	ModelRasterizer aClass108_Sub20_Sub14_Sub3_2675;
	String playerName;
	int anInt2677;
	int anInt2678;
	int anInt2679;
	boolean aBool2680 = false;
	int combatLevel = 0;
	boolean aBool2682 = false;
	static final int anInt2683 = 512;
	public static final int anInt2684 = 213;


	final void decodeAppearance(RSByteBuffer buffer) {
		buffer.position = 0;
		int gender = buffer.readUByte();
		this.pkicon = buffer.readByte() * -1024554621;
		this.prayicon = buffer.readByte() * -2079409549;
		int var4 = -1;
		this.playerTeamID = 0;
		int[] equips = new int[12];

		int index;
		int value;
		for (int slot = 0; slot < 12; ++slot) {
			index = buffer.readUByte();
			if (0 == index) {
				equips[slot] = 0;
			} else {
				value = buffer.readUByte();
				equips[slot] = (index << 8) + value;
				if (0 == slot && equips[0] == '\uffff') {
					var4 = buffer.readUShort(1591682478);
					break;
				}

				if (equips[slot] >= 512) {
					int team = AnimationDefinition.getItemDefinition(equips[slot] - 512, -437621212).team * 989158985;
					if (team != 0) {
						this.playerTeamID = team * 2145998287;
					}
				}
			}
		}

		int[] colors = new int[5];

		for (index = 0; index < 5; ++index) {
			value = buffer.readUByte();
			if (value < 0 || value >= EquipmentKit.aShortArrayArray1338[index].length) {
				value = 0;
			}

			colors[index] = value;
		}

		int a;
		this.standAnimationID = (a=buffer.readUShort(551750758)) * 1915601577;
		if (this.standAnimationID * -532414055 == '\uffff') {
			this.standAnimationID = -1915601577;
		}
		System.out.println("Anim1: " + a);

		this.nextAnimationID = (a=buffer.readUShort(-914742090)) * 1771909735;
		if ('\uffff' == this.nextAnimationID * 1113049431) {
			this.nextAnimationID = -1771909735;
		}
		System.out.println("Anim2: " + (a));

		this.walkAnimationID = this.nextAnimationID * 858874001;
		this.anInt2357 = (a=buffer.readUShort(1492975448)) * 645107359;
		if (this.anInt2357 * 1461718367 == '\uffff') {
			this.anInt2357 = -645107359;
		}
		System.out.println("Anim3: " + a);

		this.turn180AnimationID = (a=buffer.readUShort(-442040505)) * -1371640443;
		if ('\uffff' == this.turn180AnimationID * 953582413) {
			this.turn180AnimationID = 1371640443;
		}
		System.out.println("Anim4: " + a);

		this.turn90RightAnimationID = (a=buffer.readUShort(1572878172)) * -514284795;
		if ('\uffff' == this.turn90RightAnimationID * -2059161139) {
			this.turn90RightAnimationID = 514284795;
		}
		System.out.println("Anim5: " + a);

		this.turn90LeftAnimationID = (a=buffer.readUShort(-1792950317)) * -1417997611;
		if ('\uffff' == this.turn90LeftAnimationID * 568563325) {
			this.turn90LeftAnimationID = 1417997611;
		}
		System.out.println("Anim6: " + a);

		this.runAnimationID = (a=buffer.readUShort(-1023182423)) * -479130233;
		if (this.runAnimationID * -790681545 == '\uffff') {
			this.runAnimationID = 479130233;
		}
		System.out.println("Anim7: " + a);

		this.playerName = buffer.getString_2((byte) 8);
		if (Class108_Sub10.myPlayer == this) {
			RuntimeException_Sub1.aString2626 = this.playerName;
		}

		this.combatLevel = buffer.readUByte() * -588957807;
		this.skillLevel = buffer.readUShort(-1212976341) * -1134855835;
		this.aBool2682 = buffer.readUByte() == 1;

		/*
		Anim1: 809
		Anim2: 809
		Anim3: 809
		Anim4: 809
		Anim5: 809
		Anim6: 809
		Last: false, 70, 0
		 */
		System.out.println("Last: " + aBool2682 + ", " + (combatLevel * -1769445007) + ", " + (-1817505683 * skillLevel));

		if (0 == Client.anInt2708 * -759629273 && Client.rights * 171939335 >= 2) {
			this.aBool2682 = false;
		}

		if (null == this.bodyEquipmentKit) {
			this.bodyEquipmentKit = new EquipmentKit();
		}

		this.bodyEquipmentKit.initialize(equips, colors, 1 == gender, var4, -1809930983);
	}

	final boolean method2731(int var1) {
		return this.bodyEquipmentKit != null;
	}

	static final void removeFriend(String toRemove, int var1) {
		if (toRemove != null) {
			String decodedToRemove = Class108_Sub10.method1683(toRemove, UnderlayDefinition.aClass116_2142, -1914708884);
			if (null != decodedToRemove) {
				for (int friendIndex = 0; friendIndex < Client.friendListCount * -163737695; ++friendIndex) {
					Friend friend = Client.friendList[friendIndex];
					String username = friend.username;
					String var6 = Class108_Sub10.method1683(username, UnderlayDefinition.aClass116_2142, -1984290654);
					boolean containsFriend;
					if (null != toRemove && username != null) {
						if (!toRemove.startsWith("#") && !username.startsWith("#")) {
							containsFriend = decodedToRemove.equals(var6);
						} else {
							containsFriend = toRemove.equals(username);
						}
					} else {
						containsFriend = false;
					}

					if (containsFriend) {
						Client.friendListCount -= 1056183393;

						for (int shiftIndex = friendIndex; shiftIndex < Client.friendListCount * -163737695; ++shiftIndex) {
							Client.friendList[shiftIndex] = Client.friendList[shiftIndex + 1];
						}

						Client.anInt2897 = Client.anInt2731 * 1946037095;
						Client.secureBuffer.writePacket(39);
						Client.secureBuffer.writeByte(Class108_Sub20_Sub3.method2069(toRemove, (byte) 64));
						Client.secureBuffer.writeString(toRemove);
						return;
					}
				}

			}
		}
	}

	public static synchronized long method3175(int var0) {
		long var1 = System.currentTimeMillis();
		if (var1 < -3666040911483064549L * Class27.aLong361) {
			Class27.aLong359 += (-3666040911483064549L * Class27.aLong361 - var1) * 3120880967327051097L;
		}

		Class27.aLong361 = 8990033128397214483L * var1;
		return 1395227801606490857L * Class27.aLong359 + var1;
	}

	protected final ModelRasterizer getModelRasterizer(byte var1) {
		if (null == this.bodyEquipmentKit) {
			return null;
		} else {
			AnimationDefinition var2 = this.anInt2368 * 1647325343 != -1 && 0 == this.anInt2371 * 843883743 ? CullingCluster.method672(this.anInt2368 * 1647325343, 1639954209) : null;
			AnimationDefinition var4 = this.anInt2365 * 1103885695 != -1 && !this.aBool2680 && (this.anInt2365 * 1103885695 != this.standAnimationID * -532414055 || null == var2) ? CullingCluster.method672(this.anInt2365 * 1103885695, 1617260319) : null;
			ModelRasterizer rasterizer = this.bodyEquipmentKit.getModelRasterizer(var2, this.anInt2341 * -2111206063, var4, this.anInt2366 * -65543943, 677402337);
			if (null == rasterizer) {
				return null;
			} else {
				rasterizer.method2855();
				this.anInt2386 = rasterizer.modelHeight * 1878279385;
				ModelRasterizer completeRasterizer;
				ModelRasterizer[] rasterizerPieces;
				if (!this.aBool2680 && -1 != this.anInt2373 * 1305815823 && -1 != this.anInt2374 * -766701345) {
					completeRasterizer = Class2.getSpotAnimForID(this.anInt2373 * 1305815823, (byte) 0).getModelRasterizer(this.anInt2374 * -766701345, -380943559);
					if (null != completeRasterizer) {
						completeRasterizer.method2865(0, -(this.anInt2388 * 833972513), 0);
						rasterizerPieces = new ModelRasterizer[]{rasterizer, completeRasterizer};
						rasterizer = new ModelRasterizer(rasterizerPieces, 2);
					}
				}

				if (!this.aBool2680 && this.aClass108_Sub20_Sub14_Sub3_2675 != null) {
					if (Client.cycle * -637317861 >= this.anInt2670 * -1285705355) {
						this.aClass108_Sub20_Sub14_Sub3_2675 = null;
					}

					if (Client.cycle * -637317861 >= this.anInt2665 * 1616333119 && Client.cycle * -637317861 < this.anInt2670 * -1285705355) {
						completeRasterizer = this.aClass108_Sub20_Sub14_Sub3_2675;
						completeRasterizer.method2865(this.anInt2672 * 1644839921 - this.anInt2394 * 171470795, this.anInt2673 * 231705267 - this.anInt2669 * -1445368915, this.anInt2674 * 1435365123 - this.anInt2339 * 826764905);
						if (this.anInt2354 * -2014004437 == 512) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (1024 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (this.anInt2354 * -2014004437 == 1536) {
							completeRasterizer.rotate90();
						}

						rasterizerPieces = new ModelRasterizer[]{rasterizer, completeRasterizer};
						rasterizer = new ModelRasterizer(rasterizerPieces, 2);
						if (512 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
						} else if (this.anInt2354 * -2014004437 == 1024) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						} else if (1536 == this.anInt2354 * -2014004437) {
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
							completeRasterizer.rotate90();
						}

						completeRasterizer.method2865(this.anInt2394 * 171470795 - this.anInt2672 * 1644839921, this.anInt2669 * -1445368915 - this.anInt2673 * 231705267, this.anInt2339 * 826764905 - this.anInt2674 * 1435365123);
					}
				}

				rasterizer.aBool2457 = true;
				return rasterizer;
			}
		}
	}

	static final String method3177(int var0, byte var1) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + Class47.COMMA_LITERAL + var2.substring(var3);
		}

		return var2.length() > 9 ? " " + HuffmanEncoding.method690('\uff80', -2142918227) + var2.substring(0, var2.length() - 8) + StringConstants.aString1097 + " " + Class47.OPEN_PAREN + var2 + Class47.CLOSE_PAREN + Class47.COL_END : (var2.length() > 6 ? " " + HuffmanEncoding.method690(16777215, -818471386) + var2.substring(0, var2.length() - 4) + StringConstants.K + " " + Class47.OPEN_PAREN + var2 + Class47.CLOSE_PAREN + Class47.COL_END : " " + HuffmanEncoding.method690(16776960, -1154832985) + var2 + Class47.COL_END);
	}

	static CacheIndex method3178(int index, boolean var1, boolean var2, boolean var3, int var4) {
		IndexTable var5 = null;
		if (CacheConstants.cacheDataFile != null) { 
			var5 = new IndexTable(index, CacheConstants.cacheDataFile, CacheConstants.indexFileArray[index], 1000000);
		}

		return new CacheIndex(var5, Class36.cache255Index, index, var1, var2, var3);
	}

	public static void method3179(AbstractIndex var0, AbstractIndex var1, boolean var2, int var3) {
		ObjectDefinition.aClass74_2066 = var0;
		ObjectDefinition.aClass74_2067 = var1;
		ObjectDefinition.aBool2086 = var2;
	}

	static void method3180(int var0) {
		try {
			if (null == Class77.aClass43_1203) {
				Class77.aClass43_1203 = new Class43(ClientScriptMap.pringRequester, new URL(IsaacRandomGen.aString740));
			} else {
				byte[] var1 = Class77.aClass43_1203.method650((byte) 36);
				if (var1 != null) {
					RSByteBuffer var2 = new RSByteBuffer(var1);
					Class4.worldCount = var2.readUShort(267012221) * 2085782655;
					Class4.worldList = new World[Class4.worldCount * 301546367];

					for (int worldID = 0; worldID < Class4.worldCount * 301546367; ++worldID) {
						World world = Class4.worldList[worldID] = new World();
						world.anInt569 = var2.readUShort(1576580328) * -762909535;
						world.anInt558 = var2.readInt() * 694562061;
						world.aString561 = var2.getString_2((byte) 8);
						world.tooltip = var2.getString_2((byte) 8);
						world.flagID = var2.readUByte() * -2004985039;
						world.playerCount = var2.method1721(-76800636) * -1651508469;
						world.worldID = worldID * 643700009;
					}

					Ignore.method398(Class4.worldList, 0, Class4.worldList.length - 1, Class4.anIntArray56, Class4.anIntArray63, 2141773328);
					Class4.worldListOpen = true;
					Class77.aClass43_1203 = null;
				}
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Class77.aClass43_1203 = null;
		}
	}

	static int method3181(int var0, byte var1) {
		ChatMessage var2 = (ChatMessage) Class26.aClass95_348.method1202((long) var0);
		return var2 == null ? -1 : (Class26.aClass97_349.aClass108_Sub20_1374 == var2.previousNode ? -1 : ((ChatMessage) var2.previousNode).anInt1944 * -1818271001);
	}

	public static boolean method3182(int var0) {
		return Class91.anInt1325 * 485824819 != 0 ? true : Class32.aClass108_Sub4_Sub3_464.method2611(-141174129);
	}

}