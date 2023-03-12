package uth.pmo1.e_campus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    InicioFragment inicioFragment = new InicioFragment();
    NotificacionesFragment notificacionesFragment = new NotificacionesFragment();
    EvaluacionFragment evaluacionFragment = new EvaluacionFragment();
    TicketsFragment ticketsFragment = new TicketsFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.boton_navegacion);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.inicio:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, inicioFragment).commit();
                        return true;
                    case R.id.notificaciones:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notificacionesFragment).commit();
                        return true;
                    case R.id.evaluacion:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, evaluacionFragment).commit();
                        return true;
                    case R.id.tickets:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, ticketsFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}