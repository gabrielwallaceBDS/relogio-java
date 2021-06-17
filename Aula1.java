import javax.swing.JOptionPane;


public class Aula1 {

    public static void main(String[] args) throws InterruptedException {
       // TODO Auto-generated method stub


        int h = 0;
        int m = 0;
        int s = 0;

        while(true)
        {
            s += 1;

            Thread.sleep(1000);

            System.out.println(h+":"+m+":"+s);

            if (s == 60) { m +=1; s = 0;}

            if (m == 60) {h +=1; m = 0;}
        }
    }
}