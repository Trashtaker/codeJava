/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;


public class Birthday {
    private int day; 
    private int month;    
    private int year;
     Birthday()
    {
        
    }

    
    Birthday(String strDay) 
    {
        setData 
        (
        Integer.parseInt(strDay.substring(0,2)), 
        Integer.parseInt(strDay.substring(2,4)),
        Integer.parseInt(strDay.substring(4))
        );
    }

    int getDay()
    {
        return day;
    }

    int getMonth()
    {
        return month;
    }

    int getYear()
    {
        return year;
    }

    String getDate()
    {
        return Integer.toString(this.day)+"/"+Integer.toString(this.month)+"/"+this.year;
    } 

    void setData(int day)
    {
        if(day>=1 && day <=31)
            this.day=day;
        else
        {
            this.day=0;
        }
    }

    void setData(int day, int month)
    {
        setData(day);                    
        if(month >= 1 && month <= 12)
            this.month=month;
        else
        {
            this.month=0;
        }
    }

    void setData(int day, int month, int year)
    {
        setData(day, month);    
        this.year = year;
    }

}
