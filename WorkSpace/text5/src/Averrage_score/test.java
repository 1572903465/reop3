package Averrage_score;
import java.util.*;
public class test {
    public static double grade(double x) throws InvalidScoreException{//�Զ����쳣����
        if(x<-1||x>100) throw new InvalidScoreException(); //�ɼ���0~100��-1��������
        return x;
    }
    public static void main(String[] args) throws InvalidScoreException {
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.println("������ѧ��������");
        num=input.nextInt();
       StudentList students=new StudentList(num);
       boolean flag=true;
       int i=0;
       double b = 0;
       String a;
       boolean flag1=true;
        System.out.println("������ѧ���������ͳɼ�");
        while(flag) {//ѭ����������ѧ�����ɼ�
            a=input.next();
            if(a.equals("-1")){//-1��������
                flag = false;
                break;
            }
            while(flag1) {//���ɼ��������쳣 -1��������  �׳��쳣 whileѭ��Ϊ�����ȷ�ĳɼ�����
                try {
                    b = grade(input.nextDouble());
                    if(b==-1){//-1��������
                        flag1 = false;
                        break;
                    }
                    flag1 = false;
                } catch (InvalidScoreException e) {
                  System.out.println(e);
                }
            }
            if(a.equals("-1")||b==-1)//-1��������
            {
                flag = false;
                break;
            }
            flag1=true;
            students.add(new Student(a,b));
            if(students.size()==num){//����������������Ԥ������������ѭ��
                flag=false;
            }


    i++;
    }
        int studentsum=0;//�ۼӳɼ�
        int studentrate=0;//��������
        for(int j=1;j<=students.size();j++){//����������� �ɼ� �������ۼӳɼ� ��������
            System.out.println(((Student)students.get(j)).getName()+"  "+((Student)students.get(j)).getScore());
            studentsum+=((Student)students.get(j)).getScore();
            if(((Student)students.get(j)).getScore()>=60.0)
                studentrate++;
        }
        System.out.println("====");
        System.out.println("ƽ���ɼ���"+studentsum/students.size());
        System.out.println("�����ʣ�"+studentrate*100/students.size()+"%");
        }
    }

