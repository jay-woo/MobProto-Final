package grimwootier.com.olinadmissions;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class StoryList extends Fragment {

    public StoryList() {
    }

    ListView list;
    String[] title = {
            "Generic Story Title",
            "Hey Look a Story",
            "Olin Story",
            "Students Did a Thing!",
            "I <3 Olin",
            "We made POEgress!",
            "Hoppers Galore",
            "Generic Story Title",
            "Hey Look a Story",
            "Olin Story",
            "Students Did a Thing!",
            "I <3 Olin",
            "We made POEgress!",
            "Hoppers Galore"
    } ;
    Integer[] imageId = {
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1,
            R.drawable.olin1
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_story_list, container, false);

        CustomList adapter = new CustomList(this.getActivity(), title, imageId);

        list=(ListView)rootView.findViewById(R.id.story_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //??????
            }
        });

        return rootView;
    }
}


