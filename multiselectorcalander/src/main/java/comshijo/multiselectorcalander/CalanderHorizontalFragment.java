package comshijo.multiselectorcalander;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.Calendar;

public class CalanderHorizontalFragment extends Fragment implements ICalenderTittleListener,ICalenderClickListener {

    View rootView;


    FrameLayout frameLayout1;
    FrameLayout frameLayout2;
    FrameLayout frameLayout3;
    FrameLayout frameLayout4;
    FrameLayout frameLayout5;
    FrameLayout frameLayout6;
    FrameLayout frameLayout7;
    FrameLayout frameLayout8;
    FrameLayout frameLayout9;
    FrameLayout frameLayout10;
    FrameLayout frameLayout11;
    FrameLayout frameLayout12;

    Fragment calanderView1;
    Fragment calanderView2;
    Fragment calanderView3;
    Fragment calanderView4;
    Fragment calanderView5;
    Fragment calanderView6;
    Fragment calanderView7;
    Fragment calanderView8;
    Fragment calanderView9;
    Fragment calanderView10;
    Fragment calanderView11;
    Fragment calanderView12;

    IMultiCalenderClickListener iMultiCalenderClickListener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        iMultiCalenderClickListener = (IMultiCalenderClickListener) activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       rootView =    inflater.inflate(R.layout.activity_calander, container, false);

        frameLayout1    =   (FrameLayout) rootView.findViewById(R.id.content_frame1);
        frameLayout2    =   (FrameLayout) rootView.findViewById(R.id.content_frame2);
        frameLayout3    =   (FrameLayout) rootView.findViewById(R.id.content_frame3);
        frameLayout4    =   (FrameLayout) rootView.findViewById(R.id.content_frame4);
        frameLayout5    =   (FrameLayout) rootView.findViewById(R.id.content_frame5);
        frameLayout6    =   (FrameLayout) rootView.findViewById(R.id.content_frame6);
        frameLayout7    =   (FrameLayout) rootView.findViewById(R.id.content_frame7);
        frameLayout8    =   (FrameLayout) rootView.findViewById(R.id.content_frame8);
        frameLayout9    =   (FrameLayout) rootView.findViewById(R.id.content_frame9);
        frameLayout10    =   (FrameLayout) rootView.findViewById(R.id.content_frame10);
        frameLayout11    =   (FrameLayout) rootView.findViewById(R.id.content_frame11);
        frameLayout12   =   (FrameLayout) rootView.findViewById(R.id.content_frame12);

        MultiCalendarManager.getInstance().setiCalenderTittleListener(this);
        MultiCalendarManager.getInstance().setiCalenderClickListener(this);


        calanderView1   = new  CalenderView1();
        calanderView2   = new  CalenderView2();
        calanderView3   = new  CalenderView3();
        calanderView4   = new  CalenderView4();
        calanderView5   = new  CalenderView5();
        calanderView6   = new  CalenderView6();
        calanderView7   = new  CalenderView7();
        calanderView8   = new  CalenderView8();
        calanderView9   = new  CalenderView9();
        calanderView10   = new  CalenderView10();
        calanderView11   = new  CalenderView11();
        calanderView12   = new  CalenderView12();




        FragmentManager fragmentManager1 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        fragmentTransaction1.replace(R.id.content_frame1, calanderView1, "calender_view1");
        fragmentTransaction1.commit();

        setOtherCalanders();

        return rootView;
    }

    private void setOtherCalanders() {
        frameLayout1.setVisibility(View.VISIBLE);
        frameLayout2.setVisibility(View.GONE);
        frameLayout3.setVisibility(View.GONE);
        frameLayout4.setVisibility(View.GONE);
        frameLayout5.setVisibility(View.GONE);
        frameLayout6.setVisibility(View.GONE);
        frameLayout7.setVisibility(View.GONE);
        frameLayout8.setVisibility(View.GONE);
        frameLayout9.setVisibility(View.GONE);
        frameLayout10.setVisibility(View.GONE);
        frameLayout11.setVisibility(View.GONE);
        frameLayout12.setVisibility(View.GONE);

        FragmentManager fragmentManager2 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
        fragmentTransaction2.replace(R.id.content_frame2, calanderView2, "calender_view2");
        fragmentTransaction2.commit();

        FragmentManager fragmentManager3 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
        fragmentTransaction3.replace(R.id.content_frame3, calanderView3, "calender_view3");
        fragmentTransaction3.commit();

        FragmentManager fragmentManager4 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
        fragmentTransaction4.replace(R.id.content_frame4, calanderView4, "calender_view4");
        fragmentTransaction4.commit();

        FragmentManager fragmentManager5 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction5 = fragmentManager5.beginTransaction();
        fragmentTransaction5.replace(R.id.content_frame5, calanderView5, "calender_view5");
        fragmentTransaction5.commit();

        FragmentManager fragmentManager6 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction6 = fragmentManager6.beginTransaction();
        fragmentTransaction6.replace(R.id.content_frame6, calanderView6, "calender_view6");
        fragmentTransaction6.commit();

        FragmentManager fragmentManager7 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction7 = fragmentManager7.beginTransaction();
        fragmentTransaction7.replace(R.id.content_frame7, calanderView7, "calender_view7");
        fragmentTransaction7.commit();

        FragmentManager fragmentManager8 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction8 = fragmentManager8.beginTransaction();
        fragmentTransaction8.replace(R.id.content_frame8, calanderView8, "calender_view8");
        fragmentTransaction8.commit();

        FragmentManager fragmentManager9 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction9 = fragmentManager9.beginTransaction();
        fragmentTransaction9.replace(R.id.content_frame9, calanderView9, "calender_view9");
        fragmentTransaction9.commit();

        FragmentManager fragmentManager10 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction10 = fragmentManager10.beginTransaction();
        fragmentTransaction10.replace(R.id.content_frame10, calanderView10, "calender_view10");
        fragmentTransaction10.commit();

        FragmentManager fragmentManager11 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction11 = fragmentManager11.beginTransaction();
        fragmentTransaction11.replace(R.id.content_frame11, calanderView11, "calender_view11");
        fragmentTransaction11.commit();

        FragmentManager fragmentManager12 = getChildFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction12 = fragmentManager12.beginTransaction();
        fragmentTransaction12.replace(R.id.content_frame12, calanderView12, "calender_view12");
        fragmentTransaction12.commit();


    }

    @Override
    public void onDateSelected(Calendar calendar) {
        iMultiCalenderClickListener.onDateSelected(calendar);

    }

    @Override
    public void onDateOutsideClicked(Calendar calendar) {
        iMultiCalenderClickListener.onDateOutsideLimitClicked(calendar);
    }

    @Override
    public void onRightButtonClicked(int position) {
        switch (position){
            case 1:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.VISIBLE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);

                break;
            case 2:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.VISIBLE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 3:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.VISIBLE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);

                break;
            case 4:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.VISIBLE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 5:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.VISIBLE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 6:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.VISIBLE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 7:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.VISIBLE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 8:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.VISIBLE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 9:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.VISIBLE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 10:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.VISIBLE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 11:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.VISIBLE);
                break;
            case 12:
                frameLayout1.setVisibility(View.VISIBLE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;

            default:
                break;

        }
    }

    @Override
    public void onLeftButtonClicked(int position) {

        switch (position){
            case 1:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.VISIBLE);
                break;
            case 2:
                frameLayout1.setVisibility(View.VISIBLE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 3:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.VISIBLE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 4:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.VISIBLE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 5:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.VISIBLE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 6:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.VISIBLE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 7:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.VISIBLE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 8:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.VISIBLE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 9:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.VISIBLE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 10:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.VISIBLE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 11:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.VISIBLE);
                frameLayout11.setVisibility(View.GONE);
                frameLayout12.setVisibility(View.GONE);
                break;
            case 12:
                frameLayout1.setVisibility(View.GONE);
                frameLayout2.setVisibility(View.GONE);
                frameLayout3.setVisibility(View.GONE);
                frameLayout4.setVisibility(View.GONE);
                frameLayout5.setVisibility(View.GONE);
                frameLayout6.setVisibility(View.GONE);
                frameLayout7.setVisibility(View.GONE);
                frameLayout8.setVisibility(View.GONE);
                frameLayout9.setVisibility(View.GONE);
                frameLayout10.setVisibility(View.GONE);
                frameLayout11.setVisibility(View.VISIBLE);
                frameLayout12.setVisibility(View.GONE);
                break;

            default:
                break;

        }

    }


}
