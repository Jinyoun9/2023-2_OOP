import java.util.Scanner;
class MINMAX{
    int Min,Max;
    int getMin(int[] arr, int arrSize){
        this.Min = arr[0];
        for(int i=1;i<arrSize;i++){
            if (arr[i] < Min)
                Min = arr[i];
        }
        return Min;
    }
    int getMax(int[] arr, int arrSize){
        this.Max = arr[0];
        for(int i=1;i<arrSize;i++){
            if (arr[i] > Max)
                Max = arr[i];
        }
        return Max;
    }
}
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        MINMAX m  =  new MINMAX();
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("수를 입력하세요: ");
        for(int i=0;i<arrSize;i++){
            arr[i] = sc.nextInt();
        }
        System.out.printf("최대값: %d\n", m.getMax(arr, arrSize));
        System.out.printf("최소값: %d\n", m.getMin(arr, arrSize));
    }
}
