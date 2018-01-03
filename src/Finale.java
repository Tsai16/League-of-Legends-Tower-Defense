/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.Shape;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.MouseMotionListener;
/*      */ import java.awt.geom.AffineTransform;
/*      */ import java.awt.geom.Rectangle2D;
/*      */ import java.awt.geom.Rectangle2D.Double;
/*      */ import java.awt.geom.RoundRectangle2D;
/*      */ import java.awt.geom.RoundRectangle2D.Float;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.PrintStream;
/*      */ import java.util.ArrayList;
/*      */ 
/*      */ public class Finale extends GameDriver
/*      */   implements MouseMotionListener
/*      */ {
/*      */   private Champ brian;
/*      */   private Mushroom ugh;
/*      */   private SoundDriver sounds;
/*      */   private Mushroom testm;
/*      */   private Mushroom mush;
/*      */   private Mushroom pointer;
/*      */   private ArrayList<Mushroom> mushy;
/*      */   private ArrayList<TowerFire> ammo;
/*      */   private ArrayList<buildings> Tower;
/*      */   private ArrayList<RoundRectangle2D> range1;
/*      */   private ArrayList<RoundRectangle2D> range2;
/*      */   private ArrayList<RoundRectangle2D> range3;
/*      */   private ArrayList<RoundRectangle2D> range;
/*      */   private ArrayList<buildings> nami;
/*      */   private ArrayList<buildings> nunu;
/*      */   private ArrayList<buildings> garen;
/*      */   private ArrayList<Mininons> kkl;
/*      */   private ArrayList<Mininons> kkll;
/*      */   private Rectangle buyNunu;
/*      */   private Rectangle buyNami;
/*      */   private Rectangle buyGaren;
/*      */   private int lives;
/*      */   private Rectangle censor;
/*      */   private Rectangle bg;
/*      */   private Rectangle boom;
/*      */   private Rectangle box;
/*      */   private Rectangle space;
/*      */   private Rectangle cant1;
/*      */   private Rectangle cant2;
/*      */   private Rectangle cant3;
/*      */   private Rectangle cant4;
/*      */   private Rectangle cant5;
/*      */   private Rectangle cant6;
/*      */   private Rectangle cant7;
/*      */   private Rectangle cant8;
/*      */   private Rectangle cant9;
/*      */   private Rectangle nexus;
/*      */   private Rectangle Start;
/*      */   private Rectangle canc;
/*      */   private Rectangle laun;
/*      */   private Rectangle wut;
/*      */   private Rectangle cont;
/*      */   private Rectangle htp;
/*      */   private Rectangle nt;
/*      */   private Rectangle a1;
/*      */   private Rectangle faket;
/*      */   private Rectangle fakena;
/*      */   private Rectangle fakenu;
/*      */   private Rectangle fakeg;
/*      */   private Rectangle sg;
/*      */   private Rectangle morecon;
/*      */   private Rectangle res;
/*      */   private Rectangle ncensor;
/*      */   private Rectangle rese;
/*      */   private GameObject tfake;
/*      */   private GameObject nafake;
/*      */   private GameObject nufake;
/*      */   private GameObject wafake;
/*      */   private boolean dia;
/*      */   private boolean dead;
/*      */   private boolean l1;
/*      */   private boolean l2;
/*      */   private boolean l3;
/*      */   private boolean l4;
/*      */   private boolean l5;
/*      */   private boolean l6;
/*      */   private boolean l7;
/*      */   private boolean l8;
/*      */   private boolean l9;
/*      */   private boolean l10;
/*      */   private boolean l11;
/*      */   private boolean playing;
/*      */   private boolean poop;
/*      */   private boolean leftClick;
/*      */   private boolean sol;
/*      */   private boolean go;
/*      */   private boolean go1;
/*      */   private boolean go2;
/*      */   private boolean go3;
/*      */   private boolean yoyo;
/*      */   private boolean fakespin;
/*      */   private boolean wood5;
/*      */   private boolean show;
/*      */   private int brix;
/*      */   private int briy;
/*      */   private Point pointy;
/*      */   private int movex;
/*      */   private int movey;
/*      */   private boolean explosion;
/*      */   private boolean buying1;
/*      */   private boolean buying2;
/*      */   private boolean buying3;
/*      */   private boolean buying4;
/*      */   private boolean buying5;
/*      */   private ArrayList<Mininons> cs;
/*      */   private ArrayList<Mininons> cs1;
/*      */   private ArrayList<Mininons> cs2;
/*      */   private int csTimer;
/*      */   private int csDelay;
/*      */   private int cs1Delay;
/*      */   private int cs1Timer;
/*      */   private int cs2Delay;
/*      */   private int cs2Timer;
/*      */   private int cs3Delay;
/*      */   private int cs3Timer;
/*      */   private int cs4Delay;
/*      */   private int cs4Timer;
/*      */   private int cs5Delay;
/*      */   private int cs5Timer;
/*      */   private int cs6Delay;
/*      */   private int cs6Timer;
/*      */   private int cs7Delay;
/*      */   private int cs7Timer;
/*      */   private int cs8Delay;
/*      */   private int cs8Timer;
/*      */   private int cs9Delay;
/*      */   private int cs9Timer;
/*      */   private int cs10Delay;
/*      */   private int cs10Timer;
/*      */   private int ammoTimer;
/*      */   private int ammoDelay;
/*      */   private int gold;
/*      */   private int ouch;
/*      */   private int imageIndex;
/*      */   private int gg;
/*      */   private int yy;
/*      */   private int lev;
/*      */   private int Timer;
/*      */   private int de;
/*      */   private int count;
/*      */   private int count1;
/*      */   private int count2;
/*      */   private int count3;
/*      */   private int count4;
/*      */   private int count5;
/*      */   private int count6;
/*      */   private int count7;
/*      */   private int count8;
/*      */   private int count9;
/*      */   private int count10;
/*      */   private int fs;
/*      */   private int ft;
/*      */   private int fna;
/*      */   private int fnu;
/*      */   private int csd;
/*      */   private boolean mousemoved;
/*      */   private BufferedImage map1;
/*      */   private BufferedImage hero;
/*      */   private BufferedImage Tow;
/*      */   private BufferedImage right;
/*      */   private BufferedImage back;
/*      */   private BufferedImage fish;
/*      */   private BufferedImage wave;
/*      */   private BufferedImage water;
/*      */   private BufferedImage prup;
/*      */   private BufferedImage yeti;
/*      */   private BufferedImage flake;
/*      */   private BufferedImage snow;
/*      */   private BufferedImage slashu;
/*      */   private BufferedImage slashd;
/*      */   private BufferedImage slashr;
/*      */   private BufferedImage slashl;
/*      */   private BufferedImage slash;
/*      */   private BufferedImage shadow;
/*      */   private BufferedImage spinn;
/*      */   private BufferedImage dem;
/*      */   private BufferedImage slashm;
/*      */   private BufferedImage yell;
/*      */   private BufferedImage rank1;
/*      */   private BufferedImage newMin;
/*      */   private BufferedImage mewMin;
/*      */   private BufferedImage supermin;
/*      */   private BufferedImage smin;
/*      */   private BufferedImage poro;
/*      */   private BufferedImage loading;
/*      */   private BufferedImage launch;
/*      */   private BufferedImage champs;
/*      */   private BufferedImage conte;
/*      */   private BufferedImage coin;
/*      */   private BufferedImage shop;
/*      */   private BufferedImage garencard;
/*      */   private BufferedImage upgrade;
/*      */   private BufferedImage sell;
/*      */   private BufferedImage exit;
/*      */   private BufferedImage nunucard;
/*      */   private BufferedImage namicard;
/*      */   private BufferedImage turretcard;
/*      */   private BufferedImage dota;
/*      */   private BufferedImage nex;
/*      */   private BufferedImage pl;
/*      */   private BufferedImage c1;
/*      */   private BufferedImage red;
/*      */   private BufferedImage korea;
/*      */   private BufferedImage mouse;
/*      */   private BufferedImage example;
/*      */   private BufferedImage sgame;
/*      */   private BufferedImage defeat;
/*      */   private BufferedImage wood;
/*      */   private BufferedImage rest;
/*      */   private BufferedImage vic;
/*      */   private BufferedImage dia1;
/*      */   private BufferedImage diaga;
/*      */   private BufferedImage rigs;
/*      */   private BufferedImage ups;
/*      */   private BufferedImage ice;
/*      */   private BufferedImage dust;
/*  203 */   private BufferedImage[] images = new BufferedImage[15];
/*  204 */   private BufferedImage[] imagesr = new BufferedImage[3];
/*  205 */   private BufferedImage[] imagesu = new BufferedImage[3];
/*  206 */   private BufferedImage[] imagesd = new BufferedImage[3];
/*      */   private int kkk;
/*      */   private ArrayList<Mininons> kkkk;
/*      */ 
/*      */   public Finale()
/*      */   {
/*  211 */     reset();
/*      */   }
/*      */   public void reset() {
/*  214 */     addMouseListener(new MouseAdapter() {
/*      */       public void mousePressed(MouseEvent e) {
/*  216 */         Finale.this.brix = e.getX();
/*  217 */         Finale.this.briy = e.getY();
/*  218 */         Finale.this.leftClick = true;
/*      */       }
/*      */     });
/*  223 */     addMouseMotionListener(this);
/*  224 */     this.brian = new Champ();
/*  225 */     String[] locs = { "[PBE_-_01-17-14_-_Updated_39_Welcome_To_Summoner_3.wav", "New_Summoner_39_s_Rift_Login_Screen_with_Music_-_L.wav" };
/*  226 */     this.sounds = new SoundDriver(locs);
/*  227 */     this.sounds.loop(1);
/*      */ 
/*  229 */     this.lives = 10;
/*  230 */     this.Tower = new ArrayList();
/*      */ 
/*  232 */     this.range = new ArrayList();
/*  233 */     this.mushy = new ArrayList();
/*  234 */     this.nunu = new ArrayList();
/*  235 */     this.garen = new ArrayList();
/*  236 */     this.nami = new ArrayList();
/*  237 */     this.ammo = new ArrayList();
/*  238 */     this.bg = new Rectangle(700, 0, 300, 800);
/*  239 */     this.space = new Rectangle(0, 0, 700, 700);
/*  240 */     this.cant1 = new Rectangle(0, 620, 700, 50);
/*  241 */     this.cant2 = new Rectangle(0, 0, 90, 700);
/*  242 */     this.cant3 = new Rectangle(0, 0, 700, 90);
/*  243 */     this.cant4 = new Rectangle(610, 0, 90, 700);
/*  244 */     this.cant5 = new Rectangle(0, 0, 0, 0);
/*  245 */     this.cant6 = new Rectangle(0, 0, 0, 0);
/*  246 */     this.cant7 = new Rectangle(0, 0, 130, 130);
/*  247 */     this.cant8 = new Rectangle(570, 570, 130, 130);
/*  248 */     this.nexus = new Rectangle(610, 40, 50, 50);
/*  249 */     this.boom = new Rectangle(100, 100, 160, 160);
/*  250 */     this.box = new Rectangle(740, 80, 60, 60);
/*  251 */     this.laun = new Rectangle(450, 70, 100, 35);
/*  252 */     this.buyNami = new Rectangle(850, 80, 60, 60);
/*  253 */     this.buyNunu = new Rectangle(740, 200, 60, 60);
/*  254 */     this.buyGaren = new Rectangle(850, 200, 60, 60);
/*  255 */     this.wut = new Rectangle(325, 213, 350, 175);
/*  256 */     this.cont = new Rectangle(550, 340, 80, 30);
/*  257 */     this.htp = new Rectangle(0, 0, 1000, 700);
/*  258 */     this.nt = new Rectangle(510, 200, 40, 40);
/*  259 */     this.a1 = new Rectangle(850, 25, 80, 30);
/*  260 */     this.faket = new Rectangle(336, 200, 40, 40);
/*  261 */     this.fakena = new Rectangle(666, 200, 40, 40);
/*  262 */     this.fakenu = new Rectangle(333, 500, 40, 40);
/*  263 */     this.fakeg = new Rectangle(666, 500, 40, 40);
/*  264 */     this.sg = new Rectangle(420, 590, 170, 100);
/*  265 */     this.morecon = new Rectangle(430, 510, 80, 30);
/*  266 */     this.censor = new Rectangle(390, 300, 370, 170);
/*  267 */     this.res = new Rectangle(360, 471, 450, 50);
/*  268 */     this.ncensor = new Rectangle(428, 273, 350, 120);
/*  269 */     this.rese = new Rectangle(418, 394, 450, 50);
/*  270 */     this.kkk = 0;
/*  271 */     this.cs = new ArrayList();
/*  272 */     this.cs1 = new ArrayList();
/*  273 */     this.cs2 = new ArrayList();
/*  274 */     this.range1 = new ArrayList();
/*  275 */     this.range2 = new ArrayList();
/*  276 */     this.range3 = new ArrayList();
/*  277 */     this.kkkk = new ArrayList();
/*  278 */     this.kkll = new ArrayList();
/*  279 */     this.kkl = new ArrayList();
/*  280 */     this.poop = true;
/*  281 */     this.canc = new Rectangle(790, 500, 100, 50);
/*  282 */     this.leftClick = false;
/*      */ 
/*  284 */     this.tfake = new GameObject(333, 200, 5, 5, 0.0D, 0.0D);
/*  285 */     this.nafake = new GameObject(666, 200, 5, 5, 0.0D, 0.0D);
/*  286 */     this.nufake = new GameObject(333, 500, 5, 5, 0.0D, 0.0D);
/*  287 */     this.wafake = new GameObject(666, 200, 5, 5, 0.0D, 0.0D);
/*      */ 
/*  291 */     this.Start = new Rectangle(775, 560, 140, 55);
/*  292 */     this.buying1 = false;
/*  293 */     this.ouch = 0;
/*  294 */     this.csTimer = 0;
/*  295 */     this.csDelay = 40;
/*  296 */     this.cs1Timer = 0;
/*  297 */     this.cs1Delay = 50;
/*  298 */     this.cs2Timer = 0;
/*  299 */     this.cs2Delay = 35;
/*  300 */     this.ammoTimer = 0;
/*  301 */     this.ammoDelay = 25;
/*  302 */     this.Timer = 0;
/*  303 */     this.de = 1;
/*  304 */     this.lev = 0;
/*  305 */     this.fs = 0;
/*  306 */     this.playing = false;
/*  307 */     this.go = false;
/*  308 */     this.go1 = false;
/*  309 */     this.go2 = false;
/*  310 */     this.go3 = false;
/*  311 */     this.yoyo = false;
/*  312 */     this.fakespin = false;
/*  313 */     this.dead = false;
/*  314 */     this.wood5 = false;
/*  315 */     this.dia = false;
/*  316 */     this.show = false;
/*  317 */     this.l1 = false;
/*  318 */     this.l2 = false;
/*  319 */     this.l3 = false;
/*  320 */     this.l4 = false;
/*  321 */     this.l5 = false;
/*  322 */     this.l6 = false;
/*  323 */     this.l7 = false;
/*  324 */     this.l8 = false;
/*  325 */     this.l9 = false;
/*  326 */     this.lev = 0;
/*      */ 
/*  328 */     this.count = 0;
/*  329 */     this.count1 = 0;
/*  330 */     this.count2 = 0;
/*  331 */     this.count3 = 0;
/*  332 */     this.count4 = 0;
/*  333 */     this.count5 = 0;
/*  334 */     this.count6 = 0;
/*  335 */     this.count7 = 0;
/*  336 */     this.count8 = 0;
/*  337 */     this.count9 = 0;
/*  338 */     this.count10 = 0;
/*  339 */     this.gold = 300;
/*  340 */     this.csd = 0;
/*  341 */     this.ft = 20;
/*  342 */     this.fna = 20;
/*  343 */     this.fnu = 20;
/*  344 */     this.imageIndex = 0;
/*  345 */     this.explosion = false;
/*  346 */     this.testm = new Mushroom();
/*  347 */     this.ugh = new Mushroom();
/*  348 */     this.mush = new Mushroom();
/*  349 */     this.pointer = new Mushroom();
/*  350 */     this.map1 = addImage("imageedit_1_3028937317.jpg");
/*  351 */     this.Tow = addImage("imageedit_1_6223688606.png");
/*  352 */     this.right = addImage("imageedit_17_2784780342.png");
/*  353 */     this.back = addImage("imageedit_19_9846837647.png");
/*  354 */     this.hero = addImage("imageedit_2_5329748414.png");
/*  355 */     this.fish = addImage("imageedit_10_6261581461.png");
/*  356 */     this.wave = addImage("imageedit_3_2028521522.png");
/*  357 */     this.water = addImage("imageedit_13_5513535156.png");
/*  358 */     this.prup = addImage("imageedit_18_2401382297.png");
/*  359 */     this.yeti = addImage("imageedit_21_2039195600.png");
/*  360 */     this.flake = addImage("imageedit_3_8128303170.png");
/*  361 */     this.snow = addImage("imageedit_5_7678382609.png");
/*  362 */     this.slashu = addImage("imageedit_2_9651362773.png");
/*  363 */     this.slashr = addImage("imageedit_4_6838490750.png");
/*  364 */     this.slashd = addImage("imageedit_6_4058218985.png");
/*  365 */     this.slashl = addImage("imageedit_8_8003152403.png");
/*  366 */     this.slash = addImage("imageedit_10_4603078059.png");
/*  367 */     this.slashm = addImage("imageedit_12_3942756123.png");
/*  368 */     this.spinn = addImage("imageedit_14_8375978820.png");
/*  369 */     this.shadow = addImage("imageedit_18_5490415103.png");
/*  370 */     this.dem = addImage("imageedit_20_3499342318.png");
/*  371 */     this.yell = addImage("imageedit_21_8835136011.png");
/*  372 */     this.rank1 = addImage("imageedit_19_4327501624.png");
/*  373 */     this.newMin = addImage("imageedit_3_4732848893.png");
/*  374 */     this.mewMin = addImage("imageedit_5_9069962166.png");
/*  375 */     this.supermin = addImage("imageedit_12_6337185345.png");
/*  376 */     this.smin = addImage("imageedit_15_4926758561.png");
/*  377 */     this.poro = addImage("imageedit_1_7991105791.png");
/*  378 */     this.loading = addImage("imageedit_3_8527514435.gif");
/*  379 */     this.launch = addImage("imageedit_5_6682665102.jpg");
/*  380 */     this.champs = addImage("imageedit_8_5497412342.jpg");
/*  381 */     this.conte = addImage("imageedit_10_8787898559.jpg");
/*  382 */     this.coin = addImage("imageedit_28_9754433266.png");
/*  383 */     this.shop = addImage("imageedit_24_8572050794.jpg");
/*  384 */     this.garencard = addImage("imageedit_34_7252421073.jpg");
/*  385 */     this.upgrade = addImage("imageedit_40_8651434469.png");
/*  386 */     this.sell = addImage("imageedit_49_3899892978.png");
/*  387 */     this.exit = addImage("imageedit_48_3746480137.png");
/*  388 */     this.nunucard = addImage("imageedit_51_8208642929.jpg");
/*  389 */     this.namicard = addImage("imageedit_53_6295206043.jpg");
/*  390 */     this.turretcard = addImage("imageedit_56_6359269838.jpg");
/*  391 */     this.dota = addImage("imageedit_65_7145890299.png");
/*  392 */     this.nex = addImage("imageedit_69_6633750550.png");
/*  393 */     this.pl = addImage("imageedit_71_2497902259.jpg");
/*  394 */     this.red = addImage("imageedit_75_4973191831.png");
/*  395 */     this.korea = addImage("imageedit_77_3848134223.png");
/*  396 */     this.mouse = addImage("imageedit_79_2325553134.png");
/*  397 */     this.example = addImage("imageedit_85_6586085595.jpg");
/*  398 */     this.sgame = addImage("imageedit_87_9098964903.jpg");
/*  399 */     this.defeat = addImage("imageedit_90_5109820879.png");
/*  400 */     this.wood = addImage("imageedit_93_8715383991.png");
/*  401 */     this.rest = addImage("imageedit_97_6841397721.jpg");
/*  402 */     this.vic = addImage("imageedit_99_2669185020.png");
/*  403 */     this.dia1 = addImage("imageedit_106_7489513937.jpg");
/*  404 */     this.diaga = addImage("imageedit_2_6620011065.png");
/*  405 */     this.rigs = addImage("imageedit_5_3725541256.png");
/*  406 */     this.ups = addImage("imageedit_6_7919991988.png");
/*  407 */     this.ice = addImage("imageedit_1_5150464456.png");
/*  408 */     this.dust = addImage("imageedit_7_2969860993.png");
/*  409 */     int width = this.hero.getWidth() / 5;
/*  410 */     int height = this.hero.getHeight() / 3;
/*  411 */     for (int i = 0; i < 3; i++)
/*  412 */       for (int j = 0; j < 5; j++)
/*  413 */         this.images[(5 * i + j)] = this.hero.getSubimage(width * j, height * i, width, height);
/*      */   }
/*      */ 
/*      */   public void draw(Graphics2D win)
/*      */   {
/*  429 */     if (!this.go) {
/*  430 */       win.drawImage(this.loading, null, 0, 0);
/*  431 */       win.drawImage(this.dota, null, 390, 400);
/*  432 */       win.setColor(Color.GREEN);
/*  433 */       win.fill(this.laun);
/*  434 */       win.setColor(Color.BLUE);
/*  435 */       win.setFont(new Font("BerlinSans", 0, 28));
/*  436 */       win.drawString("Team #522    (click launch to begin)", 10, 40);
/*  437 */       win.drawImage(this.launch, null, this.laun.x, this.laun.y);
/*  438 */       if ((this.leftClick) && (this.brian.intersects(this.laun))) {
/*  439 */         this.go = true;
/*  440 */         this.leftClick = false;
/*      */       }
/*      */     }
/*      */ 
/*  444 */     if ((this.go) && (!this.go1)) {
/*  445 */       win.drawImage(this.champs, null, 0, 0);
/*  446 */       win.setColor(Color.WHITE);
/*  447 */       win.fill(this.wut);
/*  448 */       win.setColor(Color.BLUE);
/*  449 */       win.setFont(new Font("BerlinSans", 0, 28));
/*  450 */       win.drawString("Select your Champion", 360, 300);
/*  451 */       if (this.leftClick) {
/*  452 */         this.yoyo = true;
/*      */       }
/*      */ 
/*  455 */       if (this.yoyo) {
/*  456 */         win.setColor(Color.WHITE);
/*  457 */         win.fill(this.wut);
/*  458 */         win.setColor(Color.BLUE);
/*  459 */         win.setFont(new Font("BerlinSans", 0, 35));
/*  460 */         win.drawString("Too bad... I'll give you", 330, 270);
/*  461 */         win.setFont(new Font("BerlinSans", 0, 30));
/*  462 */         win.drawString("Nami, Nunu, and Garen", 335, 310);
/*  463 */         win.drawImage(this.fish, null, 335, 320);
/*  464 */         win.drawImage(this.yeti, null, 385, 320);
/*  465 */         win.drawImage(this.dem, null, 435, 320);
/*  466 */         win.fill(this.cont);
/*  467 */         win.drawImage(this.conte, null, this.cont.x, this.cont.y);
/*  468 */         if ((this.leftClick) && (this.brian.intersects(this.cont))) {
/*  469 */           this.go1 = true;
/*      */ 
/*  471 */           this.leftClick = false;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  476 */     if ((this.go1) && (!this.go2)) {
/*  477 */       win.setColor(new Color(0, 255, 100, 70));
/*  478 */       win.fill(this.htp);
/*  479 */       win.setColor(Color.BLUE);
/*  480 */       win.setFont(new Font("BerlinSans", 0, 35));
/*  481 */       win.drawString("How to Play:", 400, 40);
/*  482 */       win.setFont(new Font("BerlinSans", 0, 27));
/*  483 */       win.drawString("Welcome to the Field of Justice!", 60, 100);
/*  484 */       win.drawString("Goal:", 60, 130);
/*  485 */       win.setFont(new Font("BerlinSans", 0, 23));
/*  486 */       win.drawString("Defend the Nexus               from the Minions          using champions                        ", 60, 180);
/*  487 */       win.drawString("and Turrets            and Teemo Mushrooms            for 9 waves", 60, 230);
/*  488 */       win.drawImage(this.nex, null, 250, 125);
/*  489 */       win.drawImage(this.right, null, 500, 145);
/*  490 */       win.drawImage(this.yeti, null, 760, 140);
/*  491 */       win.drawImage(this.fish, null, 840, 140);
/*  492 */       win.drawImage(this.dem, null, 915, 145);
/*  493 */       win.drawImage(this.Tow, null, 185, 190);
/*  494 */       win.setColor(Color.orange);
/*  495 */       win.fill(this.nt);
/*  496 */       this.ugh.x = 530;
/*  497 */       this.ugh.y = 215;
/*  498 */       this.ugh.makeMush(win);
/*  499 */       win.drawImage(this.mouse, null, 120, 390);
/*  500 */       win.setColor(Color.BLUE);
/*  501 */       win.setFont(new Font("BerlinSans", 0, 22));
/*  502 */       win.drawString("This game only requires a Mouse/MousePad", 10, 330);
/*  503 */       win.drawString("and finger (or any other body part) to click.", 10, 360);
/*  504 */       win.setFont(new Font("BerlinSans", 0, 19));
/*  505 */       win.drawString("Place Turrets and Champions strategically in the jungle", 495, 295);
/*  506 */       win.drawString("and Teemo Mushrooms in lane (and don't be like this noob ", 475, 315);
/*  507 */       win.drawString("with -4 Health)", 670, 335);
/*  508 */       win.drawImage(this.example, null, 450, 340);
/*  509 */       win.drawImage(this.conte, null, this.a1.x, this.a1.y);
/*  510 */       if ((this.leftClick) && (this.brian.intersects(this.a1))) {
/*  511 */         this.go2 = true;
/*  512 */         this.leftClick = false;
/*      */       }
/*      */     }
/*  515 */     if ((this.go2) && (!this.go3))
/*      */     {
/*  517 */       win.setColor(new Color(200, 150, 0, 50));
/*  518 */       win.fill(this.htp);
/*  519 */       win.setColor(Color.BLACK);
/*  520 */       win.setFont(new Font("BerlinSans", 0, 28));
/*  521 */       win.drawString("Test out the Champions/Turrets/Mushroom's abilities by clicking on them", 50, 40);
/*  522 */       win.drawString("Disclaimer: The effects are not as cool in the real game T.T", 110, 90);
/*  523 */       win.drawString("(Clicking on Champions in game will allow you to upgrade them)", 110, 140);
/*      */ 
/*  527 */       this.testm.x = 500;
/*  528 */       this.testm.y = 350;
/*  529 */       this.testm.makeMush(win);
/*  530 */       if ((this.leftClick) && (this.brian.intersects(this.testm))) {
/*  531 */         this.explosion = true;
/*      */       }
/*  533 */       if (this.explosion) {
/*  534 */         this.boom = new Rectangle(this.gg - 80, this.yy - 80, 160, 160);
/*      */ 
/*  538 */         if (this.Timer >= this.de) {
/*  539 */           win.drawImage(this.images[this.imageIndex], null, this.testm.x - 100, this.testm.y - 85);
/*  540 */           this.imageIndex += 1;
/*  541 */           if (this.imageIndex == 15) {
/*  542 */             this.explosion = false;
/*  543 */             this.imageIndex = 0;
/*      */           }
/*  545 */           this.imageIndex %= 15;
/*  546 */           this.Timer = 0;
/*      */         }
/*  548 */         this.Timer += 1;
/*      */       }
/*  550 */       if ((this.leftClick) && (this.brian.intersects(this.fakeg))) {
/*  551 */         this.fakespin = true;
/*  552 */         this.leftClick = false;
/*      */       }
/*      */ 
/*  555 */       if (this.fakespin)
/*      */       {
/*  557 */         win.drawImage(this.spinn, null, this.fakeg.x - 12, this.fakeg.y - 20);
/*  558 */         win.drawImage(this.shadow, null, this.fakeg.x, this.fakeg.y - 25);
/*  559 */         win.drawImage(this.yell, null, this.fakeg.x - 7, this.fakeg.y);
/*  560 */         win.drawImage(this.yell, null, this.fakeg.x - 7, this.fakeg.y + 12);
/*  561 */         win.drawImage(this.yell, null, this.fakeg.x - 7, this.fakeg.y + 24);
/*  562 */         if ((this.fs <= 2) || (this.fs >= 6)) {
/*  563 */           win.drawImage(this.slashu, null, this.fakeg.x - 45, this.fakeg.y - 80);
/*  564 */           win.drawImage(this.dust, null, this.fakeg.x - 72, this.fakeg.y - 65);
/*      */         }
/*      */ 
/*  567 */         if (((this.fs >= 1) && (this.fs <= 3)) || (this.fs >= 6)) {
/*  568 */           win.drawImage(this.slashd, null, this.fakeg.x - 45, this.fakeg.y + 30);
/*      */         }
/*  570 */         if (((this.fs >= 2) && (this.fs <= 5)) || (this.fs > 7)) {
/*  571 */           win.drawImage(this.slash, null, this.fakeg.x - 60, this.fakeg.y - 15);
/*      */         }
/*  573 */         if (this.fs <= 3) {
/*  574 */           win.drawImage(this.slashr, null, this.fakeg.x - 45, this.fakeg.y);
/*      */         }
/*  576 */         if ((this.fs > 2) && (this.fs < 8)) {
/*  577 */           win.drawImage(this.slashl, null, this.fakeg.x - 45, this.fakeg.y);
/*      */         }
/*  579 */         if ((this.fs > 4) || (this.fs == 1)) {
/*  580 */           win.drawImage(this.slashm, null, this.fakeg.x + 45, this.fakeg.y + 10);
/*      */         }
/*  582 */         this.fs += 1;
/*  583 */         if (this.fs > 9) {
/*  584 */           this.fakespin = false;
/*  585 */           this.fs = 0;
/*      */         }
/*      */       } else {
/*  588 */         win.drawImage(this.dem, null, this.fakeg.x, this.fakeg.y);
/*      */       }
/*  590 */       if ((this.leftClick) && (this.brian.intersects(this.faket))) {
/*  591 */         this.ft = 0;
/*  592 */         this.tfake.x = 333;
/*  593 */         this.tfake.y = 200;
/*  594 */         this.leftClick = false;
/*      */       }
/*  596 */       if (this.ft < 20) {
/*  597 */         this.tfake.setDx(-10.0D);
/*  598 */         this.tfake.setDy(7.0D);
/*  599 */         win.drawImage(this.prup, null, this.tfake.x - 20, this.tfake.y - 10);
/*  600 */         this.tfake.moveAndDraw(win);
/*  601 */         this.tfake.setColor(new Color(255, 255, 255, 0));
/*      */       } else {
/*  603 */         this.tfake.setDx(0.0D);
/*  604 */         this.tfake.setDy(0.0D);
/*      */       }
/*  606 */       this.ft += 1;
/*  607 */       win.drawImage(this.Tow, null, this.faket.x - 10, this.faket.y - 15);
/*  608 */       if ((this.leftClick) && (this.brian.intersects(this.fakena))) {
/*  609 */         this.fna = 0;
/*  610 */         this.nafake.x = 666;
/*  611 */         this.nafake.y = 200;
/*  612 */         this.wafake.x = 666;
/*  613 */         this.wafake.y = 200;
/*  614 */         this.leftClick = false;
/*      */       }
/*  616 */       if (this.fna < 20) {
/*  617 */         this.wafake.setDx(-10.0D);
/*  618 */         this.wafake.setDy(-2.0D);
/*  619 */         this.nafake.setDx(-10.0D);
/*  620 */         this.nafake.setDy(7.0D);
/*  621 */         win.drawImage(this.wave, null, this.wafake.x, this.wafake.y);
/*  622 */         win.drawImage(this.water, null, this.nafake.x - 20, this.nafake.y - 10);
/*  623 */         this.nafake.moveAndDraw(win);
/*  624 */         this.nafake.setColor(new Color(255, 255, 255, 0));
/*  625 */         this.wafake.moveAndDraw(win);
/*  626 */         this.wafake.setColor(new Color(255, 255, 255, 0));
/*      */       } else {
/*  628 */         this.wafake.setDx(0.0D);
/*  629 */         this.wafake.setDy(0.0D);
/*  630 */         this.nafake.setDx(0.0D);
/*  631 */         this.nafake.setDy(0.0D);
/*      */       }
/*  633 */       this.fna += 1;
/*  634 */       win.drawImage(this.fish, null, this.fakena.x - 10, this.fakena.y - 15);
/*  635 */       if ((this.leftClick) && (this.brian.intersects(this.fakenu))) {
/*  636 */         this.fnu = 0;
/*  637 */         this.nufake.x = 333;
/*  638 */         this.nufake.y = 500;
/*  639 */         this.leftClick = false;
/*      */       }
/*  641 */       if (this.fnu < 10) {
/*  642 */         win.drawImage(this.flake, null, this.fakenu.x - 110, this.fakenu.y - 110);
/*      */       }
/*  644 */       if (this.fnu < 20) {
/*  645 */         this.nufake.setDx(-10.0D);
/*  646 */         this.nufake.setDy(7.0D);
/*  647 */         win.drawImage(this.snow, null, this.nufake.x - 20, this.nufake.y - 10);
/*  648 */         this.nufake.moveAndDraw(win);
/*  649 */         this.nufake.setColor(new Color(255, 255, 255, 0));
/*      */       } else {
/*  651 */         this.nufake.setDx(0.0D);
/*  652 */         this.nufake.setDy(0.0D);
/*      */       }
/*  654 */       this.fnu += 1;
/*  655 */       win.drawImage(this.yeti, null, this.fakenu.x - 10, this.fakenu.y - 15);
/*      */ 
/*  658 */       win.drawImage(this.sgame, null, this.sg.x, this.sg.y);
/*  659 */       if ((this.leftClick) && (this.brian.intersects(this.sg))) {
/*  660 */         this.go3 = true;
/*  661 */         this.sounds.play(0);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  667 */     if (this.go3)
/*      */     {
/*  669 */       win.drawImage(this.map1, null, 0, 0);
/*  670 */       win.drawImage(this.shop, null, 700, 0);
/*      */ 
/*  715 */       for (int i = 0; i < this.garen.size(); i++) {
/*  716 */         if (!((buildings)this.garen.get(i)).getSpin()) {
/*  717 */           win.drawImage(this.dem, null, ((buildings)this.garen.get(i)).x, ((buildings)this.garen.get(i)).y);
/*      */         }
/*      */       }
/*  720 */       win.drawImage(this.fish, null, this.buyNami.x, this.buyNami.y);
/*  721 */       win.drawImage(this.Tow, null, this.box.x, this.box.y - 10);
/*  722 */       win.drawImage(this.yeti, null, this.buyNunu.x, this.buyNunu.y);
/*  723 */       win.drawImage(this.dem, null, this.buyGaren.x + 10, this.buyGaren.y + 10);
/*  724 */       this.mush.makeMush(win);
/*  725 */       if ((this.keys[13] == true) && (this.lives > 0)) {
/*  726 */         this.brian.setDy(23.0D);
/*      */       }
/*  728 */       else if ((this.keys[12] == true) && (this.lives > 0))
/*  729 */         this.brian.setDy(-23.0D);
/*      */       else {
/*  731 */         this.brian.setDy(0.0D);
/*      */       }
/*  733 */       if ((this.keys[14] == true) && (this.lives > 0))
/*  734 */         this.brian.setDx(-23.0D);
/*  735 */       else if ((this.keys[15] == true) && (this.lives > 0))
/*  736 */         this.brian.setDx(23.0D);
/*      */       else {
/*  738 */         this.brian.setDx(0.0D);
/*      */       }
/*  740 */       if ((this.brian.x > 925) && (this.brian.getDx() > 0.0D)) {
/*  741 */         this.brian.setDx(0.0D);
/*  742 */         this.brian.x = 937;
/*      */       }
/*  744 */       if ((this.brian.x < 15) && (this.brian.getDx() < 0.0D)) {
/*  745 */         this.brian.setDx(0.0D);
/*  746 */         this.brian.x = 5;
/*      */       }
/*  748 */       if ((this.brian.y > 599) && (this.brian.getDy() > 0.0D)) {
/*  749 */         this.brian.setDy(0.0D);
/*  750 */         this.brian.y = 612;
/*      */       }
/*  752 */       if ((this.brian.y < 30) && (this.brian.getDy() < 0.0D)) {
/*  753 */         this.brian.setDy(0.0D);
/*  754 */         this.brian.y = 16;
/*      */       }
/*  756 */       if ((this.brian.intersects(this.Start)) && (this.leftClick) && (!this.playing) && (this.cs.size() <= 0) && (!this.dead)) {
/*  757 */         this.l1 = true;
/*  758 */         this.playing = true;
/*  759 */         this.lev += 1;
/*  760 */         this.count = 0;
/*  761 */         this.count1 = 0;
/*  762 */         this.count2 = 0;
/*  763 */         this.count3 = 0;
/*  764 */         this.count4 = 0;
/*  765 */         this.count5 = 0;
/*  766 */         this.count6 = 0;
/*  767 */         this.count7 = 0;
/*  768 */         this.count8 = 0;
/*  769 */         this.count9 = 0;
/*  770 */         this.count10 = 0;
/*  771 */         if (this.lev > 1) {
/*  772 */           this.l2 = true;
/*      */         }
/*  774 */         if (this.lev > 2) {
/*  775 */           this.l3 = true;
/*      */         }
/*  777 */         if (this.lev > 3) {
/*  778 */           this.l4 = true;
/*      */         }
/*  780 */         if (this.lev > 4) {
/*  781 */           this.l5 = true;
/*      */         }
/*  783 */         if (this.lev > 5) {
/*  784 */           this.l6 = true;
/*      */         }
/*  786 */         if (this.lev > 6) {
/*  787 */           this.l7 = true;
/*      */         }
/*  789 */         if (this.lev > 7) {
/*  790 */           this.l8 = true;
/*      */         }
/*  792 */         if (this.lev > 8) {
/*  793 */           this.l9 = true;
/*      */         }
/*  795 */         if (this.lev > 9) {
/*  796 */           this.l10 = true;
/*      */         }
/*      */       }
/*  799 */       if (this.lev >= 1) {
/*  800 */         win.setColor(Color.BLUE);
/*  801 */         win.setFont(new Font("SansSerif", 0, 35));
/*  802 */         win.drawString("Level: " + this.lev, 23, 40);
/*  803 */         win.drawString("Kills: " + this.csd, 200, 40);
/*      */       }
/*      */ 
/*  806 */       if (this.lev == 0) {
/*  807 */         win.drawImage(this.diaga, null, 30, 590);
/*  808 */       } else if ((this.lev == 1) && (!this.playing) && (this.cs.size() <= 0)) {
/*  809 */         win.drawImage(this.ups, null, -3, 541);
/*  810 */         win.drawImage(this.rigs, null, 50, 600);
/*  811 */         win.drawImage(this.diaga, null, 30, 590);
/*      */       }
/*  813 */       win.drawImage(this.coin, null, 755, 5);
/*  814 */       win.setColor(Color.YELLOW);
/*  815 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  816 */       win.drawString(String.valueOf(this.gold), 790, 30);
/*      */ 
/*  818 */       win.drawImage(this.coin, null, 725, 150);
/*  819 */       win.setColor(Color.YELLOW);
/*  820 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  821 */       win.drawString("100", 760, 175);
/*      */ 
/*  823 */       win.drawImage(this.coin, null, 840, 150);
/*  824 */       win.setColor(Color.YELLOW);
/*  825 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  826 */       win.drawString("175", 875, 175);
/*      */ 
/*  828 */       win.drawImage(this.coin, null, 840, 275);
/*  829 */       win.setColor(Color.YELLOW);
/*  830 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  831 */       win.drawString("125", 875, 300);
/*      */ 
/*  833 */       win.drawImage(this.coin, null, 725, 275);
/*  834 */       win.setColor(Color.YELLOW);
/*  835 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  836 */       win.drawString("175", 760, 300);
/*      */ 
/*  838 */       win.drawImage(this.coin, null, 725, 375);
/*  839 */       win.setColor(Color.YELLOW);
/*  840 */       win.setFont(new Font("BerlinSans", 0, 30));
/*  841 */       win.drawString("225", 760, 400);
/*      */ 
/*  843 */       if ((this.brian.intersects(this.box)) && (!this.dead) && (this.leftClick) && (this.gold >= 100) && (!this.buying2) && (!this.buying3) && (!this.buying4) && (!this.buying5)) {
/*  844 */         this.buying1 = true;
/*  845 */         this.leftClick = false;
/*      */       }
/*      */ 
/*  848 */       if (this.buying1) {
/*  849 */         int x = 495;
/*  850 */         int y = 100;
/*  851 */         int width = 65;
/*  852 */         int height = 1200;
/*  853 */         double theta = Math.toRadians(47.0D);
/*  854 */         Rectangle2D rect = new Rectangle2D.Double(-width / 2.0D, -height / 2.0D, width, height);
/*  855 */         AffineTransform transform = new AffineTransform();
/*  856 */         transform.rotate(theta);
/*  857 */         transform.translate(x, y);
/*  858 */         Shape rotatedRect = transform.createTransformedShape(rect);
/*  859 */         Color myColor = new Color(0, 255, 50, 70);
/*  860 */         win.setColor(myColor);
/*  861 */         win.fill(this.space);
/*      */ 
/*  863 */         Color R = new Color(255, 100, 0, 100);
/*  864 */         win.setColor(R);
/*      */ 
/*  874 */         win.drawImage(this.Tow, null, this.movex - 20, this.movey - 60);
/*  875 */         win.setColor(Color.BLACK);
/*  876 */         win.drawOval(this.brian.x - 135, this.movey - 165, 290, 290);
/*      */ 
/*  879 */         win.drawImage(this.korea, null, this.canc.x, this.canc.y);
/*  880 */         if ((this.brian.intersects(this.cant1)) || (this.brian.intersects(this.cant2)) || (this.brian.intersects(this.cant3)) || (this.brian.intersects(this.cant4)) || (this.brian.intersects(this.cant5)) || (this.brian.intersects(this.cant6)) || (this.brian.intersects(this.cant7)) || (this.brian.intersects(this.cant8)) || (this.brian.intersects(this.bg)) || (rotatedRect.intersects(this.brian))) {
/*  881 */           win.drawImage(this.red, null, this.brian.x - 15, this.brian.y - 20);
/*      */         }
/*  883 */         if ((this.leftClick) && (this.brian.intersects(this.canc))) {
/*  884 */           this.buying1 = false;
/*  885 */           this.leftClick = false;
/*      */         }
/*      */ 
/*  888 */         if ((this.leftClick) && (!this.brian.intersects(this.cant1)) && (!this.brian.intersects(this.cant2)) && (!this.brian.intersects(this.cant3)) && (!this.brian.intersects(this.cant4)) && (!this.brian.intersects(this.cant5)) && (!this.brian.intersects(this.cant6)) && (!this.brian.intersects(this.cant7)) && (!this.brian.intersects(this.cant8)) && (!this.brian.intersects(this.bg)) && (!rotatedRect.intersects(this.brian))) {
/*  889 */           this.Tower.add(new buildings());
/*  890 */           ((buildings)this.Tower.get(this.Tower.size() - 1)).setLocation(this.movex - 10, this.movey - 40);
/*      */ 
/*  892 */           this.range.add(new RoundRectangle2D.Float(this.brian.x - 135, this.brian.y - 165, 290.0F, 290.0F, 290.0F, 290.0F));
/*  893 */           ((buildings)this.Tower.get(this.Tower.size() - 1)).setShopping(true);
/*      */ 
/*  895 */           this.buying1 = false;
/*  896 */           this.leftClick = false;
/*  897 */           this.gold -= 100;
/*      */         }
/*      */       }
/*      */ 
/*  901 */       if ((this.brian.intersects(this.buyNami)) && (!this.dead) && (this.leftClick) && (this.gold >= 175) && (!this.buying1) && (!this.buying2) && (!this.buying4) && (!this.buying5)) {
/*  902 */         this.buying3 = true;
/*  903 */         this.leftClick = false;
/*      */       }
/*      */ 
/*  906 */       if (this.buying3) {
/*  907 */         int x = 495;
/*  908 */         int y = 100;
/*  909 */         int width = 65;
/*  910 */         int height = 1200;
/*  911 */         double theta = Math.toRadians(47.0D);
/*      */ 
/*  914 */         Rectangle2D rect = new Rectangle2D.Double(-width / 2.0D, -height / 2.0D, width, height);
/*      */ 
/*  916 */         AffineTransform transform = new AffineTransform();
/*  917 */         transform.rotate(theta);
/*  918 */         transform.translate(x, y);
/*      */ 
/*  922 */         Shape rotatedRect = transform.createTransformedShape(rect);
/*      */ 
/*  927 */         Color myColor = new Color(0, 255, 50, 70);
/*  928 */         win.setColor(myColor);
/*  929 */         win.fill(this.space);
/*  930 */         Color R = new Color(255, 100, 0, 100);
/*  931 */         win.setColor(R);
/*      */ 
/*  943 */         win.drawImage(this.korea, null, this.canc.x, this.canc.y);
/*  944 */         if ((this.brian.intersects(this.cant1)) || (this.brian.intersects(this.cant2)) || (this.brian.intersects(this.cant3)) || (this.brian.intersects(this.cant4)) || (this.brian.intersects(this.cant5)) || (this.brian.intersects(this.cant6)) || (this.brian.intersects(this.cant7)) || (this.brian.intersects(this.cant8)) || (this.brian.intersects(this.bg)) || (rotatedRect.intersects(this.brian))) {
/*  945 */           win.drawImage(this.red, null, this.brian.x - 15, this.brian.y - 20);
/*      */         }
/*  947 */         if ((this.leftClick) && (this.brian.intersects(this.canc))) {
/*  948 */           this.buying3 = false;
/*  949 */           this.leftClick = false;
/*      */         }
/*      */ 
/*  952 */         win.drawImage(this.fish, null, this.movex - 14, this.movey - 50);
/*  953 */         win.setColor(Color.BLACK);
/*  954 */         win.drawOval(this.brian.x - 135, this.movey - 165, 290, 290);
/*      */ 
/*  957 */         if ((this.leftClick) && (!this.brian.intersects(this.cant1)) && (!this.brian.intersects(this.cant2)) && (!this.brian.intersects(this.cant3)) && (!this.brian.intersects(this.cant4)) && (!this.brian.intersects(this.cant5)) && (!this.brian.intersects(this.cant6)) && (!this.brian.intersects(this.cant7)) && (!this.brian.intersects(this.cant8)) && (!this.brian.intersects(this.bg)) && (!rotatedRect.intersects(this.brian))) {
/*  958 */           this.nami.add(new buildings());
/*  959 */           ((buildings)this.nami.get(this.nami.size() - 1)).setLocation(this.movex - 10, this.movey - 40);
/*      */ 
/*  961 */           this.range1.add(new RoundRectangle2D.Float(this.brian.x - 135, this.brian.y - 165, 290.0F, 290.0F, 290.0F, 290.0F));
/*      */ 
/*  963 */           ((buildings)this.nami.get(this.nami.size() - 1)).setShopping(true);
/*  964 */           this.buying3 = false;
/*  965 */           this.leftClick = false;
/*  966 */           this.gold -= 175;
/*      */         }
/*      */       }
/*      */ 
/*  970 */       if ((this.brian.intersects(this.buyNunu)) && (!this.dead) && (this.leftClick) && (this.gold >= 175) && (!this.buying1) && (!this.buying3) && (!this.buying2) && (!this.buying5)) {
/*  971 */         this.buying4 = true;
/*  972 */         this.leftClick = false;
/*      */       }
/*      */ 
/*  975 */       if (this.buying4) {
/*  976 */         int x = 495;
/*  977 */         int y = 100;
/*  978 */         int width = 65;
/*  979 */         int height = 1200;
/*  980 */         double theta = Math.toRadians(47.0D);
/*      */ 
/*  983 */         Rectangle2D rect = new Rectangle2D.Double(-width / 2.0D, -height / 2.0D, width, height);
/*      */ 
/*  985 */         AffineTransform transform = new AffineTransform();
/*  986 */         transform.rotate(theta);
/*  987 */         transform.translate(x, y);
/*      */ 
/*  991 */         Shape rotatedRect = transform.createTransformedShape(rect);
/*      */ 
/*  996 */         Color myColor = new Color(0, 255, 50, 70);
/*  997 */         win.setColor(myColor);
/*  998 */         win.fill(this.space);
/*  999 */         Color R = new Color(255, 100, 0, 100);
/* 1000 */         win.setColor(R);
/*      */ 
/* 1012 */         win.drawImage(this.korea, null, this.canc.x, this.canc.y);
/* 1013 */         if ((this.brian.intersects(this.cant1)) || (this.brian.intersects(this.cant2)) || (this.brian.intersects(this.cant3)) || (this.brian.intersects(this.cant4)) || (this.brian.intersects(this.cant5)) || (this.brian.intersects(this.cant6)) || (this.brian.intersects(this.cant7)) || (this.brian.intersects(this.cant8)) || (this.brian.intersects(this.bg)) || (rotatedRect.intersects(this.brian))) {
/* 1014 */           win.drawImage(this.red, null, this.brian.x - 15, this.brian.y - 20);
/*      */         }
/* 1016 */         if ((this.leftClick) && (this.brian.intersects(this.canc))) {
/* 1017 */           this.buying4 = false;
/* 1018 */           this.leftClick = false;
/*      */         }
/*      */ 
/* 1021 */         win.drawImage(this.yeti, null, this.movex - 23, this.movey - 55);
/* 1022 */         win.setColor(Color.BLACK);
/* 1023 */         win.drawOval(this.brian.x - 135, this.movey - 165, 290, 290);
/*      */ 
/* 1026 */         if ((this.leftClick) && (!this.brian.intersects(this.cant1)) && (!this.brian.intersects(this.cant2)) && (!this.brian.intersects(this.cant3)) && (!this.brian.intersects(this.cant4)) && (!this.brian.intersects(this.cant5)) && (!this.brian.intersects(this.cant6)) && (!this.brian.intersects(this.cant7)) && (!this.brian.intersects(this.cant8)) && (!this.brian.intersects(this.bg)) && (!rotatedRect.intersects(this.brian))) {
/* 1027 */           this.nunu.add(new buildings());
/* 1028 */           ((buildings)this.nunu.get(this.nunu.size() - 1)).setLocation(this.movex - 10, this.movey - 40);
/*      */ 
/* 1030 */           this.range2.add(new RoundRectangle2D.Float(this.brian.x - 135, this.brian.y - 165, 290.0F, 290.0F, 290.0F, 290.0F));
/*      */ 
/* 1032 */           ((buildings)this.nunu.get(this.nunu.size() - 1)).setShopping(true);
/* 1033 */           this.buying4 = false;
/* 1034 */           this.leftClick = false;
/* 1035 */           this.gold -= 175;
/*      */         }
/*      */       }
/*      */ 
/* 1039 */       if ((this.brian.intersects(this.buyGaren)) && (!this.dead) && (this.leftClick) && (this.gold >= 125) && (!this.buying2) && (!this.buying3) && (!this.buying4) && (!this.buying1) && (!this.buying5)) {
/* 1040 */         this.buying5 = true;
/* 1041 */         this.leftClick = false;
/*      */       }
/*      */ 
/* 1044 */       if (this.buying5) {
/* 1045 */         int x = 495;
/* 1046 */         int y = 100;
/* 1047 */         int width = 65;
/* 1048 */         int height = 1200;
/* 1049 */         double theta = Math.toRadians(47.0D);
/*      */ 
/* 1052 */         Rectangle2D rect = new Rectangle2D.Double(-width / 2.0D, -height / 2.0D, width, height);
/*      */ 
/* 1054 */         AffineTransform transform = new AffineTransform();
/* 1055 */         transform.rotate(theta);
/* 1056 */         transform.translate(x, y);
/*      */ 
/* 1060 */         Shape rotatedRect = transform.createTransformedShape(rect);
/*      */ 
/* 1065 */         Color myColor = new Color(0, 255, 50, 70);
/* 1066 */         win.setColor(myColor);
/* 1067 */         win.fill(this.space);
/* 1068 */         Color R = new Color(255, 100, 0, 100);
/* 1069 */         win.setColor(R);
/*      */ 
/* 1079 */         win.drawImage(this.dem, null, this.movex - 10, this.movey - 40);
/* 1080 */         win.setColor(Color.BLACK);
/* 1081 */         win.drawOval(this.brian.x - 75, this.movey - 105, 170, 170);
/*      */ 
/* 1084 */         win.drawImage(this.korea, null, this.canc.x, this.canc.y);
/* 1085 */         if ((this.brian.intersects(this.cant1)) || (this.brian.intersects(this.cant2)) || (this.brian.intersects(this.cant3)) || (this.brian.intersects(this.cant4)) || (this.brian.intersects(this.cant5)) || (this.brian.intersects(this.cant6)) || (this.brian.intersects(this.cant7)) || (this.brian.intersects(this.cant8)) || (this.brian.intersects(this.bg)) || (rotatedRect.intersects(this.brian))) {
/* 1086 */           win.drawImage(this.red, null, this.brian.x - 15, this.brian.y - 20);
/*      */         }
/* 1088 */         if ((this.leftClick) && (this.brian.intersects(this.canc))) {
/* 1089 */           this.buying5 = false;
/* 1090 */           this.leftClick = false;
/*      */         }
/*      */ 
/* 1093 */         if ((this.leftClick) && (!this.brian.intersects(this.cant1)) && (!this.brian.intersects(this.cant2)) && (!this.brian.intersects(this.cant3)) && (!this.brian.intersects(this.cant4)) && (!this.brian.intersects(this.cant5)) && (!this.brian.intersects(this.cant6)) && (!this.brian.intersects(this.cant7)) && (!this.brian.intersects(this.cant8)) && (!this.brian.intersects(this.bg)) && (!rotatedRect.intersects(this.brian))) {
/* 1094 */           this.garen.add(new buildings());
/* 1095 */           ((buildings)this.garen.get(this.garen.size() - 1)).setLocation(this.movex - 10, this.movey - 40);
/* 1096 */           ((buildings)this.garen.get(this.garen.size() - 1)).setDelay(40);
/* 1097 */           this.range3.add(new RoundRectangle2D.Float(this.brian.x - 75, this.brian.y - 105, 170.0F, 170.0F, 170.0F, 170.0F));
/* 1098 */           ((buildings)this.garen.get(this.garen.size() - 1)).setShopping(true);
/*      */ 
/* 1100 */           this.buying5 = false;
/* 1101 */           this.leftClick = false;
/* 1102 */           this.gold -= 125;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 1111 */       for (int i = 0; i < this.cs.size(); i++) {
/* 1112 */         for (int j = 0; j < this.mushy.size(); j++) {
/* 1113 */           if (((Mininons)this.cs.get(i)).intersects(new Rectangle((Rectangle)this.mushy.get(j)).x - 15, ((Mushroom)this.mushy.get(j)).y - 15, 30.0D, 30.0D)) {
/* 1114 */             this.explosion = true;
/* 1115 */             this.gg = ((Mushroom)this.mushy.get(j)).x;
/* 1116 */             this.yy = ((Mushroom)this.mushy.get(j)).y;
/* 1117 */             this.mushy.remove(j);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 1127 */       for (int i = 0; i < this.Tower.size(); i++) {
/* 1128 */         win.drawImage(this.Tow, null, ((buildings)this.Tower.get(i)).x - 10, ((buildings)this.Tower.get(i)).y - 20);
/*      */       }
/* 1130 */       for (int i = 0; i < this.nami.size(); i++) {
/* 1131 */         win.drawImage(this.fish, null, ((buildings)this.nami.get(i)).x, ((buildings)this.nami.get(i)).y - 10);
/*      */       }
/*      */ 
/* 1134 */       if ((this.brian.intersects(new Rectangle(this.mush.x - 15, this.mush.y - 15, 30, 30))) && (!this.dead) && (this.leftClick) && (this.gold >= 225) && (!this.buying1) && (!this.buying3) && (!this.buying4) && (!this.buying5)) {
/* 1135 */         this.buying2 = true;
/* 1136 */         this.leftClick = false;
/*      */       }
/*      */ 
/* 1139 */       if (this.buying2) {
/* 1140 */         int x = 495;
/* 1141 */         int y = 100;
/* 1142 */         int width = 65;
/* 1143 */         int height = 1200;
/* 1144 */         double theta = Math.toRadians(47.0D);
/* 1145 */         Rectangle2D rect = new Rectangle2D.Double(-width / 2.0D, -height / 2.0D, width, height);
/* 1146 */         AffineTransform transform = new AffineTransform();
/* 1147 */         transform.rotate(theta);
/* 1148 */         transform.translate(x, y);
/* 1149 */         Shape rotatedRect = transform.createTransformedShape(rect);
/* 1150 */         Color R = new Color(255, 100, 0, 100);
/* 1151 */         win.setColor(R);
/*      */ 
/* 1153 */         Color myColor = new Color(0, 255, 50, 70);
/* 1154 */         win.setColor(myColor);
/* 1155 */         win.fill(this.space);
/*      */ 
/* 1165 */         this.pointer.makeMush(win);
/*      */ 
/* 1168 */         win.drawImage(this.korea, null, this.canc.x, this.canc.y);
/* 1169 */         if ((!this.brian.intersects(this.cant1)) && (!this.brian.intersects(this.cant2)) && (!this.brian.intersects(this.cant3)) && (!this.brian.intersects(this.cant4)) && (!this.brian.intersects(this.cant5)) && (!this.brian.intersects(this.cant6)) && (!this.brian.intersects(this.cant7)) && (!this.brian.intersects(this.cant8)) && (!this.brian.intersects(this.bg)) && (!rotatedRect.intersects(this.brian))) {
/* 1170 */           win.drawImage(this.red, null, this.brian.x - 15, this.brian.y - 20);
/*      */         }
/* 1172 */         if ((this.leftClick) && (this.brian.intersects(this.canc))) {
/* 1173 */           this.buying2 = false;
/* 1174 */           this.leftClick = false;
/*      */         }
/* 1176 */         if ((this.leftClick) && ((this.brian.intersects(this.cant1)) || (this.brian.intersects(this.cant2)) || (this.brian.intersects(this.cant3)) || (this.brian.intersects(this.cant4)) || (this.brian.intersects(this.cant5)) || (this.brian.intersects(this.cant6)) || (this.brian.intersects(this.cant7)) || (this.brian.intersects(this.cant8)) || (rotatedRect.intersects(this.brian)))) {
/* 1177 */           this.mushy.add(new Mushroom());
/* 1178 */           ((Mushroom)this.mushy.get(this.mushy.size() - 1)).setLocation(this.brix, this.briy);
/* 1179 */           this.gold -= 225;
/* 1180 */           this.buying2 = false;
/* 1181 */           this.leftClick = false;
/*      */         }
/*      */       }
/* 1184 */       this.pointer.x = this.movex;
/* 1185 */       this.pointer.y = this.movey;
/*      */ 
/* 1191 */       for (int i = 0; i < this.mushy.size(); i++) {
/* 1192 */         ((Mushroom)this.mushy.get(i)).makeMush(win);
/*      */       }
/*      */ 
/* 1200 */       for (int i = 0; i < this.Tower.size(); i++) {
/* 1201 */         if ((this.brian.intersects((Rectangle)this.Tower.get(i))) && (!this.dead) && (this.leftClick)) {
/* 1202 */           for (int j = 0; j < this.Tower.size(); j++) {
/* 1203 */             ((buildings)this.Tower.get(j)).setShopping(false);
/*      */           }
/* 1205 */           ((buildings)this.Tower.get(i)).setShopping(true);
/* 1206 */           this.leftClick = false;
/* 1207 */           ((buildings)this.Tower.get(i)).setClick(false);
/*      */         }
/*      */       }
/*      */ 
/* 1211 */       for (int i = 0; i < this.Tower.size(); i++)
/*      */       {
/* 1214 */         if (((buildings)this.Tower.get(i)).getShopping()) {
/* 1215 */           ((buildings)this.Tower.get(i)).setClick(true);
/* 1216 */           for (int j = 0; j > this.Tower.size(); j++) {
/* 1217 */             if (j != i) {
/* 1218 */               ((buildings)this.Tower.get(j)).setShopping(false);
/*      */             }
/*      */           }
/* 1221 */           for (int j = 0; j < this.nami.size(); j++)
/*      */           {
/* 1223 */             ((buildings)this.nami.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1227 */           for (int j = 0; j < this.nunu.size(); j++) {
/* 1228 */             ((buildings)this.nunu.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1231 */           for (int j = 0; j < this.garen.size(); j++) {
/* 1232 */             ((buildings)this.garen.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1236 */           win.drawImage(this.turretcard, null, 700, 40);
/* 1237 */           win.setColor(Color.YELLOW);
/* 1238 */           win.draw((Shape)this.range.get(i));
/*      */ 
/* 1246 */           win.drawImage(this.upgrade, null, ((buildings)this.Tower.get(i)).getUp().x - 5, ((buildings)this.Tower.get(i)).getUp().y - 5);
/* 1247 */           win.drawImage(this.sell, null, ((buildings)this.Tower.get(i)).getSell().x - 10, ((buildings)this.Tower.get(i)).getSell().y - 10);
/* 1248 */           win.drawImage(this.exit, null, ((buildings)this.Tower.get(i)).getCan().x - 5, ((buildings)this.Tower.get(i)).getCan().y - 5);
/*      */ 
/* 1250 */           win.setColor(Color.GREEN);
/* 1251 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1252 */           if (((buildings)this.Tower.get(i)).getTt() < 1) {
/* 1253 */             win.drawString("50", 745, 550);
/* 1254 */             win.setColor(Color.BLUE);
/* 1255 */             win.setFont(new Font("BerlinSans", 0, 12));
/* 1256 */             win.drawString("Upgrade 1: + atk speed / + atk damage / + range", 705, 470);
/* 1257 */           } else if (((buildings)this.Tower.get(i)).getTt() == 1) {
/* 1258 */             win.drawString("100", 745, 550);
/* 1259 */             win.setColor(Color.BLUE);
/* 1260 */             win.setFont(new Font("BerlinSans", 0, 12));
/* 1261 */             win.drawString("Upgrade 2: + atk speed / + atk damage / + range", 705, 470);
/*      */           } else {
/* 1263 */             win.setColor(Color.BLUE);
/* 1264 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1265 */             win.drawString("Max Level", 720, 470);
/*      */           }
/* 1267 */           win.setColor(Color.RED);
/* 1268 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1269 */           win.drawString("Escape", 810, 550);
/* 1270 */           win.setColor(Color.YELLOW);
/* 1271 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1272 */           win.drawString(String.valueOf(50 + ((buildings)this.Tower.get(i)).getSelling()), 910, 550);
/*      */ 
/* 1274 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.Tower.get(i)).getCan()))) {
/* 1275 */             ((buildings)this.Tower.get(i)).setShopping(false);
/* 1276 */             this.leftClick = false;
/*      */           }
/* 1278 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.Tower.get(i)).getSell()))) {
/* 1279 */             ((buildings)this.Tower.get(i)).setShopping(false);
/* 1280 */             this.gold += 50 + ((buildings)this.Tower.get(i)).getSelling();
/* 1281 */             this.Tower.remove(i);
/* 1282 */             this.range.remove(i);
/* 1283 */             this.leftClick = false;
/*      */           }
/*      */ 
/* 1286 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.Tower.get(i)).getUp())) && (this.gold >= 50) && (((buildings)this.Tower.get(i)).getTt() < 1))
/*      */           {
/* 1288 */             ((buildings)this.Tower.get(i)).setDelay(18);
/* 1289 */             ((buildings)this.Tower.get(i)).setDmg(6);
/* 1290 */             this.range.set(i, new RoundRectangle2D.Float(((buildings)this.Tower.get(i)).x - 140, ((buildings)this.Tower.get(i)).y - 140, 320.0F, 320.0F, 320.0F, 320.0F));
/* 1291 */             this.gold -= 50;
/* 1292 */             this.leftClick = false;
/* 1293 */             ((buildings)this.Tower.get(i)).setTt(1);
/* 1294 */             ((buildings)this.Tower.get(i)).setSelling(25);
/*      */           }
/* 1296 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.Tower.get(i)).getUp())) && (this.gold >= 100) && (((buildings)this.Tower.get(i)).getTt() == 1)) {
/* 1297 */             ((buildings)this.Tower.get(i)).setShopping(false);
/* 1298 */             ((buildings)this.Tower.get(i)).setDelay(11);
/* 1299 */             ((buildings)this.Tower.get(i)).setDmg(12);
/* 1300 */             this.range.set(i, new RoundRectangle2D.Float(((buildings)this.Tower.get(i)).x - 155, ((buildings)this.Tower.get(i)).y - 155, 350.0F, 350.0F, 350.0F, 350.0F));
/* 1301 */             this.gold -= 100;
/* 1302 */             this.leftClick = false;
/* 1303 */             ((buildings)this.Tower.get(i)).setTt(2);
/* 1304 */             ((buildings)this.Tower.get(i)).setSelling(75);
/*      */           }
/*      */         }
/*      */       }
/* 1308 */       for (int i = 0; i < this.nami.size(); i++) {
/* 1309 */         if ((this.brian.intersects((Rectangle)this.nami.get(i))) && (!this.dead) && (this.leftClick)) {
/* 1310 */           for (int j = 0; j < this.nami.size(); j++) {
/* 1311 */             ((buildings)this.nami.get(j)).setShopping(false);
/*      */           }
/* 1313 */           ((buildings)this.nami.get(i)).setShopping(true);
/* 1314 */           this.leftClick = false;
/*      */         }
/*      */       }
/* 1317 */       for (int i = 0; i < this.nami.size(); i++)
/*      */       {
/* 1320 */         if (((buildings)this.nami.get(i)).getShopping()) {
/* 1321 */           for (int j = 0; j > this.nami.size(); j++) {
/* 1322 */             if (j != i) {
/* 1323 */               ((buildings)this.nami.get(j)).setShopping(false);
/*      */             }
/*      */           }
/* 1326 */           for (int j = 0; j < this.Tower.size(); j++)
/*      */           {
/* 1328 */             ((buildings)this.Tower.get(j)).setShopping(false);
/*      */           }
/* 1330 */           for (int j = 0; j < this.nunu.size(); j++) {
/* 1331 */             ((buildings)this.nunu.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1334 */           for (int j = 0; j < this.garen.size(); j++) {
/* 1335 */             ((buildings)this.garen.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1339 */           win.drawImage(this.namicard, null, 700, 40);
/* 1340 */           win.setColor(Color.YELLOW);
/* 1341 */           win.draw((Shape)this.range1.get(i));
/*      */ 
/* 1349 */           win.drawImage(this.upgrade, null, ((buildings)this.nami.get(i)).getUp().x - 5, ((buildings)this.nami.get(i)).getUp().y - 5);
/* 1350 */           win.drawImage(this.sell, null, ((buildings)this.nami.get(i)).getSell().x - 10, ((buildings)this.nami.get(i)).getSell().y - 10);
/* 1351 */           win.drawImage(this.exit, null, ((buildings)this.nami.get(i)).getCan().x - 5, ((buildings)this.nami.get(i)).getCan().y - 5);
/*      */ 
/* 1353 */           win.setColor(Color.GREEN);
/* 1354 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1355 */           if (((buildings)this.nami.get(i)).getTt() < 1) {
/* 1356 */             win.drawString("150", 745, 550);
/* 1357 */             win.setColor(Color.BLUE);
/* 1358 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1359 */             win.drawString("Upgrade 1: Summons a Tsunami", 705, 470);
/* 1360 */           } else if (((buildings)this.nami.get(i)).getTt() == 1) {
/* 1361 */             win.drawString("175", 745, 550);
/* 1362 */             win.setColor(Color.BLUE);
/* 1363 */             win.setFont(new Font("BerlinSans", 0, 12));
/* 1364 */             win.drawString("Upgrade 2: + atk speed / + atk damage / + range", 705, 470);
/*      */           } else {
/* 1366 */             win.setColor(Color.BLUE);
/* 1367 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1368 */             win.drawString("Max Level", 720, 470);
/*      */           }
/* 1370 */           win.setColor(Color.RED);
/* 1371 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1372 */           win.drawString("Escape", 810, 550);
/* 1373 */           win.setColor(Color.YELLOW);
/* 1374 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1375 */           win.drawString(String.valueOf(87 + ((buildings)this.nami.get(i)).getSelling()), 910, 550);
/*      */ 
/* 1377 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nami.get(i)).getCan()))) {
/* 1378 */             ((buildings)this.nami.get(i)).setShopping(false);
/* 1379 */             this.leftClick = false;
/*      */           }
/* 1381 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nami.get(i)).getSell()))) {
/* 1382 */             ((buildings)this.nami.get(i)).setShopping(false);
/* 1383 */             this.gold += 87 + ((buildings)this.nami.get(i)).getSelling();
/* 1384 */             this.nami.remove(i);
/* 1385 */             this.range1.remove(i);
/*      */ 
/* 1387 */             this.leftClick = false;
/*      */           }
/*      */ 
/* 1390 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nami.get(i)).getUp())) && (this.gold >= 150) && (((buildings)this.nami.get(i)).getTt() < 1))
/*      */           {
/* 1392 */             ((buildings)this.nami.get(i)).setTsu(true);
/* 1393 */             this.gold -= 150;
/* 1394 */             this.leftClick = false;
/* 1395 */             ((buildings)this.nami.get(i)).setTt(1);
/* 1396 */             ((buildings)this.nami.get(i)).setSelling(75);
/*      */           }
/* 1398 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nami.get(i)).getUp())) && (this.gold >= 175) && (((buildings)this.nami.get(i)).getTt() == 1)) {
/* 1399 */             ((buildings)this.nami.get(i)).setShopping(false);
/* 1400 */             ((buildings)this.nami.get(i)).setDelay(15);
/* 1401 */             ((buildings)this.nami.get(i)).setMinus(15);
/* 1402 */             ((buildings)this.nami.get(i)).setDmg(20);
/* 1403 */             this.range1.set(i, new RoundRectangle2D.Float(((buildings)this.nami.get(i)).x - 140, ((buildings)this.nami.get(i)).y - 140, 320.0F, 320.0F, 320.0F, 320.0F));
/* 1404 */             this.gold -= 175;
/* 1405 */             this.leftClick = false;
/* 1406 */             ((buildings)this.nami.get(i)).setTt(2);
/* 1407 */             ((buildings)this.nami.get(i)).setSelling(162);
/*      */           }
/*      */         }
/*      */       }
/* 1411 */       for (int i = 0; i < this.nunu.size(); i++) {
/* 1412 */         if ((this.brian.intersects((Rectangle)this.nunu.get(i))) && (!this.dead) && (this.leftClick)) {
/* 1413 */           for (int j = 0; j < this.nunu.size(); j++) {
/* 1414 */             ((buildings)this.nunu.get(j)).setShopping(false);
/*      */           }
/* 1416 */           ((buildings)this.nunu.get(i)).setShopping(true);
/* 1417 */           this.leftClick = false;
/*      */         }
/*      */       }
/* 1420 */       for (int i = 0; i < this.nunu.size(); i++)
/*      */       {
/* 1422 */         if (((buildings)this.nunu.get(i)).getShopping()) {
/* 1423 */           for (int j = 0; j > this.nunu.size(); j++) {
/* 1424 */             if (j != i) {
/* 1425 */               ((buildings)this.nunu.get(j)).setShopping(false);
/*      */             }
/*      */           }
/* 1428 */           for (int j = 0; j < this.nami.size(); j++) {
/* 1429 */             ((buildings)this.nami.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1432 */           for (int j = 0; j < this.Tower.size(); j++) {
/* 1433 */             ((buildings)this.Tower.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1436 */           for (int j = 0; j < this.garen.size(); j++) {
/* 1437 */             ((buildings)this.garen.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1441 */           win.drawImage(this.nunucard, null, 700, 40);
/* 1442 */           win.setColor(Color.YELLOW);
/* 1443 */           win.draw((Shape)this.range2.get(i));
/*      */ 
/* 1450 */           win.drawImage(this.upgrade, null, ((buildings)this.nunu.get(i)).getUp().x - 5, ((buildings)this.nunu.get(i)).getUp().y - 5);
/* 1451 */           win.drawImage(this.sell, null, ((buildings)this.nunu.get(i)).getSell().x - 10, ((buildings)this.nunu.get(i)).getSell().y - 10);
/* 1452 */           win.drawImage(this.exit, null, ((buildings)this.nunu.get(i)).getCan().x - 5, ((buildings)this.nunu.get(i)).getCan().y - 5);
/* 1453 */           win.setColor(Color.GREEN);
/* 1454 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1455 */           if (((buildings)this.nunu.get(i)).getTt() < 1) {
/* 1456 */             win.drawString("150", 745, 550);
/* 1457 */             win.setColor(Color.BLUE);
/* 1458 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1459 */             win.drawString("Upgrade 1: Stuns nearby enemies", 705, 470);
/* 1460 */           } else if (((buildings)this.nunu.get(i)).getTt() == 1) {
/* 1461 */             win.drawString("175", 745, 550);
/* 1462 */             win.setColor(Color.BLUE);
/* 1463 */             win.setFont(new Font("BerlinSans", 0, 11));
/* 1464 */             win.drawString("Upgrade 2: + snowflake dmg / + atk dmg / + atk speed", 705, 470);
/*      */           }
/* 1466 */           else if (((buildings)this.nunu.get(i)).getTt() == 2) {
/* 1467 */             win.setColor(Color.BLUE);
/* 1468 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1469 */             win.drawString("Max Level", 720, 470);
/*      */           }
/* 1471 */           win.setColor(Color.RED);
/* 1472 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1473 */           win.drawString("Escape", 810, 550);
/* 1474 */           win.setColor(Color.YELLOW);
/* 1475 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1476 */           win.drawString(String.valueOf(87 + ((buildings)this.nunu.get(i)).getSelling()), 910, 550);
/*      */ 
/* 1479 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nunu.get(i)).getCan()))) {
/* 1480 */             ((buildings)this.nunu.get(i)).setShopping(false);
/* 1481 */             this.leftClick = false;
/*      */           }
/* 1483 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nunu.get(i)).getSell()))) {
/* 1484 */             ((buildings)this.nunu.get(i)).setShopping(false);
/* 1485 */             this.gold += 87 + ((buildings)this.nunu.get(i)).getSelling();
/*      */ 
/* 1487 */             this.nunu.remove(i);
/* 1488 */             this.range2.remove(i);
/*      */ 
/* 1490 */             this.leftClick = false;
/*      */           }
/*      */ 
/* 1493 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nunu.get(i)).getUp())) && (this.gold >= 150) && (((buildings)this.nunu.get(i)).getTt() < 1))
/*      */           {
/* 1495 */             ((buildings)this.nunu.get(i)).setTsu(true);
/* 1496 */             this.gold -= 150;
/* 1497 */             this.leftClick = false;
/* 1498 */             ((buildings)this.nunu.get(i)).setTt(1);
/* 1499 */             ((buildings)this.nunu.get(i)).setSelling(75);
/*      */           }
/* 1501 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.nunu.get(i)).getUp())) && (this.gold >= 175) && (((buildings)this.nunu.get(i)).getTt() == 1)) {
/* 1502 */             ((buildings)this.nunu.get(i)).setShopping(false);
/* 1503 */             ((buildings)this.nunu.get(i)).setDelay(15);
/* 1504 */             ((buildings)this.nunu.get(i)).setMinus(25);
/* 1505 */             ((buildings)this.nunu.get(i)).setDmg(12);
/* 1506 */             this.range2.set(i, new RoundRectangle2D.Float(((buildings)this.nunu.get(i)).x - 140, ((buildings)this.nunu.get(i)).y - 140, 320.0F, 320.0F, 320.0F, 320.0F));
/* 1507 */             this.gold -= 150;
/* 1508 */             this.leftClick = false;
/* 1509 */             ((buildings)this.nunu.get(i)).setTt(2);
/* 1510 */             ((buildings)this.nunu.get(i)).setSelling(162);
/*      */           }
/*      */         }
/*      */       }
/* 1514 */       for (int i = 0; i < this.garen.size(); i++) {
/* 1515 */         if ((this.brian.intersects((Rectangle)this.garen.get(i))) && (!this.dead) && (this.leftClick)) {
/* 1516 */           for (int j = 0; j < this.garen.size(); j++) {
/* 1517 */             ((buildings)this.garen.get(j)).setShopping(false);
/*      */           }
/* 1519 */           ((buildings)this.garen.get(i)).setShopping(true);
/* 1520 */           this.leftClick = false;
/*      */         }
/*      */       }
/* 1523 */       for (int i = 0; i < this.garen.size(); i++)
/*      */       {
/* 1526 */         if (((buildings)this.garen.get(i)).getShopping()) {
/* 1527 */           for (int j = 0; j > this.garen.size(); j++) {
/* 1528 */             if (j != i) {
/* 1529 */               ((buildings)this.garen.get(j)).setShopping(false);
/*      */             }
/*      */           }
/* 1532 */           for (int j = 0; j < this.nami.size(); j++) {
/* 1533 */             ((buildings)this.nami.get(j)).setShopping(false);
/*      */           }
/* 1535 */           for (int j = 0; j < this.nunu.size(); j++) {
/* 1536 */             ((buildings)this.nunu.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1539 */           for (int j = 0; j < this.Tower.size(); j++) {
/* 1540 */             ((buildings)this.Tower.get(j)).setShopping(false);
/*      */           }
/*      */ 
/* 1544 */           win.drawImage(this.garencard, null, 700, 40);
/*      */ 
/* 1546 */           win.setColor(Color.YELLOW);
/* 1547 */           win.draw((Shape)this.range3.get(i));
/*      */ 
/* 1554 */           win.drawImage(this.upgrade, null, ((buildings)this.garen.get(i)).getUp().x - 5, ((buildings)this.garen.get(i)).getUp().y - 5);
/* 1555 */           win.drawImage(this.sell, null, ((buildings)this.garen.get(i)).getSell().x - 10, ((buildings)this.garen.get(i)).getSell().y - 10);
/* 1556 */           win.drawImage(this.exit, null, ((buildings)this.garen.get(i)).getCan().x - 5, ((buildings)this.garen.get(i)).getCan().y - 5);
/* 1557 */           win.setColor(Color.GREEN);
/* 1558 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1559 */           if (((buildings)this.garen.get(i)).getTt() < 1) {
/* 1560 */             win.drawString("150", 745, 550);
/* 1561 */             win.setColor(Color.BLUE);
/* 1562 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1563 */             win.drawString("Upgrade 1: + atk speed / + atk damage", 705, 470);
/* 1564 */           } else if (((buildings)this.garen.get(i)).getTt() == 1) {
/* 1565 */             win.drawString("175", 745, 550);
/* 1566 */             win.setColor(Color.BLUE);
/* 1567 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1568 */             win.drawString("Upgrade 2: + atk speed / + atk damage", 705, 470);
/*      */           } else {
/* 1570 */             win.setColor(Color.BLUE);
/* 1571 */             win.setFont(new Font("BerlinSans", 0, 15));
/* 1572 */             win.drawString("Max Level", 720, 470);
/*      */           }
/* 1574 */           win.setColor(Color.RED);
/* 1575 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1576 */           win.drawString("Escape", 810, 550);
/* 1577 */           win.setColor(Color.YELLOW);
/* 1578 */           win.setFont(new Font("BerlinSans", 0, 20));
/* 1579 */           win.drawString(String.valueOf(62 + ((buildings)this.garen.get(i)).getSelling()), 910, 550);
/*      */ 
/* 1582 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.garen.get(i)).getCan()))) {
/* 1583 */             ((buildings)this.garen.get(i)).setShopping(false);
/* 1584 */             this.leftClick = false;
/*      */           }
/* 1586 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.garen.get(i)).getSell()))) {
/* 1587 */             ((buildings)this.garen.get(i)).setShopping(false);
/* 1588 */             this.gold += 62 + ((buildings)this.garen.get(i)).getSelling();
/* 1589 */             this.garen.remove(i);
/* 1590 */             this.range3.remove(i);
/*      */ 
/* 1592 */             this.leftClick = false;
/*      */           }
/*      */ 
/* 1595 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.garen.get(i)).getUp())) && (this.gold >= 150) && (((buildings)this.garen.get(i)).getTt() < 1))
/*      */           {
/* 1597 */             this.gold -= 150;
/* 1598 */             ((buildings)this.garen.get(i)).setDelay(15);
/*      */ 
/* 1600 */             ((buildings)this.garen.get(i)).setDmg(7);
/* 1601 */             this.leftClick = false;
/* 1602 */             ((buildings)this.garen.get(i)).setTt(1);
/* 1603 */             ((buildings)this.garen.get(i)).setSelling(75);
/*      */           }
/* 1605 */           if ((this.leftClick) && (this.brian.intersects(((buildings)this.garen.get(i)).getUp())) && (this.gold >= 175) && (((buildings)this.garen.get(i)).getTt() == 1)) {
/* 1606 */             ((buildings)this.garen.get(i)).setShopping(false);
/* 1607 */             ((buildings)this.garen.get(i)).setDelay(9);
/*      */ 
/* 1609 */             ((buildings)this.garen.get(i)).setDmg(12);
/*      */ 
/* 1611 */             this.gold -= 150;
/* 1612 */             this.leftClick = false;
/* 1613 */             ((buildings)this.garen.get(i)).setTt(2);
/* 1614 */             ((buildings)this.garen.get(i)).setSelling(162);
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 1620 */       for (int i = 0; i < this.cs.size(); i++) {
/* 1621 */         if (((Mininons)this.cs.get(i)).intersects(this.nexus)) {
/* 1622 */           this.lives -= 1;
/*      */ 
/* 1624 */           this.cs.remove(i);
/*      */         }
/*      */       }
/*      */ 
/* 1628 */       win.setColor(Color.PINK);
/* 1629 */       win.setFont(new Font("BerlinSans", 0, 35));
/* 1630 */       win.drawString("Health: " + this.lives, 760, 650);
/*      */ 
/* 1634 */       win.drawImage(this.nex, null, this.nexus.x - 6, this.nexus.y - 10);
/* 1635 */       win.drawImage(this.pl, null, this.Start.x, this.Start.y);
/* 1636 */       spawnAmmo();
/* 1637 */       MADammo(win);
/* 1638 */       spawnCS();
/* 1639 */       MADcs(win);
/* 1640 */       for (int i = 0; i < this.cs.size(); i++) {
/* 1641 */         ((Mininons)this.cs.get(i)).makelife(win);
/*      */       }
/* 1643 */       this.brian.x = this.movex;
/* 1644 */       this.brian.y = this.movey;
/* 1645 */       this.brian.moveAndDraw(win);
/* 1646 */       for (int i = 0; i < this.nunu.size(); i++) {
/* 1647 */         win.drawImage(this.yeti, null, ((buildings)this.nunu.get(i)).x - 10, ((buildings)this.nunu.get(i)).y - 15);
/*      */       }
/*      */ 
/* 1650 */       if (this.explosion) {
/* 1651 */         this.boom = new Rectangle(this.gg - 80, this.yy - 80, 160, 160);
/*      */ 
/* 1655 */         if (this.Timer >= this.de) {
/* 1656 */           win.drawImage(this.images[this.imageIndex], null, this.gg - 100, this.yy - 85);
/* 1657 */           this.imageIndex += 1;
/* 1658 */           if (this.imageIndex == 15) {
/* 1659 */             this.explosion = false;
/* 1660 */             this.imageIndex = 0;
/*      */           }
/* 1662 */           this.imageIndex %= 15;
/* 1663 */           this.Timer = 0;
/*      */         }
/* 1665 */         this.Timer += 1;
/*      */       }
/* 1667 */       for (int i = 0; i < this.cs.size(); i++) {
/* 1668 */         if ((((Mininons)this.cs.get(i)).intersects(this.boom)) && (this.explosion)) {
/* 1669 */           if (((Mininons)this.cs.get(i)).gethealth() <= 12) {
/* 1670 */             this.cs.remove(i);
/* 1671 */             this.gold += 10;
/* 1672 */             this.csd += 1;
/*      */           } else {
/* 1674 */             ((Mininons)this.cs.get(i)).l().setWidth((int)(((Mininons)this.cs.get(i)).l().getWidth() - 10.0D));
/*      */           }
/*      */         }
/*      */       }
/*      */ 
/* 1679 */       if (this.lives <= 0) {
/* 1680 */         this.dead = true;
/* 1681 */         win.setColor(new Color(255, 200, 250, 40));
/* 1682 */         win.fill(this.htp);
/* 1683 */         win.drawImage(this.defeat, null, 125, -20);
/* 1684 */         win.drawImage(this.conte, null, this.morecon.x, this.morecon.y);
/* 1685 */         if ((this.leftClick) && (this.brian.intersects(this.morecon))) {
/* 1686 */           this.wood5 = true;
/*      */ 
/* 1688 */           this.leftClick = false;
/* 1689 */           this.go3 = false;
/*      */         }
/*      */       }
/*      */ 
/* 1693 */       if ((!this.l9) && (this.lev == 9) && (this.count8 > 9) && (this.cs.size() == 0) && (this.lives > 0)) {
/* 1694 */         this.dead = true;
/* 1695 */         win.drawImage(this.vic, null, 150, 25);
/* 1696 */         win.drawImage(this.conte, null, this.morecon.x, this.morecon.y);
/* 1697 */         if ((this.leftClick) && (this.brian.intersects(this.morecon))) {
/* 1698 */           this.dia = true;
/*      */ 
/* 1700 */           this.leftClick = false;
/* 1701 */           this.go3 = false;
/*      */         }
/*      */       }
/* 1704 */       this.leftClick = false;
/*      */     }
/* 1706 */     if (this.dia) {
/* 1707 */       win.setColor(Color.BLACK);
/* 1708 */       win.fill(this.htp);
/* 1709 */       win.drawImage(this.dia1, null, 130, 165);
/* 1710 */       win.setColor(Color.BLUE);
/* 1711 */       win.fill(this.ncensor);
/* 1712 */       win.setColor(Color.WHITE);
/* 1713 */       win.setFont(new Font("BerlinSans", 0, 18));
/* 1714 */       win.drawString("You beat all the levels!", 430, 290);
/* 1715 */       win.drawString("You killed " + this.csd + " minions!", 430, 320);
/* 1716 */       win.fill(this.rese);
/* 1717 */       win.drawImage(this.rest, null, this.rese.x, this.rese.y);
/* 1718 */       if ((this.leftClick) && (this.brian.intersects(this.rese))) {
/* 1719 */         reset();
/*      */       }
/*      */     }
/* 1722 */     if (this.wood5) {
/* 1723 */       win.drawImage(this.wood, null, 0, 0);
/* 1724 */       win.setColor(Color.BLUE);
/* 1725 */       win.fill(this.censor);
/* 1726 */       win.setColor(Color.WHITE);
/* 1727 */       win.setFont(new Font("BerlinSans", 0, 18));
/* 1728 */       win.drawString("You got to level " + this.lev, 400, 330);
/* 1729 */       win.drawString("You killed " + this.csd + " minions!", 400, 350);
/* 1730 */       win.fill(this.res);
/* 1731 */       win.drawImage(this.rest, null, this.res.x, this.res.y);
/* 1732 */       if ((this.leftClick) && (this.brian.intersects(this.res))) {
/* 1733 */         reset();
/*      */       }
/*      */     }
/* 1736 */     this.brian.x = this.movex;
/* 1737 */     this.brian.y = this.movey;
/* 1738 */     this.brian.moveAndDraw(win);
/* 1739 */     this.leftClick = false;
/*      */   }
/*      */ 
/*      */   public void spawnCS()
/*      */   {
/* 1745 */     if ((this.l1) && (this.lev < 4)) {
/* 1746 */       if (this.csTimer > this.csDelay) {
/* 1747 */         this.cs.add(new Mininons());
/*      */ 
/* 1749 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(0);
/*      */ 
/* 1752 */         this.csTimer = 0;
/* 1753 */         this.count += 1;
/*      */       }
/*      */ 
/* 1756 */       this.csTimer += 1;
/*      */     }
/*      */ 
/* 1759 */     if (this.count > 12) {
/* 1760 */       this.l1 = false;
/* 1761 */       this.playing = false;
/*      */     }
/* 1763 */     if ((this.l2) && (this.lev < 4)) {
/* 1764 */       if (this.cs1Timer > this.cs1Delay)
/*      */       {
/* 1766 */         this.cs.add(new Mininons());
/* 1767 */         this.cs.add(new Mininons());
/*      */ 
/* 1770 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(1);
/* 1771 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/*      */ 
/* 1773 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(2);
/* 1774 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1775 */         this.cs1Timer = 0;
/* 1776 */         this.count1 += 1;
/*      */       }
/*      */ 
/* 1779 */       this.cs1Timer += 1;
/*      */     }
/* 1781 */     if (this.count1 > 12) {
/* 1782 */       this.l2 = false;
/* 1783 */       this.playing = false;
/*      */     }
/* 1785 */     if ((this.l3) && (this.lev != 4) && (this.lev != 6)) {
/* 1786 */       if (this.cs2Timer > 68)
/*      */       {
/* 1788 */         this.cs.add(new Mininons());
/* 1789 */         this.cs.add(new Mininons());
/* 1790 */         this.cs.add(new Mininons());
/* 1791 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(3);
/* 1792 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(2);
/* 1793 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(4);
/* 1794 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1795 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(2);
/* 1796 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(5);
/* 1797 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1798 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(2);
/* 1799 */         this.cs2Timer = 0;
/* 1800 */         this.count2 += 1;
/*      */       }
/*      */ 
/* 1803 */       this.cs2Timer += 1;
/*      */     }
/* 1805 */     if (this.count2 > 9) {
/* 1806 */       this.l3 = false;
/* 1807 */       this.playing = false;
/*      */     }
/* 1809 */     if ((this.l4) && (this.lev == 4)) {
/* 1810 */       if (this.cs3Timer > 40)
/*      */       {
/* 1812 */         this.cs.add(new Mininons());
/* 1813 */         this.cs.add(new Mininons());
/* 1814 */         this.cs.add(new Mininons());
/* 1815 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(3);
/* 1816 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(2);
/* 1817 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(4);
/* 1818 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1819 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(2);
/* 1820 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(5);
/* 1821 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1822 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(2);
/* 1823 */         this.cs3Timer = 0;
/* 1824 */         this.count3 += 1;
/*      */       }
/*      */ 
/* 1827 */       this.cs3Timer += 1;
/*      */     }
/* 1829 */     if (this.count3 > 24) {
/* 1830 */       this.l4 = false;
/* 1831 */       this.playing = false;
/*      */     }
/* 1833 */     if ((this.l5) && (this.lev != 6) && (this.lev != 9)) {
/* 1834 */       if (this.cs4Timer > 80)
/*      */       {
/* 1836 */         this.cs.add(new Mininons());
/* 1837 */         this.cs.add(new Mininons());
/* 1838 */         this.cs.add(new Mininons());
/* 1839 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(6);
/* 1840 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(4);
/* 1841 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(7);
/* 1842 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1843 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(4);
/* 1844 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(8);
/* 1845 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1846 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(4);
/* 1847 */         this.cs4Timer = 0;
/* 1848 */         this.count4 += 1;
/*      */       }
/*      */ 
/* 1851 */       this.cs4Timer += 1;
/*      */     }
/* 1853 */     if (this.count4 > 7) {
/* 1854 */       this.l5 = false;
/* 1855 */       this.playing = false;
/*      */     }
/*      */ 
/* 1858 */     if ((this.l6) && ((this.lev == 6) || (this.lev == 8)) && (this.lev != 9)) {
/* 1859 */       if (this.cs5Timer > 50)
/*      */       {
/* 1861 */         this.cs.add(new Mininons());
/* 1862 */         this.cs.add(new Mininons());
/* 1863 */         this.cs.add(new Mininons());
/* 1864 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(6);
/* 1865 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(4);
/* 1866 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(7);
/* 1867 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1868 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(4);
/* 1869 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(8);
/* 1870 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1871 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(4);
/* 1872 */         this.cs5Timer = 0;
/* 1873 */         this.count5 += 1;
/*      */       }
/*      */ 
/* 1876 */       this.cs5Timer += 1;
/*      */     }
/* 1878 */     if (this.count5 > 16) {
/* 1879 */       this.l6 = false;
/* 1880 */       this.playing = false;
/*      */     }
/*      */ 
/* 1883 */     if ((this.l7) && (this.lev != 9)) {
/* 1884 */       if (this.cs6Timer > 40)
/*      */       {
/* 1886 */         this.cs.add(new Mininons());
/* 1887 */         this.cs.add(new Mininons());
/* 1888 */         this.cs.add(new Mininons());
/* 1889 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(9);
/* 1890 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(12);
/* 1891 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(10);
/* 1892 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1893 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(12);
/* 1894 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(11);
/* 1895 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1896 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(12);
/* 1897 */         this.cs6Timer = 0;
/* 1898 */         this.count6 += 1;
/*      */       }
/*      */ 
/* 1901 */       this.cs6Timer += 1;
/*      */     }
/* 1903 */     if (this.count6 > 16) {
/* 1904 */       this.l7 = false;
/* 1905 */       this.playing = false;
/*      */     }
/*      */ 
/* 1909 */     if ((this.l8) && (this.lev != 9)) {
/* 1910 */       if (this.cs7Timer > 45)
/*      */       {
/* 1912 */         this.cs.add(new Mininons());
/* 1913 */         this.cs.add(new Mininons());
/* 1914 */         this.cs.add(new Mininons());
/* 1915 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(12);
/* 1916 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(32);
/* 1917 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(13);
/* 1918 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1919 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(32);
/* 1920 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(14);
/* 1921 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1922 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(32);
/* 1923 */         this.cs7Timer = 0;
/* 1924 */         this.count7 += 1;
/*      */       }
/*      */ 
/* 1927 */       this.cs7Timer += 1;
/*      */     }
/* 1929 */     if (this.count7 > 19) {
/* 1930 */       this.l8 = false;
/* 1931 */       this.playing = false;
/*      */     }
/*      */ 
/* 1934 */     if (this.l9) {
/* 1935 */       if (this.cs8Timer > 150)
/*      */       {
/* 1937 */         this.cs.add(new Mininons());
/* 1938 */         this.cs.add(new Mininons());
/* 1939 */         this.cs.add(new Mininons());
/* 1940 */         ((Mininons)this.cs.get(this.cs.size() - 3)).setMet(15);
/* 1941 */         ((Mininons)this.cs.get(this.cs.size() - 3)).sethealth(100);
/* 1942 */         ((Mininons)this.cs.get(this.cs.size() - 3)).l().setWidth(150);
/* 1943 */         ((Mininons)this.cs.get(this.cs.size() - 3)).l().x = (((Mininons)this.cs.get(this.cs.size() - 3)).x - 25);
/* 1944 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setMet(16);
/* 1945 */         ((Mininons)this.cs.get(this.cs.size() - 2)).setLocation(22, (int)(Math.random() * 15.0D) + 616);
/* 1946 */         ((Mininons)this.cs.get(this.cs.size() - 2)).sethealth(100);
/* 1947 */         ((Mininons)this.cs.get(this.cs.size() - 2)).l().setWidth(150);
/* 1948 */         ((Mininons)this.cs.get(this.cs.size() - 2)).l().x = (((Mininons)this.cs.get(this.cs.size() - 2)).x - 25);
/* 1949 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setMet(17);
/* 1950 */         ((Mininons)this.cs.get(this.cs.size() - 1)).setLocation((int)(Math.random() * 15.0D + 27.0D), 630);
/* 1951 */         ((Mininons)this.cs.get(this.cs.size() - 1)).sethealth(100);
/* 1952 */         ((Mininons)this.cs.get(this.cs.size() - 1)).l().setWidth(150);
/* 1953 */         ((Mininons)this.cs.get(this.cs.size() - 1)).l().x = (((Mininons)this.cs.get(this.cs.size() - 1)).x - 25);
/* 1954 */         this.cs8Timer = 0;
/* 1955 */         this.count8 += 1;
/*      */       }
/*      */ 
/* 1958 */       this.cs8Timer += 1;
/*      */     }
/* 1960 */     if (this.count8 > 9) {
/* 1961 */       this.l9 = false;
/* 1962 */       this.playing = false;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void MADcs(Graphics2D win)
/*      */   {
/* 1970 */     for (int i = 0; i < this.cs.size(); i++)
/*      */     {
/* 1973 */       Mininons m = (Mininons)this.cs.get(i);
/* 1974 */       if (m.getF()) {
/* 1975 */         this.show = true;
/* 1976 */         m.setfti(m.fti() + 1);
/* 1977 */         if (m.fti() >= 40) {
/* 1978 */           m.setF(false);
/* 1979 */           m.setfti(0);
/*      */         }
/*      */       } else {
/* 1982 */         this.show = false;
/*      */       }
/* 1984 */       if (m.getMet() == 16)
/*      */       {
/* 1986 */         if ((m.x > 540) && (m.y > 532)) {
/* 1987 */           if (m.getF()) {
/* 1988 */             m.setDx(0.0D);
/* 1989 */             m.setDy(0.0D);
/* 1990 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 1992 */             m.setDx(2.0D);
/* 1993 */             m.setDy(-2.0D);
/* 1994 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 1997 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 1998 */           if (m.getF()) {
/* 1999 */             m.setDx(0.0D);
/* 2000 */             m.setDy(0.0D);
/* 2001 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2003 */             m.setDx(0.0D);
/* 2004 */             m.setDy(-2.0D);
/* 2005 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2008 */         else if (m.getF()) {
/* 2009 */           m.setDx(0.0D);
/* 2010 */           m.setDy(0.0D);
/* 2011 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2013 */           m.setDx(2.0D);
/* 2014 */           m.setDy(0.0D);
/* 2015 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2018 */         m.moveAndDraw(win);
/*      */       }
/* 2021 */       else if (m.getMet() == 17)
/*      */       {
/* 2023 */         if ((m.y < 160) && (m.x < 160)) {
/* 2024 */           if (m.getF()) {
/* 2025 */             m.setDx(0.0D);
/* 2026 */             m.setDy(0.0D);
/*      */ 
/* 2028 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2030 */             m.setDy(-2.0D);
/* 2031 */             m.setDx(2.0D);
/* 2032 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2035 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2036 */           if (m.getF()) {
/* 2037 */             m.setDx(0.0D);
/* 2038 */             m.setDy(0.0D);
/*      */ 
/* 2040 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2042 */             m.setDy(0.0D);
/* 2043 */             m.setDx(2.0D);
/* 2044 */             win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2047 */         else if (m.getF()) {
/* 2048 */           m.setDx(0.0D);
/* 2049 */           m.setDy(0.0D);
/* 2050 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2052 */           m.setDy(-2.0D);
/* 2053 */           m.setDx(0.0D);
/* 2054 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2057 */         m.moveAndDraw(win);
/* 2058 */       } else if (m.getMet() == 15) {
/* 2059 */         if (m.getF()) {
/* 2060 */           m.setDx(0.0D);
/* 2061 */           m.setDy(0.0D);
/* 2062 */           m.moveAndDraw(win);
/* 2063 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2065 */           m.setDx(1.0D);
/* 2066 */           m.setDy(-1.0D);
/* 2067 */           m.moveAndDraw(win);
/* 2068 */           win.drawImage(this.poro, null, m.x - 15, m.y - 20);
/*      */         }
/* 2070 */       } else if (m.getMet() == 13)
/*      */       {
/* 2072 */         if ((m.x > 540) && (m.y > 532)) {
/* 2073 */           if (m.getF()) {
/* 2074 */             m.setDx(0.0D);
/* 2075 */             m.setDy(0.0D);
/* 2076 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2078 */             m.setDx(2.0D);
/* 2079 */             m.setDy(-2.0D);
/* 2080 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2083 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 2084 */           if (m.getF()) {
/* 2085 */             m.setDx(0.0D);
/* 2086 */             m.setDy(0.0D);
/* 2087 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2089 */             m.setDx(0.0D);
/* 2090 */             m.setDy(-2.0D);
/* 2091 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2094 */         else if (m.getF()) {
/* 2095 */           m.setDx(0.0D);
/* 2096 */           m.setDy(0.0D);
/* 2097 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2099 */           m.setDx(2.0D);
/* 2100 */           m.setDy(0.0D);
/* 2101 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2104 */         m.moveAndDraw(win);
/*      */       }
/* 2107 */       else if (m.getMet() == 14)
/*      */       {
/* 2109 */         if ((m.y < 160) && (m.x < 160)) {
/* 2110 */           if (m.getF()) {
/* 2111 */             m.setDx(0.0D);
/* 2112 */             m.setDy(0.0D);
/*      */ 
/* 2114 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2116 */             m.setDy(-2.0D);
/* 2117 */             m.setDx(2.0D);
/* 2118 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2121 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2122 */           if (m.getF()) {
/* 2123 */             m.setDx(0.0D);
/* 2124 */             m.setDy(0.0D);
/*      */ 
/* 2126 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2128 */             m.setDy(0.0D);
/* 2129 */             m.setDx(2.0D);
/* 2130 */             win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2133 */         else if (m.getF()) {
/* 2134 */           m.setDx(0.0D);
/* 2135 */           m.setDy(0.0D);
/* 2136 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2138 */           m.setDy(-2.0D);
/* 2139 */           m.setDx(0.0D);
/* 2140 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2143 */         m.moveAndDraw(win);
/* 2144 */       } else if (m.getMet() == 12) {
/* 2145 */         if (m.getF()) {
/* 2146 */           m.setDx(0.0D);
/* 2147 */           m.setDy(0.0D);
/* 2148 */           m.moveAndDraw(win);
/* 2149 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2151 */           m.setDx(1.0D);
/* 2152 */           m.setDy(-1.0D);
/* 2153 */           m.moveAndDraw(win);
/* 2154 */           win.drawImage(this.smin, null, m.x - 15, m.y - 20);
/*      */         }
/* 2156 */       } else if (m.getMet() == 10)
/*      */       {
/* 2158 */         if ((m.x > 540) && (m.y > 532)) {
/* 2159 */           if (m.getF()) {
/* 2160 */             m.setDx(0.0D);
/* 2161 */             m.setDy(0.0D);
/* 2162 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2164 */             m.setDx(2.0D);
/* 2165 */             m.setDy(-2.0D);
/* 2166 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2169 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 2170 */           if (m.getF()) {
/* 2171 */             m.setDx(0.0D);
/* 2172 */             m.setDy(0.0D);
/* 2173 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2175 */             m.setDx(0.0D);
/* 2176 */             m.setDy(-2.0D);
/* 2177 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2180 */         else if (m.getF()) {
/* 2181 */           m.setDx(0.0D);
/* 2182 */           m.setDy(0.0D);
/* 2183 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2185 */           m.setDx(2.0D);
/* 2186 */           m.setDy(0.0D);
/* 2187 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2190 */         m.moveAndDraw(win);
/*      */       }
/* 2193 */       else if (m.getMet() == 11)
/*      */       {
/* 2195 */         if ((m.y < 160) && (m.x < 160)) {
/* 2196 */           if (m.getF()) {
/* 2197 */             m.setDx(0.0D);
/* 2198 */             m.setDy(0.0D);
/*      */ 
/* 2200 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2202 */             m.setDy(-2.0D);
/* 2203 */             m.setDx(2.0D);
/* 2204 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2207 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2208 */           if (m.getF()) {
/* 2209 */             m.setDx(0.0D);
/* 2210 */             m.setDy(0.0D);
/*      */ 
/* 2212 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2214 */             m.setDy(0.0D);
/* 2215 */             m.setDx(2.0D);
/* 2216 */             win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2219 */         else if (m.getF()) {
/* 2220 */           m.setDx(0.0D);
/* 2221 */           m.setDy(0.0D);
/* 2222 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2224 */           m.setDy(-2.0D);
/* 2225 */           m.setDx(0.0D);
/* 2226 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2229 */         m.moveAndDraw(win);
/* 2230 */       } else if (m.getMet() == 9) {
/* 2231 */         if (m.getF()) {
/* 2232 */           m.setDx(0.0D);
/* 2233 */           m.setDy(0.0D);
/* 2234 */           m.moveAndDraw(win);
/* 2235 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2237 */           m.setDx(1.0D);
/* 2238 */           m.setDy(-1.0D);
/* 2239 */           m.moveAndDraw(win);
/* 2240 */           win.drawImage(this.supermin, null, m.x - 15, m.y - 20);
/*      */         }
/* 2242 */       } else if (m.getMet() == 7)
/*      */       {
/* 2244 */         if ((m.x > 540) && (m.y > 532)) {
/* 2245 */           if (m.getF()) {
/* 2246 */             m.setDx(0.0D);
/* 2247 */             m.setDy(0.0D);
/* 2248 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2250 */             m.setDx(2.0D);
/* 2251 */             m.setDy(-2.0D);
/* 2252 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2255 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 2256 */           if (m.getF()) {
/* 2257 */             m.setDx(0.0D);
/* 2258 */             m.setDy(0.0D);
/* 2259 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2261 */             m.setDx(0.0D);
/* 2262 */             m.setDy(-2.0D);
/* 2263 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2266 */         else if (m.getF()) {
/* 2267 */           m.setDx(0.0D);
/* 2268 */           m.setDy(0.0D);
/* 2269 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2271 */           m.setDx(2.0D);
/* 2272 */           m.setDy(0.0D);
/* 2273 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2276 */         m.moveAndDraw(win);
/*      */       }
/* 2279 */       else if (m.getMet() == 8)
/*      */       {
/* 2281 */         if ((m.y < 160) && (m.x < 160)) {
/* 2282 */           if (m.getF()) {
/* 2283 */             m.setDx(0.0D);
/* 2284 */             m.setDy(0.0D);
/*      */ 
/* 2286 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2288 */             m.setDy(-2.0D);
/* 2289 */             m.setDx(2.0D);
/* 2290 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2293 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2294 */           if (m.getF()) {
/* 2295 */             m.setDx(0.0D);
/* 2296 */             m.setDy(0.0D);
/*      */ 
/* 2298 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2300 */             m.setDy(0.0D);
/* 2301 */             m.setDx(2.0D);
/* 2302 */             win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2305 */         else if (m.getF()) {
/* 2306 */           m.setDx(0.0D);
/* 2307 */           m.setDy(0.0D);
/* 2308 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2310 */           m.setDy(-2.0D);
/* 2311 */           m.setDx(0.0D);
/* 2312 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2315 */         m.moveAndDraw(win);
/* 2316 */       } else if (m.getMet() == 6) {
/* 2317 */         if (m.getF()) {
/* 2318 */           m.setDx(0.0D);
/* 2319 */           m.setDy(0.0D);
/* 2320 */           m.moveAndDraw(win);
/* 2321 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2323 */           m.setDx(1.0D);
/* 2324 */           m.setDy(-1.0D);
/* 2325 */           m.moveAndDraw(win);
/* 2326 */           win.drawImage(this.mewMin, null, m.x - 15, m.y - 20);
/*      */         }
/* 2328 */       } else if (m.getMet() == 4)
/*      */       {
/* 2330 */         if ((m.x > 540) && (m.y > 532)) {
/* 2331 */           if (m.getF()) {
/* 2332 */             m.setDx(0.0D);
/* 2333 */             m.setDy(0.0D);
/* 2334 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2336 */             m.setDx(2.0D);
/* 2337 */             m.setDy(-2.0D);
/* 2338 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2341 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 2342 */           if (m.getF()) {
/* 2343 */             m.setDx(0.0D);
/* 2344 */             m.setDy(0.0D);
/* 2345 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2347 */             m.setDx(0.0D);
/* 2348 */             m.setDy(-2.0D);
/* 2349 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2352 */         else if (m.getF()) {
/* 2353 */           m.setDx(0.0D);
/* 2354 */           m.setDy(0.0D);
/* 2355 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2357 */           m.setDx(2.0D);
/* 2358 */           m.setDy(0.0D);
/* 2359 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2362 */         m.moveAndDraw(win);
/*      */       }
/* 2365 */       else if (m.getMet() == 5)
/*      */       {
/* 2367 */         if ((m.y < 160) && (m.x < 160)) {
/* 2368 */           if (m.getF()) {
/* 2369 */             m.setDx(0.0D);
/* 2370 */             m.setDy(0.0D);
/*      */ 
/* 2372 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2374 */             m.setDy(-2.0D);
/* 2375 */             m.setDx(2.0D);
/* 2376 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2379 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2380 */           if (m.getF()) {
/* 2381 */             m.setDx(0.0D);
/* 2382 */             m.setDy(0.0D);
/*      */ 
/* 2384 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2386 */             m.setDy(0.0D);
/* 2387 */             m.setDx(2.0D);
/* 2388 */             win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2391 */         else if (m.getF()) {
/* 2392 */           m.setDx(0.0D);
/* 2393 */           m.setDy(0.0D);
/* 2394 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2396 */           m.setDy(-2.0D);
/* 2397 */           m.setDx(0.0D);
/* 2398 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2401 */         m.moveAndDraw(win);
/* 2402 */       } else if (m.getMet() == 3) {
/* 2403 */         if (m.getF()) {
/* 2404 */           m.setDx(0.0D);
/* 2405 */           m.setDy(0.0D);
/* 2406 */           m.moveAndDraw(win);
/* 2407 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2409 */           m.setDx(1.0D);
/* 2410 */           m.setDy(-1.0D);
/* 2411 */           m.moveAndDraw(win);
/* 2412 */           win.drawImage(this.newMin, null, m.x - 15, m.y - 20);
/*      */         }
/* 2414 */       } else if (m.getMet() == 1)
/*      */       {
/* 2416 */         if ((m.x > 540) && (m.y > 532)) {
/* 2417 */           if (m.getF()) {
/* 2418 */             m.setDx(0.0D);
/* 2419 */             m.setDy(0.0D);
/* 2420 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2422 */             m.setDx(2.0D);
/* 2423 */             m.setDy(-2.0D);
/* 2424 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2427 */         else if ((m.y <= 532) && (m.x >= 565)) {
/* 2428 */           if (m.getF()) {
/* 2429 */             m.setDx(0.0D);
/* 2430 */             m.setDy(0.0D);
/* 2431 */             win.drawImage(this.back, null, m.x - 5, m.y - 10);
/*      */           } else {
/* 2433 */             m.setDx(0.0D);
/* 2434 */             m.setDy(-2.0D);
/* 2435 */             win.drawImage(this.back, null, m.x - 5, m.y - 10);
/*      */           }
/*      */         }
/* 2438 */         else if (m.getF()) {
/* 2439 */           m.setDx(0.0D);
/* 2440 */           m.setDy(0.0D);
/* 2441 */           win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */         } else {
/* 2443 */           m.setDx(2.0D);
/* 2444 */           m.setDy(0.0D);
/* 2445 */           win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */         }
/*      */ 
/* 2448 */         m.moveAndDraw(win);
/*      */       }
/* 2451 */       else if (m.getMet() == 2)
/*      */       {
/* 2453 */         if ((m.y < 160) && (m.x < 160)) {
/* 2454 */           if (m.getF()) {
/* 2455 */             m.setDx(0.0D);
/* 2456 */             m.setDy(0.0D);
/*      */ 
/* 2458 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2460 */             m.setDy(-2.0D);
/* 2461 */             m.setDx(2.0D);
/* 2462 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2465 */         else if ((m.x >= 160) && (m.y < 160)) {
/* 2466 */           if (m.getF()) {
/* 2467 */             m.setDx(0.0D);
/* 2468 */             m.setDy(0.0D);
/*      */ 
/* 2470 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           } else {
/* 2472 */             m.setDy(0.0D);
/* 2473 */             m.setDx(2.0D);
/* 2474 */             win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */           }
/*      */         }
/* 2477 */         else if (m.getF()) {
/* 2478 */           m.setDx(0.0D);
/* 2479 */           m.setDy(0.0D);
/* 2480 */           win.drawImage(this.back, null, m.x - 5, m.y - 10);
/*      */         } else {
/* 2482 */           m.setDy(-2.0D);
/* 2483 */           m.setDx(0.0D);
/* 2484 */           win.drawImage(this.back, null, m.x - 5, m.y - 10);
/*      */         }
/*      */ 
/* 2487 */         m.moveAndDraw(win);
/*      */       }
/* 2489 */       else if (m.getF()) {
/* 2490 */         m.setDx(0.0D);
/* 2491 */         m.setDy(0.0D);
/* 2492 */         m.moveAndDraw(win);
/* 2493 */         win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */       } else {
/* 2495 */         m.setDx(1.0D);
/* 2496 */         m.setDy(-1.0D);
/* 2497 */         m.moveAndDraw(win);
/* 2498 */         win.drawImage(this.right, null, m.x - 15, m.y - 20);
/*      */       }
/*      */ 
/* 2502 */       if (this.show) {
/* 2503 */         win.drawImage(this.ice, null, m.x, m.y);
/*      */       }
/* 2505 */       if (m.getMet() >= 15) {
/* 2506 */         m.l().x = (m.x - 62);
/* 2507 */         m.l().y = (m.y - 10);
/*      */       } else {
/* 2509 */         m.l().x = m.x;
/* 2510 */         m.l().y = (m.y - 10);
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2516 */     for (int i = 0; i < this.Tower.size(); i++) {
/* 2517 */       if (((buildings)this.Tower.get(i)).mini().size() > 0)
/*      */       {
/* 2520 */         Mininons m = ((buildings)this.Tower.get(i)).min();
/*      */ 
/* 2524 */         if ((m.getMet() == 1) || (m.getMet() == 4) || (m.getMet() == 7) || (m.getMet() == 10) || (m.getMet() == 13) || (m.getMet() == 16))
/*      */         {
/* 2526 */           if ((m.x > 540) && (m.y > 532)) {
/* 2527 */             m.setDy(-2.0D);
/*      */           }
/* 2530 */           else if ((m.y <= 532) && (m.x >= 565)) {
/* 2531 */             m.setDx(0.0D);
/* 2532 */             m.setDy(-2.0D);
/*      */           }
/*      */           else {
/* 2535 */             m.setDx(2.0D);
/* 2536 */             m.setDy(0.0D);
/*      */           }
/*      */ 
/* 2539 */           m.moveAndDraw(win);
/*      */         }
/* 2542 */         else if ((m.getMet() == 2) || (m.getMet() == 5) || (m.getMet() == 8) || (m.getMet() == 11) || (m.getMet() == 14) || (m.getMet() == 17))
/*      */         {
/* 2544 */           if ((m.y < 160) && (m.x < 160)) {
/* 2545 */             m.setDx(2.0D);
/*      */           }
/* 2548 */           else if ((m.x >= 160) && (m.y < 160)) {
/* 2549 */             m.setDy(0.0D);
/* 2550 */             m.setDx(2.0D);
/*      */           }
/*      */           else {
/* 2553 */             m.setDy(-2.0D);
/* 2554 */             m.setDx(0.0D);
/*      */           }
/* 2556 */           m.moveAndDraw(win);
/*      */         } else {
/* 2558 */           m.setDx(1.0D);
/* 2559 */           m.setDy(-1.0D);
/* 2560 */           m.moveAndDraw(win);
/*      */         }
/*      */ 
/* 2563 */         if (m.y < 0) {
/* 2564 */           ((buildings)this.Tower.get(i)).mini().clear();
/* 2565 */           ((buildings)this.Tower.get(i)).kkk().clear();
/*      */         }
/* 2567 */         if (m.x > 660) {
/* 2568 */           ((buildings)this.Tower.get(i)).mini().clear();
/* 2569 */           ((buildings)this.Tower.get(i)).kkk().clear();
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2575 */     for (int i = 0; i < this.nami.size(); i++) {
/* 2576 */       if (((buildings)this.nami.get(i)).mini().size() > 0)
/*      */       {
/* 2579 */         Mininons m = ((buildings)this.nami.get(i)).min();
/*      */ 
/* 2583 */         if ((m.getMet() == 1) || (m.getMet() == 4) || (m.getMet() == 7) || (m.getMet() == 10) || (m.getMet() == 13) || (m.getMet() == 16))
/*      */         {
/* 2585 */           if ((m.x > 540) && (m.y > 532)) {
/* 2586 */             m.setDy(-2.0D);
/*      */           }
/* 2589 */           else if ((m.y <= 532) && (m.x >= 565)) {
/* 2590 */             m.setDx(0.0D);
/* 2591 */             m.setDy(-2.0D);
/*      */           }
/*      */           else {
/* 2594 */             m.setDx(2.0D);
/* 2595 */             m.setDy(0.0D);
/*      */           }
/*      */ 
/* 2598 */           m.moveAndDraw(win);
/*      */         }
/* 2601 */         else if ((m.getMet() == 2) || (m.getMet() == 5) || (m.getMet() == 8) || (m.getMet() == 11) || (m.getMet() == 14) || (m.getMet() == 17))
/*      */         {
/* 2603 */           if ((m.y < 160) && (m.x < 160)) {
/* 2604 */             m.setDx(2.0D);
/*      */           }
/* 2607 */           else if ((m.x >= 160) && (m.y < 160)) {
/* 2608 */             m.setDy(0.0D);
/* 2609 */             m.setDx(2.0D);
/*      */           }
/*      */           else {
/* 2612 */             m.setDy(-2.0D);
/* 2613 */             m.setDx(0.0D);
/*      */           }
/* 2615 */           m.moveAndDraw(win);
/*      */         } else {
/* 2617 */           m.setDx(1.0D);
/* 2618 */           m.setDy(-1.0D);
/* 2619 */           m.moveAndDraw(win);
/*      */         }
/*      */ 
/* 2622 */         if (m.y < 0) {
/* 2623 */           ((buildings)this.nami.get(i)).mini().remove(0);
/* 2624 */           ((buildings)this.nami.get(i)).kkk().clear();
/*      */         }
/* 2626 */         if (m.x > 660) {
/* 2627 */           ((buildings)this.nami.get(i)).mini().remove(0);
/* 2628 */           ((buildings)this.nami.get(i)).kkk().clear();
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2634 */     for (int i = 0; i < this.nami.size(); i++) {
/* 2635 */       if (((buildings)this.nami.get(i)).bigi().size() > 0)
/*      */       {
/* 2638 */         Mininons m = ((buildings)this.nami.get(i)).big();
/*      */ 
/* 2642 */         if ((m.getMet() == 1) || (m.getMet() == 4) || (m.getMet() == 7) || (m.getMet() == 10) || (m.getMet() == 13) || (m.getMet() == 16))
/*      */         {
/* 2644 */           if ((m.x > 540) && (m.y > 532)) {
/* 2645 */             m.setDy(-2.0D);
/*      */           }
/* 2648 */           else if ((m.y <= 532) && (m.x >= 565)) {
/* 2649 */             m.setDx(0.0D);
/* 2650 */             m.setDy(-2.0D);
/*      */           }
/*      */           else {
/* 2653 */             m.setDx(2.0D);
/* 2654 */             m.setDy(0.0D);
/*      */           }
/*      */ 
/* 2657 */           m.moveAndDraw(win);
/*      */         }
/* 2660 */         else if ((m.getMet() == 2) || (m.getMet() == 5) || (m.getMet() == 8) || (m.getMet() == 11) || (m.getMet() == 14) || (m.getMet() == 17))
/*      */         {
/* 2662 */           if ((m.y < 160) && (m.x < 160)) {
/* 2663 */             m.setDx(2.0D);
/*      */           }
/* 2666 */           else if ((m.x >= 160) && (m.y < 160)) {
/* 2667 */             m.setDy(0.0D);
/* 2668 */             m.setDx(2.0D);
/*      */           }
/*      */           else {
/* 2671 */             m.setDy(-2.0D);
/* 2672 */             m.setDx(0.0D);
/*      */           }
/* 2674 */           m.moveAndDraw(win);
/*      */         } else {
/* 2676 */           m.setDx(1.0D);
/* 2677 */           m.setDy(-1.0D);
/* 2678 */           m.moveAndDraw(win);
/*      */         }
/*      */ 
/* 2681 */         if (m.y < 0) {
/* 2682 */           ((buildings)this.nami.get(i)).bigi().clear();
/* 2683 */           ((buildings)this.nami.get(i)).kkll().clear();
/*      */         }
/* 2685 */         if (m.x > 660) {
/* 2686 */           ((buildings)this.nami.get(i)).bigi().clear();
/* 2687 */           ((buildings)this.nami.get(i)).kkll().clear();
/*      */         }
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 2693 */     for (int i = 0; i < this.nunu.size(); i++) {
/* 2694 */       if (((buildings)this.nunu.get(i)).mini().size() > 0)
/*      */       {
/* 2696 */         Mininons m = ((buildings)this.nunu.get(i)).min();
/* 2697 */         if (m.getF())
/*      */         {
/* 2699 */           m.setfti(m.fti() + 1);
/* 2700 */           if (m.fti() >= 40) {
/* 2701 */             m.setF(false);
/* 2702 */             m.setfti(0);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 2709 */         if ((m.getMet() == 1) || (m.getMet() == 4) || (m.getMet() == 7) || (m.getMet() == 10) || (m.getMet() == 13) || (m.getMet() == 16))
/*      */         {
/* 2711 */           if ((m.x > 540) && (m.y > 532))
/*      */           {
/* 2713 */             if (m.getF()) {
/* 2714 */               m.setDx(0.0D);
/* 2715 */               m.setDy(0.0D);
/*      */             } else {
/* 2717 */               m.setDy(-2.0D);
/*      */             }
/*      */           }
/* 2720 */           else if ((m.y <= 532) && (m.x >= 565)) {
/* 2721 */             if (m.getF()) {
/* 2722 */               m.setDx(0.0D);
/* 2723 */               m.setDy(0.0D);
/*      */             } else {
/* 2725 */               m.setDx(0.0D);
/* 2726 */               m.setDy(-2.0D);
/*      */             }
/*      */           }
/* 2729 */           else if (m.getF()) {
/* 2730 */             m.setDx(0.0D);
/* 2731 */             m.setDy(0.0D);
/*      */           } else {
/* 2733 */             m.setDx(2.0D);
/* 2734 */             m.setDy(0.0D);
/*      */           }
/*      */ 
/* 2737 */           m.moveAndDraw(win);
/*      */         }
/* 2740 */         else if ((m.getMet() == 2) || (m.getMet() == 5) || (m.getMet() == 8) || (m.getMet() == 11) || (m.getMet() == 14) || (m.getMet() == 17))
/*      */         {
/* 2742 */           if ((m.y < 160) && (m.x < 160)) {
/* 2743 */             if (m.getF()) {
/* 2744 */               m.setDx(0.0D);
/* 2745 */               m.setDy(0.0D);
/*      */             } else {
/* 2747 */               m.setDx(2.0D);
/*      */             }
/*      */           }
/* 2750 */           else if ((m.x >= 160) && (m.y < 160)) {
/* 2751 */             if (m.getF()) {
/* 2752 */               m.setDx(0.0D);
/* 2753 */               m.setDy(0.0D);
/*      */             } else {
/* 2755 */               m.setDy(0.0D);
/* 2756 */               m.setDx(2.0D);
/*      */             }
/*      */           }
/* 2759 */           else if (m.getF()) {
/* 2760 */             m.setDx(0.0D);
/* 2761 */             m.setDy(0.0D);
/*      */           } else {
/* 2763 */             m.setDy(-2.0D);
/* 2764 */             m.setDx(0.0D);
/*      */           }
/*      */ 
/* 2767 */           m.moveAndDraw(win);
/*      */         } else {
/* 2769 */           if (m.getF()) {
/* 2770 */             m.setDx(0.0D);
/* 2771 */             m.setDy(0.0D);
/*      */           } else {
/* 2773 */             m.setDx(1.0D);
/* 2774 */             m.setDy(-1.0D);
/*      */           }
/* 2776 */           m.moveAndDraw(win);
/*      */         }
/*      */ 
/* 2779 */         if (m.y < 0) {
/* 2780 */           ((buildings)this.nunu.get(i)).mini().remove(0);
/* 2781 */           ((buildings)this.nunu.get(i)).kkk().clear();
/*      */         }
/* 2783 */         if (m.x > 660) {
/* 2784 */           ((buildings)this.nunu.get(i)).mini().remove(0);
/* 2785 */           ((buildings)this.nunu.get(i)).kkk().clear();
/*      */         }
/*      */       }
/*      */     }
/* 2789 */     for (int i = 0; i < this.nunu.size(); i++)
/* 2790 */       if (((buildings)this.nunu.get(i)).bigi().size() > 0)
/*      */       {
/* 2793 */         Mininons m = ((buildings)this.nunu.get(i)).big();
/* 2794 */         if (m.getF()) {
/* 2795 */           System.out.println("kk");
/* 2796 */           m.setfti(m.fti() + 1);
/* 2797 */           if (m.fti() >= 50) {
/* 2798 */             m.setF(false);
/* 2799 */             m.setfti(0);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 2805 */         if ((m.getMet() == 1) || (m.getMet() == 4) || (m.getMet() == 7) || (m.getMet() == 10) || (m.getMet() == 13) || (m.getMet() == 16))
/*      */         {
/* 2807 */           if ((m.x > 540) && (m.y > 532)) {
/* 2808 */             if (m.getF()) {
/* 2809 */               m.setDx(0.0D);
/* 2810 */               m.setDy(0.0D);
/*      */             } else {
/* 2812 */               m.setDy(-2.0D);
/*      */             }
/*      */ 
/*      */           }
/* 2816 */           else if ((m.y <= 532) && (m.x >= 565)) {
/* 2817 */             if ((m.x > 540) && (m.y > 532)) {
/* 2818 */               if (m.getF()) {
/* 2819 */                 m.setDx(0.0D);
/* 2820 */                 m.setDy(0.0D);
/*      */               } else {
/* 2822 */                 m.setDx(0.0D);
/* 2823 */                 m.setDy(-2.0D);
/*      */               }
/*      */             }
/*      */           }
/* 2827 */           else if ((m.x > 540) && (m.y > 532)) {
/* 2828 */             if (m.getF()) {
/* 2829 */               m.setDx(0.0D);
/* 2830 */               m.setDy(0.0D);
/*      */             } else {
/* 2832 */               m.setDx(2.0D);
/* 2833 */               m.setDy(0.0D);
/*      */             }
/*      */           }
/*      */ 
/* 2837 */           m.moveAndDraw(win);
/*      */         }
/* 2840 */         else if ((m.getMet() == 2) || (m.getMet() == 5) || (m.getMet() == 8) || (m.getMet() == 11) || (m.getMet() == 14) || (m.getMet() == 17))
/*      */         {
/* 2842 */           if ((m.y < 160) && (m.x < 160)) {
/* 2843 */             if ((m.x > 540) && (m.y > 532)) {
/* 2844 */               if (m.getF()) {
/* 2845 */                 m.setDx(0.0D);
/* 2846 */                 m.setDy(0.0D);
/*      */               } else {
/* 2848 */                 m.setDx(2.0D);
/*      */               }
/*      */             }
/*      */           }
/* 2852 */           else if ((m.x >= 160) && (m.y < 160))
/*      */           {
/* 2854 */             if ((m.x > 540) && (m.y > 532)) {
/* 2855 */               if (m.getF()) {
/* 2856 */                 m.setDx(0.0D);
/* 2857 */                 m.setDy(0.0D);
/*      */               } else {
/* 2859 */                 m.setDy(0.0D);
/* 2860 */                 m.setDx(2.0D);
/*      */               }
/*      */             }
/*      */           }
/* 2864 */           else if ((m.x > 540) && (m.y > 532)) {
/* 2865 */             if (m.getF()) {
/* 2866 */               m.setDx(0.0D);
/* 2867 */               m.setDy(0.0D);
/*      */             } else {
/* 2869 */               m.setDy(-2.0D);
/* 2870 */               m.setDx(0.0D);
/*      */             }
/*      */           }
/*      */ 
/* 2874 */           m.moveAndDraw(win);
/*      */         }
/* 2877 */         else if ((m.x > 540) && (m.y > 532)) {
/* 2878 */           if (m.getF()) {
/* 2879 */             m.setDx(0.0D);
/* 2880 */             m.setDy(0.0D);
/*      */           } else {
/* 2882 */             m.setDx(1.0D);
/* 2883 */             m.setDy(-1.0D);
/* 2884 */             m.moveAndDraw(win);
/*      */           }
/*      */         }
/*      */ 
/* 2888 */         if (m.y < 0) {
/* 2889 */           ((buildings)this.nunu.get(i)).bigi().remove(0);
/* 2890 */           ((buildings)this.nunu.get(i)).kkll().clear();
/*      */         }
/* 2892 */         if (m.x > 660) {
/* 2893 */           ((buildings)this.nunu.get(i)).bigi().remove(0);
/* 2894 */           ((buildings)this.nunu.get(i)).kkll().clear();
/*      */         }
/*      */       }
/*      */   }
/*      */ 
/*      */   public void spawnAmmo()
/*      */   {
/* 2904 */     for (int i = 0; i < this.Tower.size(); i++) {
/* 2905 */       ArrayList kk = new ArrayList();
/* 2906 */       for (int j = 0; j < this.cs.size(); j++) {
/* 2907 */         if (((RoundRectangle2D)this.range.get(i)).intersects((Rectangle2D)this.cs.get(j))) {
/* 2908 */           kk.add((Mininons)this.cs.get(j));
/*      */         }
/*      */       }
/*      */ 
/* 2912 */       if ((((buildings)this.Tower.get(i)).getTimer() > ((buildings)this.Tower.get(i)).getDelay()) && 
/* 2913 */         (kk.size() > 0))
/*      */       {
/* 2915 */         ((buildings)this.Tower.get(i)).spawnBullets();
/*      */ 
/* 2917 */         ((buildings)this.Tower.get(i)).setTimer(0);
/*      */       }
/*      */ 
/* 2920 */       ((buildings)this.Tower.get(i)).setTimer(((buildings)this.Tower.get(i)).getTimer() + 1);
/*      */     }
/* 2922 */     for (int i = 0; i < this.nami.size(); i++) {
/* 2923 */       ArrayList kk = new ArrayList();
/* 2924 */       for (int j = 0; j < this.cs.size(); j++) {
/* 2925 */         if (new RoundRectangle2D.Float(((buildings)this.nami.get(i)).x - 125, ((buildings)this.nami.get(i)).y - 125, 290.0F, 290.0F, 290.0F, 290.0F).intersects((Rectangle2D)this.cs.get(j))) {
/* 2926 */           kk.add((Mininons)this.cs.get(j));
/*      */         }
/*      */       }
/*      */ 
/* 2930 */       if ((((buildings)this.nami.get(i)).getTimer() > ((buildings)this.nami.get(i)).getDelay()) && 
/* 2931 */         (kk.size() > 0) && (((buildings)this.nami.get(i)).BulSize() == 0))
/*      */       {
/* 2933 */         ((buildings)this.nami.get(i)).spawnBullets();
/*      */ 
/* 2935 */         ((buildings)this.nami.get(i)).setTimer(0);
/*      */       }
/*      */ 
/* 2938 */       if (((buildings)this.nami.get(i)).getTsu()) {
/* 2939 */         if ((((buildings)this.nami.get(i)).getWave() > 80 - ((buildings)this.nami.get(i)).getMinus()) && 
/* 2940 */           (kk.size() > 0) && (((buildings)this.nami.get(i)).bigi().size() > 0)) {
/* 2941 */           ((buildings)this.nami.get(i)).addWave(((buildings)this.nami.get(i)).x, ((buildings)this.nami.get(i)).y, 90, 70);
/* 2942 */           ((buildings)this.nami.get(i)).setWave(0);
/*      */         }
/*      */ 
/* 2945 */         ((buildings)this.nami.get(i)).setWave(((buildings)this.nami.get(i)).getWave() + 1);
/*      */       }
/* 2947 */       ((buildings)this.nami.get(i)).setTimer(((buildings)this.nami.get(i)).getTimer() + 1);
/*      */     }
/*      */ 
/* 2950 */     for (int i = 0; i < this.nunu.size(); i++) {
/* 2951 */       ArrayList kk = new ArrayList();
/* 2952 */       for (int j = 0; j < this.cs.size(); j++) {
/* 2953 */         if (new RoundRectangle2D.Float(((buildings)this.nunu.get(i)).x - 125, ((buildings)this.nunu.get(i)).y - 125, 290.0F, 290.0F, 290.0F, 290.0F).intersects((Rectangle2D)this.cs.get(j))) {
/* 2954 */           kk.add((Mininons)this.cs.get(j));
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 2959 */       if ((((buildings)this.nunu.get(i)).getTimer() > ((buildings)this.nunu.get(i)).getDelay()) && 
/* 2960 */         (kk.size() > 0))
/*      */       {
/* 2962 */         ((buildings)this.nunu.get(i)).spawnBullets();
/*      */ 
/* 2964 */         ((buildings)this.nunu.get(i)).setTimer(0);
/*      */       }
/*      */ 
/* 2967 */       if (((buildings)this.nunu.get(i)).getTsu()) {
/* 2968 */         if ((((buildings)this.nunu.get(i)).getWave() > 100 - ((buildings)this.nunu.get(i)).getMinus()) && 
/* 2969 */           (kk.size() > 0) && (((buildings)this.nunu.get(i)).bigi().size() > 0)) {
/* 2970 */           if (((buildings)this.nunu.get(i)).getTt() <= 1)
/* 2971 */             ((buildings)this.nunu.get(i)).r().add(new RoundRectangle2D.Float(((buildings)this.nunu.get(i)).x - 125, ((buildings)this.nunu.get(i)).y - 125, 290.0F, 290.0F, 290.0F, 290.0F));
/*      */           else {
/* 2973 */             ((buildings)this.nunu.get(i)).r().add(new RoundRectangle2D.Float(((buildings)this.nunu.get(i)).x - 140, ((buildings)this.nunu.get(i)).y - 140, 320.0F, 320.0F, 320.0F, 320.0F));
/*      */           }
/*      */ 
/* 2976 */           ((buildings)this.nunu.get(i)).setWave(0);
/*      */         }
/*      */ 
/* 2979 */         ((buildings)this.nunu.get(i)).setWave(((buildings)this.nunu.get(i)).getWave() + 1);
/*      */       }
/*      */ 
/* 2982 */       ((buildings)this.nunu.get(i)).setTimer(((buildings)this.nunu.get(i)).getTimer() + 1);
/*      */     }
/* 2984 */     for (int i = 0; i < this.garen.size(); i++) {
/* 2985 */       ArrayList kk = new ArrayList();
/* 2986 */       for (int j = 0; j < this.cs.size(); j++) {
/* 2987 */         if (((RoundRectangle2D)this.range3.get(i)).intersects((Rectangle2D)this.cs.get(j))) {
/* 2988 */           kk.add((Mininons)this.cs.get(j));
/*      */         }
/*      */       }
/*      */ 
/* 2992 */       if ((((buildings)this.garen.get(i)).getTimer() > ((buildings)this.garen.get(i)).getDelay()) && 
/* 2993 */         (kk.size() > 0) && (((buildings)this.garen.get(i)).bigi().size() > 0))
/*      */       {
/* 2995 */         ((buildings)this.garen.get(i)).r().add(new RoundRectangle2D.Float(((buildings)this.garen.get(i)).x - 65, ((buildings)this.garen.get(i)).y - 65, 170.0F, 170.0F, 170.0F, 170.0F));
/*      */ 
/* 2997 */         ((buildings)this.garen.get(i)).setTimer(0);
/*      */       }
/*      */ 
/* 3001 */       ((buildings)this.garen.get(i)).setTimer(((buildings)this.garen.get(i)).getTimer() + 1);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void MADammo(Graphics2D win)
/*      */   {
/* 3010 */     for (int i = 0; i < this.nunu.size(); i++) {
/* 3011 */       if (((buildings)this.nunu.get(i)).getTsu()) {
/* 3012 */         if (((buildings)this.nunu.get(i)).kkll().size() == 0)
/*      */         {
/* 3015 */           for (int l = 0; l < this.cs.size(); l++) {
/* 3016 */             if (new RoundRectangle2D.Float(((buildings)this.nunu.get(i)).x - 125, ((buildings)this.nunu.get(i)).y - 125, 290.0F, 290.0F, 290.0F, 290.0F).intersects((Rectangle2D)this.cs.get(l)))
/*      */             {
/* 3018 */               if (((buildings)this.nunu.get(i)).kkll().size() == 0)
/*      */               {
/* 3020 */                 ((buildings)this.nunu.get(i)).makeBig();
/* 3021 */                 ((buildings)this.nunu.get(i)).big().x = ((Mininons)this.cs.get(l)).x;
/* 3022 */                 ((buildings)this.nunu.get(i)).big().y = ((Mininons)this.cs.get(l)).y;
/* 3023 */                 ((buildings)this.nunu.get(i)).big().setMet(((Mininons)this.cs.get(l)).getMet());
/*      */               }
/*      */ 
/* 3026 */               ((buildings)this.nunu.get(i)).kkll().add((Mininons)this.cs.get(l));
/*      */             }
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 3032 */         for (int j = 0; j < ((buildings)this.nunu.get(i)).r().size(); j++) {
/* 3033 */           RoundRectangle2D fire = (RoundRectangle2D)((buildings)this.nunu.get(i)).r().get(j);
/*      */ 
/* 3040 */           win.drawImage(this.flake, null, ((buildings)this.nunu.get(i)).x - 115, ((buildings)this.nunu.get(i)).y - 125);
/* 3041 */           win.setColor(new Color(0, 255, 200, 50));
/* 3042 */           win.fill(fire);
/*      */ 
/* 3044 */           if (((buildings)this.nunu.get(i)).bigi().size() <= 0) {
/* 3045 */             ((buildings)this.nunu.get(i)).r().remove(j);
/*      */           }
/* 3048 */           else if (((buildings)this.nunu.get(i)).bigi().size() > 0) {
/* 3049 */             ((buildings)this.nunu.get(i)).setIce(true);
/*      */           }
/* 3051 */           if (((buildings)this.nunu.get(i)).getIce())
/*      */           {
/* 3053 */             if ((((buildings)this.nunu.get(i)).bigi().size() > 0) && (((buildings)this.nunu.get(i)).mini().size() > 0) && (fire.intersects(((buildings)this.nunu.get(i)).min()))) {
/* 3054 */               ((buildings)this.nunu.get(i)).min().setF(true);
/*      */             }
/*      */ 
/* 3057 */             for (int d = 0; d < this.cs.size(); d++) {
/* 3058 */               if ((((buildings)this.nunu.get(i)).bigi().size() > 0) && (fire.intersects((Rectangle2D)this.cs.get(d)))) {
/* 3059 */                 ((Mininons)this.cs.get(d)).setF(true);
/*      */               }
/*      */ 
/* 3064 */               if ((((buildings)this.nunu.get(i)).bigi().size() > 0) && (fire.intersects((Rectangle2D)this.cs.get(d))) && (((Mininons)this.cs.get(d)).getFF() != 1)) {
/* 3065 */                 if (((Mininons)this.cs.get(d)).gethealth() == 100)
/* 3066 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg() / 40));
/* 3067 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3068 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg() / 32);
/* 3069 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3070 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg() / 12);
/* 3071 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3072 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg() / 4);
/* 3073 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3074 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg() / 2);
/*      */                 else {
/* 3076 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - ((buildings)this.nunu.get(i)).getDmg());
/*      */                 }
/* 3078 */                 ((Mininons)this.cs.get(d)).setFF(1);
/*      */               }
/*      */             }
/*      */           }
/*      */ 
/* 3083 */           if ((((buildings)this.nunu.get(i)).getWave() > 10) && (((buildings)this.nunu.get(i)).bigi().size() > 0)) {
/* 3084 */             ((buildings)this.nunu.get(i)).r().clear();
/* 3085 */             ((buildings)this.nunu.get(i)).kkll().clear();
/* 3086 */             ((buildings)this.nunu.get(i)).bigi().clear();
/* 3087 */             ((buildings)this.nunu.get(i)).setIce(false);
/* 3088 */             for (int q = 0; q < this.cs.size(); q++) {
/* 3089 */               ((Mininons)this.cs.get(q)).setFF(0);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 3095 */     for (int i = 0; i < this.Tower.size(); i++)
/*      */     {
/* 3098 */       if (((buildings)this.Tower.get(i)).kkk().size() == 0) {
/* 3099 */         for (int l = 0; l < this.cs.size(); l++) {
/* 3100 */           if ((((RoundRectangle2D)this.range.get(i)).intersects((Rectangle2D)this.cs.get(l))) && (((buildings)this.Tower.get(i)).BulSize() < 2))
/*      */           {
/* 3102 */             if (((buildings)this.Tower.get(i)).kkk().size() == 0)
/*      */             {
/* 3104 */               ((buildings)this.Tower.get(i)).makeRec();
/* 3105 */               ((buildings)this.Tower.get(i)).min().x = ((Mininons)this.cs.get(l)).x;
/* 3106 */               ((buildings)this.Tower.get(i)).min().y = ((Mininons)this.cs.get(l)).y;
/* 3107 */               ((buildings)this.Tower.get(i)).min().setMet(((Mininons)this.cs.get(l)).getMet());
/*      */             }
/*      */ 
/* 3110 */             ((buildings)this.Tower.get(i)).kkk().add((Mininons)this.cs.get(l));
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 3116 */       for (int j = 0; j < ((buildings)this.Tower.get(i)).BulSize(); j++) {
/* 3117 */         TowerFire fire = ((buildings)this.Tower.get(i)).shoo(j);
/* 3118 */         double x = 0.0D;
/* 3119 */         double y = 0.0D;
/* 3120 */         double w = 0.0D;
/* 3121 */         double ww = 0.0D;
/* 3122 */         ((buildings)this.Tower.get(i)).setinter(false);
/* 3123 */         for (int q = 0; q < this.cs.size(); q++) {
/* 3124 */           if ((((buildings)this.Tower.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(q)).intersects(((buildings)this.Tower.get(i)).min()))) {
/* 3125 */             ((buildings)this.Tower.get(i)).setinter(true);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 3131 */         if (!((buildings)this.Tower.get(i)).inter()) {
/* 3132 */           ((buildings)this.Tower.get(i)).mini().clear();
/* 3133 */           ((buildings)this.Tower.get(i)).kkk().clear();
/*      */         }
/* 3135 */         if (((buildings)this.Tower.get(i)).mini().size() > 0) {
/* 3136 */           w = ((buildings)this.Tower.get(i)).min().x - ((buildings)this.Tower.get(i)).x;
/* 3137 */           ww = ((buildings)this.Tower.get(i)).min().y - ((buildings)this.Tower.get(i)).y;
/*      */         }
/*      */ 
/* 3141 */         x = w / 9.0D;
/* 3142 */         y = ww / 9.0D;
/* 3143 */         fire.setDx(x);
/* 3144 */         fire.setDy(y);
/*      */ 
/* 3146 */         fire.moveAndDraw(win);
/* 3147 */         win.drawImage(this.prup, null, fire.x - 10, fire.y - 10);
/* 3148 */         if (((buildings)this.Tower.get(i)).kkk().size() <= 0) {
/* 3149 */           ((buildings)this.Tower.get(i)).sho().remove(j);
/* 3150 */         } else if ((((buildings)this.Tower.get(i)).mini().size() > 0) && (fire.intersects(((buildings)this.Tower.get(i)).min()))) {
/* 3151 */           ((buildings)this.Tower.get(i)).sho().remove(j);
/* 3152 */           for (int d = 0; d < this.cs.size(); d++) {
/* 3153 */             if ((((buildings)this.Tower.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(d)).intersects(((buildings)this.Tower.get(i)).min()))) {
/* 3154 */               ((buildings)this.Tower.get(i)).delRec();
/* 3155 */               if (((Mininons)this.cs.get(d)).gethealth() == 100)
/* 3156 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - (2 + ((buildings)this.Tower.get(i)).getDmg() / 12)));
/* 3157 */               else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3158 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.Tower.get(i)).getDmg()) / 32);
/* 3159 */               else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3160 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.Tower.get(i)).getDmg()) / 12);
/* 3161 */               else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3162 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.Tower.get(i)).getDmg()) / 4);
/* 3163 */               else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3164 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (13 + ((buildings)this.Tower.get(i)).getDmg()) / 2);
/*      */               else {
/* 3166 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (13 + ((buildings)this.Tower.get(i)).getDmg()));
/*      */               }
/*      */             }
/*      */           }
/* 3170 */           ((buildings)this.Tower.get(i)).kkk().clear();
/*      */         }
/* 3172 */         for (int s = 0; s < this.cs.size(); s++) {
/* 3173 */           if ((((buildings)this.Tower.get(i)).mini().size() > 0) && (!((Mininons)this.cs.get(s)).intersects(((buildings)this.Tower.get(i)).min()))) {
/* 3174 */             ((buildings)this.Tower.get(i)).kkk().clear();
/* 3175 */             ((buildings)this.Tower.get(i)).mini().clear();
/*      */           }
/*      */ 
/* 3178 */           if (((Mininons)this.cs.get(s)).l().getWidth() <= 0.0D) {
/* 3179 */             this.cs.remove(s);
/* 3180 */             this.gold += 10;
/* 3181 */             this.csd += 1;
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 3187 */     for (int i = 0; i < this.nami.size(); i++)
/*      */     {
/* 3189 */       if (((buildings)this.nami.get(i)).kkk().size() == 0)
/*      */       {
/* 3192 */         for (int l = 0; l < this.cs.size(); l++) {
/* 3193 */           if (new RoundRectangle2D.Float(((buildings)this.nami.get(i)).x - 125, ((buildings)this.nami.get(i)).y - 125, 290.0F, 290.0F, 290.0F, 290.0F).intersects((Rectangle2D)this.cs.get(l)))
/*      */           {
/* 3195 */             if (((buildings)this.nami.get(i)).kkk().size() == 0)
/*      */             {
/* 3197 */               ((buildings)this.nami.get(i)).makeRec();
/* 3198 */               ((buildings)this.nami.get(i)).min().x = ((Mininons)this.cs.get(l)).x;
/* 3199 */               ((buildings)this.nami.get(i)).min().y = ((Mininons)this.cs.get(l)).y;
/* 3200 */               ((buildings)this.nami.get(i)).min().setMet(((Mininons)this.cs.get(l)).getMet());
/*      */             }
/*      */ 
/* 3203 */             ((buildings)this.nami.get(i)).kkk().add((Mininons)this.cs.get(l));
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 3209 */       for (int j = 0; j < ((buildings)this.nami.get(i)).BulSize(); j++) {
/* 3210 */         TowerFire fire = ((buildings)this.nami.get(i)).shoo(j);
/* 3211 */         double x = 0.0D;
/* 3212 */         double y = 0.0D;
/* 3213 */         double w = 0.0D;
/* 3214 */         double ww = 0.0D;
/* 3215 */         ((buildings)this.nami.get(i)).setinter(false);
/* 3216 */         for (int q = 0; q < this.cs.size(); q++) {
/* 3217 */           if ((((buildings)this.nami.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(q)).intersects(((buildings)this.nami.get(i)).min()))) {
/* 3218 */             ((buildings)this.nami.get(i)).setinter(true);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 3224 */         if (!((buildings)this.nami.get(i)).inter()) {
/* 3225 */           ((buildings)this.nami.get(i)).mini().clear();
/* 3226 */           ((buildings)this.nami.get(i)).kkk().clear();
/*      */         }
/* 3228 */         if (((buildings)this.nami.get(i)).mini().size() > 0) {
/* 3229 */           w = ((buildings)this.nami.get(i)).min().x + 10 - ((buildings)this.nami.get(i)).x;
/* 3230 */           ww = ((buildings)this.nami.get(i)).min().y + 10 - ((buildings)this.nami.get(i)).y;
/*      */         }
/*      */ 
/* 3234 */         x = w / 9.0D;
/* 3235 */         y = ww / 9.0D;
/* 3236 */         fire.setDx(x);
/* 3237 */         fire.setDy(y);
/*      */ 
/* 3239 */         fire.moveAndDraw(win);
/* 3240 */         win.drawImage(this.water, null, fire.x - 10, fire.y - 9);
/* 3241 */         if (((buildings)this.nami.get(i)).mini().size() <= 0) {
/* 3242 */           ((buildings)this.nami.get(i)).sho().remove(j);
/* 3243 */         } else if ((((buildings)this.nami.get(i)).mini().size() > 0) && (fire.intersects(((buildings)this.nami.get(i)).min()))) {
/* 3244 */           ((buildings)this.nami.get(i)).sho().remove(j);
/* 3245 */           for (int d = 0; d < this.cs.size(); d++) {
/* 3246 */             if ((((buildings)this.nami.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(d)).intersects(((buildings)this.nami.get(i)).min()))) {
/* 3247 */               ((buildings)this.nami.get(i)).delRec();
/* 3248 */               if (((Mininons)this.cs.get(d)).gethealth() == 100)
/* 3249 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 10));
/* 3250 */               else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3251 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 32);
/* 3252 */               else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3253 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 12);
/* 3254 */               else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3255 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 4);
/* 3256 */               else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3257 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 2);
/*      */               else {
/* 3259 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()));
/*      */               }
/*      */             }
/*      */ 
/*      */           }
/*      */ 
/* 3265 */           ((buildings)this.nami.get(i)).kkk().clear();
/*      */ 
/* 3267 */           for (int s = 0; s < this.cs.size(); s++) {
/* 3268 */             if ((((buildings)this.nami.get(i)).mini().size() > 0) && (!((Mininons)this.cs.get(s)).intersects(((buildings)this.nami.get(i)).min()))) {
/* 3269 */               ((buildings)this.nami.get(i)).kkk().clear();
/* 3270 */               ((buildings)this.nami.get(i)).mini().clear();
/*      */             }
/*      */ 
/* 3273 */             if (((Mininons)this.cs.get(s)).l().getWidth() <= 0.0D) {
/* 3274 */               this.cs.remove(s);
/* 3275 */               this.gold += 10;
/* 3276 */               this.csd += 1;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 3283 */     for (int i = 0; i < this.nami.size(); i++) {
/* 3284 */       if (((buildings)this.nami.get(i)).getTsu()) {
/* 3285 */         if (((buildings)this.nami.get(i)).kkll().size() == 0)
/*      */         {
/* 3288 */           for (int l = 0; l < this.cs.size(); l++) {
/* 3289 */             if (((RoundRectangle2D)this.range1.get(i)).intersects((Rectangle2D)this.cs.get(l))) {
/* 3290 */               ((buildings)this.nami.get(i)).kkll().add((Mininons)this.cs.get(l));
/*      */             }
/*      */           }
/*      */ 
/* 3294 */           if (((buildings)this.nami.get(i)).kkll().size() > 0)
/*      */           {
/* 3296 */             ((buildings)this.nami.get(i)).makeBig();
/* 3297 */             ((buildings)this.nami.get(i)).big().x = ((Mininons)((buildings)this.nami.get(i)).kkll().get(((buildings)this.nami.get(i)).kkll().size() - 1)).x;
/* 3298 */             ((buildings)this.nami.get(i)).big().y = ((Mininons)((buildings)this.nami.get(i)).kkll().get(((buildings)this.nami.get(i)).kkll().size() - 1)).y;
/* 3299 */             ((buildings)this.nami.get(i)).big().setMet(((Mininons)((buildings)this.nami.get(i)).kkll().get(((buildings)this.nami.get(i)).kkll().size() - 1)).getMet());
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 3304 */         for (int j = 0; j < ((buildings)this.nami.get(i)).wa().size(); j++) {
/* 3305 */           TowerFire fire = (TowerFire)((buildings)this.nami.get(i)).wa().get(j);
/* 3306 */           double x = 0.0D;
/* 3307 */           double y = 0.0D;
/* 3308 */           double w = 0.0D;
/* 3309 */           double ww = 0.0D;
/*      */ 
/* 3311 */           if (((buildings)this.nami.get(i)).bigi().size() > 0) {
/* 3312 */             w = ((buildings)this.nami.get(i)).big().x + 10 - ((buildings)this.nami.get(i)).x;
/* 3313 */             ww = ((buildings)this.nami.get(i)).big().y + 10 - ((buildings)this.nami.get(i)).y;
/*      */           }
/*      */ 
/* 3317 */           x = w / 9.0D;
/* 3318 */           y = ww / 9.0D;
/* 3319 */           fire.setDx(x);
/* 3320 */           fire.setDy(y);
/*      */ 
/* 3322 */           fire.moveAndDraw(win);
/* 3323 */           win.drawImage(this.wave, null, fire.x - 15, fire.y - 10);
/* 3324 */           if (((buildings)this.nami.get(i)).bigi().size() <= 0) {
/* 3325 */             ((buildings)this.nami.get(i)).wa().remove(j);
/*      */           }
/*      */ 
/* 3328 */           if (((buildings)this.nami.get(i)).bigi().size() < 0)
/* 3329 */             ((buildings)this.nami.get(i)).wa().remove(j);
/* 3330 */           else if (((buildings)this.nami.get(i)).bigi().size() > 0)
/*      */           {
/* 3332 */             for (int d = 0; d < this.cs.size(); d++) {
/* 3333 */               if ((((buildings)this.nami.get(i)).bigi().size() > 0) && (((Mininons)this.cs.get(d)).intersects((Rectangle)((buildings)this.nami.get(i)).wa().get(j))) && (((Mininons)this.cs.get(d)).getasdf() == 0)) {
/* 3334 */                 if (((Mininons)this.cs.get(d)).gethealth() == 100)
/* 3335 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 5));
/* 3336 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3337 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 32);
/* 3338 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3339 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 12);
/* 3340 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3341 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 4);
/* 3342 */                 else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3343 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()) / 2);
/*      */                 else {
/* 3345 */                   ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nami.get(i)).getDmg()));
/*      */                 }
/* 3347 */                 ((Mininons)this.cs.get(d)).setasdf(1);
/*      */               }
/*      */ 
/*      */             }
/*      */ 
/*      */           }
/*      */ 
/* 3358 */           for (int s = 0; s < this.cs.size(); s++) {
/* 3359 */             if (((Mininons)this.cs.get(s)).l().getWidth() <= 0.0D) {
/* 3360 */               this.cs.remove(s);
/* 3361 */               this.gold += 10;
/* 3362 */               this.csd += 1;
/*      */             }
/*      */           }
/* 3365 */           if ((((buildings)this.nami.get(i)).getWave() > 60) && (((buildings)this.nami.get(i)).bigi().size() > 0)) {
/* 3366 */             ((buildings)this.nami.get(i)).wa().clear();
/* 3367 */             ((buildings)this.nami.get(i)).kkll().clear();
/* 3368 */             ((buildings)this.nami.get(i)).bigi().clear();
/* 3369 */             for (int e = 0; e < this.cs.size(); e++) {
/* 3370 */               ((Mininons)this.cs.get(e)).setasdf(0);
/*      */             }
/*      */           }
/* 3373 */           for (int s = 0; s < ((buildings)this.nami.get(i)).wa().size(); s++) {
/* 3374 */             if ((((buildings)this.nami.get(i)).wa().size() > 0) && (((TowerFire)((buildings)this.nami.get(i)).wa().get(s)).x >= 600)) {
/* 3375 */               ((buildings)this.nami.get(i)).wa().remove(j);
/* 3376 */               ((buildings)this.nami.get(i)).kkll().clear();
/* 3377 */               ((buildings)this.nami.get(i)).bigi().clear();
/* 3378 */               for (int e = 0; e < this.cs.size(); e++) {
/* 3379 */                 ((Mininons)this.cs.get(e)).setasdf(0);
/*      */               }
/*      */             }
/* 3382 */             if ((((buildings)this.nami.get(i)).wa().size() > 0) && (((TowerFire)((buildings)this.nami.get(i)).wa().get(s)).x <= -100)) {
/* 3383 */               ((buildings)this.nami.get(i)).wa().remove(j);
/* 3384 */               ((buildings)this.nami.get(i)).kkll().clear();
/* 3385 */               ((buildings)this.nami.get(i)).bigi().clear();
/* 3386 */               for (int e = 0; e < this.cs.size(); e++) {
/* 3387 */                 ((Mininons)this.cs.get(e)).setasdf(0);
/*      */               }
/*      */             }
/* 3390 */             if ((((buildings)this.nami.get(i)).wa().size() > 0) && (((TowerFire)((buildings)this.nami.get(i)).wa().get(s)).y >= 600)) {
/* 3391 */               ((buildings)this.nami.get(i)).wa().remove(j);
/* 3392 */               ((buildings)this.nami.get(i)).kkll().clear();
/* 3393 */               ((buildings)this.nami.get(i)).bigi().clear();
/* 3394 */               for (int e = 0; e < this.cs.size(); e++) {
/* 3395 */                 ((Mininons)this.cs.get(e)).setasdf(0);
/*      */               }
/*      */             }
/* 3398 */             if ((((buildings)this.nami.get(i)).wa().size() > 0) && (((TowerFire)((buildings)this.nami.get(i)).wa().get(s)).y <= 50)) {
/* 3399 */               ((buildings)this.nami.get(i)).wa().remove(j);
/* 3400 */               ((buildings)this.nami.get(i)).kkll().clear();
/* 3401 */               ((buildings)this.nami.get(i)).bigi().clear();
/* 3402 */               for (int e = 0; e < this.cs.size(); e++) {
/* 3403 */                 ((Mininons)this.cs.get(e)).setasdf(0);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 3410 */     for (int i = 0; i < this.nunu.size(); i++)
/*      */     {
/* 3413 */       if (((buildings)this.nunu.get(i)).kkk().size() == 0) {
/* 3414 */         for (int l = 0; l < this.cs.size(); l++) {
/* 3415 */           if (((RoundRectangle2D)this.range2.get(i)).intersects((Rectangle2D)this.cs.get(l)))
/*      */           {
/* 3417 */             if (((buildings)this.nunu.get(i)).kkk().size() == 0)
/*      */             {
/* 3419 */               ((buildings)this.nunu.get(i)).makeRec();
/* 3420 */               ((buildings)this.nunu.get(i)).min().x = ((Mininons)this.cs.get(l)).x;
/* 3421 */               ((buildings)this.nunu.get(i)).min().y = ((Mininons)this.cs.get(l)).y;
/* 3422 */               ((buildings)this.nunu.get(i)).min().setMet(((Mininons)this.cs.get(l)).getMet());
/*      */             }
/*      */ 
/* 3425 */             ((buildings)this.nunu.get(i)).kkk().add((Mininons)this.cs.get(l));
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 3431 */       for (int j = 0; j < ((buildings)this.nunu.get(i)).BulSize(); j++) {
/* 3432 */         TowerFire fire = ((buildings)this.nunu.get(i)).shoo(j);
/* 3433 */         double x = 0.0D;
/* 3434 */         double y = 0.0D;
/* 3435 */         double w = 0.0D;
/* 3436 */         double ww = 0.0D;
/* 3437 */         ((buildings)this.nunu.get(i)).setinter(false);
/* 3438 */         for (int q = 0; q < this.cs.size(); q++) {
/* 3439 */           if ((((buildings)this.nunu.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(q)).intersects(((buildings)this.nunu.get(i)).min()))) {
/* 3440 */             ((buildings)this.nunu.get(i)).setinter(true);
/*      */           }
/*      */ 
/*      */         }
/*      */ 
/* 3446 */         if (!((buildings)this.nunu.get(i)).inter()) {
/* 3447 */           ((buildings)this.nunu.get(i)).mini().clear();
/* 3448 */           ((buildings)this.nunu.get(i)).kkk().clear();
/*      */         }
/* 3450 */         if (((buildings)this.nunu.get(i)).mini().size() > 0) {
/* 3451 */           w = ((buildings)this.nunu.get(i)).min().x + 10 - ((buildings)this.nunu.get(i)).x;
/* 3452 */           ww = ((buildings)this.nunu.get(i)).min().y + 10 - ((buildings)this.nunu.get(i)).y;
/*      */         }
/*      */ 
/* 3456 */         x = w / 9.0D;
/* 3457 */         y = ww / 9.0D;
/* 3458 */         fire.setDx(x);
/* 3459 */         fire.setDy(y);
/*      */ 
/* 3461 */         fire.moveAndDraw(win);
/* 3462 */         win.drawImage(this.snow, null, fire.x - 2, fire.y - 2);
/* 3463 */         if (((buildings)this.nunu.get(i)).kkk().size() <= 0) {
/* 3464 */           ((buildings)this.nunu.get(i)).sho().remove(j);
/* 3465 */         } else if ((((buildings)this.nunu.get(i)).mini().size() > 0) && (fire.intersects(((buildings)this.nunu.get(i)).min()))) {
/* 3466 */           ((buildings)this.nunu.get(i)).sho().remove(j);
/*      */ 
/* 3468 */           for (int d = 0; d < this.cs.size(); d++) {
/* 3469 */             if ((((buildings)this.nunu.get(i)).mini().size() > 0) && (((Mininons)this.cs.get(d)).intersects(((buildings)this.nunu.get(i)).min()))) {
/* 3470 */               ((buildings)this.nunu.get(i)).delRec();
/* 3471 */               if (((Mininons)this.cs.get(d)).gethealth() == 100)
/* 3472 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nunu.get(i)).getDmg()) / 30 + 2.0D));
/* 3473 */               else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3474 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nunu.get(i)).getDmg()) / 32);
/* 3475 */               else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3476 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nunu.get(i)).getDmg()) / 12);
/* 3477 */               else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3478 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nunu.get(i)).getDmg()) / 4);
/* 3479 */               else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3480 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (20 + ((buildings)this.nunu.get(i)).getDmg()) / 2);
/*      */               else {
/* 3482 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - 20 + ((buildings)this.nunu.get(i)).getDmg());
/*      */               }
/*      */             }
/*      */           }
/* 3486 */           ((buildings)this.nunu.get(i)).kkk().clear();
/*      */         }
/* 3488 */         for (int s = 0; s < this.cs.size(); s++)
/*      */         {
/* 3494 */           if (((Mininons)this.cs.get(s)).l().getWidth() <= 0.0D) {
/* 3495 */             this.cs.remove(s);
/* 3496 */             this.gold += 10;
/* 3497 */             this.csd += 1;
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/* 3505 */     for (int i = 0; i < this.garen.size(); i++) {
/* 3506 */       if (((buildings)this.garen.get(i)).getSpin()) {
/* 3507 */         win.drawImage(this.spinn, null, ((buildings)this.garen.get(i)).x - 12, ((buildings)this.garen.get(i)).y - 20);
/* 3508 */         win.drawImage(this.shadow, null, ((buildings)this.garen.get(i)).x, ((buildings)this.garen.get(i)).y - 25);
/* 3509 */         win.drawImage(this.yell, null, ((buildings)this.garen.get(i)).x - 7, ((buildings)this.garen.get(i)).y);
/* 3510 */         win.drawImage(this.yell, null, ((buildings)this.garen.get(i)).x - 7, ((buildings)this.garen.get(i)).y + 12);
/* 3511 */         win.drawImage(this.yell, null, ((buildings)this.garen.get(i)).x - 7, ((buildings)this.garen.get(i)).y + 24);
/* 3512 */         if ((((buildings)this.garen.get(i)).getSpinC() <= 2) || (((buildings)this.garen.get(i)).getSpinC() >= 6)) {
/* 3513 */           win.drawImage(this.slashu, null, ((buildings)this.garen.get(i)).x - 45, ((buildings)this.garen.get(i)).y - 80);
/* 3514 */           win.drawImage(this.dust, null, ((buildings)this.garen.get(i)).x - 72, ((buildings)this.garen.get(i)).y - 65);
/*      */         }
/* 3516 */         if (((((buildings)this.garen.get(i)).getSpinC() >= 1) && (((buildings)this.garen.get(i)).getSpinC() <= 3)) || (((buildings)this.garen.get(i)).getSpinC() >= 6)) {
/* 3517 */           win.drawImage(this.slashd, null, ((buildings)this.garen.get(i)).x - 45, ((buildings)this.garen.get(i)).y + 30);
/*      */         }
/* 3519 */         if (((((buildings)this.garen.get(i)).getSpinC() >= 2) && (((buildings)this.garen.get(i)).getSpinC() <= 5)) || (((buildings)this.garen.get(i)).getSpinC() > 7)) {
/* 3520 */           win.drawImage(this.slash, null, ((buildings)this.garen.get(i)).x - 60, ((buildings)this.garen.get(i)).y - 15);
/*      */         }
/* 3522 */         if (((buildings)this.garen.get(i)).getSpinC() <= 3) {
/* 3523 */           win.drawImage(this.slashr, null, ((buildings)this.garen.get(i)).x - 45, ((buildings)this.garen.get(i)).y);
/*      */         }
/* 3525 */         if ((((buildings)this.garen.get(i)).getSpinC() > 2) && (((buildings)this.garen.get(i)).getSpinC() < 8)) {
/* 3526 */           win.drawImage(this.slashl, null, ((buildings)this.garen.get(i)).x - 45, ((buildings)this.garen.get(i)).y);
/*      */         }
/* 3528 */         if ((((buildings)this.garen.get(i)).getSpinC() > 4) || (((buildings)this.garen.get(i)).getSpinC() == 1)) {
/* 3529 */           win.drawImage(this.slashm, null, ((buildings)this.garen.get(i)).x + 45, ((buildings)this.garen.get(i)).y + 10);
/*      */         }
/*      */ 
/* 3532 */         ((buildings)this.garen.get(i)).setSpinC(((buildings)this.garen.get(i)).getSpinC() + 1);
/* 3533 */         if (((buildings)this.garen.get(i)).getSpinC() > 9) {
/* 3534 */           ((buildings)this.garen.get(i)).setSpin(false);
/* 3535 */           ((buildings)this.garen.get(i)).setSpinC(0);
/*      */         }
/*      */       }
/* 3538 */       if (((buildings)this.garen.get(i)).kkll().size() == 0)
/*      */       {
/* 3541 */         for (int l = 0; l < this.cs.size(); l++) {
/* 3542 */           if (((RoundRectangle2D)this.range3.get(i)).intersects((Rectangle2D)this.cs.get(l)))
/*      */           {
/* 3544 */             if (((buildings)this.garen.get(i)).kkll().size() == 0)
/*      */             {
/* 3546 */               ((buildings)this.garen.get(i)).makeBig();
/* 3547 */               ((buildings)this.garen.get(i)).big().x = ((Mininons)this.cs.get(l)).x;
/* 3548 */               ((buildings)this.garen.get(i)).big().y = ((Mininons)this.cs.get(l)).y;
/* 3549 */               ((buildings)this.garen.get(i)).big().setMet(((Mininons)this.cs.get(l)).getMet());
/*      */             }
/*      */ 
/* 3552 */             ((buildings)this.garen.get(i)).kkll().add((Mininons)this.cs.get(l));
/*      */           }
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/* 3558 */       for (int j = 0; j < ((buildings)this.garen.get(i)).r().size(); j++) {
/* 3559 */         RoundRectangle2D fire = (RoundRectangle2D)((buildings)this.garen.get(i)).r().get(j);
/*      */ 
/* 3562 */         ((buildings)this.garen.get(i)).setSpin(true);
/*      */ 
/* 3567 */         win.setColor(new Color(255, 100, 200, 50));
/* 3568 */         win.fill(fire);
/*      */ 
/* 3570 */         if (((buildings)this.garen.get(i)).bigi().size() <= 0) {
/* 3571 */           ((buildings)this.garen.get(i)).r().remove(j);
/*      */         }
/* 3574 */         else if (((buildings)this.garen.get(i)).bigi().size() > 0)
/*      */         {
/* 3576 */           for (int d = 0; d < this.cs.size(); d++) {
/* 3577 */             if ((((buildings)this.garen.get(i)).bigi().size() > 0) && (((RoundRectangle2D)((buildings)this.garen.get(i)).r().get(j)).intersects((Rectangle2D)this.cs.get(d)))) {
/* 3578 */               if (((Mininons)this.cs.get(d)).gethealth() == 100)
/*      */               {
/* 3580 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - 1.0D));
/*      */               }
/* 3582 */               else if (((Mininons)this.cs.get(d)).gethealth() == 32)
/* 3583 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)(((Mininons)this.cs.get(d)).l().getWidth() - (10 + ((buildings)this.garen.get(i)).getDmg()) / 32.0D));
/* 3584 */               else if (((Mininons)this.cs.get(d)).gethealth() == 12)
/* 3585 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (10 + ((buildings)this.garen.get(i)).getDmg()) / 12);
/* 3586 */               else if (((Mininons)this.cs.get(d)).gethealth() == 4)
/* 3587 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (10 + ((buildings)this.garen.get(i)).getDmg()) / 4);
/* 3588 */               else if (((Mininons)this.cs.get(d)).gethealth() == 2)
/* 3589 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (10 + ((buildings)this.garen.get(i)).getDmg()) / 2);
/*      */               else {
/* 3591 */                 ((Mininons)this.cs.get(d)).l().setWidth((int)((Mininons)this.cs.get(d)).l().getWidth() - (10 + ((buildings)this.garen.get(i)).getDmg()));
/*      */               }
/*      */             }
/*      */ 
/* 3595 */             if (((Mininons)this.cs.get(d)).l().getWidth() <= 0.0D) {
/* 3596 */               this.cs.remove(d);
/* 3597 */               this.gold += 10;
/* 3598 */               this.csd += 1;
/*      */             }
/*      */           }
/*      */         }
/* 3602 */         if ((((buildings)this.garen.get(i)).getTimer() > 0) && (((buildings)this.garen.get(i)).bigi().size() > 0)) {
/* 3603 */           ((buildings)this.garen.get(i)).r().clear();
/* 3604 */           ((buildings)this.garen.get(i)).kkll().clear();
/* 3605 */           ((buildings)this.garen.get(i)).bigi().clear();
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   public void mouseDragged(MouseEvent e)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void mouseMoved(MouseEvent e)
/*      */   {
/* 3621 */     this.movex = e.getX();
/* 3622 */     this.movey = e.getY();
/*      */   }
/*      */ }

/* Location:           C:\Users\Brian Tsai\Documents\High school\2015-2016 Junior\Comp Sci Games\522 LOL.jar
 * Qualified Name:     Finale
 * JD-Core Version:    0.6.2
 */