
# Eagler Context Redacted Diff
# Copyright (c) 2024 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 7

> CHANGE  1 : 3  @  1 : 4

~ import java.io.InputStreamReader;
~ import java.io.OutputStreamWriter;

> DELETE  1  @  1 : 3

> INSERT  3 : 27  @  3

+ 
+ import net.lax1dude.eaglercraft.v1_8.sp.relay.RelayManager;
+ import net.lax1dude.eaglercraft.v1_8.voice.VoiceClientController;
+ 
+ import org.json.JSONArray;
+ 
+ import com.google.common.collect.ImmutableSet;
+ import com.google.common.collect.Lists;
+ import com.google.common.collect.Maps;
+ import com.google.common.collect.Sets;
+ 
+ import net.lax1dude.eaglercraft.v1_8.ArrayUtils;
+ import net.lax1dude.eaglercraft.v1_8.EagRuntime;
+ import net.lax1dude.eaglercraft.v1_8.EaglerInputStream;
+ import net.lax1dude.eaglercraft.v1_8.EaglerOutputStream;
+ import net.lax1dude.eaglercraft.v1_8.EaglerZLIB;
+ import net.lax1dude.eaglercraft.v1_8.HString;
+ import net.lax1dude.eaglercraft.v1_8.Keyboard;
+ import net.lax1dude.eaglercraft.v1_8.Mouse;
+ import net.lax1dude.eaglercraft.v1_8.internal.EnumPlatformType;
+ import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
+ import net.lax1dude.eaglercraft.v1_8.log4j.LogManager;
+ import net.lax1dude.eaglercraft.v1_8.log4j.Logger;
+ import net.lax1dude.eaglercraft.v1_8.opengl.ext.deferred.EaglerDeferredConfig;

> DELETE  5  @  5 : 7

> DELETE  5  @  5 : 11

> DELETE  3  @  3 : 8

> DELETE  1  @  1 : 9

> CHANGE  22 : 26  @  22 : 26

~ 	public int limitFramerate = 260;
~ 	public int clouds = 1;
~ 	public boolean fancyGraphics = false;
~ 	public int ambientOcclusion = 0;

> CHANGE  8 : 9  @  8 : 11

~ 	public boolean enableVsync = EagRuntime.getPlatformType() != EnumPlatformType.DESKTOP;

> CHANGE  5 : 6  @  5 : 6

~ 	private final Set<EnumPlayerModelParts> setModelParts = Sets.newHashSet(EnumPlayerModelParts._VALUES);

> DELETE  11  @  11 : 22

> CHANGE  8 : 9  @  8 : 9

~ 	public KeyBinding keyBindSprint = new KeyBinding("key.sprint", KeyboardConstants.KEY_R, "key.categories.movement");

> CHANGE  10 : 16  @  10 : 17

~ 	public KeyBinding keyBindSmoothCamera = new KeyBinding("key.smoothCamera", KeyboardConstants.KEY_M,
~ 			"key.categories.misc");
~ 	public KeyBinding keyBindZoomCamera = new KeyBinding("key.zoomCamera", KeyboardConstants.KEY_C,
~ 			"key.categories.misc");
~ 	public KeyBinding keyBindFunction = new KeyBinding("key.function", KeyboardConstants.KEY_F, "key.categories.misc");
~ 	public KeyBinding keyBindClose = new KeyBinding("key.close", KeyboardConstants.KEY_GRAVE, "key.categories.misc");

> DELETE  12  @  12 : 13

> INSERT  1 : 4  @  1

+ 	public boolean hasCreatedDemoWorld;
+ 	public int relayTimeout;
+ 	public boolean hideJoinCode;

> CHANGE  11 : 12  @  11 : 12

~ 	public int guiScale = 3;

> INSERT  3 : 18  @  3

+ 	public boolean hudFps = true;
+ 	public boolean hudCoords = true;
+ 	public boolean hudPlayer = false;
+ 	public boolean hudWorld = false;
+ 	public boolean hudStats = false;
+ 	public boolean hud24h = false;
+ 	public boolean chunkFix = true;
+ 	public boolean fog = true;
+ 	public int fxaa = 0;
+ 	public boolean shaders = false;
+ 	public boolean shadersAODisable = false;
+ 	public EaglerDeferredConfig deferredShaderConf = new EaglerDeferredConfig();
+ 	public boolean enableUpdateSvc = true;
+ 	public boolean enableFNAWSkins = true;
+ 	public boolean enableDynamicLights = false;

> CHANGE  1 : 7  @  1 : 2

~ 	public int voiceListenRadius = 16;
~ 	public float voiceListenVolume = 0.5f;
~ 	public float voiceSpeakVolume = 0.5f;
~ 	public int voicePTTKey = 47; // V
~ 
~ 	public GameSettings(Minecraft mcIn) {

> CHANGE  4 : 6  @  4 : 7

~ 				this.keyBindTogglePerspective, this.keyBindSmoothCamera, this.keyBindZoomCamera, this.keyBindFunction,
~ 				this.keyBindClose }, this.keyBindsHotbar);

> INSERT  1 : 3  @  1

+ 		this.relayTimeout = 4;
+ 		this.hideJoinCode = false;

> CHANGE  2 : 4  @  2 : 3

~ 		this.gammaSetting = 1.0F;
~ 		this.language = EagRuntime.getConfiguration().getDefaultLocale();

> CHANGE  2 : 3  @  2 : 8

~ 		GameSettings.Options.RENDER_DISTANCE.setValueMax(18.0F);

> CHANGE  1 : 2  @  1 : 2

~ 		this.renderDistanceChunks = 4;

> DELETE  3  @  3 : 18

> CHANGE  3 : 4  @  3 : 4

~ 						: HString.format("%c", new Object[] { Character.valueOf((char) (parInt1 - 256)) })

> DELETE  76  @  76 : 99

> INSERT  35 : 37  @  35

+ 			this.mc.loadingScreen.eaglerShow(I18n.format("resourcePack.load.refreshing"),
+ 					I18n.format("resourcePack.load.pleaseWait"));

> DELETE  18  @  18 : 38

> DELETE  20  @  20 : 37

> INSERT  13 : 67  @  13

+ 		if (parOptions == GameSettings.Options.HUD_FPS) {
+ 			this.hudFps = !this.hudFps;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_COORDS) {
+ 			this.hudCoords = !this.hudCoords;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_PLAYER) {
+ 			this.hudPlayer = !this.hudPlayer;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_STATS) {
+ 			this.hudStats = !this.hudStats;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_WORLD) {
+ 			this.hudWorld = !this.hudWorld;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.HUD_24H) {
+ 			this.hud24h = !this.hud24h;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.CHUNK_FIX) {
+ 			this.chunkFix = !this.chunkFix;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FOG) {
+ 			this.fog = !this.fog;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FXAA) {
+ 			this.fxaa = (this.fxaa + parInt1) % 3;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FULLSCREEN) {
+ 			this.mc.toggleFullscreen();
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.FNAW_SKINS) {
+ 			this.enableFNAWSkins = !this.enableFNAWSkins;
+ 			this.mc.getRenderManager().setEnableFNAWSkins(this.mc.getEnableFNAWSkins());
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.EAGLER_VSYNC) {
+ 			this.enableVsync = !this.enableVsync;
+ 		}
+ 
+ 		if (parOptions == GameSettings.Options.EAGLER_DYNAMIC_LIGHTS) {
+ 			this.enableDynamicLights = !this.enableDynamicLights;
+ 			this.mc.renderGlobal.loadRenderers();
+ 		}
+ 

> CHANGE  23 : 24  @  23 : 34

~ 																										: 0.0F)))))))))));

> DELETE  20  @  20 : 26

> DELETE  2  @  2 : 4

> INSERT  8 : 32  @  8

+ 		case HUD_COORDS:
+ 			return this.hudCoords;
+ 		case HUD_FPS:
+ 			return this.hudFps;
+ 		case HUD_PLAYER:
+ 			return this.hudPlayer;
+ 		case HUD_STATS:
+ 			return this.hudStats;
+ 		case HUD_WORLD:
+ 			return this.hudWorld;
+ 		case HUD_24H:
+ 			return this.hud24h;
+ 		case CHUNK_FIX:
+ 			return this.chunkFix;
+ 		case FOG:
+ 			return this.fog;
+ 		case FULLSCREEN:
+ 			return this.mc.isFullScreen();
+ 		case FNAW_SKINS:
+ 			return this.enableFNAWSkins;
+ 		case EAGLER_VSYNC:
+ 			return this.enableVsync;
+ 		case EAGLER_DYNAMIC_LIGHTS:
+ 			return this.enableDynamicLights;

> CHANGE  43 : 46  @  43 : 47

~ 																	: (parOptions == GameSettings.Options.CHAT_SCALE
~ 																			? s + (int) (f * 90.0F + 10.0F) + "%"
~ 																			: (parOptions == GameSettings.Options.CHAT_HEIGHT_UNFOCUSED

> CHANGE  3 : 4  @  3 : 4

~ 																					: (parOptions == GameSettings.Options.CHAT_HEIGHT_FOCUSED

> CHANGE  1 : 2  @  1 : 2

~ 																									.calculateChatboxHeight(

> CHANGE  2 : 21  @  2 : 36

~ 																							: (parOptions == GameSettings.Options.CHAT_WIDTH
~ 																									? s + GuiNewChat
~ 																											.calculateChatboxWidth(
~ 																													f)
~ 																											+ "px"
~ 																									: (parOptions == GameSettings.Options.RENDER_DISTANCE
~ 																											? s + (int) f1
~ 																													+ (f1 == 1.0F
~ 																															? " chunk"
~ 																															: " chunks")
~ 																											: (parOptions == GameSettings.Options.MIPMAP_LEVELS
~ 																													? (f == 0.0F
~ 																															? s + I18n
~ 																																	.format("options.off",
~ 																																			new Object[0])
~ 																															: s + (int) (f
~ 																																	* 100.0F)
~ 																																	+ "%")
~ 																													: "yee"))))))))))));

> DELETE  11  @  11 : 19

> INSERT  9 : 17  @  9

+ 		} else if (parOptions == GameSettings.Options.FXAA) {
+ 			if (this.fxaa == 0) {
+ 				return s + I18n.format("options.fxaa.auto");
+ 			} else if (this.fxaa == 1) {
+ 				return s + I18n.format("options.on");
+ 			} else {
+ 				return s + I18n.format("options.off");
+ 			}

> CHANGE  6 : 12  @  6 : 10

~ 		byte[] options = EagRuntime.getStorage("g");
~ 		if (options == null) {
~ 			return;
~ 		}
~ 		loadOptions(options);
~ 	}

> CHANGE  1 : 5  @  1 : 2

~ 	public void loadOptions(byte[] data) {
~ 		try {
~ 			BufferedReader bufferedreader = new BufferedReader(
~ 					new InputStreamReader(EaglerZLIB.newGZIPInputStream(new EaglerInputStream(data))));

> INSERT  58 : 70  @  58

+ 					if (astring[0].equals("hasCreatedDemoWorld")) {
+ 						this.hasCreatedDemoWorld = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("relayTimeout")) {
+ 						this.relayTimeout = Integer.parseInt(astring[1]);
+ 					}
+ 
+ 					if (astring[0].equals("hideJoinCode")) {
+ 						this.hideJoinCode = astring[1].equals("true");
+ 					}
+ 

> CHANGE  25 : 31  @  25 : 26

~ 						this.resourcePacks.clear();
~ 						for (Object o : (new JSONArray(s.substring(s.indexOf(58) + 1))).toList()) {
~ 							if (o instanceof String) {
~ 								this.resourcePacks.add((String) o);
~ 							}
~ 						}

> CHANGE  6 : 12  @  6 : 7

~ 						this.field_183018_l.clear();
~ 						for (Object o : (new JSONArray(s.substring(s.indexOf(58) + 1))).toList()) {
~ 							if (o instanceof String) {
~ 								this.field_183018_l.add((String) o);
~ 							}
~ 						}

> CHANGE  38 : 39  @  38 : 43

~ 					if (astring[0].equals("enableVsyncEag")) {

> DELETE  3  @  3 : 7

> CHANGE  52 : 54  @  52 : 54

~ 					if (astring[0].equals("forceUnicodeFont")) {
~ 						this.forceUnicodeFont = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("allowBlockAlternatives")) {
~ 						this.allowBlockAlternatives = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("reducedDebugInfo")) {
~ 						this.reducedDebugInfo = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("useNativeTransport")) {
~ 						this.field_181150_U = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("entityShadows")) {
~ 						this.field_181151_V = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hudFps")) {
~ 						this.hudFps = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hudWorld")) {
~ 						this.hudWorld = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hudCoords")) {
~ 						this.hudCoords = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hudPlayer")) {
~ 						this.hudPlayer = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hudStats")) {
~ 						this.hudStats = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("hud24h")) {
~ 						this.hud24h = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("chunkFix")) {
~ 						this.chunkFix = astring[1].equals("true");

> CHANGE  2 : 4  @  2 : 4

~ 					if (astring[0].equals("fog")) {
~ 						this.fog = astring[1].equals("true");

> CHANGE  2 : 5  @  2 : 4

~ 					if (astring[0].equals("fxaa")) {
~ 						this.fxaa = (astring[1].equals("true") || astring[1].equals("false")) ? 0
~ 								: Integer.parseInt(astring[1]);

> DELETE  2  @  2 : 10

> CHANGE  6 : 31  @  6 : 7

~ 					if (astring[0].equals("shaders")) {
~ 						this.shaders = astring[1].equals("true");
~ 					}
~ 
~ 					if (astring[0].equals("enableUpdateSvc")) {
~ 						this.enableUpdateSvc = astring[1].equals("true");
~ 					}
~ 
~ 					if (astring[0].equals("voiceListenRadius")) {
~ 						voiceListenRadius = Integer.parseInt(astring[1]);
~ 					}
~ 
~ 					if (astring[0].equals("voiceListenVolume")) {
~ 						voiceListenVolume = this.parseFloat(astring[1]);
~ 					}
~ 
~ 					if (astring[0].equals("voiceSpeakVolume")) {
~ 						voiceSpeakVolume = this.parseFloat(astring[1]);
~ 					}
~ 
~ 					if (astring[0].equals("voicePTTKey")) {
~ 						voicePTTKey = Integer.parseInt(astring[1]);
~ 					}
~ 
~ 					for (SoundCategory soundcategory : SoundCategory._VALUES) {

> CHANGE  5 : 6  @  5 : 6

~ 					for (EnumPlayerModelParts enumplayermodelparts : EnumPlayerModelParts._VALUES) {

> INSERT  4 : 14  @  4

+ 
+ 					if (astring[0].equals("enableFNAWSkins")) {
+ 						this.enableFNAWSkins = astring[1].equals("true");
+ 					}
+ 
+ 					if (astring[0].equals("enableDynamicLights")) {
+ 						this.enableDynamicLights = astring[1].equals("true");
+ 					}
+ 
+ 					deferredShaderConf.readOption(astring[0], astring[1]);

> CHANGE  6 : 13  @  6 : 7

~ 
~ 			Keyboard.setFunctionKeyModifier(keyBindFunction.getKeyCode());
~ 			VoiceClientController.setVoiceListenVolume(voiceListenVolume);
~ 			VoiceClientController.setVoiceSpeakVolume(voiceSpeakVolume);
~ 			VoiceClientController.setVoiceProximity(voiceListenRadius);
~ 			if (this.mc.getRenderManager() != null)
~ 				this.mc.getRenderManager().setEnableFNAWSkins(this.enableFNAWSkins);

> CHANGE  1 : 3  @  1 : 2

~ 			logger.error("Failed to load options");
~ 			logger.error(exception);

> INSERT  9 : 18  @  9

+ 		byte[] data = writeOptions();
+ 		if (data != null) {
+ 			EagRuntime.setStorage("g", data);
+ 		}
+ 		RelayManager.relayManager.save();
+ 		this.sendSettingsToServer();
+ 	}
+ 
+ 	public byte[] writeOptions() {

> CHANGE  1 : 3  @  1 : 2

~ 			EaglerOutputStream bao = new EaglerOutputStream();
~ 			PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(EaglerZLIB.newGZIPOutputStream(bao)));

> INSERT  13 : 16  @  13

+ 			printwriter.println("hasCreatedDemoWorld:" + this.hasCreatedDemoWorld);
+ 			printwriter.println("relayTimeout:" + this.relayTimeout);
+ 			printwriter.println("hideJoinCode:" + this.hideJoinCode);

> CHANGE  13 : 15  @  13 : 15

~ 			printwriter.println("resourcePacks:" + toJSONArray(this.resourcePacks));
~ 			printwriter.println("incompatibleResourcePacks:" + toJSONArray(this.field_183018_l));

> CHANGE  8 : 9  @  8 : 11

~ 			printwriter.println("enableVsyncEag:" + this.enableVsync);

> DELETE  13  @  13 : 24

> INSERT  5 : 22  @  5

+ 			printwriter.println("hudFps:" + this.hudFps);
+ 			printwriter.println("hudWorld:" + this.hudWorld);
+ 			printwriter.println("hudCoords:" + this.hudCoords);
+ 			printwriter.println("hudPlayer:" + this.hudPlayer);
+ 			printwriter.println("hudStats:" + this.hudStats);
+ 			printwriter.println("hud24h:" + this.hud24h);
+ 			printwriter.println("chunkFix:" + this.chunkFix);
+ 			printwriter.println("fog:" + this.fog);
+ 			printwriter.println("fxaa:" + this.fxaa);
+ 			printwriter.println("shaders:" + this.shaders);
+ 			printwriter.println("enableUpdateSvc:" + this.enableUpdateSvc);
+ 			printwriter.println("voiceListenRadius:" + this.voiceListenRadius);
+ 			printwriter.println("voiceListenVolume:" + this.voiceListenVolume);
+ 			printwriter.println("voiceSpeakVolume:" + this.voiceSpeakVolume);
+ 			printwriter.println("voicePTTKey:" + this.voicePTTKey);
+ 			printwriter.println("enableFNAWSkins:" + this.enableFNAWSkins);
+ 			printwriter.println("enableDynamicLights:" + this.enableDynamicLights);

> CHANGE  5 : 8  @  5 : 6

~ 			Keyboard.setFunctionKeyModifier(keyBindFunction.getKeyCode());
~ 
~ 			for (SoundCategory soundcategory : SoundCategory._VALUES) {

> CHANGE  4 : 5  @  4 : 5

~ 			for (EnumPlayerModelParts enumplayermodelparts : EnumPlayerModelParts._VALUES) {

> INSERT  4 : 6  @  4

+ 			deferredShaderConf.writeOptions(printwriter);
+ 

> INSERT  1 : 2  @  1

+ 			return bao.toByteArray();

> CHANGE  1 : 4  @  1 : 2

~ 			logger.error("Failed to save options");
~ 			logger.error(exception);
~ 			return null;

> DELETE  2  @  2 : 3

> CHANGE  5 : 6  @  5 : 6

~ 				: (parSoundCategory == SoundCategory.VOICE ? 0.0F : 1.0F);

> CHANGE  16 : 17  @  16 : 17

~ 					Math.max(this.renderDistanceChunks, 2), this.chatVisibility, this.chatColours, i));

> INSERT  36 : 44  @  36

+ 	private String toJSONArray(List<String> e) {
+ 		JSONArray arr = new JSONArray();
+ 		for (String s : e) {
+ 			arr.put(s);
+ 		}
+ 		return arr.toString();
+ 	}
+ 

> CHANGE  4 : 5  @  4 : 5

~ 		RENDER_DISTANCE("options.renderDistance", true, false, 1.0F, 18.0F, 1.0F),

> CHANGE  8 : 10  @  8 : 12

~ 		TOUCHSCREEN("options.touchscreen", false, true), CHAT_SCALE("options.chat.scale", true, false),
~ 		CHAT_WIDTH("options.chat.width", true, false), CHAT_HEIGHT_FOCUSED("options.chat.height.focused", true, false),

> CHANGE  14 : 22  @  14 : 15

~ 		ENTITY_SHADOWS("options.entityShadows", false, true), HUD_FPS("options.hud.fps", false, true),
~ 		HUD_COORDS("options.hud.coords", false, true), HUD_STATS("options.hud.stats", false, true),
~ 		HUD_WORLD("options.hud.world", false, true), HUD_PLAYER("options.hud.player", false, true),
~ 		HUD_24H("options.hud.24h", false, true), CHUNK_FIX("options.chunkFix", false, true),
~ 		FOG("options.fog", false, true), FXAA("options.fxaa", false, false),
~ 		FULLSCREEN("options.fullscreen", false, true),
~ 		FNAW_SKINS("options.skinCustomisation.enableFNAWSkins", false, true),
~ 		EAGLER_VSYNC("options.vsync", false, true), EAGLER_DYNAMIC_LIGHTS("options.dynamicLights", false, true);

> EOF
