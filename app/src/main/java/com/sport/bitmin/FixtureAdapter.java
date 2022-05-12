package com.sport.bitmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FixtureAdapter extends BaseAdapter {

    int count;
    Integer[] flagsLeft;
    String[] countriesLeft;
    String[] dateList;
    Integer[] flagsRight;
    String[] countriesRight;
    String[] stadiumNames;
    String[] timeList;
    String[] locationList;



    Context context;
    // int [] imageId;
    private static LayoutInflater inflater=null;
    public FixtureAdapter(Fixture Title, int count1, Integer[] flagsLeft1, String[] countriesLeft1, String[] dateList1, Integer[] flagsRight1, String[] countriesRight1, String[] stadiumNames1, String[] timeList1, String[] locationList1) {
        // TODO Auto-generated constructor stub


        count = count1;
        flagsLeft = flagsLeft1;
        countriesLeft = countriesLeft1;
        dateList = dateList1;
        flagsRight =  flagsRight1;
        countriesRight = countriesRight1;
        stadiumNames = stadiumNames1;
        timeList = timeList1;
        locationList = locationList1;

        context=Title;
        // imageId=prgmImages;
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return count;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {

        TextView matchType;

        ImageView flagLeftImage;
        TextView countryLeftName;
        TextView dateTxt;
        ImageView flagRightImage;
        TextView countryRightName;

        TextView stadiumTxt;
        TextView timeTxt;
        TextView locationTxt;



    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.item_fixture, null);

        holder.matchType=(TextView) rowView.findViewById(R.id.match_type);

        holder.flagLeftImage=(ImageView) rowView.findViewById(R.id.flagLeftImage);
        holder.countryLeftName=(TextView) rowView.findViewById(R.id.countryLeftName);
        holder.dateTxt=(TextView) rowView.findViewById(R.id.dateTxt);
        holder.flagRightImage=(ImageView) rowView.findViewById(R.id.flagRightImage);
        holder.countryRightName=(TextView) rowView.findViewById(R.id.countryRightName);

        holder.stadiumTxt=(TextView) rowView.findViewById(R.id.stadiumTxt);
        holder.timeTxt=(TextView) rowView.findViewById(R.id.timeTxt);
        holder.locationTxt=(TextView) rowView.findViewById(R.id.locationTxt);

        /*

        count = count1;
        flagsLeft = flagsLeft1;
        countriesLeft = countriesLeft1;
        dateList = dateList1;
        flagsRight =  flagsRight1;
        countriesRight = countriesRight1;
        stadiumNames = stadiumNames1;
        timeList = timeList1;
        locationList = locationList1;
         */

       if(position >= 45 && position < 47){

            holder.matchType.setVisibility(View.VISIBLE);
            holder.matchType.setText("Semi Final");

        }else if(position == 47){

            holder.matchType.setVisibility(View.VISIBLE);
            holder.matchType.setText("Final");

        } else {

            holder.matchType.setVisibility(View.GONE);

        }

        holder.flagLeftImage.setImageResource(flagsLeft[position]);
        holder.countryLeftName.setText(countriesLeft[position]);

        holder.dateTxt.setText(dateSeperator(dateList[position]));

        holder.flagRightImage.setImageResource(flagsRight[position]);
        holder.countryRightName.setText(countriesRight[position]);

        holder.stadiumTxt.setText(stadiumNames[position]);
        //holder.timeTxt.setText("GMT\n"+ timeList[position]+"\n-----\n" +"Local Time\n"+findHourDifference(timeList[position])+"\n");
        holder.timeTxt.setText(timeList[position]);
        holder.locationTxt.setText(locationList[position]);




        return rowView;
    }



    private String dateSeperator(String st){

        String tempS = "";

        for(int i=0; i< 2; i++){

            tempS = tempS + st.charAt(i);
        }

        tempS = tempS+"\n";

        for (int i=2; i<st.length(); i++){

            tempS = tempS + st.charAt(i);
        }

        return tempS;

    }






}
