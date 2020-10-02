package Averrage_score;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentList implements ReLine{
    private int num=0;
    private int i=0;
    private Student students[];//����Student����
    public StudentList(int num){ //�������鹹�췽��
         this.num=num;
         students=new Student[num];
    }

    @Override
    public void add(Object obj) {
         if(i==students.length){ //���ռ��Ƿ����������������������������µĿռ�
                students= Arrays.copyOf(students,students.length+1);
         }
         students[i]=(Student)obj;
         i++;
    }

    @Override
    public Object get(int index) {//���б��л�ȡ����Ϊi�Ķ���
        if(index>0&&index<=students.length){
            return students[index-1];
        }

        else {
            System.out.println("error index");
            return null;
        }
    }

    @Override
    public void clear() {//������еĶ���
          for (int j=0;j<this.i;j++){
              students[j]=null;
          }
          this.i=0;
    }

    @Override
    public boolean isEmpty() {//�ж��б����Ƿ��ж���
        for (int i=0;i<students.length;i++){
            if(students[i]!=null){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {//��ȡ�б��ж���ĸ���
         int a=0;
         if(students[students.length-1]!=null) return students.length;
         else {
             for(int k=0;students[k]!=null&&k<students.length;k++){
                 a++;
             }
             return a;
         }
    }

    @Override
    public int capacity() {//����Ŀռ��С
        return students.length;
    }
}
