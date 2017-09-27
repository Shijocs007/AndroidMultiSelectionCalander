### 1. Add calenderview library in your project

### 2. For Horizontal Calander add the following code

          Fragment calenderView;
          calenderView   =    new CalanderHorizontalFragment();
          FragmentManager fragmentManager = getSupportFragmentManager();
          android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
          fragmentTransaction1.replace(R.id.content_frame, calenderView, "multi_calender_view");
          fragmentTransaction1.commit();
          
            MultiCalendarManager.getInstance().setStartCalender(Calendar.getInstance())// set the start date here
            MultiCalendarManager.getInstance().setEndDate(endCalendar); // set the end date of calander
          
         
### 3.For vertical calander add below code.

         MultiCalendarManager.getInstance().setIsVertical(true); //add this code to make vertical view

           Fragment calenderView;
          calenderView   =    new CalanderVerticalFragment();
          FragmentManager fragmentManager = getSupportFragmentManager();
          android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction();
          fragmentTransaction1.replace(R.id.content_frame, calenderView, "multi_calender_view");
          fragmentTransaction1.commit();
          
            MultiCalendarManager.getInstance().setStartCalender(Calendar.getInstance())// set the start date here
            MultiCalendarManager.getInstance().setEndDate(endCalendar); // set the end date of calander
            
 ###   Additional Codes
 
        MultiCalendarManager.getInstance().setClickable(false);  // this code will disable the click functionality
        
        List<String> testItem = new ArrayList<>();
         testItem.add("15/9/2017");
        testItem.add("25/9/2017");
        testItem.add("25/10/2017");
         MultiCalendarManager.getInstance().setSelectedDates(testItem); // make these date selected, make the same format as used in the          example.


###  ScreenShots

![ScreenShot](https://github.com/Shijocs007/AndroidMultiSelectionCalander/blob/master/screenshot/horizonal.png)
![ScreenShot](https://github.com/Shijocs007/AndroidMultiSelectionCalander/blob/master/screenshot/vertical.png)
