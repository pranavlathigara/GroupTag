package blue.stack.grouptag;

import blue.stack.grouptag.lib.ITag;

/**
 * Created by BunnyBlue on 3/11/15.
 */
public class MyTag implements ITag {
    String tag;

    public MyTag(String tag) {
        this.tag = tag;
    }

    @Override

    public int getID() {
        return 0;
    }

    @Override
    public void setID(int id) {

    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public void setTag(String tag) {
        this.tag=tag;
    }
}
