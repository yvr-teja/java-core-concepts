package Methods.controlflow;

public class BreakStatement {
    public static void main(String[] args) {
        //Break

        for (int i=0;i<10;i++){

            System.out.println(i);
            //Go out of the block if value is greater than 6.

            //if(i>=6){
            if(i==2){
                break;
            }
        }
    }
}
