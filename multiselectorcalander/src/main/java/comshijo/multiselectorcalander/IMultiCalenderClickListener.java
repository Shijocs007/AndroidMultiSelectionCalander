package comshijo.multiselectorcalander;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by mboxuser on 9/16/2017.
 */

public interface IMultiCalenderClickListener {
    public void onDateSelected(Calendar calendar);
    public void onDateOutsideLimitClicked(Calendar calendar);
}
