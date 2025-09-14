package OperatorProgram;

public class DecrementOperator {
    public static void main(String[] args) {
        //Decrement by 1

        //Post-decrement : uses value first then use
        int a = 100;
        System.out.println(a--);//100
        System.out.println(a);//99

        int b = 200;
        System.out.println(b--);//200
        System.out.println(b);//199

        int c = 211;
        System.out.println(c--);//211
        System.out.println(c);//210

        int d = 422;
        System.out.println(d--);//422
        System.out.println(d);//421

        int e = 452;
        System.out.println(e--);//452
        System.out.println(e);//451


        //Pre-decrement : first decrement then uses value
        int f = 322;
        System.out.println(--f);//321
        System.out.println(f);//321

        int g = 577;
        System.out.println(--g);//576
        System.out.println(g);//576

        int h =98;
        System.out.println(--h);//97
        System.out.println(h);//97

        int i = 56;
        System.out.println(--i);//55
        System.out.println(i);//55

        int j = 566;
        System.out.println(--j);//565
        System.out.println(j);//565

        //Mixed pre and post decrement

        int k = 344;
        System.out.println(++k);//345
        System.out.println(k);//345
        System.out.println(--k);//344
        System.out.println(k);//344

        int l = 432;
        System.out.println(++l);//433
        System.out.println(--l);//432
        System.out.println(l);//432

        //Mixed Increment and decrement

        int m = 54;
        System.out.println(++m);//55
        System.out.println(m);//55
        System.out.println(--m);//54
        System.out.println(m);//54
        System.out.println(m++);//54
        System.out.println(m);//55
        System.out.println(m--);//55
        System.out.println(m);//54

        int n = 22;
        System.out.println(--n);//21
        System.out.println(n++);//21
        System.out.println(n--);//22
        System.out.println(++n);//22
        System.out.println(n);//22
        System.out.println(n--);//22
        System.out.println(++n);//22
        System.out.println(n);//22
        System.out.println(n--);//22
        System.out.println(n);//21
        System.out.println(++n);//22
        System.out.println(++n);//23
        System.out.println(n);//23


        //inverts boolean value
        boolean t=true;
        System.out.println("Value of t without inverts = "+t);//value without inverts = true
        System.out.println("Value of t after inverts = "+!t);//After inverts = false

        boolean u = false;
        System.out.println("\nvalue of u without inverts = "+u);//value without inverts = false
        System.out.println("value of u after inverts = "+!u);//value after inverts = true

    }
}
