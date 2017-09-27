package comshijo.multipleselectercalander;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import comshijo.multiselectorcalander.CalanderHorizontalFragment;
import comshijo.multiselectorcalander.CalanderVerticalFragment;
import comshijo.multiselectorcalander.IMultiCalenderClickListener;
import comshijo.multiselectorcalander.MultiCalendarManager;

public class MainActivity extends AppCompatActivity implements IMultiCalenderClickListener {

    Fragment calenderView;
    FrameLayout calenderLayout1;
    private FragmentManager fragmentManager;
    List<String> testItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testItem.add("15/9/2017");
        testItem.add("25/9/2017");
        testItem.add("25/10/2017");

        calenderView   =    new CalanderHorizontalFragment();
        MultiCalendarManager.getInstance().setStartCalender(Calendar.getInstance());
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.set(2017,Calendar.DECEMBER,20);
        MultiCalendarManager.getInstance().setEndDate(endCalendar);
        MultiCalendarManager.getInstance().setIsVertical(false);
        MultiCalendarManager.getInstance().setSelectedDates(testItem);
        MultiCalendarManager.getInstance().setClickable(true);

        fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
        fragmentTransaction1.replace(R.id.content_frame, calenderView, "multi_calender_view");
        fragmentTransaction1.commit();
    }

    @Override
    public void onDateSelected(Calendar calendar) {
        String date_check = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1)+"/"+calendar.get(Calendar.YEAR);
    }

    @Override
    public void onDateOutsideLimitClicked(Calendar calendar) {
        String date_check = calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1)+"/"+calendar.get(Calendar.YEAR);
    }
}
