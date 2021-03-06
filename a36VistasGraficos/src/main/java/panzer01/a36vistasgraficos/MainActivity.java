package panzer01.a36vistasgraficos;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Establecer que comience por vista propia.
        setContentView(new MiPropiaVista(this));
    }

    /**
     * Creando vista propia.
     */
    public class MiPropiaVista extends View {
        //Constructor
        public MiPropiaVista(Context context){

            super (context);
        }

        @Override
        protected void onDraw(Canvas canvas){
            //Crear pincel
            Paint miPincel = new Paint();

            //Establecer color
            //miPincel.setColor(Color.BLUE);
            miPincel.setColor(Color.argb(185, 168, 155, 255));
            //
            miPincel.setStrokeWidth(8);
            //
            miPincel.setStyle(Paint.Style.FILL_AND_STROKE);

            canvas.drawCircle(175, 175, 100, miPincel);

            /*Se puede establecer un color por medio del archivo colors.xml*/
            //Relleno
            int miColor = ContextCompat.getColor(getContext(), R.color.rellenoCirculo);
            miPincel.setColor(miColor);
            miPincel.setStyle(Paint.Style.FILL);
            canvas.drawCircle(175, 175, 100, miPincel);
        }
    }

}
