package comshijo.multiselectorcalander;

import java.util.Calendar;

/**
 * Created by mboxuser on 9/16/2017.
 */

public interface ICalenderClickListener {
    public void onDateSelected(Calendar calendar);
    public void onDateOutsideClicked(Calendar calendar);
}
