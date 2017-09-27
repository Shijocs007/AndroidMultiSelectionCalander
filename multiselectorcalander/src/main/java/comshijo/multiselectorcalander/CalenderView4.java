package comshijo.multiselectorcalander;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by mboxuser on 9/16/2017.
 */

public class CalenderView4 extends Fragment {

    View rootView;
    TextView day;
    Calendar calendar;
    TextView calendarTitle;
    ImageView leftBtn;
    ImageView rightBtn;
    int currentPage     =   0;
    private static final String DAY_OF_WEEK = "dayOfWeek";
    private static final String DAY_OF_MONTH_TEXT = "dayOfMonthText";
    private static final String CROSS_OF_DAY    =   "crossdayOfMonthText";
    private static final String DAY_OF_MONTH_CONTAINER = "dayOfMonthContainer";
    ICalenderTittleListener tittleListener;
    ICalenderClickListener iCalenderClickListener;

    public CalenderView4() {
        tittleListener = MultiCalendarManager.getInstance().getiCalenderTittleListener();
        this.iCalenderClickListener = MultiCalendarManager.getInstance().getiCalenderClickListener();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_calender_view1, container, false);
        leftBtn =   (ImageView) rootView.findViewById(R.id.leftButton);
        rightBtn=   (ImageView) rootView.findViewById(R.id.rightButton);
        calendarTitle   =   (TextView)rootView.findViewWithTag("dateTitle");

        calendar = MultiCalendarManager.getInstance().getStartCalender();
        calendar.add(Calendar.MONTH,1);
        setCalander();
        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tittleListener.onLeftButtonClicked(4);
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tittleListener.onRightButtonClicked(4);
            }
        });

        if(MultiCalendarManager.getInstance().isVertical()){
            leftBtn.setVisibility(View.GONE);
            rightBtn.setVisibility(View.GONE);
        }

        return rootView;
    }

    private void setCalander() {
        calendar = MultiCalendarManager.getInstance().getFirstDateOfCurrentMonth(calendar);
        calendarTitle.setText(MultiCalendarManager.getInstance().getCalendarTitle(calendar));

        int start_date  =  0;
        int end_date    =   100;

        Calendar endDateThisCalander = Calendar.getInstance();
        endDateThisCalander.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),MultiCalendarManager.getInstance().getNumberofDaysInMonth(calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR)));
        Calendar startDateThisCalander = Calendar.getInstance();
        startDateThisCalander.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
        if(MultiCalendarManager.getInstance().getEndDate() == null){
            end_date    =   100;
        }
        else if((endDateThisCalander.getTimeInMillis()>MultiCalendarManager.getInstance().getEndDate().getTimeInMillis()) && (startDateThisCalander.getTimeInMillis()<MultiCalendarManager.getInstance().getEndDate().getTimeInMillis())){
            end_date    =   MultiCalendarManager.getInstance().getEndDate().get(Calendar.DAY_OF_MONTH);
        }else {
            end_date = 100;
        }

        for (int i = calendar.getTime().getDay(), j = 1; j <= MultiCalendarManager.getInstance().getNumberofDaysInMonth(calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR)); i++,j++) {
            if(i == 0){
                i=7;
            }
            day = (TextView) rootView.findViewWithTag(DAY_OF_MONTH_TEXT + i);
            day.setText(Integer.toString(j));
            day.setTag(j);
            day.setOnClickListener(onDayClickListener);

            if(j < start_date || j>end_date){
                day.setBackgroundColor(getResources().getColor(R.color.grey));

            }else {
                day.setBackgroundColor(getResources().getColor(R.color.white));
                day.setTextColor(Color.GRAY);
            }
            String date_check = j + "/" + (calendar.get(Calendar.MONTH) + 1)+"/"+calendar.get(Calendar.YEAR);

            if(MultiCalendarManager.getInstance().getSelectedDates().contains(date_check)){
                day.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                day.setTextColor(Color.WHITE);
            }

        }
    }

    private View.OnClickListener onDayClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            TextView daySelected = (TextView) view;
            int dateTag = (int) daySelected.getTag();

            int start_date  = 0;
            int end_date    =   100;

            Calendar endDateThisCalander = Calendar.getInstance();
            endDateThisCalander.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),MultiCalendarManager.getInstance().getNumberofDaysInMonth(calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR)));
            Calendar startDateThisCalander = Calendar.getInstance();
            startDateThisCalander.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),1);
            if(MultiCalendarManager.getInstance().getEndDate() == null){
                end_date    =   100;
            }
            else if((endDateThisCalander.getTimeInMillis()>MultiCalendarManager.getInstance().getEndDate().getTimeInMillis()) && (startDateThisCalander.getTimeInMillis()<MultiCalendarManager.getInstance().getEndDate().getTimeInMillis())){
                end_date    =   MultiCalendarManager.getInstance().getEndDate().get(Calendar.DAY_OF_MONTH);
            }else {
                end_date = 100;
            }
            String date_check = dateTag + "/" + (calendar.get(Calendar.MONTH) + 1)+"/"+calendar.get(Calendar.YEAR);

            Calendar calender1 = Calendar.getInstance();
            calender1.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),dateTag,0,0);
            if(MultiCalendarManager.getInstance().isClickable()) {
                if (dateTag < start_date || dateTag > end_date) {
                    iCalenderClickListener.onDateOutsideClicked(calender1);
                } else {
                    if (MultiCalendarManager.getInstance().getSelectedDates().contains(date_check)) {
                        MultiCalendarManager.getInstance().getSelectedDates().remove(calender1);
                        daySelected.setBackgroundColor(getResources().getColor(R.color.white));
                        daySelected.setTextColor(Color.GRAY);
                    } else {
                        MultiCalendarManager.getInstance().getSelectedDates().add(date_check);
                        daySelected.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        daySelected.setTextColor(Color.WHITE);
                    }
                }
            }
            iCalenderClickListener.onDateSelected(calender1);
        }};

}
