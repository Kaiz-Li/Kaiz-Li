import java.util.Scanner;

class Mark{

    public static void main(String[] args)throws Exception{

        System.out.println("������һ������");

        //��������ķ���Ϊ��mark�����ҷ�������С��

        double mark;

        Scanner scanner = new Scanner(System.in);

        mark = scanner.nextDouble();

 

        //�ж��Ƿ����������

        if(mark<0||mark>100){

           System.out.println("�������� ");

           System.exit(0);

        }

        /*�жϷ����ĵȼ�

        90��������A���� 80~89���� B����70~79���� C���� 60~69�� D����60������ E�� */

        if (mark>=90) System.out.println("���ѧ���ɼ��� \'A\' ");

        else if (mark>=80) System.out.println("���ѧ���ɼ��� \'B\' ");

        else if (mark>=70) System.out.println("���ѧ���ɼ��� \'C\' ");

        else if (mark>=60) System.out.println("���ѧ���ɼ��� \'D\' ");

        else System.out.println("���ѧ���ɼ��� \'E\' ");
        
	    Thread.sleep(60000);
    }

}