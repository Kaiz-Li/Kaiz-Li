import java.util.Scanner;

class Mark{

    public static void main(String[] args)throws Exception{

        System.out.println("请输入一个分数");

        //定义输入的分数为“mark”，且分数会有小数

        double mark;

        Scanner scanner = new Scanner(System.in);

        mark = scanner.nextDouble();

 

        //判断是否有输入错误。

        if(mark<0||mark>100){

           System.out.println("输入有误！ ");

           System.exit(0);

        }

        /*判断分数的等级

        90分以上者A级， 80~89分者 B级，70~79分者 C级， 60~69者 D级，60分以下 E级 */

        if (mark>=90) System.out.println("这个学生成绩是 \'A\' ");

        else if (mark>=80) System.out.println("这个学生成绩是 \'B\' ");

        else if (mark>=70) System.out.println("这个学生成绩是 \'C\' ");

        else if (mark>=60) System.out.println("这个学生成绩是 \'D\' ");

        else System.out.println("这个学生成绩是 \'E\' ");
        
	    Thread.sleep(60000);
    }

}