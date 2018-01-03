/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ 
/*     */ public class Mushroom extends GameObject
/*     */ {
/*     */   private Rectangle a;
/*     */   private Rectangle b;
/*     */   private Rectangle c;
/*     */   private Rectangle d;
/*     */   private Rectangle e;
/*     */   private Rectangle f;
/*     */   private Rectangle g;
/*     */   private Rectangle h;
/*     */   private Rectangle i;
/*     */   private Rectangle j;
/*     */   private Rectangle k;
/*     */   private Rectangle l;
/*     */   private Rectangle m;
/*     */   private Rectangle n;
/*     */   private Rectangle o;
/*     */   private Rectangle p;
/*     */   private Rectangle q;
/*     */   private Rectangle r;
/*     */   private Rectangle s;
/*     */   private Rectangle t;
/*     */   private Rectangle u;
/*     */   private Rectangle v;
/*     */   private Rectangle w;
/*     */   private Rectangle cancel;
/*     */ 
/*     */   public Mushroom()
/*     */   {
/*  31 */     super(770, 330, 30, 30, 0.0D, 0.0D);
/*  32 */     this.cancel = new Rectangle(750, 500, 200, 50);
/*     */   }
/*     */ 
/*     */   public Rectangle can() {
/*  36 */     return this.cancel;
/*     */   }
/*     */   public void makeMush(Graphics2D win) {
/*  39 */     this.a = new Rectangle(this.x, this.y, 5, 5);
/*  40 */     win.setColor(Color.GREEN);
/*  41 */     win.fill(this.a);
/*  42 */     this.b = new Rectangle(this.x + 5, this.y, 5, 5);
/*  43 */     win.setColor(Color.MAGENTA);
/*  44 */     win.fill(this.b);
/*  45 */     this.c = new Rectangle(this.x + 10, this.y, 5, 5);
/*  46 */     win.setColor(Color.GREEN);
/*  47 */     win.fill(this.c);
/*  48 */     this.d = new Rectangle(this.x - 5, this.y, 5, 5);
/*  49 */     win.setColor(Color.GREEN);
/*  50 */     win.fill(this.d);
/*  51 */     this.e = new Rectangle(this.x, this.y - 5, 5, 5);
/*  52 */     win.setColor(Color.MAGENTA);
/*  53 */     win.fill(this.e);
/*  54 */     this.f = new Rectangle(this.x + 5, this.y - 5, 5, 5);
/*  55 */     win.setColor(Color.GREEN);
/*  56 */     win.fill(this.f);
/*  57 */     this.g = new Rectangle(this.x - 10, this.y, 5, 5);
/*  58 */     win.setColor(Color.MAGENTA);
/*  59 */     win.fill(this.g);
/*  60 */     this.h = new Rectangle(this.x - 5, this.y - 5, 5, 5);
/*  61 */     win.setColor(Color.GREEN);
/*  62 */     win.fill(this.h);
/*  63 */     this.i = new Rectangle(this.x, this.y + 5, 5, 5);
/*  64 */     win.setColor(Color.GREEN);
/*  65 */     win.fill(this.i);
/*  66 */     this.j = new Rectangle(this.x + 5, this.y + 5, 5, 5);
/*  67 */     win.setColor(Color.MAGENTA);
/*  68 */     win.fill(this.j);
/*  69 */     this.k = new Rectangle(this.x + 10, this.y + 5, 5, 5);
/*  70 */     win.setColor(Color.GREEN);
/*  71 */     win.fill(this.k);
/*  72 */     this.l = new Rectangle(this.x - 5, this.y + 5, 5, 5);
/*  73 */     win.setColor(Color.GREEN);
/*  74 */     win.fill(this.l);
/*  75 */     this.m = new Rectangle(this.x, this.y + 5, 5, 5);
/*  76 */     win.setColor(Color.MAGENTA);
/*  77 */     win.fill(this.m);
/*  78 */     this.n = new Rectangle(this.x - 10, this.y + 5, 5, 5);
/*  79 */     win.setColor(Color.MAGENTA);
/*  80 */     win.fill(this.n);
/*  81 */     this.o = new Rectangle(this.x, this.y + 10, 5, 5);
/*  82 */     win.setColor(Color.YELLOW);
/*  83 */     win.fill(this.o);
/*     */ 
/*  87 */     this.q = new Rectangle(this.x - 5, this.y + 10, 5, 5);
/*  88 */     win.setColor(Color.YELLOW);
/*  89 */     win.fill(this.q);
/*     */ 
/*  93 */     this.s = new Rectangle(this.x, this.y + 15, 5, 5);
/*  94 */     win.setColor(Color.YELLOW);
/*  95 */     win.fill(this.s);
/*  96 */     this.t = new Rectangle(this.x - 5, this.y + 15, 5, 5);
/*  97 */     win.setColor(Color.YELLOW);
/*  98 */     win.fill(this.t);
/*  99 */     this.u = new Rectangle(this.x - 15, this.y, 5, 5);
/* 100 */     win.setColor(Color.GREEN);
/* 101 */     win.fill(this.u);
/* 102 */     this.v = new Rectangle(this.x - 15, this.y + 5, 5, 5);
/* 103 */     win.setColor(Color.GREEN);
/* 104 */     win.fill(this.v);
/* 105 */     this.w = new Rectangle(this.x - 10, this.y - 5, 5, 5);
/* 106 */     win.setColor(Color.GREEN);
/* 107 */     win.fill(this.w);
/*     */   }
/*     */ }

