package szines.androidapp;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.AndroidTestCase;

import junit.framework.TestCase;

import szines.androidapp.MainActivity;

public class MainActivityTest extends AndroidTestCase {

    private MainActivity mMainActivity;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mMainActivity = getActivity();
    }

    public void testPreconditions() {
        assertNotNull("mMainActivity is null", mMainActivity);
    }

    public void tearDown() throws Exception {

    }

    public void testOnCreate() throws Exception {

    }

    public void testOnCreateOptionsMenu() throws Exception {

    }

    public void testOnOptionsItemSelected() throws Exception {

    }
}