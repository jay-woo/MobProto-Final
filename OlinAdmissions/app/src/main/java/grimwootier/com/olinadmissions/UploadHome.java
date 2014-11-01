package grimwootier.com.olinadmissions;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.text.style.UpdateLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UploadHome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_upload_home, container, false);

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
                        Intent intent = new Intent(rootView.getContext(), TakePicture.class);
                        rootView.getContext().startActivity(intent);

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
