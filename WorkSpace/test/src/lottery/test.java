package lottery;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("�����Ʊ��������������ָ���n��������3��9֮�䣩��");

        int n = input.nextInt();

        System.out.println("�����Ʊ����Ҫƥ�����С������m��������1��n֮�䣩��");

        int m = input.nextInt();

        Lottery lottery = new Lottery(n, m);

        //lottery.printList();

        System.out.println("���û�����"+n+"��������ȵĲ²������");

        for(int i=0;i<n;i++){

            System.out.println("��"+(i+1)+"��");

            int e = input.nextInt();

            if(lottery.addGuess(e)){

            }else{

                System.out.println("���Ѿ��¹�������ˣ����������롣");

                i--;

            }

        }

        System.out.println("�����н����Ϊ:");

        System.out.println("����Ϊ:"+lottery.getAward()+"RMB");

        System.out.println("��Ʊ�Ľ������Ľ��:");

        lottery.printList();

        input.close();

    }

}