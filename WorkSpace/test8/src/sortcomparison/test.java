package sortcomparison;


import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand=new Random(10000);//ÿ�����ж��ܲ�����ͬ�������
        int n=rand.nextInt(1000000);//����һ��n�ϴ���������
        int a[] =new int[n];//����һ�������n������
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n ; i++){
        a[i]=rand.nextInt(10000);
        }

        System.arraycopy(a,0,b,0,n);//����ֱ��a=b,���ø�ֵ�����ֻ����ͬһ���ַ������
        System.arraycopy(a,0,c,0,n);
       // b=a;
        BubbleSort bubbleSort=new BubbleSort(a,3);
        insertionSort insertionsort=new insertionSort(b,3);
        quickSort quicksort=new quickSort(c,3);
        bubbleSort.start();
        insertionsort.start();
        quicksort.start();
    }
}
