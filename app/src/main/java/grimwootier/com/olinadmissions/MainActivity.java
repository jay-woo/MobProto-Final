package grimwootier.com.olinadmissions;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity {
    ActionBar.Tab tab1, tab2, tab3;
    Fragment storyList = new StoryList();
    Fragment olinMap = new StoryList();
    Fragment upload = new StoryList();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tab1 = actionBar.newTab().setText("MAP");
        tab2 = actionBar.newTab().setText("LIST");
        tab3 = actionBar.newTab().setText("UPLOAD");

        tab1.setTabListener(new TabListener(storyList));
        tab2.setTabListener(new TabListener(olinMap));
        tab3.setTabListener(new TabListener(upload));

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
    }
}