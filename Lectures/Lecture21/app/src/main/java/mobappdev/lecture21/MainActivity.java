package mobappdev.lecture21;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Fragtivity {
    public static Intent newIntent(Context c) {
        return new Intent(c, MainActivity.class);
    }

    @Override
    public Fragment createFragment() {
        return MainFragment.newInstance();
    }
}
