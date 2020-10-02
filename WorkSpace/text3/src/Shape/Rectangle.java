package Shape;

public class Rectangle extends Shape2D {
    double x;
    double y;
    public Rectangle(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public double Circumference() {
        return 2*(x+y);
    }

    @Override
    public double Area() {
        return x*y;
    }
    public void Rectangle_Showing(double x,double y,double L,double S){
        System.out.printf("�߳�Ϊ%.0f,%.0f�ĳ������ܳ�Ϊ��%.2f\n",x,y,L);
        System.out.printf("�߳�Ϊ%.0f,%.0f�ĳ��������Ϊ��%.2f\n",x,y,L);
    }

}
