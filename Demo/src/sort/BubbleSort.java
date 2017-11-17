package sort;

public class BubbleSort {
    public int[] sortArr;
    public BubbleSort(){
        this.sortArr = new int[]{1, 4, 3, 2, 6, 1};
    }
    public void sortArrayWithBubble(){
        if (this.sortArr == null || this.sortArr.length <= 1){
            return;
        }
        int beforePosition = 0;
        int afterPosition = this.sortArr.length - 1;
        //让beforePosition保持不变，修改afterPosition，当afterPosition所在的索引值小于beforePosition索引值时，交换
        while (afterPosition > 0){
            beforePosition = 0;
            for (int i = 0; i < afterPosition; i++){
                if (this.sortArr[i] < this.sortArr[i + 1]){
                    int temp = this.sortArr[i];
                    this.sortArr[i] = this.sortArr[i + 1];
                    this.sortArr[i + 1] = temp;
                    beforePosition = i;
                }
            }
            afterPosition = beforePosition;
        }
        this.printSortedArr();
    }
    public void printSortedArr(){
        int len = this.sortArr.length;
        for(int i = 0;i < len;i++){
            System.out.println( this.sortArr[i] );
        }
    }
}
