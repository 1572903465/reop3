public class TestMemory {

    static final int SIZE=1700*1024*1024;

  public static void main(String[] args) {

                             System.out.println("�������п�ʼʱ:");

                             System.out.println("�����ڴ�:"+Runtime.getRuntime().freeMemory() / 1024 / 1024);

                             System.out.println("���ڴ�:"+Runtime.getRuntime().totalMemory() / 1024 / 1024);

                            System.out.println("����ڴ�:"+Runtime.getRuntime().maxMemory() / 1024 / 1024);

                            System.out.println("=============");

                            System.out.println("����һ����������ڴ������Ϊ1700*1024*1024��");

  try {

 int[] i = new int[SIZE];

  }catch (OutOfMemoryError ee) {

  System.out.println("������OutOfMemoryError!�쳣");

 }

 finally {

  System.gc();

  }

                   System.out.println("ʹ��System.gc()������ָ��쳣:");

                   System.out.println("�����ڴ�:"+Runtime.getRuntime().freeMemory() / 1024 / 1024);

                   System.out.println("���ڴ�:"+Runtime.getRuntime().totalMemory() / 1024 / 1024);

                   System.out.println("����ڴ�:"+Runtime.getRuntime().maxMemory() / 1024 / 1024);

                   System.out.println("=============");

    }

}


