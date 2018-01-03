/*    */ import java.awt.Color;
/*    */ 
/*    */ public class TowerFire extends GameObject
/*    */ {
/*  4 */   private int aTimer = 0; private int aDelay = 25;
/*    */ 
/*  6 */   public TowerFire() { super(100, 100, 10, 10, 0.0D, 0.0D);
/*    */ 
/*  8 */     setColor(new Color(255, 255, 255, 0)); }
/*    */ 
/*    */   public int getTimer()
/*    */   {
/* 12 */     return this.aTimer;
/*    */   }
/*    */   public void setTimer(int result) {
/* 15 */     this.aTimer = result;
/*    */   }
/*    */   public int getDelay() {
/* 18 */     return this.aDelay;
/*    */   }
/*    */ }

/* Location:           C:\Users\Brian Tsai\Documents\High school\2015-2016 Junior\Comp Sci Games\522 LOL.jar
 * Qualified Name:     TowerFire
 * JD-Core Version:    0.6.2
 */