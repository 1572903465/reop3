package Averrage_score;
import java.util.*;
public class Student  {
    public String name;
    private double score;

    public Student(String name, double score) {//���췽��
        this.name = name;
        this.score = score;
    }
    public Student() {//�ع����췽��
        this.name = name;
        this.score = score;
    }
    public void setScore( double score) {//���óɼ�
        this.score = score;
    }

    public void setName(String name) {//��������
        this.name = name;
    }

    public String getName() { //˽�����͵�get����
        return this.name;
    }

    public double getScore() {//˽�����͵�get����
        return this.score;
    }
}
