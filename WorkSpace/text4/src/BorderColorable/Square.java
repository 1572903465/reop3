package BorderColorable;

public class Square extends  Rectangle{
    private double x;
    private boolean isSlidePainted=false;
    private boolean  isshape=false;
    public Square(double x){
        super(x,x);
    }
    public void paintBorder() {
        System.out.println("�ѽ������εı߽�����ɫ!");
        isSlidePainted = true;
    }
    public void paintShape() {
        System.out.println("�ѽ������ν�����ɫ!");
        isshape=true;
    }
}
