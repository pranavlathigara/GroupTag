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
for (int i=0;i<5;i++){
  //  tags.add(new MyTag("i"+i));

}

        tagGroup.setAppendMode(true);
        tagGroup.setSelectMode(false);
        tagGroup.setTagsList(tags);
        tagGroup.setBrightColor(Color.RED);
    }


}
