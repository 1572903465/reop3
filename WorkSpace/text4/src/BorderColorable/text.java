package BorderColorable;
import java.util.*;
public class text<a> {
    public static void main(String[] args) {
        double a,b,c,d;
        Triangle T=new Triangle(3,4,5);
        Triangle T1;
        if(true){
            T1 = new Triangle(1 ,2 ,3);
        }
        T1.Area();
        CostCalculator Cost=new CostCalculator(3,4);
        a=Cost.calculate(T);
        System.out.printf("��ɫ�����εĻ���=%.2f\n",a);
        Circle C=new Circle(3);
        b=Cost.calculate(C);
        System.out.printf("��ɫԲ�Ļ���=%.2f\n",b);
        Rectangle R=new Rectangle(5,6);
        c=Cost.calculate(R);
        System.out.printf("��ɫ���εĻ���=%.2f\n",c);
        Square S=new Square(3);
        d=Cost.calculate(S);
        System.out.printf("��ɫ�����εĻ���=%.2f\n",d);
    }
}
