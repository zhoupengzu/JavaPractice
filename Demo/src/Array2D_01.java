import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Array2D_01 {
      public static void countHourglass(){
          try {
              int rowSize = 6;
              int colSize = 6;
              int[][] arr2D = new int[rowSize][colSize];
              File file = new File( "src/array2D.txt" );
              FileInputStream fileStrem = new FileInputStream( file );
              InputStreamReader input = new InputStreamReader( fileStrem );
              BufferedReader read = new BufferedReader( input );
              String numStr = null;
              int line = 0;
              while ((numStr = read.readLine()) != null){
                  String[] strArr = numStr.split( " " );
                  for (int i = 0;i < strArr.length;i++){
                      arr2D[line][i] = Integer.parseInt( strArr[i] );
                  }
                  line++;
              }
              int step = 3;
              int[] maxSum = null;
              for (int i = 0;i < (rowSize - 2);i++){
                  for (int j = 0; j < (colSize - 2); j++){
                      int tempSum = 0;  //(s_i=1,s_j=0) 和(s_i=1,s_j=2)不求和
                      for (int s_i = 0;s_i < step;s_i++){
                          for (int s_j = 0;s_j < step;s_j++){
                              if ((s_i == 1 && s_j == 0) || (s_i == 1 && s_j == (step - 1))){
                                  continue;
                              }
                              tempSum = tempSum + arr2D[i + s_i][j + s_j];
                          }
                      }
                      System.out.println( tempSum );
                      if (maxSum == null){
                          maxSum = new int[1];
                          maxSum[0] = tempSum;
                      }else {
                          if (tempSum > maxSum[0]){
                              maxSum[0] = tempSum;
                          }
                      }
                  }
              }
              System.out.println( maxSum[0] );
          } catch (Exception e){
              System.out.println( e );
          }

      }
}
