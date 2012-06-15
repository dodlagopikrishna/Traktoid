package com.florianmski.tracktoid.ui.fragments.library;


import android.os.Bundle;

import com.florianmski.tracktoid.ListCheckerManager;
import com.florianmski.tracktoid.ui.fragments.MovieShowFragment;


public class PagerLibraryFragment extends MovieShowFragment
{	
	public static PagerLibraryFragment newInstance(Bundle args)
	{
		PagerLibraryFragment f = new PagerLibraryFragment();
		f.setArguments(args);
		return f;
	}
	
	public PagerLibraryFragment() {}

	@Override
	public Class<?> getShowFragment() 
	{
		return PI_LibraryShowFragment.class;
	}

	@Override
	public Class<?> getMovieFragment() 
	{
		return PI_LibaryMovieFragment.class;
	}

	@Override
	public void onPageSelected(int position) 
	{
		super.onPageSelected(position);
		ListCheckerManager.finish();
	}
}
