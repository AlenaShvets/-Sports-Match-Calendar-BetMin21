package com.sport.bitmin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.twotoasters.jazzylistview.JazzyListView;
import com.twotoasters.jazzylistview.effects.SlideInEffect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fixture extends AppCompatActivity {


    JazzyListView fxList;



    String[] countryLeft = {"Belgium",
            "Argentina",
            "Brazil",
            "Croatia",
            "France",

            "Belgium",
            "Croatia",
            "France",
            "Germany",
            "Iceland",

            "Japan",
            "Belgium",
            "Croatia",
            "Russia",
            "France",

            "Germany",
            "Iceland",
            "Russia",
            "Belgium",
            "Spain",

            "France",
            "Russia",
            "Argentina",
            "Belgium",
            "Brazil",

            "Iceland",
            "Belgium",
            "Russia",
            "Argentina",
            "Japan",

            "Germany",
            "Belgium",
            "Brazil",
            "Argentina",
            "Spain",

            "Japan",
            "Brazil",
            "Belgium",
            "Spain",
            "Germany",

            "Belgium",
            "Croatia",
            "Japan",
            "Spain",
            "Iceland",

            "1st",
            "2nd",
            "TBC"


    };

    String[] countryRight = {"France",
            "Japan",
            "Spain",
            "Iceland",
            "Germany",

            "Japan",
            "Spain",
            "Russia",
            "Brazil",
            "Argentina",

            "Spain",
            "Germany",
            "Brazil",
            "Iceland",
            "Argentina",

            "Spain",
            "Japan",
            "Brazil",
            "Argentina",
            "Iceland",

            "Afghanistan",
            "Japan",
            "Germany",
            "Croatia",
            "France",

            "Germany",
            "Spain",
            "Croatia",
            "Brazil",
            "France",

            "Croatia",
            "Iceland",
            "Japan",
            "Russia",
            "France",

            "Croatia",
            "Iceland",
            "Russia",
            "Argentina",
            "India",

            "Brazil",
            "Argentina",
            "Germany",
            "Russia",
            "France",

            "4th",
            "3rd",
            "TBC"

    };


    Integer[] flagLeft = {R.drawable.belgium,
            R.drawable.argentina,
            R.drawable.brazil,
            R.drawable.croatia,
            R.drawable.france,

            R.drawable.belgium,
            R.drawable.croatia,
            R.drawable.france,
            R.drawable.germany,
            R.drawable.iceland,

            R.drawable.japan,
            R.drawable.belgium,
            R.drawable.croatia,
            R.drawable.russia,
            R.drawable.france,

            R.drawable.germany,
            R.drawable.iceland,
            R.drawable.russia,
            R.drawable.belgium,
            R.drawable.spain,

            R.drawable.france,
            R.drawable.russia,
            R.drawable.argentina,
            R.drawable.belgium,
            R.drawable.brazil,

            R.drawable.iceland,
            R.drawable.belgium,
            R.drawable.russia,
            R.drawable.argentina,
            R.drawable.japan,

            R.drawable.germany,
            R.drawable.belgium,
            R.drawable.brazil,
            R.drawable.argentina,
            R.drawable.spain,

            R.drawable.japan,
            R.drawable.brazil,
            R.drawable.belgium,
            R.drawable.spain,
            R.drawable.germany,

            R.drawable.belgium,
            R.drawable.croatia,
            R.drawable.japan,
            R.drawable.spain,
            R.drawable.iceland,

            R.drawable.defaultflag,
            R.drawable.defaultflag,

            R.drawable.defaultflag,






    };

    Integer[] flagRight = {R.drawable.france,
            R.drawable.japan ,
            R.drawable.spain ,
            R.drawable.iceland ,
            R.drawable.germany ,

            R.drawable.japan ,
            R.drawable.spain ,
            R.drawable.russia ,
            R.drawable.brazil ,
            R.drawable.argentina ,

            R.drawable.spain ,
            R.drawable.germany ,
            R.drawable.brazil ,
            R.drawable.iceland ,
            R.drawable.argentina ,

            R.drawable.spain ,
            R.drawable.japan ,
            R.drawable.brazil ,
            R.drawable.argentina ,
            R.drawable.iceland ,

            R.drawable.croatia ,
            R.drawable.japan ,
            R.drawable.germany ,
            R.drawable.brazil ,
            R.drawable.france ,

            R.drawable.germany ,
            R.drawable.spain ,
            R.drawable.croatia ,
            R.drawable.brazil ,
            R.drawable.france ,

            R.drawable.croatia ,
            R.drawable.iceland ,
            R.drawable.japan ,
            R.drawable.russia ,
            R.drawable.france ,

            R.drawable.croatia ,
            R.drawable.iceland ,
            R.drawable.russia ,
            R.drawable.argentina ,
            R.drawable.russia ,

            R.drawable.brazil ,
            R.drawable.argentina ,
            R.drawable.germany ,
            R.drawable.russia ,
            R.drawable.france ,

            R.drawable.defaultflag ,
            R.drawable.defaultflag ,

            R.drawable.defaultflag ,



    };




    String[] dateList = {"30 May",
            "31 May",
            "1 June",
            "1 June",
            "2 June",

            "3 June",
            "4 June",
            "5 June",
            "5 June",
            "6 June",

            "7 June",
            "8 June",
            "8 June",
            "9 June",
            "10 June",

            "11 June",
            "12 June",
            "13 June",
            "14 June",
            "15 June",

            "15 June",
            "16 June",
            "17 June",
            "18 June",
            "19 June",


            "20 June",
            "21 June",
            "22 June",
            "22 June",
            "23 June",

            "24 June",
            "25 June",
            "26 June",
            "27 June",
            "28 June",


            "29 June",
            "29 June",
            "30 June",
            "1 July",
            "2 July",

            "3 July",
            "4 July",
            "5 July",
            "6 July",
            "6 July",

            "9 July",
            "11 July",

            "14 July"



    };



    String[] timeList = {"15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "18:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "18:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "15:30 BDT",
            "18:30 BDT",
            "15:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",

            "18:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "18:30 BDT",
            "15:30 BDT",


            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "18:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",

            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "15:30 BDT",
            "18:30 BDT",

            "15:30 BDT",
            "15:30 BDT",

            "15:30 BDT",

    };






    String[] stadiumList = {"The Oval",
            "Trent Bridge",
            "Cardiff Wales Stadium",
            "Bristol County Ground",
            "The Oval",

            "Trent Bridge",
            "Cardiff Wales Stadium",
            "Hampshire Bowl",
            "The Oval",
            "Trent Bridge",

            "Bristol County Ground",
            "Cardiff Wales Stadium",
            "County Ground Taunton",
            "The Oval",
            "Hampshire Bowl",

            "Bristol County Ground",
            "County Ground Taunton",
            "Trent Bridge",
            "Hampshire Bowl",
            "The Oval",

            "Cardiff Wales Stadium",
            "Old Trafford",
            "County Ground Taunton",
            "Old Trafford",
            "Edgbaston",

            "Trent Bridge",
            "Headingley",
            "Hampshire Bowl",
            "Old Trafford",
            "Lord's",


            "Hampshire Bowl",
            "Lord's",
            "Edgbaston",
            "Old Trafford",
            "The Riverside Durham",

            "Headingley",
            "Lord's",
            "Edgbaston",
            "The Riverside Durham",
            "Edgbaston",


            "The Riverside Durham",
            "Headingley",
            "Lord's",
            "Headingley",
            "Old Trafford",

            "Old Trafford",
            "Edgbaston",

            "Lord's"

    };





    String[] locationList = {"London",
            "Nottingham",
            "Cardiff",
            "Bristol",
            "London",

            "Nottingham",
            "Cardiff",
            "Southampton",
            "London",
            "Nottingham",

            "Bristol",
            "Cardiff",
            "Taunton",
            "London",
            "Southampton",

            "Bristol",
            "Taunton",
            "Nottingham",
            "Southampton",
            "London",

            "Cardiff",
            "Manchester",
            "Taunton",
            "Manchester",
            "Birmingham",

            "Nottingham",
            "Leeds",
            "Southampton",
            "Manchester",
            "London",


            "Southampton",
            "London",
            "Birmingham",
            "Manchester",
            "Chester-le-Street",

            "Leeds",
            "London",
            "Birmingham",
            "Chester-le-Street",
            "Birmingham",


            "Chester-le-Street",
            "Leeds",
            "London",
            "Leeds",
            "Manchester",

            "Manchester",
            "Birmingham",

            "London"

    };

    // String[] country_array;// = {"Select distance","1 KM", "2 KM", "3 KM", "4 KM","5 KM","10 KM"};
    // String[] date_array;// = {"Select distance","1 KM", "2 KM", "3 KM", "4 KM","5 KM","10 KM"};
    List<String> country_array = new ArrayList<String>();
    List<String> date_array = new ArrayList<String>();
    private Spinner country_filter,date_filter;
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;

    List<Integer> flag_left1 = new ArrayList<Integer>();
    List<String> country_left1 = new ArrayList<String>();
    List<String> dateTemp1 = new ArrayList<String>();
    List<Integer> flag_right1= new ArrayList<Integer>();
    List<String> country_right1 = new ArrayList<String>();
    List<String> stadiumTemp1 = new ArrayList<String>();
    List<String> timeTemp1 = new ArrayList<String>();
    List<String> locationTemp = new ArrayList<String>();

    List<String> arrayTemp = new ArrayList<String>();

    private int temp1 = 0;

    private boolean countryFlag = true;
    private  boolean dateFlag = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fixture_activity);


        fxList = (JazzyListView)findViewById(R.id.fixtureList);
        country_filter = (Spinner)findViewById(R.id.country_filter);
        date_filter = (Spinner)findViewById(R.id.date_filter);



        //fxList.setTransitionEffect(new WaveEffect());
        fxList.setTransitionEffect(new SlideInEffect());

        // fxList.setAdapter(new FixtureAdapter(this, flagLeft.length,flagLeft,countryLeft,dateList,flagRight,countryRight,stadiumList,timeList,locationList));


        for (int i = 0, j = 1; i < countryLeft.length; i++,j++){

            /*
            if(!countryLeft[i].contains("1") && !countryLeft[i].contains("2") && !countryLeft[i].contains("3") && !countryLeft[i].contains("4") && !countryLeft[i].contains("5") && !countryLeft[i].contains("6") && !countryLeft[i].contains("7") && !countryLeft[i].contains("8") && !countryLeft[i].contains("9")&& !countryLeft[i].contains("0")){
                country_array.add(j,countryLeft[i]);

            }
            */

            date_array.add(dateList[i]);
        }


        generateCountryList();
        generateDateList();
        // Collections.sort(date_array);

        adapter1 = new ArrayAdapter<String>(this, R.layout.item_spinner, country_array);
        adapter2 = new ArrayAdapter<String>(this, R.layout.item_spinner, date_array);

        country_filter.setAdapter(adapter1);
        date_filter.setAdapter(adapter2);

        //  filterWithCountry();



        // adapter1.notifyDataSetChanged();
        // adapter2.notifyDataSetChanged();

        country_filter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here


                /*
                if(countryFlag){

                    dateFlag = false;
                    date_filter.setSelection(0);

                    resetFlags();

                }
                */
                filterWithCountry();





                // Toast.makeText(Fixture.this,"Clicked",Toast.LENGTH_LONG).show();




                // Toast.makeText(Fixture.this,"Clicked",Toast.LENGTH_LONG).show();







            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        date_filter.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // your code here




                temp1++;
                if(temp1 >= 2){

                    /*


                    if(dateFlag){

                        countryFlag = false;
                        country_filter.setSelection(0);

                        resetFlags();

                    }

                    */

                    filterWithDate();








                    // Toast.makeText(Fixture.this,"Clicked",Toast.LENGTH_LONG).show();

                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });

        country_filter.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()== MotionEvent.ACTION_UP){


                    date_filter.setSelection(0);
                }
                return false;
            }
        });

        date_filter.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()== MotionEvent.ACTION_UP){


                    country_filter.setSelection(0);
                }
                return false;
            }
        });

        //timeLocalization();



    }

    private void filterWithCountry(){




        flag_left1.clear();
        country_left1.clear();
        dateTemp1.clear();

        country_right1.clear();
        flag_right1.clear();
        stadiumTemp1.clear();
        timeTemp1.clear();
        locationTemp.clear();




        String tempS = country_filter.getSelectedItem().toString();

        if(tempS.equalsIgnoreCase("Country : All")){

            fxList.setAdapter(new FixtureAdapter(this, flagLeft.length,flagLeft,countryLeft,dateList,flagRight,countryRight,stadiumList,timeList,locationList));

        }else {

            for (int i = 0; i < countryLeft.length; i++){



                if(countryLeft[i].equalsIgnoreCase(tempS)){

                    flag_left1.add(flagLeft[i]);
                    country_left1.add(countryLeft[i]);
                    dateTemp1.add(dateList[i]);

                    country_right1.add(countryRight[i]);
                    flag_right1.add(flagRight[i]);
                    stadiumTemp1.add(stadiumList[i]);
                    timeTemp1.add(timeList[i]);
                    locationTemp.add(locationList[i]);


                }

                if(countryRight[i].equalsIgnoreCase(tempS)){

                    flag_left1.add(flagLeft[i]);
                    country_left1.add(countryLeft[i]);
                    dateTemp1.add(dateList[i]);

                    country_right1.add(countryRight[i]);
                    flag_right1.add(flagRight[i]);
                    stadiumTemp1.add(stadiumList[i]);
                    timeTemp1.add(timeList[i]);
                    locationTemp.add(locationList[i]);


                }



            }


            Integer[] Temp1 = flag_left1.toArray(new Integer[flag_left1.size()]);
            String[] Temp2 = country_left1.toArray(new String[country_left1.size()]);
            String[] Temp3 = dateTemp1.toArray(new String[dateTemp1.size()]);
            String[] Temp4 = country_right1.toArray(new String[country_right1.size()]);
            Integer[] Temp5 = flag_right1.toArray(new Integer[flag_right1.size()]);
            String[] Temp6 = stadiumTemp1.toArray(new String[stadiumTemp1.size()]);
            String[] Temp7 = timeTemp1.toArray(new String[timeTemp1.size()]);
            String[] Temp8 = locationTemp.toArray(new String[locationTemp.size()]);



            //fxList.setAdapter(new FixtureAdapter(this, flagLeft.length,flagLeft,countryLeft,dateList,flagRight,countryRight,stadiumList,timeList,locationList));
            fxList.setAdapter(new FixtureAdapter(this, flag_left1.size(),Temp1,Temp2,Temp3,Temp5,Temp4,Temp6,Temp7,Temp8));





        }





    }

    private void filterWithDate(){

        flag_left1.clear();
        country_left1.clear();
        dateTemp1.clear();

        country_right1.clear();
        flag_right1.clear();
        stadiumTemp1.clear();
        timeTemp1.clear();
        locationTemp.clear();

        String tempS = date_filter.getSelectedItem().toString();

        if(tempS.equalsIgnoreCase("14 Jun - 14 Jul")){

            fxList.setAdapter(new FixtureAdapter(this, flagLeft.length,flagLeft,countryLeft,dateList,flagRight,countryRight,stadiumList,timeList,locationList));

        }else {

            for (int i = 0; i < countryLeft.length; i++){



                if(dateList[i].equalsIgnoreCase(tempS)){

                    flag_left1.add(flagLeft[i]);
                    country_left1.add(countryLeft[i]);
                    dateTemp1.add(dateList[i]);

                    country_right1.add(countryRight[i]);
                    flag_right1.add(flagRight[i]);
                    stadiumTemp1.add(stadiumList[i]);
                    timeTemp1.add(timeList[i]);
                    locationTemp.add(locationList[i]);


                }


            }


            Integer[] Temp1 = flag_left1.toArray(new Integer[flag_left1.size()]);
            String[] Temp2 = country_left1.toArray(new String[country_left1.size()]);
            String[] Temp3 = dateTemp1.toArray(new String[dateTemp1.size()]);
            String[] Temp4 = country_right1.toArray(new String[country_right1.size()]);
            Integer[] Temp5 = flag_right1.toArray(new Integer[flag_right1.size()]);
            String[] Temp6 = stadiumTemp1.toArray(new String[stadiumTemp1.size()]);
            String[] Temp7 = timeTemp1.toArray(new String[timeTemp1.size()]);
            String[] Temp8 = locationTemp.toArray(new String[locationTemp.size()]);



            //fxList.setAdapter(new FixtureAdapter(this, flagLeft.length,flagLeft,countryLeft,dateList,flagRight,countryRight,stadiumList,timeList,locationList));
            fxList.setAdapter(new FixtureAdapter(this, flag_left1.size(),Temp1,Temp2,Temp3,Temp5,Temp4,Temp6,Temp7,Temp8));





        }



    }

    private void generateCountryList(){

        // country_array.add("Country : All");

        arrayTemp.add("France");
        arrayTemp.add("Brazil");
        arrayTemp.add("Croatia");
        arrayTemp.add("Belgium");
        arrayTemp.add("Russia");
        arrayTemp.add("Iceland");
        arrayTemp.add("Japan");
        arrayTemp.add("Spain");
        arrayTemp.add("Argentina");
        arrayTemp.add("Germany");




        Collections.sort(arrayTemp);



        country_array.add("Country : All");
        country_array.addAll(arrayTemp);
        Log.d("countries",arrayTemp.toString());

        /*
        country_array.clear();

        for(int i=0; i<country_array.size(); i++){

            country_array.add(i,arrayTemp.get(i));
        }
        */
        // country_array = arrayTemp;


    }

    private void generateDateList() {

        // country_array.add("Country : All");

        date_array.add(0,"30 May - 14 July");

        date_array.add("30 May");
        date_array.add("31 May");
        date_array.add("1 June");
        date_array.add("1 June");
        date_array.add("2 June");
        date_array.add("3 June");
        date_array.add("4 June");
        date_array.add("5 June");
        date_array.add("6 June");
        date_array.add("7 June");
        date_array.add("8 June");
        date_array.add("9 June");
        date_array.add("10 June");
        date_array.add("11 June");
        date_array.add("12 June");
        date_array.add("13 June");
        date_array.add("14 June");
        date_array.add("15 June");
        date_array.add("16 June");
        date_array.add("17 June");
        date_array.add("18 June");
        date_array.add("19 June");
        date_array.add("20 June");
        date_array.add("21 June");
        date_array.add("22 June");
        date_array.add("23 June");
        date_array.add("24 June");
        date_array.add("25 June");
        date_array.add("26 June");
        date_array.add("27 June");
        date_array.add("28 June");
        date_array.add("29 June");
        date_array.add("30 June");
        date_array.add("1 July");
        date_array.add("2 July");
        date_array.add("3 July");
        date_array.add("4 July");
        date_array.add("5 July");
        date_array.add("6 July");
        date_array.add("9 July");
        date_array.add("11 July");
        date_array.add("14 July");



    }



    // Log.d("Local Time Zone",TimeZone.getDefault().toString());





    private void  resetFlags(){



        final Handler handler2= new Handler();
        handler2.postDelayed(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub

                countryFlag = true;
                dateFlag = true;
                Log.d("FlagRest","---------- Reset Flag --------------");

            }

        }, 1000);



    }

    @Override
    public void onBackPressed() {

        Intent openNewWindow = new Intent(Fixture.this, Title.class);
        startActivity(openNewWindow);
        finish();

    }


}
