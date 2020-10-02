package Shape;

public  class Triangle extends Shape2D{
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double Circumference() {
        return a+b+c;
    }
    public double Area(){
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public void Triangle_Showing(double a,double b,double c,double L,double S){
        System.out.printf("�߳�Ϊ%.0f,%.0f,%.0f���������ܳ�Ϊ��%.2f\n",a,b,c,L);
        System.out.printf("�߳�Ϊ%.0f,%.0f,%.0f�����������Ϊ��%.2f\n",a,b,c,S);
    }
}
