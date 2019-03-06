package Five.One.SIX.ONE;
//An example of capturing a local varaiable from the enclosing scope.
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        //A local variable that can be captured.
        int num = 10;
        MyFunc myLambda = (n) ->{
            //This use of num is OK. It does not modify num.
            System.out.println(10);
            int v = num +n;
            //However, the following is illegal because it attempts to modify the value of num
            //num++
            System.out.println(v);
            return v;
        };
        //The following line would also cause an error, because it would remove the effectively final status from num
        //num =9;
    }
}
