/*    */ public class Point
/*    */ {
/*    */   private int x;
/*    */   private int y;
/*    */ 
/*    */   public Point()
/*    */   {
/*  9 */     this.x = (this.y = 0);
/*    */   }
/*    */ 
/*    */   public Point(int x, int y) {
/* 13 */     this.x = x;
/* 14 */     this.y = y;
/*    */   }
/*    */ 
/*    */   public void move(int x, int y) {
/* 18 */     this.x = x;
/* 19 */     this.y = y;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 23 */     String s = "x: " + this.x + "y: " + this.y;
/* 24 */     return s;
/*    */   }
/*    */ }

