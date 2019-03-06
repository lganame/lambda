package One.One;
//Deomonstrate a simple lambda expression
//A functional iterface.
interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; //declare an interface refernce;
        //Here, the lambda expression is simply a constant expression.
        //When it is assigned to myNum, a class instance is
        //constructed in which the lambda expression implement the
        //getValue() method in MyNumber.
        myNum = ()->123.45;
        //Call getVlaue(),which is provided by the previously assigned lambda expression
        System.out.println("A fixed value:"+myNum.getValue());
        //Hrere, a more complex exrpression is used.
        myNum = ()->Math.random()*100;
        //THese call the lambda exprtession in the previous line.
        System.out.println("A random value:"+myNum.getValue());
        System.out.println("Another random value:"+myNum.getValue());
        //A lambda expression must be compatible with the method
        //defind by the functional interface, Therefore, this won't work;
        //myNum = ()->"123.03";
    }
}
