/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Rectangle;
/*     */ 
/*     */ public class SpinWin extends GameObject
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
/*     */   private Rectangle aa;
/*     */   private Rectangle bb;
/*     */   private Rectangle cc;
/*     */   private Rectangle dd;
/*     */   private Rectangle ee;
/*     */   private Rectangle ff;
/*     */   private Rectangle gg;
/*     */   private Rectangle hh;
/*     */   private Rectangle ii;
/*     */   private Rectangle jj;
/*     */   private Rectangle kk;
/*     */   private Rectangle ll;
/*     */   private Rectangle mm;
/*     */   private Rectangle nn;
/*     */   private Rectangle oo;
/*     */   private Rectangle pp;
/*     */   private Rectangle qq;
/*     */   private Rectangle rr;
/*     */   private Rectangle ss;
/*     */   private Rectangle tt;
/*     */   private Rectangle uu;
/*     */   private Rectangle vv;
/*     */   private Rectangle ww;
/*     */ 
/*     */   public SpinWin()
/*     */   {
/*  55 */     super(100, 300, 0, 0, 0.0D, 0.0D);
/*     */   }
/*     */   public void makeSpin(Graphics2D win) {
/*  58 */     this.a = new Rectangle(this.x - 20, this.y, 3, 3);
/*  59 */     win.setColor(Color.YELLOW);
/*  60 */     win.fill(this.a);
/*  61 */     this.b = new Rectangle(this.x + 20, this.y - 20, 3, 3);
/*  62 */     win.setColor(Color.YELLOW);
/*  63 */     win.fill(this.b);
/*  64 */     this.c = new Rectangle(this.x + 30, this.y - 16, 3, 3);
/*  65 */     win.setColor(Color.YELLOW);
/*  66 */     win.fill(this.c);
/*  67 */     this.d = new Rectangle(this.x - 20, this.y + 7, 3, 3);
/*  68 */     win.setColor(Color.YELLOW);
/*  69 */     win.fill(this.d);
/*  70 */     this.e = new Rectangle(this.x + 11, this.y - 41, 3, 3);
/*  71 */     win.setColor(Color.YELLOW);
/*  72 */     win.fill(this.e);
/*  73 */     this.f = new Rectangle(this.x - 10, this.y + 20, 3, 3);
/*  74 */     win.setColor(Color.YELLOW);
/*  75 */     win.fill(this.f);
/*  76 */     this.g = new Rectangle(this.x - 11, this.y + 17, 3, 3);
/*  77 */     win.setColor(Color.YELLOW);
/*  78 */     win.fill(this.g);
/*  79 */     this.h = new Rectangle(this.x + 1, this.y - 31, 3, 3);
/*  80 */     win.setColor(Color.YELLOW);
/*  81 */     win.fill(this.h);
/*  82 */     this.i = new Rectangle(this.x + 10, this.y - 21, 3, 3);
/*  83 */     win.setColor(Color.YELLOW);
/*  84 */     win.fill(this.i);
/*  85 */     this.j = new Rectangle(this.x, this.y - 28, 3, 3);
/*  86 */     win.setColor(Color.YELLOW);
/*  87 */     win.fill(this.j);
/*  88 */     this.k = new Rectangle(this.x - 1, this.y + 23, 3, 3);
/*  89 */     win.setColor(Color.YELLOW);
/*  90 */     win.fill(this.k);
/*  91 */     this.l = new Rectangle(this.x, this.y - 16, 3, 3);
/*  92 */     win.setColor(Color.YELLOW);
/*  93 */     win.fill(this.l);
/*  94 */     this.m = new Rectangle(this.x + 4, this.y - 24, 3, 3);
/*  95 */     win.setColor(Color.YELLOW);
/*  96 */     win.fill(this.m);
/*  97 */     this.n = new Rectangle(this.x - 17, this.y + 19, 3, 3);
/*  98 */     win.setColor(Color.YELLOW);
/*  99 */     win.fill(this.n);
/* 100 */     this.o = new Rectangle(this.x - 11, this.y + 7, 3, 3);
/* 101 */     win.setColor(Color.YELLOW);
/* 102 */     win.fill(this.o);
/* 103 */     this.p = new Rectangle(this.x + 21, this.y - 23, 3, 3);
/* 104 */     win.setColor(Color.YELLOW);
/* 105 */     win.fill(this.p);
/* 106 */     this.q = new Rectangle(this.x + 2, this.y - 19, 3, 3);
/* 107 */     win.setColor(Color.YELLOW);
/* 108 */     win.fill(this.q);
/* 109 */     this.r = new Rectangle(this.x - 17, this.y + 6, 3, 3);
/* 110 */     win.setColor(Color.YELLOW);
/* 111 */     win.fill(this.r);
/* 112 */     this.s = new Rectangle(this.x - 23, this.y + 8, 3, 3);
/* 113 */     win.setColor(Color.YELLOW);
/* 114 */     win.fill(this.s);
/* 115 */     this.t = new Rectangle(this.x - 7, this.y + 13, 3, 3);
/* 116 */     win.setColor(Color.YELLOW);
/* 117 */     win.fill(this.t);
/* 118 */     this.u = new Rectangle(this.x - 2, this.y - 3, 3, 3);
/* 119 */     win.setColor(Color.YELLOW);
/* 120 */     win.fill(this.u);
/* 121 */     this.v = new Rectangle(this.x - 12, this.y - 16, 3, 3);
/* 122 */     win.setColor(Color.YELLOW);
/* 123 */     win.fill(this.v);
/* 124 */     this.w = new Rectangle(this.x, this.y, 5, 5);
/* 125 */     win.setColor(Color.GREEN);
/* 126 */     win.fill(this.w);
/* 127 */     this.aa = new Rectangle(this.x - 23, this.y, 3, 3);
/* 128 */     win.setColor(Color.YELLOW);
/* 129 */     win.fill(this.aa);
/* 130 */     this.bb = new Rectangle(this.x + 20, this.y - 26, 3, 3);
/* 131 */     win.setColor(Color.YELLOW);
/* 132 */     win.fill(this.bb);
/* 133 */     this.cc = new Rectangle(this.x + 30, this.y - 20, 3, 3);
/* 134 */     win.setColor(Color.YELLOW);
/* 135 */     win.fill(this.cc);
/* 136 */     this.dd = new Rectangle(this.x - 20, this.y + 17, 3, 3);
/* 137 */     win.setColor(Color.YELLOW);
/* 138 */     win.fill(this.dd);
/* 139 */     this.ee = new Rectangle(this.x + 11, this.y - 10, 3, 3);
/* 140 */     win.setColor(Color.YELLOW);
/* 141 */     win.fill(this.ee);
/* 142 */     this.ff = new Rectangle(this.x + 30, this.y - 20, 3, 3);
/* 143 */     win.setColor(Color.YELLOW);
/* 144 */     win.fill(this.ff);
/* 145 */     this.gg = new Rectangle(this.x + 14, this.y - 17, 3, 3);
/* 146 */     win.setColor(Color.YELLOW);
/* 147 */     win.fill(this.gg);
/* 148 */     this.hh = new Rectangle(this.x + 34, this.y - 21, 3, 3);
/* 149 */     win.setColor(Color.YELLOW);
/* 150 */     win.fill(this.hh);
/* 151 */     this.ii = new Rectangle(this.x + 40, this.y - 7, 3, 3);
/* 152 */     win.setColor(Color.YELLOW);
/* 153 */     win.fill(this.ii);
/* 154 */     this.jj = new Rectangle(this.x + 32, this.y - 4, 3, 3);
/* 155 */     win.setColor(Color.YELLOW);
/* 156 */     win.fill(this.jj);
/* 157 */     this.kk = new Rectangle(this.x + 25, this.y - 14, 3, 3);
/* 158 */     win.setColor(Color.YELLOW);
/* 159 */     win.fill(this.kk);
/* 160 */     this.ll = new Rectangle(this.x, this.y - 16, 3, 3);
/* 161 */     win.setColor(Color.YELLOW);
/* 162 */     win.fill(this.ll);
/* 163 */     this.mm = new Rectangle(this.x + 4, this.y - 24, 3, 3);
/* 164 */     win.setColor(Color.YELLOW);
/* 165 */     win.fill(this.mm);
/* 166 */     this.nn = new Rectangle(this.x - 17, this.y + 19, 3, 3);
/* 167 */     win.setColor(Color.YELLOW);
/* 168 */     win.fill(this.nn);
/* 169 */     this.oo = new Rectangle(this.x - 11, this.y + 7, 3, 3);
/* 170 */     win.setColor(Color.YELLOW);
/* 171 */     win.fill(this.oo);
/* 172 */     this.pp = new Rectangle(this.x + 21, this.y - 23, 3, 3);
/* 173 */     win.setColor(Color.YELLOW);
/* 174 */     win.fill(this.pp);
/* 175 */     this.qq = new Rectangle(this.x + 2, this.y - 19, 3, 3);
/* 176 */     win.setColor(Color.YELLOW);
/* 177 */     win.fill(this.qq);
/* 178 */     this.rr = new Rectangle(this.x - 17, this.y + 6, 3, 3);
/* 179 */     win.setColor(Color.YELLOW);
/* 180 */     win.fill(this.rr);
/* 181 */     this.ss = new Rectangle(this.x - 23, this.y + 8, 3, 3);
/* 182 */     win.setColor(Color.YELLOW);
/* 183 */     win.fill(this.ss);
/* 184 */     this.tt = new Rectangle(this.x - 7, this.y + 13, 3, 3);
/* 185 */     win.setColor(Color.YELLOW);
/* 186 */     win.fill(this.tt);
/* 187 */     this.uu = new Rectangle(this.x - 2, this.y - 3, 3, 3);
/* 188 */     win.setColor(Color.YELLOW);
/* 189 */     win.fill(this.uu);
/* 190 */     this.vv = new Rectangle(this.x - 12, this.y - 16, 3, 3);
/* 191 */     win.setColor(Color.YELLOW);
/* 192 */     win.fill(this.vv);
/* 193 */     this.ww = new Rectangle(this.x, this.y, 5, 5);
/* 194 */     win.setColor(Color.GREEN);
/* 195 */     win.fill(this.ww);
/*     */   }
/*     */ }

