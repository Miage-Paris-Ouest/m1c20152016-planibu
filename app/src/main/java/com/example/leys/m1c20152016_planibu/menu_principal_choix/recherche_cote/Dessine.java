package com.example.leys.m1c20152016_planibu.menu_principal_choix.recherche_cote;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Pascal on 24/02/2016.
 */
public class Dessine extends View {



        private Paint paint;

        public Dessine(Context context) {
            super(context);

            // create the Paint and set its color
            paint = new Paint();
            paint.setColor(Color.GRAY);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLUE);
            canvas.drawCircle(200, 200, 100, paint);
        }

    }

