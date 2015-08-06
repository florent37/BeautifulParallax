# BeautifulParallax

##RecyclerView

First, add a [Carpaccio tags](http://www.github.com/florent37/Carpaccio) to your View, then add a <strong>com.github.florent37.beautifulparallax.ParallaxViewController</strong>

You can now use <strong>registerImageParallax()</strong> in your [carpaccio tags](http://www.github.com/florent37/Carpaccio)

```xml

    <com.github.florent37.carpaccio.Carpaccio
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/carpaccio"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:register="
            com.github.florent37.carpaccio.controllers.CommonViewController;
            com.github.florent37.carpaccio.controllers.ImageViewController;
            com.github.florent37.carpaccio.controllers.TextViewController;
            com.github.florent37.beautifulparallax.ParallaxViewController;
        ">

        <android.support.v7.widget.RecyclerView
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:tag="
                        registerImageParallax();
                        adapter(object,cell_sample);
                " />

    <com.github.florent37.carpaccio.Carpaccio>

```

* ImageViewController : enable mapping POJO with url($object.backgroundUrl)
* TextViewController : enable mapping POJO with setText($object.title)
* CommonViewController : enable mapping a POJO List with adapter(object,R.layout.cell)

##Cell

In your viewholder/cell, just add in your [carpaccio tags](http://www.github.com/florent37/Carpaccio) : <strong>imageParallax()</strong>

```xml

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:clipChildren="true"
        android:clipToPadding="true">

        <!-- this image must be higher than the cell, to enable parallax ! -->

        <ImageView
            android:layout_width="match_parent"
            android:layout_height="250dp"
            android:scaleType="centerCrop"
            android:tag="
                imageParallax();
                url($object.backgroundUrl);
            " />

    </FrameLayout>

```

#Dependencies

Carpaccio : [http://www.github.com/florent37/Carpaccio](http://www.github.com/florent37/Carpaccio)

#Community

Looking for contributors, feel free to fork !

Tell me if you're using my library in your application, I'll share it in this README

#Credits

Author: Florent Champigny
www.florentchampigny.com/

<a href="https://plus.google.com/+florentchampigny">
  <img alt="Follow me on Google+"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/gplus.png" />
</a>
<a href="https://twitter.com/florent_champ">
  <img alt="Follow me on Twitter"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/twitter.png" />
</a>
<a href="https://www.linkedin.com/profile/view?id=297860624">
  <img alt="Follow me on LinkedIn"
       src="https://raw.githubusercontent.com/florent37/DaVinci/master/mobile/src/main/res/drawable-hdpi/linkedin.png" />
</a>


License
--------

    Copyright 2015 florent37, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.