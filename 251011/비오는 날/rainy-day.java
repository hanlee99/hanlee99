import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weatherDatas = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            weatherDatas[i] = new Weather(date,day,weather);
        }
        Weather res = weatherDatas[0];
        for(int i=1; i<n; i++){
            if(!res.weather.equals("Rain")){
                if(weatherDatas[i].weather.equals("Rain")) 
                    res=weatherDatas[i];
            }else{
                if(!weatherDatas[i].weather.equals("Rain")){
                    continue;
                }
            }
            String date1=res.date;
            String date2=weatherDatas[i].date;

            String[] dates1 = date1.split("-");
            String[] dates2 = date2.split("-");

            for(int j=0; j<dates1.length; j++){
                int a=Integer.parseInt(dates1[j]);
                int b=Integer.parseInt(dates2[j]);

                if(a!=b){
                    if(a>b) res=weatherDatas[i];
                    break;
                }
            }
        }
        System.out.println(res.date + " " + res.day+" "+res.weather);

    }
}

class Weather{
    String date;
    String day;
    String weather;
    public Weather(String date,String day,String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public Weather(){
        this.date="";
        this.day="";
        this.weather="";
    }
}