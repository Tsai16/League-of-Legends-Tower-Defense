/*     */ import java.awt.Rectangle;
/*     */ import java.awt.geom.RoundRectangle2D;
/*     */ import java.awt.geom.RoundRectangle2D.Float;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class buildings extends GameObject
/*     */ {
/*     */   private boolean shopping;
/*     */   private boolean inty;
/*     */   private boolean iceplosion;
/*     */   private boolean spinning;
/*     */   private boolean tsu;
/*     */   private int minus;
/*     */   private int dmg;
/*     */   private int spinC;
/*     */   private ArrayList<TowerFire> shoot;
/*     */   private ArrayList<Mininons> fake;
/*     */   private ArrayList<Mininons> bigfake;
/*     */   private ArrayList<Mininons> kk;
/*     */   private ArrayList<Mininons> kkl;
/*  20 */   private int wave = 0;
/*  21 */   private int aTimer = 0; private int aDelay = 25;
/*     */   private int iden;
/*     */   private ArrayList<TowerFire> w;
/*     */   private ArrayList<RoundRectangle2D> ult;
/*     */   private Rectangle cancel;
/*     */   private Rectangle sell;
/*     */   private Rectangle up;
/*     */   private ArrayList<Mininons> stab;
/*     */   private int tt;
/*     */   private int selling;
/*     */   private boolean stabs;
/*     */   private boolean clicked;
/*     */ 
/*     */   public buildings()
/*     */   {
/*  35 */     super(100, 100, 40, 40, 0.0D, 0.0D);
/*  36 */     this.stab = new ArrayList();
/*  37 */     this.shoot = new ArrayList();
/*  38 */     this.fake = new ArrayList();
/*  39 */     this.w = new ArrayList();
/*  40 */     this.ult = new ArrayList();
/*  41 */     this.bigfake = new ArrayList();
/*  42 */     this.kk = new ArrayList();
/*  43 */     this.kkl = new ArrayList();
/*  44 */     this.iceplosion = false;
/*  45 */     this.inty = false;
/*  46 */     this.spinC = 0;
/*  47 */     this.dmg = 0;
/*  48 */     this.minus = 0;
/*  49 */     this.cancel = new Rectangle(820, 490, 40, 40);
/*  50 */     this.sell = new Rectangle(900, 490, 40, 40);
/*  51 */     this.up = new Rectangle(740, 490, 40, 40);
/*  52 */     this.tt = 0;
/*  53 */     this.selling = 0;
/*  54 */     this.stabs = false;
/*     */   }
/*     */ 
/*     */   public void setClick(boolean x) {
/*  58 */     this.clicked = x;
/*     */   }
/*     */   public boolean getClick() {
/*  61 */     return this.clicked;
/*     */   }
/*     */   public void setStabs(boolean x) {
/*  64 */     this.stabs = x;
/*     */   }
/*     */   public boolean getStabs() {
/*  67 */     return this.stabs;
/*     */   }
/*     */   public void setDmg(int x) {
/*  70 */     this.dmg = x;
/*     */   }
/*     */   public int getDmg() {
/*  73 */     return this.dmg;
/*     */   }
/*     */   public void setSelling(int x) {
/*  76 */     this.selling = x;
/*     */   }
/*     */   public int getSelling() {
/*  79 */     return this.selling;
/*     */   }
/*     */   public void setMinus(int x) {
/*  82 */     this.minus = x;
/*     */   }
/*     */   public int getMinus() {
/*  85 */     return this.minus;
/*     */   }
/*     */   public void setTsu(boolean x) {
/*  88 */     this.tsu = x;
/*     */   }
/*     */   public boolean getTsu() {
/*  91 */     return this.tsu;
/*     */   }
/*     */   public Rectangle getCan() {
/*  94 */     return this.cancel;
/*     */   }
/*     */   public Rectangle getSell() {
/*  97 */     return this.sell;
/*     */   }
/*     */   public Rectangle getUp() {
/* 100 */     return this.up;
/*     */   }
/*     */   public void spawnBullets() {
/* 103 */     this.shoot.add(new TowerFire());
/* 104 */     ((TowerFire)this.shoot.get(this.shoot.size() - 1)).setLocation(this.x, this.y);
/*     */   }
/*     */   public int BulSize() {
/* 107 */     return this.shoot.size();
/*     */   }
/*     */   public ArrayList<TowerFire> sho() {
/* 110 */     return this.shoot;
/*     */   }
/*     */   public ArrayList<RoundRectangle2D> r() {
/* 113 */     return this.ult;
/*     */   }
/*     */   public void setIce(boolean x) {
/* 116 */     this.iceplosion = x;
/*     */   }
/*     */   public boolean getIce() {
/* 119 */     return this.iceplosion;
/*     */   }
/*     */   public void addUlt(int x, int y, int w) {
/* 122 */     this.ult.add(new RoundRectangle2D.Float(x, y, w, w, w, w));
/*     */   }
/*     */   public ArrayList<TowerFire> wa() {
/* 125 */     return this.w;
/*     */   }
/*     */   public void addWave(int x, int y, int l, int h) {
/* 128 */     this.w.add(new TowerFire());
/* 129 */     ((TowerFire)this.w.get(this.w.size() - 1)).setHeight(h);
/* 130 */     ((TowerFire)this.w.get(this.w.size() - 1)).setWidth(l);
/* 131 */     ((TowerFire)this.w.get(this.w.size() - 1)).x = x;
/* 132 */     ((TowerFire)this.w.get(this.w.size() - 1)).y = y;
/*     */   }
/*     */   public void setTt(int x) {
/* 135 */     this.tt = x;
/*     */   }
/*     */   public int getTt() {
/* 138 */     return this.tt;
/*     */   }
/*     */   public TowerFire shoo(int a) {
/* 141 */     return (TowerFire)this.shoot.get(a);
/*     */   }
/*     */   public void Setx(int a, double b) {
/* 144 */     ((TowerFire)this.shoot.get(a)).setDx(b);
/*     */   }
/*     */   public void Sety(int a, double b) {
/* 147 */     ((TowerFire)this.shoot.get(a)).setDy(b);
/*     */   }
/*     */   public int getTimer() {
/* 150 */     return this.aTimer;
/*     */   }
/*     */   public void setTimer(int result) {
/* 153 */     this.aTimer = result;
/*     */   }
/*     */   public int getDelay() {
/* 156 */     return this.aDelay;
/*     */   }
/*     */   public void setDelay(int x) {
/* 159 */     this.aDelay = x;
/*     */   }
/*     */   public boolean getShopping() {
/* 162 */     return this.shopping;
/*     */   }
/*     */   public void setShopping(boolean result) {
/* 165 */     this.shopping = result;
/*     */   }
/*     */   public void setIden(int x) {
/* 168 */     this.iden = x;
/*     */   }
/*     */   public int getIden() {
/* 171 */     return this.iden;
/*     */   }
/*     */   public void makeRec() {
/* 174 */     this.fake.add(new Mininons());
/*     */   }
/*     */   public void setRecLoc(int x, int y) {
/* 177 */     ((Mininons)this.fake.get(0)).setLocation(x, y);
/*     */   }
/*     */   public Mininons min() {
/* 180 */     return (Mininons)this.fake.get(0);
/*     */   }
/*     */   public ArrayList<Mininons> mini() {
/* 183 */     return this.fake;
/*     */   }
/*     */   public void delRec() {
/* 186 */     this.fake.remove(0);
/*     */   }
/*     */   public void setWave(int x) {
/* 189 */     this.wave = x;
/*     */   }
/*     */   public int getWave() {
/* 192 */     return this.wave;
/*     */   }
/*     */   public void makeBig() {
/* 195 */     this.bigfake.add(new Mininons());
/*     */   }
/*     */   public void setBigLoc(int x, int y) {
/* 198 */     ((Mininons)this.bigfake.get(0)).setLocation(x, y);
/*     */   }
/*     */   public Mininons big() {
/* 201 */     return (Mininons)this.bigfake.get(0);
/*     */   }
/*     */   public ArrayList<Mininons> bigi() {
/* 204 */     return this.bigfake;
/*     */   }
/*     */   public void delBig() {
/* 207 */     this.bigfake.remove(0);
/*     */   }
/*     */   public ArrayList<Mininons> kkk() {
/* 210 */     return this.kk;
/*     */   }
/*     */   public ArrayList<Mininons> kkll() {
/* 213 */     return this.kkl;
/*     */   }
/*     */   public boolean inter() {
/* 216 */     return this.inty;
/*     */   }
/*     */   public void setinter(boolean x) {
/* 219 */     this.inty = x;
/*     */   }
/*     */   public void setSpin(boolean x) {
/* 222 */     this.spinning = x;
/*     */   }
/*     */   public boolean getSpin() {
/* 225 */     return this.spinning;
/*     */   }
/*     */   public int getSpinC() {
/* 228 */     return this.spinC;
/*     */   }
/*     */   public void setSpinC(int x) {
/* 231 */     this.spinC = x;
/*     */   }
/*     */ }

/* Location:           C:\Users\Brian Tsai\Documents\High school\2015-2016 Junior\Comp Sci Games\522 LOL.jar
 * Qualified Name:     buildings
 * JD-Core Version:    0.6.2
 */