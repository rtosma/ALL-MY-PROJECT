package mayintarlasi;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RECEP OSMA
 */    
public class MayinTarlasi {
  int rowNumber,colNumber;
  int [][] map;
  int [][] board;
  int size;
  
  Random rand = new Random();
  Scanner scan = new Scanner(System.in);
  
  MayinTarlasi(int rowNumber,int colNumber){
      this.rowNumber = rowNumber;
      this.colNumber = colNumber;
      this.map = new int[rowNumber][colNumber];
      this.board = new int[rowNumber][colNumber];
      this.size = rowNumber * colNumber;
  }
  public void run(){
      prepareGame();
      print(map);
  }
  public void prepareGame(){
      int randRow,randCol,count = 0;
      while(count != (size/4)){
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if(map[randRow][randCol] != -1)
            {
                map[randRow][randCol] = -1;
            }
            count++;
      }
  }
public void print(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[i][j] >= 0)
                System.out.print(" ");
            System.out.print(arr[i][j]+ " ");
        }  
            System.out.println();
    }
}
}
