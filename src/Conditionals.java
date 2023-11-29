public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall =new Conditionals();
    }//main method

    public int randomInt;
    public Conditionals(){

        String question  = "Should I eat pizza for dinner tonight?";

        System.out.println(question);

        randomInt = (int) (10* Math.random());

        if(randomInt>=1&&randomInt>=2){
            System.out.println("Signs point to yes, but only if you dance the Macarena first.");
        } else if(randomInt>2&&randomInt<=4){
            System.out.println("Concentrate and ask again, but this time do it in a British accent for good luck.");
        } else if(randomInt>4&&randomInt<=6){
            System.out.println("As likely as finding a needle in a haystack.");
        } else if(randomInt>6&&randomInt<=8){
            System.out.println("Outlook sunny, unless you're a vampire");
        }else{
            System.out.println("Ask your mom; she knows everything, including where you left your socks.");
        }
    }//constructor method

}
