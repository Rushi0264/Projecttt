package OperatorProgram;

public class AssignmentOperator {
    public static void main(String[] args) {

        int f = 7;
        System.out.println("\nf = f += 3 : "+(f+=3));//o=7+3=10

        System.out.println("f = f -= 2 : "+(f-=2));//o=10 10-2=8

        System.out.println("f= f *= 4: "+(f*=4));//o=8 8*4=32

        System.out.println("f= f /= 3: "+(f/=3));//10.666  //10

        System.out.println("f= f %= 2: "+(f%=2));//0.66661 //0

        double p = 7;
        System.out.println("\np = p += 3 : "+(p+=3));//o=7+3=10

        System.out.println("p = p -= 2 : "+(p-=2));//o=10 10-2=8

        System.out.println("p= p *= 4: "+(p*=4));//o=8 8*4=32

        System.out.println("p= p /= 3: "+(p/=3));//10.666  //10

        System.out.println("p= p %= 2: "+(p%=2));//0.66661 //0

        int a=2;
        System.out.println("\na = a += 3 : "+(a+=3));//a=2 2+3=5

        System.out.println("a = a -= 2 : "+(a-=1));//a=5 5-1=4

        System.out.println("a= a *= 5 : "+(a*=5));//a=4 4*5=20

        System.out.println("a= a /= 3 : "+(a/=3));//a=20 20/3=6

        System.out.println("a= a %= 5 : "+(a%=5));//a=6 6%5 = 1

        double b = 5;
        System.out.println("\nb=b+=4 "+(b+=4));//b=5 5+4=9

        System.out.println("b=b-=2 "+(b-=2));//b=9 9-2=7

        System.out.println("b=b*=2 "+(b*=2));//b=7 7*2=14

        System.out.println("b=b/=2 "+(b/=2));//b=14 14/2=7

        System.out.println("b=b%=3 "+(b%=3));//b=7 7%3=1

        float c=10;
        System.out.println("\nc=c+=2 "+(c+=2));//c=10 10+2=12

        System.out.println("c=c-=4 "+(c-=4));//c=12 12-4=8

        System.out.println("c=c*=5 "+(c*=5));//c=8 8*4=40

        System.out.println("c=c/=6 "+(c/=6));//c=40 40/6=6.6666

        System.out.println("c=c%=4 "+(c%=4));//2.666

        int d= 12;
        System.out.println("\nd=d+=3 "+(d+=3));//d=12 12+3=15

        System.out.println("d=d-=5 "+(d-=5));//d=15 15-5=10

        System.out.println("d=d*=6 "+(d*=6));//d=10 10*6=60

        System.out.println("d=d/=4 "+(d/=4));//d=60 60/4=15

        System.out.println("d=d%=2 "+(d%=2));//d=15 15%2=1

        /*AssignmentOperator obj = new AssignmentOperator();
        System.out.println(d);*/

        int e=60;
        System.out.println("e=e+=5 "+(e+=5));//e=60 60+5=65

        System.out.println("e=e-=15 "+(e-=15));//e=65 65-15=50

        System.out.println("e=e*=2 "+(e*=2));//e=50 50*2=100

        System.out.println("e=e/=5 "+(e/=5));//e=100 100/5=20

        System.out.println("e=e%=5 "+(e%=5));//e=20 20%5=0

        int v=32;
        System.out.println("\nv=v+=3 "+(v+=3));
        System.out.println("v=v-=5 "+(v-=5));
        System.out.println("v=v*=2 "+(v*=2));
        System.out.println("v=v/=4 "+(v/=4));
        System.out.println("v=v%=6 "+(v%=6));

    }
}
