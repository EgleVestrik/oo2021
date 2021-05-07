import java.sql.Date;
import java.time.Month;
import java.util.Calendar;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;
  
    public EstonianID(String code){
      this.code = code;
    }
  
    @Override
    public String getGender() {
      // kirjutada loogika
      int gender = Integer.parseInt(code.substring(0,1));

      return gender%2==0 ? "Female":"Male";
    }
  
    @Override
    public int getFullYear() {
      // TODO Auto-generated method stub
      int year = Integer.parseInt(code.substring(1,3));
      //int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3)) ;
      if (year<99 && year>=50){
        return 1900+year;
        //System.out.println("19"+year);
      }
      else{
          return 2000+year;
      }
      
    }
  
    @Override
    public String getDOB() {
      int year = Integer.parseInt(code.substring(1,3));
      int month = Integer.parseInt(code.substring(3,5));
      int day = Integer.parseInt(code.substring(5,7));
      return "Oled Sündinud "+ getFullYear()+" " + Month.of(month).name()+" "+day;
    }

    @Override
    public int getAge() {
        int month = Integer.parseInt(code.substring(3,5));
        
        
        return  Calendar.getInstance().get(Calendar.YEAR)-getFullYear();
        
            
        
        
    }
    
  }