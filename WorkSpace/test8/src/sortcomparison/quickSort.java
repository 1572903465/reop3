package sortcomparison;

public class quickSort extends Thread{
    private int []p;
    private int []q;
    private int num;
    public quickSort (int []q,int num){ //���췽��
        this.q=q;
        this.num=num;
    }
    long timestart;
    long timeend;
    long  sumtime=0;
    public void run(){
        for (int k=0;k<num;k++){
            p=q.clone();
//         for(int j=0;j<p.length;j++){
//             System.out.println("����ǰ"+p[j]);
//         }
            timestart=System.currentTimeMillis();
            quickSort(p,0,p.length-1);
            timeend=System.currentTimeMillis();
            sumtime+=timeend-timestart;
//        for(int j=0;j<p.length;j++){
//            System.out.println("�����"+p[j]);
//        }
            System.out.println("ʹ�ÿ�������ʹ�õ�ʱ���ǣ�" + (timeend - timestart) + "����");
        }
        System.out.println("ʹ�ÿ�������ƽ��ʹ�õ�ʱ���ǣ�" + sumtime/num+ "����");
    }
    public void quickSort(int[] arr, int left, int right) {
        //�����жϣ��������������ұ��������ǲ��Ϸ��ģ�ֱ��ʹ��return�����������
        if(left>right)
        {
            return;
        }
        //������������׼��
        int base=arr[left];
        //�������i,ָ�������
        int i=left;
        //�������j,ָ�����ұ�
        int j=right;

        //��i��j��������ʱ����ѭ���н��м���
        while(i!=j)
        {
            //����j������������Ȼ�׼��С�ģ�����������Ȼ�׼��С�ľ�ͣ��
            //����������Ȼ�׼����Ļ�����ȵģ��ͼ�������
            while(arr[j]>=base && i<j)
            {
                j--;    //j���ұ������ƶ�
            }
            while(arr[i]<=base&&i<j)
            {
                i++;	//i���������ƶ�
            }
            //�����ߵ����iͣ���ˣ�jҲͣ���ˡ�Ȼ�󽻻�i��jλ�õ�Ԫ��
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //�������whileѭ�������������������������ѭ��������ִ��
        //����������������˵��i��j������
        //���i��J�����ˣ��ͽ�����׼�����Ԫ�غ�����λ�õ�Ԫ��
        //������λ�õ�Ԫ�ظ�ֵ����׼�����λ�õ�Ԫ��
        arr[left]=arr[i];
        //�ѻ�׼����ֵ������λ�õ�Ԫ��
        arr[i]=base;
        //��׼��������͹�Ϊ�ˣ���ߵ����ֶ�����С���ұߵĶ�������
        //�Ż�׼�������

        quickSort(arr, left, i-1);
        //���ұ�
        quickSort(arr, j+1, right);
    }
}


