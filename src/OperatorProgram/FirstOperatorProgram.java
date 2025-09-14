package OperatorProgram;

public class FirstOperatorProgram {
    public static void main(String[] args) {
        //Arithmatic
        int a =10;
        a=a+20;
        System.out.println(a);//03

        int b = 100;
        b = b-50;
        System.out.println(b); //50

        //++operator
        //increment value of variable by 1

        //Post-increment : Uses value first then increment
        int c =100;
        System.out.println(c++);
        System.out.println(c);


        //Pre-increment : increment first, then uses value
        int d= 300;
        System.out.println(++d);
        System.out.println(d);

        int aa = 1000;
        System.out.println(++aa);//1001 new value of aa
        System.out.println(aa++);//1001
        System.out.println(aa);//then increment by 1 that is 1002

        int e = 104;
        System.out.println(e++);//104
        System.out.println(e);
        System.out.println(++e);
        System.out.println(e);

        int f = 11;
        System.out.println(f++);//11
        System.out.println(f);//12
        System.out.println(++f);
        System.out.println(f);

        int g= 433;
        System.out.println(g++);//433
        System.out.println(++g);//435
        System.out.println(g++);//435
        System.out.println(g);//436
        System.out.println(++g);//437

        //System.out.println("Latest value of g: "+g);

        int h =33;
        System.out.println("\n"+h++);//33
        System.out.println(h);//34
        System.out.println(++h);//35
        System.out.println(h);//35
        System.out.println(++h);//36

        int i=65;
        System.out.println("\n"+ ++i);//66
        System.out.println(i++);//66
        System.out.println(i);//67
        System.out.println(++i);//68
        System.out.println(i++);//68
        System.out.println(i);//69

        int j=45;
        System.out.println("\n"+ j++);//45
        System.out.println(j);//46
        System.out.println(--j);//45
        System.out.println(j);//45
        System.out.println(j--);//45
        System.out.println(j);//44
        System.out.println(++j);//45
        System.out.println(j);//45
    }
}
