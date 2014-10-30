package grimwootier.com.olinadmissions;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.sql.Timestamp;

public class UploadHome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_upload_home, container, false);

        //Initiate all the buttons!
        final Button storyButton = (Button) rootView.findViewById(R.id.story_button);
        final Button takePicButton = (Button) rootView.findViewById(R.id.take_picture_button);
        final Button uploadPicButton = (Button) rootView.findViewById(R.id.choose_picture_button);

        //when the story button is pressed

        storyButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        //switch to story fragment

                    }
                });

        //when the take picture button is pressed
        takePicButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        //switch to camera

                    }
                });

        //when the choose picture button is pressed
        uploadPicButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        //switch to library

                    }
                });

        return rootView;
    }
}
