package rational;
import java.util.List;
import java.util.*;
import java.util.Collections;
public class Test {

    public static void main(String[] args) {
        Random random=new Random(1000);
        int x=0;
        int y=0;
        List<Rational>list = new ArrayList<Rational>();//List�ӿ�ʵ���� ����ΪRatoional
        List<InverseComparator>list1 =new ArrayList<InverseComparator>();
        for(int i = 0; i<100; i++){
            try{
                   x=random.nextInt(500);
                   y=random.nextInt(500);
                   if(x==0&&y==0){
                       throw new IllegalThreadStateException();
                   }
            }catch (IllegalThreadStateException e){
                System.out.println(e);
                i--;
            }
            list.add(new Rational(x,y));
            list1.add(new InverseComparator(y,x));
        }

        System.out.println("����ǰ ���ӷ�ĸ�����������500���ڵ�����������0��:");

        for (Rational rational : list){

       System.out.print(rational.getNumerator()+"/"+rational.getDenominator()+" ");
        }

        System.out.println("");

      for(InverseComparator inverseComparator:list1)
          System.out.print(inverseComparator.getNumerator()+"/"+inverseComparator.getDenominator()+" ");

        System.out.println("");

        System.out.println("������С����:");

        Collections.sort(list);

        Collections.sort(list1);

        for (Rational rational : list){

 System.out.print(rational.getNumerator()+"/"+rational.getDenominator()+" ");

        }

        System.out.println("");

                for (InverseComparator rational2 : list1){

       System.out.print(rational2.getNumerator()+"/"+rational2.getDenominator()+" ");

        }


    }
}
