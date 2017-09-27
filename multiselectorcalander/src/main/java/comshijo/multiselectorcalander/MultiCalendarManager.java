package comshijo.multiselectorcalander;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by mboxuser on 9/15/2017.
 */

public class MultiCalendarManager {
    private static MultiCalendarManager _instance = new MultiCalendarManager();

    private static ICalenderTittleListener iCalenderTittleListener;
    private static ICalenderClickListener iCalenderClickListener;
    private static Calendar startCalender;

    private static    Calendar endDate = null;
    private static boolean clickable    =   true;
    private static boolean isVertical    =   false;

    private static List<String> selectedDates = new ArrayList<>();

    public static MultiCalendarManager getInstance(){
        if(_instance    ==  null){
            _instance   =   new MultiCalendarManager();
        }
        return _instance;
    }

    public String getCalendarTitle(Calendar date){
        int month    =   date.get(Calendar.MONTH)+1;
        int year    =   date.get(Calendar.YEAR);
        String title    =   "";
        if(month    ==  1){
            title   =   "JANUARY "+year;
        }
        else if(month == 2){
            title   =   "FEBRUARY "+year;
        }
        else if(month == 3){
            title   =   "MARCH "+year;
        }
        else if(month == 4){
            title   =   "APRIL "+year;
        }
        else if(month == 5){
            title   =   "MAY "+year;
        }
        else if(month == 6){
            title   =   "JUNE "+year;
        }
        else if(month == 7){
            title   =   "JULY "+year;
        }
        else if(month == 8){
            title   =   "AUGUST "+year;
        }
        else if(month == 9){
            title   =   "SEPTEMBER "+year;
        }
        else if(month == 10){
            title   =   "OCTOBER "+year;
        }
        else if(month == 11){
            title   =   "NOVEMBER "+year;
        }
        else if(month == 12){
            title   =   "DECEMBER "+year;
        }

        return title;
    }


    public int getNumberofDaysInMonth(int month, int year){
        int count   =   0;
        if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month == 10 || month == 12){
            count   = 31;
        }
        else if(month == 4|| month == 6|| month == 9 || month == 11){
            count   =   30;
        }
        else{
            if(year % 4 == 0){
                count = 29;
            }
            else{
                count  = 28;
            }
        }
        return count;
    }
    public Calendar getFirstDateOfCurrentMonth(Calendar calendar) {
        Calendar cal = Calendar.getInstance();
        Date date   =   new Date(calendar.getTimeInMillis());
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal;
    }
    public  Calendar getStartCalender() {
        return startCalender;
    }

    public  void setStartCalender(Calendar startCalender) {
        MultiCalendarManager.startCalender = startCalender;
    }

    public  void setiCalenderTittleListener(ICalenderTittleListener iCalenderTittleListener) {
        MultiCalendarManager.iCalenderTittleListener = iCalenderTittleListener;
    }

    public  ICalenderTittleListener getiCalenderTittleListener() {
        return iCalenderTittleListener;
    }

    public  ICalenderClickListener getiCalenderClickListener() {
        return iCalenderClickListener;
    }

    public  void setiCalenderClickListener(ICalenderClickListener iCalenderClickListener) {
        MultiCalendarManager.iCalenderClickListener = iCalenderClickListener;
    }

    public  List<String> getSelectedDates() {
        return selectedDates;
    }

    public  void setSelectedDates(List<String> selectedDates) {
        MultiCalendarManager.selectedDates = selectedDates;
    }




    public  Calendar getEndDate() {

        return endDate;
    }

    public  void setEndDate(Calendar endDate) {
        MultiCalendarManager.endDate = endDate;
    }

    public  boolean isClickable() {
        return clickable;
    }

    public  void setClickable(boolean clickable) {
        MultiCalendarManager.clickable = clickable;
    }

    public  boolean isVertical() {
        return isVertical;
    }

    public  void setIsVertical(boolean isVertical) {
        MultiCalendarManager.isVertical = isVertical;
    }
}
