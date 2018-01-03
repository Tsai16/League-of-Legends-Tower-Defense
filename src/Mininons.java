/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics2D;
/*    */ 
/*    */ public class Mininons extends GameObject
/*    */ {
/*    */   private int health;
/*  7 */   private int time = 0;
/*  8 */   private int met = 0;
/*    */   private int id;
/*    */   private int f;
/*    */   private boolean frozen;
/*    */   private GameObject life;
/*    */   private int ft;
/*    */   private int asdf;
/*    */ 
/*    */   public Mininons()
/*    */   {
/* 17 */     super((int)(Math.random() * 8.0D + 15.0D), 640, 25, 25, (int)(Math.random() * 1.0D + 3.0D), 0.0D);
/*    */ 
/* 19 */     this.life = new GameObject(this.x, this.y - 20, 25, 5, 0.0D, 0.0D);
/* 20 */     this.frozen = false;
/* 21 */     this.ft = 40;
/* 22 */     this.asdf = 0;
/* 23 */     this.health = 0;
/*    */ 
/* 25 */     setColor(new Color(255, 255, 255, 0));
/*    */   }
/*    */   public void makelife(Graphics2D win) {
/* 28 */     win.setColor(Color.RED);
/* 29 */     win.fill(this.life);
/*    */   }
/*    */   public int getFF() {
/* 32 */     return this.f;
/*    */   }
/*    */   public void setFF(int x) {
/* 35 */     this.f = x;
/*    */   }
/*    */   public int gethealth() {
/* 38 */     return this.health;
/*    */   }
/*    */   public void sethealth(int result) {
/* 41 */     this.health = result;
/*    */   }
/*    */   public int gettimer() {
/* 44 */     return this.time;
/*    */   }
/*    */   public void settimer(int result) {
/* 47 */     this.time = result;
/*    */   }
/*    */   public void setMet(int result) {
/* 50 */     this.met = result;
/*    */   }
/*    */   public int getMet() {
/* 53 */     return this.met;
/*    */   }
/*    */   public void setId(int x) {
/* 56 */     this.id = x;
/*    */   }
/*    */   public int getId() {
/* 59 */     return this.id;
/*    */   }
/*    */   public GameObject l() {
/* 62 */     return this.life;
/*    */   }
/*    */   public void minusl(int x) {
/* 65 */     this.life.setWidth(x);
/*    */   }
/*    */   public int getminusl() {
/* 68 */     return (int)this.life.getWidth();
/*    */   }
/*    */   public void setF(boolean x) {
/* 71 */     this.frozen = x;
/*    */   }
/*    */   public boolean getF() {
/* 74 */     return this.frozen;
/*    */   }
/*    */   public int fti() {
/* 77 */     return this.ft;
/*    */   }
/*    */   public void setfti(int x) {
/* 80 */     this.ft = x;
/*    */   }
/*    */   public void setasdf(int x) {
/* 83 */     this.asdf = x;
/*    */   }
/*    */   public int getasdf() {
/* 86 */     return this.asdf;
/*    */   }
/*    */ }

