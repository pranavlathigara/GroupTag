package blue.stack.grouptag;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import blue.stack.grouptag.lib.ITag;
import blue.stack.grouptag.lib.TagGroup;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TagGroup tagGroup= (TagGroup) findViewById(R.id.tags);
        List<ITag> tags=new ArrayList<>();


        tagGroup.setAppendMode(true);
        tagGroup.setSelectMode(false);
       tagGroup.setTagsList(tags);
        tagGroup.setBrightColor(Color.RED);
        TagGroup tagGroup2= (TagGroup) findViewById(R.id.tags2);
        for (int i=0;i<5;i++){
           tags.add(new MyTag("i"+i));

        }
        tagGroup2.setAppendMode(false);
        tagGroup2.setSelectMode(true);
        tagGroup2.setTagsList(tags);
        tagGroup2.setBrightColor(Color.RED);
    }


}
