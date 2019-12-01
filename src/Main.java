import java.util.Scanner;
public class Main {
    private static scene scen;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("choose type of scene:1-with electro guitar, 2- with ukulele");
        int type=in.nextInt();
        if (type ==1){
            scen = new sceneWithElectroGuitar();
            scen.createScene();
        }else{
            if( type==2){
                scen = new sceneWithUkulele();
                scen.createScene();
            }else{
                System.out.print("invalid input value");
            }
        }
    }
}
