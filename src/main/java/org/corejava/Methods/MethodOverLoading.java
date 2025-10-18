package Methods;

public class MethodOverLoading {
     int add(int a,int b){
    return a+b;
    }
    float add(float a,float b){
        return a+b;
    }

    float add(float a,float b, float c){
         return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
       float methodwithdiffDataType= methodOverLoading.add(20.5f,30.7f);
        System.out.println("methodwithdiffDataType = "+methodwithdiffDataType);
        float methodwithdiffparameters = methodOverLoading.add(20.5f,30.7f, 30.5f);
        System.out.println("methodwithdiffparameters = "+methodwithdiffparameters);
    }

}
