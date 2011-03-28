package edu.brandeis.pitosalas.servicedemo;

import android.os.AsyncTask;

public class MyAsyncTask extends AsyncTask<Integer, Integer, Integer> {
	Integer total;

	// This method is executed before starting the new Thread. There is no
	// input/output values, so just initialize variables or whatever you think
	// you need to do.
	protected void onPreExecute() {
		total = 0;
	}

	// The most important method in the AsyncTask class. You have to place here
	// all the stuff you want to do in the background,
	// in a different thread from the main one. Here we have as an input value
	// an array of objects from the type “Integer”
	// and returns an object from the type “Integer”.

	@Override
	protected Integer doInBackground(Integer... res) {
		for (Integer i : res) {
		 total += i;
		}
		return total;
	}

	// This method is called using the method publishProgress(String) from doInBackground, and it is
	// usually used when you want to show any progress or information in the main screen, like a progress bar showing the
	// progress of the operation you are doing in the background. 
	@Override
	protected void onProgressUpdate(Integer... status) {
		System.out.print(status[0]);
	}

	// This method is called after the operation in the background is done. As
	// an input parameter you will receive the output parameter of the doInBackground method.
	@Override
	protected void onPostExecute(Integer result) {

	}

}
