package grimwootier.com.olinadmissions;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {
    ActionBar.Tab tab1, tab2;
    Fragment storyList = new StoryList();
    Fragment olinMap = new StoryList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tab1 = actionBar.newTab().setText("MAP");
        tab2 = actionBar.newTab().setText("LIST");

        tab1.setTabListener(new TabListener(storyList));
        tab2.setTabListener(new TabListener(olinMap));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
    }
}