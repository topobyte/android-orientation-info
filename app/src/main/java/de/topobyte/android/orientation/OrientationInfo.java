// Copyright 2016 Sebastian Kuerten
//
// This file is part of orientation-info.
//
// orientation-info is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// orientation-info is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with orientation-info. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.android.orientation;

import android.content.Context;
import android.content.pm.ActivityInfo;

import java.util.ArrayList;
import java.util.List;

import de.topobyte.orientation.R;

public class OrientationInfo {

  private int[] choices = new int[]{
      ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED,
      ActivityInfo.SCREEN_ORIENTATION_SENSOR,
      ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
      ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
  };

  private List<String> names = new ArrayList<>();
  private List<String> values = new ArrayList<>();

  public OrientationInfo(Context context)
  {
    names.add(context.getString(R.string.orientation_default));
    names.add(context.getString(R.string.orientation_auto));
    names.add(context.getString(R.string.orientation_portrait));
    names.add(context.getString(R.string.orientation_landscape));
    for (int value : choices) {
      values.add(Integer.toString(value));
    }
  }

  public CharSequence[] getEntries()
  {
    return names.toArray(new String[0]);
  }

  public CharSequence[] getEntryValues()
  {
    return values.toArray(new String[0]);
  }

}
