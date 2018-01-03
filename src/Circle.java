/*    */ public class Circle
/*    */ {
/*    */   private int radius;
/*    */   private Point center;
/*    */ 
/*    */   public Circle()
/*    */   {
/*  8 */     this.radius = 1;
/*  9 */     this.center = new Point(0, 0);
/*    */   }
/*    */ 
/*    */   public Circle(int radius, Point center) {
/* 13 */     radius = this.radius;
/* 14 */     center = this.center;
/*    */   }
/*    */ 
/*    */   double area() {
/* 18 */     return 3.141592653589793D * this.radius * this.radius;
/*    */   }
/*    */ 
/*    */   double circumference() {
/* 22 */     return 6.283185307179586D * this.radius;
/*    */   }
/*    */ }

