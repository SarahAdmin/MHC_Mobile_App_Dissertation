package com.example.maldenhollywoodcinemaapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class DatePicker extends DialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar pickFromCalendar = Calendar.getInstance();
        int year = pickFromCalendar.get(Calendar.YEAR);
        int month = pickFromCalendar.get(Calendar.MONTH);
        int dayOfMonth = pickFromCalendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), (DatePickerDialog.OnDateSetListener)
        getActivity(), year, month, dayOfMonth);
    }
}
