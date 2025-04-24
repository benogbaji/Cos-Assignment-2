public class Chicken extends Bird{
    public void flight() {
        System.out.println("Can not fly")
    }
    public static void main (String[] args) {
        Chicken obj = new Chicken();

        obj.flight();
        obj.attribute();
 
     }
     //hirerachical inheritance
     //Chicken extends bird and eagle also extends bird

}