// Day107_Q1.java
import java.util.Scanner;
public class ShortestPath_106 {
    public static void Shortestpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                System.out.println("");
                    break;
            }
        }
        float Shortestpath = (float)Math.sqrt((Math.pow(x, 2)+Math.pow(y, 2)));
        System.out.println("Shortest Path is "+Shortestpath);
    }
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the path");
        String path = scan.next();
        Shortestpath(path);
        // eg path WNEENESENNN;
        // N = y+1 ,S =y-1
        // E = x+1 ,W =x-1
    }
}
