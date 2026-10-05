import java.util.Scanner;
import java.util.Random;

public class shuangseqiu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
int []ballArray=new int[7];
for(int i=0;i<ballArray.length;i++){
    ballArray[i]=0;
}
for(int i=0;i<ballArray.length-1;){
    int randomNumber=r.nextInt(33)+1;
    if(!isContain(ballArray,randomNumber)){
        ballArray[i]=randomNumber;
        i++;
    }

}
ballArray[ballArray.length-1]=r.nextInt(16)+1;
showArray(ballArray);
int redcount=0;
int bluecount=0;
int []input=inputArray();
for(int i=0;i<ballArray.length-1;i++){
    if(isContain(ballArray,input[i])){
        redcount++;
    }

}
if(ballArray[ballArray.length-1]==input[input.length-1]){
    bluecount++;
}
System.out.println("恭喜你，红球和蓝球分别各中了"+redcount+"个和"+bluecount+"个");
if(redcount==6&&bluecount==1){
    System.out.println("恭喜你中了一等奖，奖金为1000万元！");
}else if(redcount==6&&bluecount==0){
    System.out.println("恭喜你中了二等奖，奖金为500万元！");
}else if(redcount==5&&bluecount==1||redcount==5&&bluecount==0){
    System.out.println("恭喜你中了三等奖，奖金为3000元！");
}else if(redcount==4&&bluecount==1||redcount==4&&bluecount==0){
    System.out.println("恭喜你中了四等奖，奖金为200元！");
}else if(redcount==3&&bluecount==1||redcount==2&&bluecount==1){
    System.out.println("恭喜你中了五等奖，奖金为10元！");
}else if(redcount==1&&bluecount==1||redcount==0&&bluecount==1){
    System.out.println("恭喜你中了六等奖，奖金为5元！");
}else{
    System.out.println("很遗憾，你并没有中奖");

    }
    }

    public static int[] inputArray(){
        int[] inputarray=new int[7];
        for(int i=0;i<inputarray.length;i++){
            inputarray[i]=0;
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<inputarray.length-1;){
            System.out.println("请输入第"+(i+1)+"个红球的号码");

            while(true){
                int temp=sc.nextInt();
                if(temp>=1&&temp<=33){
                    if(!isContain(inputarray,temp)){
                        inputarray[i]=temp;
                        i++;
                        break;
                    }else{
                        System.out.println("当前输入的号码已经存在，请重新输入");
                    }
                }else{
                    System.out.println("当前输入的红球号码数字不在正确范围内，请重新输入第"+(i+1)+"个红球的号码");
                }

            }
        }
        System.out.println("请输入蓝球的号码");
        while(true){
            int temp=sc.nextInt();
            if(temp>=1&&temp<=16){
                inputarray[inputarray.length-1]=temp;
                break;
            }else{
                System.out.println("输入的蓝球号码数字不在范围内，请重新输入蓝球号码");
            }
        }
        return inputarray;
    }
    public static boolean isContain(int[]arr,int i) {
        for(int j=0;j<arr.length;j++){
            if(arr[j]==i){
                return true;
            }
        }
        return false;
    }
public static void showArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
}

}
