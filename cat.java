public class cat extends Animals {
    public void display(){
        System.out.println("A Cat is an animal");
    }
    public static void main(String[] args) {
        cat input=new cat();
        input.display();
        input.show();

    }
    //Single level inheritance
    //Cat extends animals
}
