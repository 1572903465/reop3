import java.util.Random;

public class Randnumber {
    public int randnum;
    public int size;//���齻��������
    public int number=0;
    boolean available=false;
    int count;
    Random rand=new Random();


    public Randnumber(int size){
        this.size=size;
    }
    public synchronized void set(){
        if (available){
            try{
                wait();
            }catch (Exception e){

            }
        }
        randnum=rand.nextInt(20);
        System.out.println("�����Ϊ��"+randnum);
        number++;
        available=true;
        notify();
    }
    public synchronized void ave(){

        if(available){

           System.out.println("�����������ƽ������" +this.randnum*this.randnum);
            available=false;
            notify();

            if(number==size){
                number=size+1;
            }
        }
    }
}

