public class Loops {
    public static void main(String[] args) {
Loops Zipper = new Loops();
    }
    public Loops(){
        System.out.println("bonjour");
        countUp();
        countByThrees();
        countDown();
    }//end of Loops method

    public void countUp(){
        for(int x=1; x<=5; x=x+1){
            System.out.println(x);
        }
        System.out.println();
    }

    public void countByThrees(){
        for(int x=3; x<=15; x=x+3){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void countDown(){
        for(int x=10; x>=1; x=x-1){
            System.out.print(x + ",");
        }
        System.out.println();
        System.out.println("Happy Loop Year!");
    }

}// end of Loops class